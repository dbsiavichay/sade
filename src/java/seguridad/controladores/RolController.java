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
import seguridad.entidades.Rol;
import seguridad.servicios.RolModel;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class RolController {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Rol rolActual;
    private RolModel rolModel;
    private List<Rol> roles;
    private List<Rol> rolesFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public RolController() {
        this.rolActual = new Rol();
        this.rolModel = new RolModel();
        this.editar = false;
        this.nuevo = false;
        this.ingresaDatos = false;
        try {
            this.roles = this.rolModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Rol.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">    
    public Rol getRolActual() {
        return rolActual;
    }

    public void setRolActual(Rol rolActual) {
        this.rolActual = rolActual;
    }

    public RolModel getRolModel() {
        return rolModel;
    }

    public void setRolModel(RolModel rolModel) {
        this.rolModel = rolModel;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public List<Rol> getRolesFiltro() {
        return rolesFiltro;
    }

    public void setRolesFiltro(List<Rol> rolesFiltro) {
        this.rolesFiltro = rolesFiltro;
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

    //<editor-fold defaultstate="collapsed" desc="Funciones de preparacion">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.rolActual = new Rol();
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
    public void guardarRol() {
        Rol _rol = null;
        try {
            _rol = this.rolModel.crear(this.rolActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Rol.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_rol != null) {
            try {
                this.roles = this.rolModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Rol.class, e, TipoOrigenError.LISTADO);
            }
            this.rolActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Rol.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Rol.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarRol() {
        Rol _rol = null;
        try {
            _rol = this.rolModel.editar(this.rolActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Rol.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_rol != null) {
            try {
                this.roles = this.rolModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Rol.class, e, TipoOrigenError.LISTADO);
            }
            this.rolActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Rol.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Rol.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarRol() {
        Boolean exito = false;
        try {
            exito = rolModel.eliminar(this.rolActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Rol.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            Mensajeria.addSuccessMessage(Rol.class, OpcionesSobreTablas.ELIMINACION);
            try {
                this.roles = rolModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Rol.class, ex, TipoOrigenError.LISTADO);                
            }
            this.rolActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;            
        }
        DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
    }   
    //</editor-fold>    
}
