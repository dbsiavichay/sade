/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.CampoDetallado;
import informacion.parametros.CampoDetalladoParametros;
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
public class CampoDetalladoModel {
    
    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private CampoDetallado cargaDatos(DataBaseReader dbr) throws Exception {
        CampoDetallado campoDetallado = null;
        try {
            Integer id = dbr.getInt32("outid");            
            String codigo = dbr.getString("outcodigo");
            String nombre = dbr.getString("outnombre");                                                
            Integer idCampoEspecifico = dbr.getInt32("outid_campo_especifico");
            campoDetallado = new CampoDetallado(id, codigo, nombre, idCampoEspecifico);
        } catch (Exception ex) {
            throw ex;
        }
        return campoDetallado;
    }

    private List<Parametro> getParametrosEntrada(String operacion, CampoDetallado campoDetallado) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, campoDetallado.getId(), Boolean.TRUE, "inid", Types.INTEGER));        
        parametros.add(new Parametro(3, campoDetallado.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametros.add(new Parametro(4, campoDetallado.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));        
        parametros.add(new Parametro(5, campoDetallado.getIdCampoEspecifico(), Boolean.TRUE, "inid_campo_especifico", Types.INTEGER));
        return parametros;
    }       
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public CampoDetallado crear(CampoDetallado entidad) throws Exception {
        CampoDetallado campoDetallado = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetallado;
    }
    
    public CampoDetallado editar(CampoDetallado entidad) throws Exception {
        CampoDetallado campoDetallado = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetallado;
    }
    
    public Boolean eliminar(CampoDetallado entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public CampoDetallado encontrar(Object unSecuencial) throws Exception {
        CampoDetallado campoDetallado = null;
        try {
            CampoDetallado _campoDetallado = new CampoDetallado();
            _campoDetallado.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_SELECT_ID, _campoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetallado;
    }       
    
    public List<CampoDetallado> encontrarPorCampoEspecifico(Integer idCampoEspecifico) throws Exception {
        List<CampoDetallado> camposDetallados = new ArrayList<CampoDetallado>();
        try {
            CampoDetallado _campoDetallado = new CampoDetallado();
            _campoDetallado.setIdCampoEspecifico(idCampoEspecifico);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_SELECT_POR_CAMPO_ESPECIFICO, _campoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetallados;
    } 
    
    public List<CampoDetallado> encontrarPorTitulo(Integer idTitulo) throws Exception {
        List<CampoDetallado> camposDetallados = new ArrayList<CampoDetallado>();
        try {
            CampoDetallado _campoDetallado = new CampoDetallado();
            _campoDetallado.setId(idTitulo);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_SELECT_POR_TITULO, _campoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetallados;
    } 
    
    public List<CampoDetallado> encontrarPorMateria(Integer idMateria) throws Exception {
        List<CampoDetallado> camposDetallados = new ArrayList<CampoDetallado>();
        try {
            CampoDetallado _campoDetallado = new CampoDetallado();
            _campoDetallado.setId(idMateria);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_SELECT_POR_MATERIA, _campoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetallados;
    } 
    
    public List<CampoDetallado> encontrarTodos() throws Exception {
        List<CampoDetallado> camposDetallados = new ArrayList<CampoDetallado>();
        try {
            CampoDetallado _campoDetallado = new CampoDetallado();
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoParametros.OPERACION_SELECT_TODOS, _campoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetallados;
    }                         
    //</editor-fold>    
}
