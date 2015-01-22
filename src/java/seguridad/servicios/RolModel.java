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
import seguridad.entidades.Rol;
import seguridad.parametros.RolParametros;

/**
 *
 * @author Luis
 */
public class RolModel {

    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    

    private Rol cargaDatos(DataBaseReader dbr) throws Exception {
        Rol rol = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigo = dbr.getString("outcodigo");
            String nombre = dbr.getString("outnombre");            
            Boolean activo = dbr.getBoolean("outactivo");            
            rol = new Rol(id, codigo, nombre, activo);
        } catch (Exception ex) {
            throw ex;
        }
        return rol;
    }    
    
    protected List<Parametro> getParametrosEntrada(String operacion, Rol rol) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, rol.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, rol.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametrosSalida.add(new Parametro(4, rol.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));        
        parametrosSalida.add(new Parametro(5, rol.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));        
        return parametrosSalida;
    }

    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Rol crear(Rol entidad) throws Exception {
        Rol rol = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                rol = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return rol;
    }
    
    public Rol editar(Rol entidad) throws Exception {
        Rol rol = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                rol = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return rol;
    }
    
    public Boolean eliminar(Rol entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //   <editor-fold defaultstate="collapsed" desc="Funciones select">    
    public Rol encontrar(Integer idRol) throws Exception {
        Rol rol = null;
        try {
            Rol _rol = new Rol();
            _rol.setId(idRol);
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_SELECT_ID, _rol);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                rol = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return rol;
    }        
    
    public List<Rol> encontrarPorUsuario(Integer idUsuario) throws Exception {
        List<Rol> roles = new ArrayList<Rol>();
        try {
            Rol _rol = new Rol();
            _rol.setId(idUsuario);
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_SELECT_POR_USUARIO, _rol);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                roles.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return roles;
    }
    
    public List<Rol> encontrarTodos() throws Exception {
        List<Rol> roles = new ArrayList<Rol>();
        try {
            Rol _rol = new Rol();
            List<Parametro> parametros = this.getParametrosEntrada(RolParametros.OPERACION_SELECT_TODOS, _rol);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(RolParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                roles.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return roles;
    }
    //</editor-fold>     
}
