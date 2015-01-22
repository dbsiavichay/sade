/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.CampoDetallado;
import informacion.entidades.Categoria;
import informacion.servicios.CampoDetalladoModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class CampoDetalladoController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private CampoDetallado campoDetalladoActual;
    private CampoDetalladoModel campoDetalladoModel;
    private List<CampoDetallado> camposDetallados;
    private List<CampoDetallado> camposDetalladosFiltrado;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private Integer campoEspecificoSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">  
    public CampoDetalladoController() {
        this.campoDetalladoActual = new CampoDetallado();
        this.campoDetalladoModel = new CampoDetalladoModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;

        String idCampoEspecifico = Mensajeria.getRequestParameter("campoespecifico");
        try {
            if (idCampoEspecifico != null) {
                this.campoEspecificoSeleccionado = Integer.valueOf(idCampoEspecifico);
                this.camposDetallados = this.campoDetalladoModel.encontrarPorCampoEspecifico(this.campoEspecificoSeleccionado);
            }else{
                this.camposDetallados = this.campoDetalladoModel.encontrarTodos();
            }            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoDetallado.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public CampoDetallado getCampoDetalladoActual() {
        return campoDetalladoActual;
    }

    public void setCampoDetalladoActual(CampoDetallado campoDetalladoActual) {
        this.campoDetalladoActual = campoDetalladoActual;
    }

    public CampoDetalladoModel getCampoDetalladoModel() {
        return campoDetalladoModel;
    }

    public void setCampoDetalladoModel(CampoDetalladoModel campoDetalladoModel) {
        this.campoDetalladoModel = campoDetalladoModel;
    }

    public List<CampoDetallado> getCamposDetallados() {
        return camposDetallados;
    }

    public void setCamposDetallados(List<CampoDetallado> camposDetallados) {
        this.camposDetallados = camposDetallados;
    }

    public List<CampoDetallado> getCamposDetalladosFiltrado() {
        return camposDetalladosFiltrado;
    }

    public void setCamposDetalladosFiltrado(List<CampoDetallado> camposDetalladosFiltrado) {
        this.camposDetalladosFiltrado = camposDetalladosFiltrado;
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

    public Integer getCampoEspecificoSeleccionado() {
        return campoEspecificoSeleccionado;
    }

    public void setCampoEspecificoSeleccionado(Integer campoEspecificoSeleccionado) {
        this.campoEspecificoSeleccionado = campoEspecificoSeleccionado;
    }                
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.campoDetalladoActual = new CampoDetallado();
        this.campoDetalladoActual.setIdCampoEspecifico(this.campoEspecificoSeleccionado>0?this.campoEspecificoSeleccionado:null);
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
    public void guardarCampoDetallado() {
        CampoDetallado _campoDetallado = null;
        try {
            _campoDetallado = this.campoDetalladoModel.crear(this.campoDetalladoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoDetallado.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoDetallado != null) {
            this.cambiarListaCamposDetallados();
            this.campoDetalladoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoDetallado.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(CampoDetallado.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarCampoDetallado() {
        CampoDetallado _campoDetallado = null;
        try {
            _campoDetallado = this.campoDetalladoModel.editar(this.campoDetalladoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoDetallado.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoDetallado != null) {
            this.cambiarListaCamposDetallados();
            this.campoDetalladoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoDetallado.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(CampoDetallado.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarCampoDetallado() {
        Boolean exito = false;
        try {
            exito = this.campoDetalladoModel.eliminar(this.campoDetalladoActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(CampoDetallado.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.camposDetallados = this.campoDetalladoModel.encontrarTodos();
                this.campoEspecificoSeleccionado = null;
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(CampoDetallado.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.campoDetalladoActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoDetallado.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaCamposDetallados() {
        if (this.campoEspecificoSeleccionado == null) {
            return;
        }
        try {
            this.camposDetallados = this.campoEspecificoSeleccionado != 0 ? this.campoDetalladoModel.encontrarPorCampoEspecifico(this.campoEspecificoSeleccionado) : this.campoDetalladoModel.encontrarTodos();
            this.camposDetalladosFiltrado = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>    
}
