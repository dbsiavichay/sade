/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.controladores;

import configuracion.Mensajeria;
import configuracion.TipoOrigenError;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.DragDropEvent;
import seguridad.entidades.Competencia;
import seguridad.entidades.Rol;
import seguridad.servicios.CompetenciaModel;
import seguridad.servicios.RolModel;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class CompetenciaController {

    //<editor-fold defaultstate="collapsed" desc="Atributos">     
    private CompetenciaModel competenciaModel;
    private List<Competencia> competencias;
    private Integer usuarioSeleccionado;
    private Competencia competenciaSeleccionado;
    private List<Rol> rolesDisponibles;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Contructor">
    public CompetenciaController() {
        this.competenciaModel = new CompetenciaModel();
        String idUsuario = Mensajeria.getRequestParameter("usuario");
        if (idUsuario != null) {
            this.usuarioSeleccionado = Integer.valueOf(idUsuario);
            this.cargarCompetencias();
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public CompetenciaModel getCompetenciaModel() {
        return competenciaModel;
    }

    public void setCompetenciaModel(CompetenciaModel competenciaModel) {
        this.competenciaModel = competenciaModel;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

    public Integer getUsuarioSeleccionado() {
        return usuarioSeleccionado;
    }

    public void setUsuarioSeleccionado(Integer usuarioSeleccionado) {
        this.usuarioSeleccionado = usuarioSeleccionado;
    }

    public Competencia getCompetenciaSeleccionado() {
        return competenciaSeleccionado;
    }

    public void setCompetenciaSeleccionado(Competencia competenciaSeleccionado) {
        this.competenciaSeleccionado = competenciaSeleccionado;
    }

    public List<Rol> getRolesDisponibles() {
        return rolesDisponibles;
    }

    public void setRolesDisponibles(List<Rol> rolesDisponibles) {
        this.rolesDisponibles = rolesDisponibles;
    }                
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funciones">    
    public void guardarCompetencias() {
        try {
            List<Competencia> _competencias = this.competenciaModel.encontrarPorUsuario(this.usuarioSeleccionado);
            Boolean cambios = false;
            for (Competencia competencia : this.competencias) {
                if (_competencias.contains(competencia)) {
                    Competencia _competencia = _competencias.get(_competencias.indexOf(competencia));
                    if (competencia.getActivo() != _competencia.getActivo()) {
                        _competencia.setActivo(competencia.getActivo());
                        this.competenciaModel.editar(_competencia);
                        cambios = true;
                    }
                    _competencias.remove(_competencia);
                } else {
                    this.competenciaModel.crear(competencia);
                    cambios = true;
                }
            }

            for (Competencia competencia : _competencias) {
                this.competenciaModel.eliminar(competencia);
                cambios = true;
            }
            if (cambios) {
                this.cargarCompetencias();
                Mensajeria.addSuccessMessage("Los acción se realizó con éxito.");
            } else {
                Mensajeria.addSuccessMessage("No se realizaron cambios.");
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al guardar los competencias.\n" + e.getMessage());
        }
    }

    public void eliminarCompetencia() {
        this.competencias.remove(this.competenciaSeleccionado);
        this.rolesDisponibles.add(this.competenciaSeleccionado.getRol());
    }

    public void agregarCompetencia(DragDropEvent ddEvent) {
        Rol rol = ((Rol) ddEvent.getData());
        Competencia competencia = new Competencia(null, Boolean.TRUE, rol.getId(), this.usuarioSeleccionado);
        competencia.setRol(rol);
        this.competencias.add(competencia);
        this.rolesDisponibles.remove(rol);
    }

    public void activarCompetencia() {
        this.competencias.get(this.competencias.indexOf(this.competenciaSeleccionado)).setActivo(Boolean.TRUE);
    }

    public void desactivarCompetencia() {
        this.competencias.get(this.competencias.indexOf(this.competenciaSeleccionado)).setActivo(Boolean.FALSE);
    }

    public void cargarCompetencias() {
        RolModel rolModel = new RolModel();
        if (this.usuarioSeleccionado == null) {
            Mensajeria.addErrorMessage("Debe seleccionar un usuario.");
            return;
        }

        try {
            this.rolesDisponibles = rolModel.encontrarTodos();
            this.competencias = this.competenciaModel.encontrarPorUsuarioConObjetos(this.usuarioSeleccionado);
            for (Competencia competencia : this.competencias) {
                for (int i = 0; i < this.rolesDisponibles.size(); i++) {
                    if (competencia.getIdRol() == this.rolesDisponibles.get(i).getId()) {
                        this.rolesDisponibles.remove(i);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Competencia.class, e, TipoOrigenError.LISTADO);
        }
    }
//</editor-fold>        
}
