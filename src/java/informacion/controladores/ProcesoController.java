/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import conocimiento.entidades.Reporte;
import conocimiento.servicios.ReporteModel;
import informacion.entidades.Materia;
import informacion.entidades.Proceso;
import informacion.servicios.MateriaModel;
import informacion.servicios.ProcesoModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class ProcesoController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Proceso procesoActual;
    private ProcesoModel procesoModel;
    private List<Proceso> procesos;
    private List<Proceso> procesosFiltrado;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private Integer docenteActual;
    private List<Materia> materias;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">    
    public ProcesoController() {
        this.procesoActual = new Proceso();
        this.procesoModel = new ProcesoModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;

        try {
            this.procesos = this.procesoModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Proceso.class, e, TipoOrigenError.LISTADO);
        }                
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Proceso getProcesoActual() {
        return procesoActual;
    }

    public void setProcesoActual(Proceso procesoActual) {
        this.procesoActual = procesoActual;
    }

    public ProcesoModel getProcesoModel() {
        return procesoModel;
    }

    public void setProcesoModel(ProcesoModel procesoModel) {
        this.procesoModel = procesoModel;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }

    public List<Proceso> getProcesosFiltrado() {
        return procesosFiltrado;
    }

    public void setProcesosFiltrado(List<Proceso> procesosFiltrado) {
        this.procesosFiltrado = procesosFiltrado;
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

    public Integer getDocenteActual() {
        return docenteActual;
    }

    public void setDocenteActual(Integer docenteActual) {
        this.docenteActual = docenteActual;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }        
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.procesoActual = new Proceso();
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
    public void guardarProceso() {
        Proceso _proceso = null;
        try {
            _proceso = this.procesoModel.crear(this.procesoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Proceso.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_proceso != null) {
            try {
                this.procesos = this.procesoModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Proceso.class, e, TipoOrigenError.LISTADO);
            }
            this.procesoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Proceso.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");

        } else {
            Mensajeria.addErrorMessage(Proceso.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarProceso() {
        Proceso _proceso = null;
        try {
            _proceso = this.procesoModel.editar(this.procesoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Proceso.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_proceso != null) {
            try {
                this.procesos = this.procesoModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Proceso.class, e, TipoOrigenError.LISTADO);
            }
            this.procesoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Proceso.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");

        } else {
            Mensajeria.addErrorMessage(Proceso.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarProceso() {
        Boolean exito = false;
        try {
            exito = this.procesoModel.eliminar(this.procesoActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Proceso.class, ex, TipoOrigenError.ENTIDAD);
            return;
        }
        if (exito) {
            try {
                this.procesos = this.procesoModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Proceso.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.procesoActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Proceso.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Proceso.class, TipoOrigenError.ENTIDAD);
        }
    }

    //Solo para postulacion a proceso de los docentes
    public void encontrarProcesosActivos() {
        try {
            this.procesos = this.procesoModel.encontrarActivos();
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Proceso.class, ex, TipoOrigenError.LISTADO);
        }
    }

    public String goReportByDocente() {
        try {
            ReporteModel reporteModel = new ReporteModel();
            List<Reporte> reportes = reporteModel.encontrarPorProcesoConObjetos(this.procesoActual.getId());
            if (reportes.isEmpty()) {
                Mensajeria.addErrorMessage("El proceso seleccionados aun no tiene resultados.");
                return "#";
            }
            DefaultRequestContext.getCurrentInstance().addCallbackParam("proceso", this.procesoActual.getId());
            return "/reportes/reportePorDocente";
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
            return "#";
        }
    }

    public String goReportByMateria() {
        try {
            ReporteModel reporteModel = new ReporteModel();
            List<Reporte> reportes = reporteModel.encontrarPorProcesoConObjetos(this.procesoActual.getId());
            if (reportes.isEmpty()) {
                Mensajeria.addErrorMessage("El proceso seleccionados aun no tiene resultados.");
                return "#";
            }
            DefaultRequestContext.getCurrentInstance().addCallbackParam("proceso", this.procesoActual.getId());
            return "/reportes/reportePorMateria";
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
            return "#";
        }
    }
    
    public void cambiarListaMaterias(){
        try {
            Proceso _proceso = this.procesoModel.encontrar(this.procesoActual.getId());
            if(_proceso==null){
                Mensajeria.addErrorMessage("Error al encontrar el proceso. Id no válida");
                return;
            }
            this.procesoActual = _proceso;
            MateriaModel materiaModel = new MateriaModel();
            this.materias = materiaModel.encontrarPorProceso(this.procesoActual.getId());
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al listar materias.");
        }
    }
    //</editor-fold>    
}
