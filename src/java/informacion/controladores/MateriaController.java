/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.Categoria;
import informacion.entidades.Materia;
import informacion.servicios.MateriaModel;
import informacion.servicios.WebServiceModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import wsInfoGeneral.UnidadAcademica;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class MateriaController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Materia materiaActual;
    private MateriaModel materiaModel;
    private List<Materia> materias;
    private List<Materia> materiasFiltrado;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private WebServiceModel webServiceModel;
    private List<UnidadAcademica> carreras;
    private String carreraSeleccionada;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">  
    public MateriaController() {
        this.materiaActual = new Materia();
        this.materiaModel = new MateriaModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;
        try {
            this.materias = this.materiaModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
        }

        try {
            this.webServiceModel = new WebServiceModel();
            try {
                this.carreras = this.webServiceModel.getCarrerasFie();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(UnidadAcademica.class, e, TipoOrigenError.LISTADO);
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al establecer conexión con el servidos OASIS.\n" + e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Materia getMateriaActual() {
        return materiaActual;
    }

    public void setMateriaActual(Materia materiaActual) {
        this.materiaActual = materiaActual;
    }

    public MateriaModel getMateriaModel() {
        return materiaModel;
    }

    public void setMateriaModel(MateriaModel materiaModel) {
        this.materiaModel = materiaModel;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Materia> getMateriasFiltrado() {
        return materiasFiltrado;
    }

    public void setMateriasFiltrado(List<Materia> materiasFiltrado) {
        this.materiasFiltrado = materiasFiltrado;
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

    public List<UnidadAcademica> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<UnidadAcademica> carreras) {
        this.carreras = carreras;
    }

    public String getCarreraSeleccionada() {
        return carreraSeleccionada;
    }

    public void setCarreraSeleccionada(String carreraSeleccionada) {
        this.carreraSeleccionada = carreraSeleccionada;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.materiaActual = new Materia();
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
    public void guardarMateria() {
        Materia _materia = null;
        try {
            _materia = this.materiaModel.crear(this.materiaActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_materia != null) {
            try {
                this.cambiarListaMaterias();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
            this.materiaActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Materia.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Materia.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarMateria() {
        Materia _materia = null;
        try {
            _materia = this.materiaModel.editar(this.materiaActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_materia != null) {
            try {
                this.cambiarListaMaterias();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
            this.materiaActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Materia.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Materia.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarMateria() {
        Boolean exito = false;
        try {
            exito = this.materiaModel.eliminar(this.materiaActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Materia.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.cambiarListaMaterias();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Materia.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.materiaActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Materia.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaMaterias() {
        if (this.carreraSeleccionada == null) {
            this.carreraSeleccionada = "0";
        }
        try {
            this.materias = this.carreraSeleccionada.equals("0") ? this.materiaModel.encontrarTodos() : this.materiaModel.encontrarPorCarrera(this.carreraSeleccionada);
            this.materiasFiltrado = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void sincronizarConOasis() {
        try {
            List<Materia> materiasOasis = this.webServiceModel.getMateriasFie();
            List<Materia> matteriasBase = this.materiaModel.encontrarTodos();
            for (Materia materia : matteriasBase) {
                if (materiasOasis.contains(materia)) {
                    materiasOasis.remove(materia);
                } else {
                    materiasOasis.add(materia);
                }
            }

            for (Materia materia : materiasOasis) {
                if (materia.getId() != null) {
                    this.materiaModel.eliminar(materia);
                } else {
                    this.materiaModel.crear(materia);
                }
            }

            this.materias = this.materiaModel.encontrarTodos();
            this.carreraSeleccionada = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al sincronizar datos.\n" + e.getMessage());
        }
    }
    //</editor-fold>    
}
