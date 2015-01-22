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
import seguridad.entidades.Funcion;
import seguridad.entidades.Rol;
import seguridad.servicios.FuncionModel;
import seguridad.servicios.RolModel;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class FuncionController {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Funcion funcionActual;
    private FuncionModel funcionModel;
    private List<Funcion> funciones;
    private List<Funcion> funcionesFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;    
    private Integer rolSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public FuncionController() {
        this.funcionActual = new Funcion();
        this.funcionModel = new FuncionModel();
        this.editar = false;
        this.nuevo = false;
        this.ingresaDatos = false;
        try {
            RolModel rolModel = new RolModel();
            List<Rol> roles = rolModel.encontrarTodos();
            this.rolSeleccionado = roles.get(0).getId();
            this.funciones = this.funcionModel.encontrarPorRolConObjetos(this.rolSeleccionado);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">    
    public Funcion getFuncionActual() {
        return funcionActual;
    }

    public void setFuncionActual(Funcion funcionActual) {
        this.funcionActual = funcionActual;
    }

    public FuncionModel getFuncionModel() {
        return funcionModel;
    }

    public void setFuncionModel(FuncionModel funcionModel) {
        this.funcionModel = funcionModel;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public List<Funcion> getFuncionesFiltro() {
        return funcionesFiltro;
    }

    public void setFuncionesFiltro(List<Funcion> funcionesFiltro) {
        this.funcionesFiltro = funcionesFiltro;
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

    public Integer getRolSeleccionado() {
        return rolSeleccionado;
    }

    public void setRolSeleccionado(Integer rolSeleccionado) {
        this.rolSeleccionado = rolSeleccionado;
    }  
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funciones de preparacion">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.funcionActual = new Funcion();
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

    //<editor-fold defaultstate="collapsed" desc="Funciones">
    public void guardarFuncion() {
        Funcion _funcion = null;
        try {
            _funcion = this.funcionModel.crear(this.funcionActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_funcion != null) {
            try {
                this.rolSeleccionado = this.funcionActual.getIdRol();
                this.funciones = this.funcionModel.encontrarPorRolConObjetos(this.rolSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.LISTADO);
            }
            this.funcionActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Funcion.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Funcion.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarFuncion() {
        Funcion _funcion = null;
        try {
            _funcion = this.funcionModel.editar(this.funcionActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_funcion != null) {
            try {
               this.rolSeleccionado = this.funcionActual.getIdRol();
                this.funciones = this.funcionModel.encontrarPorRolConObjetos(this.rolSeleccionado);
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.LISTADO);
            }
            this.funcionActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Funcion.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Funcion.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarFuncion() {
        Boolean exito = false;
        try {
            exito = funcionModel.eliminar(this.funcionActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Funcion.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            Mensajeria.addSuccessMessage(Funcion.class, OpcionesSobreTablas.ELIMINACION);
            try {
                RolModel rolModel = new RolModel();                
                this.rolSeleccionado = this.funcionActual.getIdRol();
                this.funciones = funcionModel.encontrarPorRolConObjetos(this.rolSeleccionado);
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Funcion.class, ex, TipoOrigenError.LISTADO);
            }
            this.funcionActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
        }
        DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
    }
    
    public void cambiarLista(){
        try {
            this.funciones = this.funcionModel.encontrarPorRolConObjetos(this.rolSeleccionado);
            this.funcionesFiltro = null;
        } catch (Exception e) {
             Mensajeria.addErrorMessage(Funcion.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>  
}
