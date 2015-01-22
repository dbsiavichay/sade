/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.MateriaCampoDetallado;
import informacion.parametros.MateriaCampoDetalladoParametros;
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
public class MateriaCampoDetalladoModel {
    
    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private MateriaCampoDetallado cargaDatos(DataBaseReader dbr) throws Exception {
        MateriaCampoDetallado materiaCampoDetallado = null;
        try {
            Integer id = dbr.getInt32("outid");            
            Integer idMateria = dbr.getInt32("outid_materia");
            Integer idCampoDetallado = dbr.getInt32("outid_campo_detallado");
            materiaCampoDetallado = new MateriaCampoDetallado(id, idMateria, idCampoDetallado);
        } catch (Exception ex) {
            throw ex;
        }
        return materiaCampoDetallado;
    }

    private List<Parametro> getParametrosEntrada(String operacion, MateriaCampoDetallado materiaCampoDetallado) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, materiaCampoDetallado.getId(), Boolean.TRUE, "inid", Types.INTEGER));        
        parametros.add(new Parametro(3, materiaCampoDetallado.getIdMateria(), Boolean.TRUE, "inid_materia", Types.INTEGER));
        parametros.add(new Parametro(4, materiaCampoDetallado.getIdCampoDetallado(), Boolean.TRUE, "inid_campo_detallado", Types.INTEGER));
        return parametros;
    }        
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public MateriaCampoDetallado crear(MateriaCampoDetallado entidad) throws Exception {
        MateriaCampoDetallado materiaCampoDetallado = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaCampoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaCampoDetallado;
    }
    
    public MateriaCampoDetallado editar(MateriaCampoDetallado entidad) throws Exception {
        MateriaCampoDetallado materiaCampoDetallado = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaCampoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaCampoDetallado;
    }
    
    public Boolean eliminar(MateriaCampoDetallado entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    
    public Boolean eliminarPorMateriaYCampo(MateriaCampoDetallado entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_ELIMINAR_POR_MATERIA_Y_CAMPO, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
      
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public MateriaCampoDetallado encontrar(Object unSecuencial) throws Exception {
        MateriaCampoDetallado materiaCampoDetallado = null;
        try {
            MateriaCampoDetallado _materiaCampoDetallado = new MateriaCampoDetallado();
            _materiaCampoDetallado.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_SELECT_ID, _materiaCampoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaCampoDetallado = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaCampoDetallado;
    }    
    
    public List<MateriaCampoDetallado> encontrarPorCampoDetallado(Integer idCampoDetallado) throws Exception {
        List<MateriaCampoDetallado> materiasCamposDetallados = new ArrayList<MateriaCampoDetallado>();
        try {
            MateriaCampoDetallado _materiaCampoDetallado = new MateriaCampoDetallado();
            _materiaCampoDetallado.setIdCampoDetallado(idCampoDetallado);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaCampoDetalladoParametros.OPERACION_SELECT_POR_CAMPO_DETALLADO, _materiaCampoDetallado);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaCampoDetalladoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materiasCamposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiasCamposDetallados;
    }   
    
    public List<MateriaCampoDetallado> encontrarPorCampoDetalladoYCarrera(Integer idCampoDetallado, String codigoCarrera) throws Exception {
        List<MateriaCampoDetallado> materiasCamposDetallados = new ArrayList<MateriaCampoDetallado>();
        try {            
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(MateriaCampoDetalladoParametros.CONSULTA_POR_CAMPO_DETALLADO_Y_CARRERA, idCampoDetallado, codigoCarrera));
            while (dbr.next()) {
                materiasCamposDetallados.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiasCamposDetallados;
    }   
    
    public List<MateriaCampoDetallado> consultaPorCampoDetallado(Integer idCampoDetallado) throws Exception {
        List<MateriaCampoDetallado> materiasCamposDetallados = new ArrayList<MateriaCampoDetallado>();
        try {            
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(MateriaCampoDetalladoParametros.CONSULTA_POR_CAMPO_DETALLADO, idCampoDetallado));
            while (dbr.next()) {
                MateriaCampoDetallado materiaCampoDetallado = new MateriaCampoDetallado();
                materiaCampoDetallado.setId(dbr.getInt32(1));
                materiaCampoDetallado.setIdMateria(dbr.getInt32(2));
                materiaCampoDetallado.setIdCampoDetallado(dbr.getInt32(3));
                
                materiaCampoDetallado.getMateria().setId(dbr.getInt32(4));
                materiaCampoDetallado.getMateria().setCodigoCarrera(dbr.getString(5));
                materiaCampoDetallado.getMateria().setNombreCarrera(dbr.getString(6));
                materiaCampoDetallado.getMateria().setCodigoMateria(dbr.getString(7));
                materiaCampoDetallado.getMateria().setNombreMateria(dbr.getString(8));
                materiasCamposDetallados.add(materiaCampoDetallado);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiasCamposDetallados;
    }   
    //</editor-fold>    
}
