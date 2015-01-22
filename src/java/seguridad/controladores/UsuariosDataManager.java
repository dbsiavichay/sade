/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.controladores;

import configuracion.Mensajeria;
import informacion.servicios.WebServiceModel;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import seguridad.entidades.Competencia;
import seguridad.entidades.Funcion;
import seguridad.entidades.NodoMenu;
import seguridad.entidades.Rol;
import seguridad.entidades.Usuario;
import seguridad.servicios.CompetenciaModel;
import seguridad.servicios.FuncionModel;
import seguridad.servicios.NodoMenuModel;
import seguridad.servicios.RolModel;
import seguridad.servicios.UsuarioModel;
import wsInfoCarrera.Persona;

/**
 *
 * @author Denis
 */
@ManagedBean
@SessionScoped
public class UsuariosDataManager implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Usuario usuarioSesion;
    private UsuarioModel usuarioModel;
    private Rol rolActual;
    private List<NodoMenu> menuUsuario;
    private List<Rol> roles;
    private String pagina;
    private Integer rolSelected;
    private Funcion funcionActual;
    private Integer accionSelected;
    private WebServiceModel webServiceModel;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public UsuariosDataManager() {
        this.usuarioSesion = new Usuario();
        this.rolActual = new Rol();
        this.usuarioModel = new UsuarioModel();
        try {
            this.webServiceModel = new WebServiceModel();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
        }

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="MÃ©todos Set y Get">
    public Usuario getUsuarioSesion() {
        return usuarioSesion;
    }

    public void setUsuarioSesion(Usuario usuarioSesion) {
        this.usuarioSesion = usuarioSesion;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public Rol getRolActual() {
        return rolActual;
    }

    public void setRolActual(Rol rolActual) {
        this.rolActual = rolActual;
    }

    public List<NodoMenu> getMenuUsuario() {
        return menuUsuario;
    }

    public void setMenuUsuario(List<NodoMenu> menuUsuario) {
        this.menuUsuario = menuUsuario;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Integer getRolSelected() {
        return rolSelected;
    }

    public void setRolSelected(Integer rolSelected) {
        this.rolSelected = rolSelected;
    }

    public Funcion getFuncionActual() {
        return funcionActual;
    }

    public void setFuncionActual(Funcion funcionActual) {
        this.funcionActual = funcionActual;
    }

    public Integer getAccionSelected() {
        return accionSelected;
    }

    public void setAccionSelected(Integer accionSelected) {
        this.accionSelected = accionSelected;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funciones">
    public String getFechaActualCiudad() {
        SimpleDateFormat formato = new SimpleDateFormat("'Macas', dd 'de' MMMM 'de' yyyy");
        Calendar cal = Calendar.getInstance();
        return formato.format(cal.getTime());
    }

    public void cambiarRol() {
        RolModel rolModel = new RolModel();
        try {
            this.rolActual = rolModel.encontrar(rolSelected);
            this.menuUsuario = NodoMenuModel.generarMenuUsuario(this.rolActual.getId());
            this.pagina = "bienvenida.xhtml";
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(ex.getMessage());
        }
    }

    public void asignarPermisos() {
        FuncionModel permisoRolModel = new FuncionModel();
        try {
            this.funcionActual = permisoRolModel.encontrar(this.accionSelected);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
        }
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
        return "/faces/index?faces-redirect=true";
    }

    public String ingresarSistema() {
        RolModel rolModel = new RolModel();
        try {
            String rolCarrera = this.webServiceModel.autenticarDocente(this.usuarioSesion.getCedula(), this.usuarioSesion.getContrasena());
            this.usuarioSesion.setContrasena(this.usuarioSesion.getContrasena().toLowerCase());
            //this.usuarioSesion.encriptarContrasena();            

            if (rolCarrera != null) {
                Usuario usuario = this.usuarioModel.encontrarPorCedula(this.usuarioSesion.getCedula());
                Persona persona = this.webServiceModel.getDatosDocente(rolCarrera, this.usuarioSesion.getCedula());
                if (usuario == null) {
                    usuario = new Usuario();
                    usuario.setCedula(persona.getCedula());
                    //usuario.setContrasena(this.usuarioSesion.getContrasena());
                    usuario.setNombres(persona.getNombres());
                    usuario.setApellidos(persona.getApellidos());
                    usuario.setEmail(persona.getEmail());
                    usuario.setActivo(Boolean.TRUE);
                    Usuario _usuario = this.usuarioModel.crear(usuario);

                    List<Rol> rolesitos = rolModel.encontrarTodos();
                    for (Rol rol : rolesitos) {
                        if (rol.getCodigo().equals("DOC")) {
                            CompetenciaModel competenciaModel = new CompetenciaModel();
                            Competencia competencia = new Competencia();
                            competencia.setActivo(Boolean.TRUE);
                            competencia.setIdRol(rol.getId());
                            competencia.setIdUsuario(_usuario.getId());
                            competenciaModel.crear(competencia);
                            break;
                        }
                    }
                    this.usuarioSesion = _usuario;
                } else {
                    usuario.setCedula(persona.getCedula());
                    //usuario.setContrasena(this.usuarioSesion.getContrasena());
                    usuario.setNombres(persona.getNombres());
                    usuario.setApellidos(persona.getApellidos());
                    usuario.setEmail(persona.getEmail());
                    this.usuarioModel.editar(usuario);
                    this.usuarioSesion = usuario;
                }
            } else {                 
                this.usuarioSesion = this.usuarioModel.encontrarPorLogin(this.usuarioSesion.getCedula(), this.usuarioSesion.getContrasena());
            }

            if (this.usuarioSesion == null) {
                Mensajeria.addErrorMessage("Usuario o contraseña incorrectos.");
                this.usuarioSesion = new Usuario();
                return null;
            }
            if (!this.usuarioSesion.getActivo()) {
                Mensajeria.addErrorMessage("Este usuario está inactivo.");
                return null;
            }

            this.roles = rolModel.encontrarPorUsuario(this.usuarioSesion.getId());

            if (this.roles.isEmpty()) {
                Mensajeria.addErrorMessage("Este usuario no tiene roles.");
                return null;
            }

            this.rolActual = this.roles.get(0);
            this.menuUsuario = NodoMenuModel.generarMenuUsuario(this.rolActual.getId());
            this.pagina = "bienvenida.xhtml";
            return "faces/frmHome?faces-redirect=true";
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(ex.getMessage());
            return null;
        }
    }

    public void cambiarPassword() {
        try {
            Usuario _usuario = this.usuarioModel.editar(this.usuarioSesion);
            if (_usuario != null) {
                this.usuarioSesion = _usuario;
                Mensajeria.addSuccessMessage("La operacion fue realizada satisfactoriamente.");
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al cambiar el password.\n" + e.getMessage());
        }

    }
    //</editor-fold>
}
