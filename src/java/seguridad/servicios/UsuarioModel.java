/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.servicios;

import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import seguridad.entidades.Usuario;
import seguridad.parametros.UsuarioParametros;

/**
 *
 * @author Luis
 */
public class UsuarioModel {

    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Usuario cargaDatos(DataBaseReader dbr) throws Exception {
        Usuario usuario = null;
        try {
            Integer id = dbr.getInt32("outid");
            String cedula = dbr.getString("outcedula");
            String contrasena = dbr.getString("outcontrasena");
            String nombres = dbr.getString("outnombres");
            String apellidos = dbr.getString("outapellidos");            
            String telefonoFijo = dbr.getString("outtelefono_fijo");
            String telefonoCelular = dbr.getString("outtelefono_celular");
            String email = dbr.getString("outemail");
            Boolean activo = dbr.getBoolean("outactivo");
            usuario = new Usuario(id, cedula, contrasena, nombres, apellidos, telefonoFijo, telefonoCelular, email, activo);
        } catch (Exception ex) {
            throw ex;
        }
        return usuario;
    }

    protected List<Parametro> getParametrosEntrada(String operacion, Usuario usuario) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, usuario.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, usuario.getCedula(), Boolean.TRUE, "incedula", Types.VARCHAR));
        parametrosSalida.add(new Parametro(4, usuario.getContrasena(), Boolean.TRUE, "incontrasena", Types.VARCHAR));
        parametrosSalida.add(new Parametro(5, usuario.getNombres(), Boolean.TRUE, "innombres", Types.VARCHAR));
        parametrosSalida.add(new Parametro(6, usuario.getApellidos(), Boolean.TRUE, "inapellidos", Types.VARCHAR));        
        parametrosSalida.add(new Parametro(7, usuario.getTelefonoFijo(), Boolean.TRUE, "intelefono_fijo", Types.VARCHAR));
        parametrosSalida.add(new Parametro(8, usuario.getTelefonoCelular(), Boolean.TRUE, "intelefono_celular", Types.VARCHAR));
        parametrosSalida.add(new Parametro(9, usuario.getEmail(), Boolean.TRUE, "inemail", Types.VARCHAR));
        parametrosSalida.add(new Parametro(10, usuario.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));
        return parametrosSalida;
    }

    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Usuario crear(Usuario entidad) throws Exception {
        Usuario usuario = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

    public Usuario editar(Usuario entidad) throws Exception {
        Usuario usuario = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

    public Boolean eliminar(Usuario entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //   <editor-fold defaultstate="collapsed" desc="Usuarioes select">    
    public Usuario encontrar(Integer idUsuario) throws Exception {
        Usuario usuario = null;
        try {
            Usuario _usuario = new Usuario();
            _usuario.setId(idUsuario);
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_SELECT_ID, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
    public Usuario encontrar(String cedula) throws Exception {
        Usuario usuario = null;
        try {
            Usuario _usuario = new Usuario();
            _usuario.setCedula(cedula);
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_SELECT_CEDULA, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }

       
    public Usuario encontrarPorLogin(String cedula, String contrasena) throws Exception {
        Usuario usuario = null;
        try {
            Usuario _usuario = new Usuario();
            _usuario.setCedula(cedula);
            _usuario.setContrasena(contrasena);
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_LOGIN, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
    public Usuario encontrarPorCedula(String cedula) throws Exception {
        Usuario usuario = null;
        try {
            Usuario _usuario = new Usuario();
            _usuario.setCedula(cedula);            
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_SELECT_CEDULA, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuario = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuario;
    }
    
    public List<Usuario> encontrarPorRol(Integer idRol) throws Exception {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            Usuario _usuario = new Usuario();
            _usuario.setId(idRol);           
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_SELECT_POR_ROL, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuarios.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuarios;
    }

    public List<Usuario> encontrarTodos() throws Exception {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            Usuario _usuario = new Usuario();
            List<Parametro> parametros = this.getParametrosEntrada(UsuarioParametros.OPERACION_SELECT_TODOS, _usuario);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(UsuarioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                usuarios.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return usuarios;
    }
    //</editor-fold>      
}
