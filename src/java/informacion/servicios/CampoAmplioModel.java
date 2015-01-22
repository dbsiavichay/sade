/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.CampoAmplio;
import informacion.parametros.CampoAmplioParametros;
import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class CampoAmplioModel {
    
    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private CampoAmplio cargaDatos(DataBaseReader dbr) throws Exception {
        CampoAmplio campoAmplio = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigo = dbr.getString("outcodigo");
            String nombre = dbr.getString("outnombre");                                                
            campoAmplio = new CampoAmplio(id, codigo, nombre);
        } catch (Exception ex) {
            throw ex;
        }
        return campoAmplio;
    }

    private List<Parametro> getParametrosEntrada(String operacion, CampoAmplio campoAmplio) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, campoAmplio.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, campoAmplio.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametros.add(new Parametro(4, campoAmplio.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));        
        return parametros;
    }       
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public CampoAmplio crear(CampoAmplio entidad) throws Exception {
        CampoAmplio campoAmplio = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoAmplioParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoAmplioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoAmplio = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoAmplio;
    }
    
    public CampoAmplio editar(CampoAmplio entidad) throws Exception {
        CampoAmplio campoAmplio = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoAmplioParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoAmplioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoAmplio = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoAmplio;
    }
    
    public Boolean eliminar(CampoAmplio entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoAmplioParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoAmplioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public CampoAmplio encontrar(Object unSecuencial) throws Exception {
        CampoAmplio campoAmplio = null;
        try {
            CampoAmplio _campoAmplio = new CampoAmplio();
            _campoAmplio.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(CampoAmplioParametros.OPERACION_SELECT_ID, _campoAmplio);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoAmplioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoAmplio = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoAmplio;
    }       
    
    public List<CampoAmplio> encontrarTodos() throws Exception {
        List<CampoAmplio> camposAmplios = new ArrayList<CampoAmplio>();
        try {
            CampoAmplio _campoAmplio = new CampoAmplio();
            List<Parametro> parametros = this.getParametrosEntrada(CampoAmplioParametros.OPERACION_SELECT_TODOS, _campoAmplio);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoAmplioParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposAmplios.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposAmplios;
    }         
    //</editor-fold>    
}
