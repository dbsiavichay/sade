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
import seguridad.entidades.Accion;
import seguridad.parametros.AccionParametros;

/**
 *
 * @author Denis
 */
public class AccionModel {
      
    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Accion cargaDatos(DataBaseReader dbr) throws Exception {
        Accion accion = null;
        try {
            Integer id = dbr.getInt32("outid");
            String nombre = dbr.getString("outnombre");
            String url = dbr.getString("outurl");
            Boolean activo = dbr.getBoolean("outactivo");            
            accion = new Accion(id, nombre, url, activo);
        } catch (Exception ex) {
            throw ex;
        }
        return accion;
    }        
        
    protected List<Parametro> getParametrosEntrada(String operacion, Accion accion) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, accion.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, accion.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));
        parametrosSalida.add(new Parametro(4, accion.getUrl(), Boolean.TRUE, "inurl", Types.VARCHAR));
        parametrosSalida.add(new Parametro(5, accion.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));        
        return parametrosSalida;
    }

    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Accion crear(Accion entidad) throws Exception {
        Accion accion = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                accion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return accion;
    }

    
    public Accion editar(Accion entidad) throws Exception {
        Accion accion = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                accion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return accion;
    }
    
    public Boolean eliminar(Accion entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Funciones select">    
    public Accion encontrar(Integer idAccion) throws Exception {
        Accion accion = null;
        try {
            Accion _accion = new Accion();
            _accion.setId(idAccion);
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_SELECT_ID, _accion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                accion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return accion;
    }
    
    public List<Accion> encontrarActivos(Boolean activo) throws Exception {
        List<Accion> acciones = new ArrayList<Accion>();
        try {
            Accion _accion = new Accion();
            _accion.setActivo(activo);
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_SELECT_ACTIVOS, _accion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                acciones.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return acciones;
    }
               
            
    public List<Accion> encontrarTodos() throws Exception {
        List<Accion> acciones = new ArrayList<Accion>();
        try {
            Accion _accion = new Accion();
            List<Parametro> parametros = this.getParametrosEntrada(AccionParametros.OPERACION_SELECT_TODOS, _accion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(AccionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                acciones.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return acciones;
    }
    //</editor-fold>    
}
