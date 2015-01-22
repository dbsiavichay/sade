/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import seguridad.entidades.Grupo;
import seguridad.servicios.GrupoModel;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class GrupoController {
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Grupo grupoActual;
    private GrupoModel grupoModel;
    private List<Grupo> grupos;
    private List<Grupo> gruposFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public GrupoController() {
        this.grupoActual = new Grupo();       
        this.grupoModel = new GrupoModel();
        this.editar = false;
        this.nuevo = false;
        this.ingresaDatos = false;
        try {
            this.grupos = this.grupoModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Grupo.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Grupo getGrupoActual() {
        return grupoActual;
    }

    public void setGrupoActual(Grupo grupoActual) {
        this.grupoActual = grupoActual;
    }

    public GrupoModel getGrupoModel() {
        return grupoModel;
    }

    public void setGrupoModel(GrupoModel grupoModel) {
        this.grupoModel = grupoModel;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Grupo> getGruposFiltro() {
        return gruposFiltro;
    }

    public void setGruposFiltro(List<Grupo> gruposFiltro) {
        this.gruposFiltro = gruposFiltro;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    public Boolean getEditar() {
        return editar;
    }

    public void setEditar(Boolean editar) {
        this.editar = editar;
    }

    public Boolean getIngresaDatos() {
        return ingresaDatos;
    }

    public void setIngresaDatos(Boolean ingresaDatos) {
        this.ingresaDatos = ingresaDatos;
    }        
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.grupoActual = new Grupo();        
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;
    }

    public void preparaVer() {
        this.nuevo = false;
        this.editar = false;
        this.ingresaDatos = false;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarGrupo() {
        Grupo _grupo = null;
        try {
            _grupo = this.grupoModel.crear(this.grupoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Grupo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_grupo != null) {
            try {
                this.grupos = this.grupoModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Grupo.class, e, TipoOrigenError.LISTADO);
            }
            this.grupoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Grupo.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Grupo.class, TipoOrigenError.ENTIDAD);
        }
    }
    
    public void editarGrupo() {
        Grupo _grupo = null;
        try {
            _grupo = this.grupoModel.editar(this.grupoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Grupo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_grupo != null) {
            try {
                this.grupos = this.grupoModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Grupo.class, e, TipoOrigenError.LISTADO);
            }
            this.grupoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Grupo.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Grupo.class, TipoOrigenError.ENTIDAD);
        }
    }
    
    public void eliminarGrupo() {
        Boolean exito = false;
        try {
            exito = grupoModel.eliminar(this.grupoActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Grupo.class, ex, TipoOrigenError.ENTIDAD);
            return;
        }
        if (exito) {
            try {
                this.grupos = grupoModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Grupo.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.grupoActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Grupo.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Grupo.class, TipoOrigenError.ENTIDAD);
        }
    }
    //</editor-fold>    
}
