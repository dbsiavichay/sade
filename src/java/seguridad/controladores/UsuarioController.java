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
import seguridad.entidades.Competencia;
import seguridad.entidades.Rol;
import seguridad.entidades.Usuario;
import seguridad.servicios.CompetenciaModel;
import seguridad.servicios.RolModel;
import seguridad.servicios.UsuarioModel;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class UsuarioController {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Usuario usuarioActual;
    private UsuarioModel usuarioModel;
    private List<Usuario> usuarios;
    private List<Usuario> usuariosFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private Integer rolSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public UsuarioController() {
        this.usuarioActual = new Usuario();
        this.usuarioModel = new UsuarioModel();
        this.editar = false;
        this.nuevo = false;
        this.ingresaDatos = false;
        try {
            this.usuarios = this.usuarioModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Usuario> getUsuariosFiltro() {
        return usuariosFiltro;
    }

    public void setUsuariosFiltro(List<Usuario> usuariosFiltro) {
        this.usuariosFiltro = usuariosFiltro;
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
        this.usuarioActual = new Usuario();
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

    public String irACompetencias() {
        return "/seguridad/competencia/manageCompetencia";
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Funciones">
    public void registrarDocente() {
        Usuario _usuario = null;
        try {
            if (!validaCedula(this.usuarioActual.getCedula())) {
                Mensajeria.addErrorMessage(String.format("La cédula %s no es correcta.", this.usuarioActual.getCedula()));
                this.usuarioActual.setCedula(null);
                return;
            }
            this.usuarioActual.setActivo(Boolean.TRUE);
            //this.usuarioActual.encriptarContrasena();
            _usuario = this.usuarioModel.crear(this.usuarioActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_usuario != null) {
            try {
                RolModel rolModel = new RolModel();
                List<Rol> roles = rolModel.encontrarTodos();
                for (Rol rol : roles) {
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
            } catch (Exception e) {
                Mensajeria.addErrorMessage(e.getMessage());
            }
            Mensajeria.addSuccessMessage(Usuario.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Usuario.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void guardarUsuario() {
        Usuario _usuario = null;
        try {
            if (!validaCedula(this.usuarioActual.getCedula())) {
                Mensajeria.addErrorMessage(String.format("La cédula %s no es correcta.", this.usuarioActual.getCedula()));
                this.usuarioActual.setCedula(null);
                return;
            }
            //this.usuarioActual.encriptarContrasena();
            _usuario = this.usuarioModel.crear(this.usuarioActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_usuario != null) {
            try {
                this.rolSeleccionado = null;
                this.usuarios = this.usuarioModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.LISTADO);
            }
            this.usuarioActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Usuario.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Usuario.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarUsuario() {
        Usuario _usuario = null;
        try {
            if (!validaCedula(this.usuarioActual.getCedula())) {
                Mensajeria.addErrorMessage(String.format("La cédula %s no es correcta.", this.usuarioActual.getCedula()));
                this.usuarioActual.setCedula(null);
                return;
            }
            //this.usuarioActual.encriptarContrasena();
            _usuario = this.usuarioModel.editar(this.usuarioActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_usuario != null) {
            try {
                this.rolSeleccionado = null;
                this.usuarios = this.usuarioModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.LISTADO);
            }
            this.usuarioActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Usuario.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Usuario.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarUsuario() {
        Boolean exito = false;
        try {
            exito = usuarioModel.eliminar(this.usuarioActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Usuario.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            Mensajeria.addSuccessMessage(Usuario.class, OpcionesSobreTablas.ELIMINACION);
            try {
                this.rolSeleccionado = null;
                this.usuarios = usuarioModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Usuario.class, ex, TipoOrigenError.LISTADO);
            }
            this.usuarioActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
        }
        DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
    }

    public void cambiarLista() {
        try {
            this.usuarios = this.rolSeleccionado != null ? this.usuarioModel.encontrarPorRol(this.rolSeleccionado) : this.usuarioModel.encontrarTodos();
            this.usuariosFiltro = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Usuario.class, e, TipoOrigenError.LISTADO);

        }
    }

    private Boolean validaCedula(String cedula) {
        String guion = String.valueOf(cedula.charAt(9));
        
        if(!guion.equals("-")){
            return false;
        }        
        cedula = cedula.replace("-", "").trim();        
        try {            
            Integer numero = Integer.valueOf(cedula);
        } catch (Exception e) {
            return false;
        }
        if (cedula.equals("2121212121")) {
            return false;
        }
        if (cedula.length() != 10) {
            return false;
        }

        Integer codigoProvincia = Integer.valueOf(cedula.substring(0, 2));
        if (codigoProvincia < 1 || codigoProvincia > 24) {
            return false;
        }

        Integer tercerDigito = Integer.valueOf(cedula.substring(2, 3));
        if (tercerDigito < 0 || tercerDigito > 5) {
            return false;
        }

        Integer[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
        String[] digitos = cedula.replace("", ":").substring(1).split(":");
        Integer suma = 0;
        for (int i = 0; i < 9; i++) {
            Integer producto = coeficientes[i] * Integer.valueOf(digitos[i]);
            suma += producto > 9 ? producto - 9 : producto;
        }

        Integer digitoVerificadorRecibido = Integer.valueOf(digitos[9]);
        Integer digitoVerificadorObtenido = suma > 9 ? (suma % 10) != 0 ? 10 - (suma % 10) : (suma % 10) : suma;
        if (digitoVerificadorObtenido != digitoVerificadorRecibido) {
            return false;
        }
        return true;
    }
    //</editor-fold>      
}
