/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.Proceso;
import informacion.parametros.ProcesoParametros;
import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Denis
 */
public class ProcesoModel {
    
    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Proceso cargaDatos(DataBaseReader dbr) throws Exception {
        Proceso proceso = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigo = dbr.getString("outcodigo");
            String descripcion = dbr.getString("outdescripcion");
            Date inicia = dbr.getDate("outinicia");
            Date finaliza = dbr.getDate("outfinaliza");
            Boolean activo = dbr.getBoolean("outactivo");
            proceso = new Proceso(id, codigo, descripcion, inicia, finaliza, activo);
        } catch (Exception ex) {
            throw ex;
        }
        return proceso;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Proceso proceso) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, proceso.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, proceso.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametros.add(new Parametro(4, proceso.getDescripcion(), Boolean.TRUE, "indescripcion", Types.VARCHAR));
        parametros.add(new Parametro(5, proceso.getInicia(), Boolean.TRUE, "ininicia", Types.DATE));
        parametros.add(new Parametro(6, proceso.getFinaliza(), Boolean.TRUE, "infinaliza", Types.DATE));
        parametros.add(new Parametro(7, proceso.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Proceso crear(Proceso entidad) throws Exception {
        Proceso proceso = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                proceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return proceso;
    }
    
    public Proceso editar(Proceso entidad) throws Exception {
        Proceso proceso = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                proceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return proceso;
    }
    
    public Boolean eliminar(Proceso entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Proceso encontrar(Object unSecuencial) throws Exception {
        Proceso proceso = null;
        try {
            Proceso _proceso = new Proceso();
            _proceso.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_SELECT_ID, _proceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                proceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return proceso;
    }
    
     public List<Proceso> encontrarActivos() throws Exception {
        List<Proceso> procesos = new ArrayList<Proceso>();
        try {
            Proceso _proceso = new Proceso();
            _proceso.setActivo(true);
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_SELECT_ACTIVOS, _proceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                procesos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return procesos;
    }
    
    public List<Proceso> encontrarTodos() throws Exception {
        List<Proceso> procesos = new ArrayList<Proceso>();
        try {
            Proceso _proceso = new Proceso();
            List<Parametro> parametros = this.getParametrosEntrada(ProcesoParametros.OPERACION_SELECT_TODOS, _proceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                procesos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return procesos;
    }
    //</editor-fold>
}
