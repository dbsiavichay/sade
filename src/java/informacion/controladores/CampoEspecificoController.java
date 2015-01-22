/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.CampoEspecifico;
import informacion.entidades.CampoEspecifico;
import informacion.servicios.CampoEspecificoModel;
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
public class CampoEspecificoController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private CampoEspecifico campoEspecificoActual;
    private CampoEspecificoModel campoEspecificoModel;
    private List<CampoEspecifico> camposEspecificos;
    private List<CampoEspecifico> camposEspecificosFiltrado;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private Integer campoAmplioSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">  
    public CampoEspecificoController() {
        this.campoEspecificoActual = new CampoEspecifico();
        this.campoEspecificoModel = new CampoEspecificoModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;

        String idCampoAmplio = Mensajeria.getRequestParameter("campoamplio");
        try {
            if (idCampoAmplio != null) {
                this.campoAmplioSeleccionado = Integer.valueOf(idCampoAmplio);
                this.camposEspecificos = this.campoEspecificoModel.encontrarPorCampoAmplio(this.campoAmplioSeleccionado);
            }else{
                this.camposEspecificos = this.campoEspecificoModel.encontrarTodos();
            }            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public CampoEspecifico getCampoEspecificoActual() {
        return campoEspecificoActual;
    }

    public void setCampoEspecificoActual(CampoEspecifico campoEspecificoActual) {
        this.campoEspecificoActual = campoEspecificoActual;
    }

    public CampoEspecificoModel getCampoEspecificoModel() {
        return campoEspecificoModel;
    }

    public void setCampoEspecificoModel(CampoEspecificoModel campoEspecificoModel) {
        this.campoEspecificoModel = campoEspecificoModel;
    }

    public List<CampoEspecifico> getCamposEspecificos() {
        return camposEspecificos;
    }

    public void setCamposEspecificos(List<CampoEspecifico> camposEspecificos) {
        this.camposEspecificos = camposEspecificos;
    }

    public List<CampoEspecifico> getCamposEspecificosFiltrado() {
        return camposEspecificosFiltrado;
    }

    public void setCamposEspecificosFiltrado(List<CampoEspecifico> camposEspecificosFiltrado) {
        this.camposEspecificosFiltrado = camposEspecificosFiltrado;
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

    public Integer getCampoAmplioSeleccionado() {
        return campoAmplioSeleccionado;
    }

    public void setCampoAmplioSeleccionado(Integer campoAmplioSeleccionado) {
        this.campoAmplioSeleccionado = campoAmplioSeleccionado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.campoEspecificoActual = new CampoEspecifico();        
        this.campoEspecificoActual.setIdCampoAmplio(this.campoAmplioSeleccionado>0?this.campoAmplioSeleccionado:null);
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
    public void guardarCampoEspecifico() {
        CampoEspecifico _campoEspecifico = null;
        try {
            this.campoEspecificoActual.setIdCampoAmplio(this.campoAmplioSeleccionado);
            _campoEspecifico = this.campoEspecificoModel.crear(this.campoEspecificoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoEspecifico != null) {
            this.cambiarListaCamposEspecificos();
            this.campoEspecificoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoEspecifico.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(CampoEspecifico.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarCampoEspecifico() {
        CampoEspecifico _campoEspecifico = null;
        try {
            this.campoEspecificoActual.setIdCampoAmplio(this.campoAmplioSeleccionado);
            _campoEspecifico = this.campoEspecificoModel.editar(this.campoEspecificoActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoEspecifico != null) {
            this.cambiarListaCamposEspecificos();
            this.campoEspecificoActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoEspecifico.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(CampoEspecifico.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarCampoEspecifico() {
        Boolean exito = false;
        try {
            exito = this.campoEspecificoModel.eliminar(this.campoEspecificoActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.camposEspecificos = this.campoEspecificoModel.encontrarTodos();
                this.campoAmplioSeleccionado = null;
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(CampoEspecifico.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.campoEspecificoActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoEspecifico.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(CampoEspecifico.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaCamposEspecificos() {
        if (this.campoAmplioSeleccionado == null) {
            return;
        }
        try {
            this.camposEspecificos = this.campoAmplioSeleccionado != 0 ? this.campoEspecificoModel.encontrarPorCampoAmplio(this.campoAmplioSeleccionado) : this.campoEspecificoModel.encontrarTodos();
            this.camposEspecificosFiltrado = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>    
}
