/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import conocimiento.entidades.Reporte;
import conocimiento.servicios.ReporteModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author dbsiavichay
 */
@ManagedBean
@ViewScoped
public class ReporteController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Reporte reporteActual;
    private ReporteModel reporteModel;
    private List<Reporte> reportes;    
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;   
    private Integer procesoSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">    
    public ReporteController() {        
        this.reporteModel = new ReporteModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;
        try {            
            this.reportes = this.reporteModel.encontrarTodosConObjetos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public Reporte getReporteActual() {
        return reporteActual;
    }

    public void setReporteActual(Reporte reporteActual) {
        this.reporteActual = reporteActual;
    }

    public ReporteModel getReporteModel() {
        return reporteModel;
    }

    public void setReporteModel(ReporteModel reporteModel) {
        this.reporteModel = reporteModel;
    }

    public List<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(List<Reporte> reportes) {
        this.reportes = reportes;
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

    public Integer getProcesoSeleccionado() {
        return procesoSeleccionado;
    }

    public void setProcesoSeleccionado(Integer procesoSeleccionado) {
        this.procesoSeleccionado = procesoSeleccionado;
    }                    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.reporteActual = new Reporte();        
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;        
    }

    public void preparaVer(ValueChangeEvent event) {
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;        
        try {
            Reporte _reporte = this.reporteModel.encontrarConObjetos(Integer.valueOf(event.getNewValue().toString()));
            if(_reporte!=null){
                this.reporteActual = _reporte;
                this.procesoSeleccionado = this.reporteActual.getIdProceso(); 
                DefaultRequestContext.getCurrentInstance().addCallbackParam("reporte", this.reporteActual.getId());                
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al preparar el objeto reporte.");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarReporte() {
        Reporte _reporte = null;
        try {
            this.reporteActual.setIdProceso(this.procesoSeleccionado);
            _reporte = this.reporteModel.crear(this.reporteActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_reporte != null) {
            try {
                this.reportes = this.reporteModel.encontrarPorProcesoConObjetos(this.procesoSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.LISTADO);
            }
            this.reporteActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Reporte.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Reporte.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarReporte() {
        Reporte _reporte = null;
        try {
            this.reporteActual.setIdProceso(this.procesoSeleccionado);
            _reporte = this.reporteModel.editar(this.reporteActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_reporte != null) {
            try {
                this.reportes = this.reporteModel.encontrarPorProcesoConObjetos(this.procesoSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.LISTADO);
            }
            this.reporteActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Reporte.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Reporte.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarReporte() {
        Boolean exito = false;
        try {
            exito = this.reporteModel.eliminar(this.reporteActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Reporte.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                if(this.procesoSeleccionado!=null){
                    this.reportes = this.reporteModel.encontrarPorProcesoConObjetos(this.procesoSeleccionado);
                }else{
                    this.reportes = this.reporteModel.encontrarTodosConObjetos();
                }
                
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Reporte.class, ex, TipoOrigenError.LISTADO);
                return;
            }    
            this.reporteActual = null;            
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;            
            Mensajeria.addSuccessMessage(Reporte.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Reporte.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaReportes() {
        try {
            this.reportes = this.reporteModel.encontrarPorProcesoConObjetos(this.procesoSeleccionado);            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Reporte.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>
}
