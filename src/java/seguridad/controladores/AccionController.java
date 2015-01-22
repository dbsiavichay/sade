/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;
import seguridad.entidades.Accion;
import seguridad.servicios.AccionModel;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class AccionController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Accion accionActual;
    private AccionModel accionModel;
    private List<Accion> acciones;
    private List<Accion> accionesFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public AccionController() {
        this.accionActual = new Accion();
        this.accionModel = new AccionModel();
        this.editar = false;
        this.nuevo = false;
        this.ingresaDatos = false;
        try {
            this.acciones = this.accionModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Accion.class, e, TipoOrigenError.LISTADO);
        }        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">    
    public Accion getAccionActual() {
        return accionActual;
    }

    public void setAccionActual(Accion accionActual) {
        this.accionActual = accionActual;
    }

    public AccionModel getAccionModel() {
        return accionModel;
    }

    public void setAccionModel(AccionModel accionModel) {
        this.accionModel = accionModel;
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<Accion> acciones) {
        this.acciones = acciones;
    }

    public List<Accion> getAccionesFiltro() {
        return accionesFiltro;
    }

    public void setAccionesFiltro(List<Accion> accionesFiltro) {
        this.accionesFiltro = accionesFiltro;
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
        this.accionActual = new Accion();
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
    public void guardarAccion() {
        Accion _accion = null;
        try {
            _accion = this.accionModel.crear(this.accionActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Accion.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_accion != null) {
            try {
                this.acciones = this.accionModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Accion.class, e, TipoOrigenError.LISTADO);
            }
            this.accionActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Accion.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Accion.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarAccion() {
        Accion _accion = null;
        try {
            _accion = this.accionModel.editar(this.accionActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Accion.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_accion != null) {
            try {
                this.acciones = this.accionModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Accion.class, e, TipoOrigenError.LISTADO);
            }
            this.accionActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Accion.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Accion.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarAccion() {
        Boolean exito = false;
        try {
            exito = accionModel.eliminar(this.accionActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Accion.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            Mensajeria.addSuccessMessage(Accion.class, OpcionesSobreTablas.ELIMINACION);
            try {
                this.acciones = accionModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Accion.class, ex, TipoOrigenError.LISTADO);                
            }
            this.accionActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;            
        }
        DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
    }

    public List<String> getListaPaginas() {
        File file = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/"));
        List<String> archivos = new ArrayList<String>();
        for (File f : file.listFiles()) {
            if (!f.getName().equals("resources") && !f.getName().equals("templates") && !f.getName().equals("WEB-INF")) {
                if (f.isDirectory()) {
                    archivos.addAll(this.archivosHijos(f));
                }
            }

        }
        return archivos;

    }

    private List<String> archivosHijos(File padre) {
        List<String> archivos = new ArrayList<String>();
        for (File file : padre.listFiles()) {
            if (file.isDirectory()) {
                archivos.addAll(this.archivosHijos(file));
            } else {
                if (file.getName().endsWith("xhtml")) {
                    archivos.add(file.getAbsolutePath().substring(file.getAbsolutePath().indexOf("web") + 4).replace('\\', '/'));
                }
            }
        }
        return archivos;
    }
    //</editor-fold>    
}
