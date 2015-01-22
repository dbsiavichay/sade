/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.CampoAmplio;
import informacion.entidades.Categoria;
import informacion.servicios.CampoAmplioModel;
import informacion.servicios.CategoriaModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import org.primefaces.context.DefaultRequestContext;
/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class CampoAmplioController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private CampoAmplio campoAmplioActual;
    private CampoAmplioModel campoAmplioModel;
    private List<CampoAmplio> camposAmplios;
    private List<CampoAmplio> camposAmpliosFiltrado;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">  
    public CampoAmplioController() {
        this.campoAmplioActual = new CampoAmplio();
        this.campoAmplioModel = new CampoAmplioModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;        
        try {
            this.camposAmplios = this.campoAmplioModel.encontrarTodos();            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoAmplio.class, e, TipoOrigenError.LISTADO);
        }                
    }   
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public CampoAmplio getCampoAmplioActual() {
        return campoAmplioActual;
    }

    public void setCampoAmplioActual(CampoAmplio campoAmplioActual) {
        this.campoAmplioActual = campoAmplioActual;
    }

    public CampoAmplioModel getCampoAmplioModel() {
        return campoAmplioModel;
    }

    public void setCampoAmplioModel(CampoAmplioModel campoAmplioModel) {
        this.campoAmplioModel = campoAmplioModel;
    }

    public List<CampoAmplio> getCamposAmplios() {
        return camposAmplios;
    }

    public void setCamposAmplios(List<CampoAmplio> camposAmplios) {
        this.camposAmplios = camposAmplios;
    }

    public List<CampoAmplio> getCamposAmpliosFiltrado() {
        return camposAmpliosFiltrado;
    }

    public void setCamposAmpliosFiltrado(List<CampoAmplio> camposAmpliosFiltrado) {
        this.camposAmpliosFiltrado = camposAmpliosFiltrado;
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
        this.campoAmplioActual = new CampoAmplio();
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
    public void guardarCampoAmplio() {
        CampoAmplio _campoAmplio = null;
        try {
            _campoAmplio = this.campoAmplioModel.crear(this.campoAmplioActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoAmplio.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoAmplio != null) {
            try {
                this.camposAmplios = this.campoAmplioModel.encontrarTodos();                
            } catch (Exception e) {
                Mensajeria.addErrorMessage(CampoAmplio.class, e, TipoOrigenError.LISTADO);
            }
            this.campoAmplioActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoAmplio.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");            
        } else {
            Mensajeria.addErrorMessage(CampoAmplio.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarCampoAmplio() {
        CampoAmplio _campoAmplio = null;
        try {
            _campoAmplio = this.campoAmplioModel.editar(this.campoAmplioActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoAmplio.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_campoAmplio != null) {
            try {
                this.camposAmplios = this.campoAmplioModel.encontrarTodos();                
            } catch (Exception e) {
                Mensajeria.addErrorMessage(CampoAmplio.class, e, TipoOrigenError.LISTADO);
            }
            this.campoAmplioActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoAmplio.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");            
        } else {
            Mensajeria.addErrorMessage(CampoAmplio.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarCampoAmplio() {
        Boolean exito = false;
        try {
            exito = this.campoAmplioModel.eliminar(this.campoAmplioActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(CampoAmplio.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.camposAmplios = this.campoAmplioModel.encontrarTodos();                
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(CampoAmplio.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.campoAmplioActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(CampoAmplio.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }            
    //</editor-fold>    
    
}
