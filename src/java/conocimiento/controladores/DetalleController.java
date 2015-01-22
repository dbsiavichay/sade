/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import conocimiento.entidades.Detalle;
import conocimiento.servicios.DetalleModel;
import informacion.entidades.MateriaProceso;
import informacion.servicios.WebServiceModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import wsInfoGeneral.UnidadAcademica;

/**
 *
 * @author dbsiavichay
 */
@ManagedBean
@ViewScoped
public class DetalleController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Detalle detalleActual;
    private DetalleModel detalleModel;
    private List<Detalle> detalles;    
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;   
    private Integer reporteSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">    
    public DetalleController() {
        this.detalleActual = new Detalle();
        this.detalleModel = new DetalleModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public Detalle getDetalleActual() {
        return detalleActual;
    }

    public void setDetalleActual(Detalle detalleActual) {
        this.detalleActual = detalleActual;
    }

    public DetalleModel getDetalleModel() {
        return detalleModel;
    }

    public void setDetalleModel(DetalleModel detalleModel) {
        this.detalleModel = detalleModel;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
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

    public Integer getReporteSeleccionado() {
        return reporteSeleccionado;
    }

    public void setReporteSeleccionado(Integer reporteSeleccionado) {
        this.reporteSeleccionado = reporteSeleccionado;
    }              
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.detalleActual = new Detalle();        
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;                
    }

    public void preparaVer() {
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;                
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarDetalle() {
        Detalle _detalle = null;
        try {                                                                      
            _detalle = this.detalleModel.crear(this.detalleActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Detalle.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_detalle != null) {
            try {
                this.detalles = this.detalleModel.encontrarPorReporteConObjetos(this.reporteSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Detalle.class, e, TipoOrigenError.LISTADO);
            }
            this.detalleActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Detalle.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Detalle.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarDetalle() {
        Detalle _detalle = null;
        try {            
            _detalle = this.detalleModel.editar(this.detalleActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Detalle.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_detalle != null) {
            try {
                this.detalles = this.detalleModel.encontrarPorReporteConObjetos(this.reporteSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Detalle.class, e, TipoOrigenError.LISTADO);
            }
            this.detalleActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Detalle.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Detalle.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarDetalle() {
        Boolean exito = false;
        try {
            exito = this.detalleModel.eliminar(this.detalleActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Detalle.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.detalles = this.detalleModel.encontrarPorReporteConObjetos(this.detalleActual.getIdReporte());
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Detalle.class, ex, TipoOrigenError.LISTADO);
                return;
            }    
            this.detalleActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Detalle.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Detalle.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaDetalles() {
        try {
            String idReporte = DefaultRequestContext.getCurrentInstance().getCallbackParams().get("reporte").toString();
            if(idReporte!=null){
                this.detalles = this.detalleModel.encontrarPorReporteConObjetos(Integer.valueOf(idReporte));            
            }            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Detalle.class, e, TipoOrigenError.LISTADO);
        }
    }        
    //</editor-fold>
}
