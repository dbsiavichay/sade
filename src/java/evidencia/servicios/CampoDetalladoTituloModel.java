/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.servicios;

import evidencia.entidades.CampoDetalladoTitulo;
import evidencia.parametros.CampoDetalladoTituloParametros;
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
public class CampoDetalladoTituloModel {

    //<editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private CampoDetalladoTitulo cargaDatos(DataBaseReader dbr) throws Exception {
        CampoDetalladoTitulo campoDetalladoTitulo = null;
        try {
            Integer id = dbr.getInt32("outid");
            Integer idCampoDetallado = dbr.getInt32("outid_campo_detallado");
            Integer idTitulo = dbr.getInt32("outid_titulo");
            campoDetalladoTitulo = new CampoDetalladoTitulo(id, idCampoDetallado, idTitulo);
        } catch (Exception ex) {
            throw ex;
        }
        return campoDetalladoTitulo;
    }

    private List<Parametro> getParametrosEntrada(String operacion, CampoDetalladoTitulo areaPerfil) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, areaPerfil.getId(), Boolean.TRUE, "intid", Types.INTEGER));
        parametros.add(new Parametro(3, areaPerfil.getIdCampoDetallado(), Boolean.TRUE, "inid_campo_detallado", Types.INTEGER));
        parametros.add(new Parametro(4, areaPerfil.getIdTitulo(), Boolean.TRUE, "inid_titulo", Types.INTEGER));
        return parametros;
    }    
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="Ingreso, Actualizacion, Eliminacion">         
    public CampoDetalladoTitulo crear(CampoDetalladoTitulo entidad) throws Exception {
        CampoDetalladoTitulo campoDetalladoTitulo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetalladoTitulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetalladoTitulo;
    }

    public CampoDetalladoTitulo editar(CampoDetalladoTitulo entidad) throws Exception {
        CampoDetalladoTitulo campoDetalladoTitulo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetalladoTitulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetalladoTitulo;
    }

    public Boolean eliminar(CampoDetalladoTitulo entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }

    public Boolean eliminarPorCampoTitulo(CampoDetalladoTitulo entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_ELIMINAR_POR_CAMPO_TITULO, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Funciones Select">       
    public CampoDetalladoTitulo encontrar(Object unSecuencial) throws Exception {
        CampoDetalladoTitulo campoDetalladoTitulo = null;
        try {
            CampoDetalladoTitulo _campoDetalladoTitulo = new CampoDetalladoTitulo();
            _campoDetalladoTitulo.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_SELECT_ID, _campoDetalladoTitulo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoDetalladoTitulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoDetalladoTitulo;
    }

    public List<CampoDetalladoTitulo> encontrarPorTitulo(Integer idTitulo) throws Exception {
        List<CampoDetalladoTitulo> camposDetalladosTitulos = new ArrayList<CampoDetalladoTitulo>();
        try {
            CampoDetalladoTitulo _campoDetalladoTitulo = new CampoDetalladoTitulo();
            _campoDetalladoTitulo.setIdTitulo(idTitulo);
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_SELECT_POR_TITULO, _campoDetalladoTitulo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetalladosTitulos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetalladosTitulos;
    }   
    
    public List<CampoDetalladoTitulo> encontrarTodos() throws Exception {
        List<CampoDetalladoTitulo> camposDetalladosTitulos = new ArrayList<CampoDetalladoTitulo>();
        try {
            CampoDetalladoTitulo _campoDetalladoTitulo = new CampoDetalladoTitulo();
            List<Parametro> parametros = this.getParametrosEntrada(CampoDetalladoTituloParametros.OPERACION_SELECT_TODOS, _campoDetalladoTitulo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoDetalladoTituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposDetalladosTitulos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposDetalladosTitulos;
    }   
    //</editor-fold>       
}
