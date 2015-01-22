/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.servicios;

import conocimiento.entidades.Detalle;
import conocimiento.parametros.DetalleParametros;
import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denis
 */
public class DetalleModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Detalle cargaDatos(DataBaseReader dbr) throws Exception {
        Detalle detalle = null;
        try {
            Integer id = dbr.getInt32("outid");
            Double valor = dbr.getDecimal("outvalor");
            Integer idReporte = dbr.getInt32("outid_reporte");
            Integer idMateria = dbr.getInt32("outid_materia");
            detalle = new Detalle(id, valor, idReporte, idMateria);
        } catch (Exception ex) {
            throw ex;
        }
        return detalle;
    }

    public List<Parametro> getParametrosEntrada(String operacion, Detalle detalle) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, detalle.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, detalle.getValor(), Boolean.TRUE, "invalor", Types.NUMERIC));
        parametros.add(new Parametro(4, detalle.getIdReporte(), Boolean.TRUE, "inid_reporte", Types.INTEGER));
        parametros.add(new Parametro(5, detalle.getIdMateria(), Boolean.TRUE, "inid_materia", Types.INTEGER));

        return parametros;
    }

//    private Detalle cargaDatosConObjetos(DataBaseReader dbr) throws Exception {
//        Detalle detalle = new Detalle();
//        try { 
//            detalle.setId(dbr.getInt32(1));
//            detalle.setValor(dbr.getDecimal(2));
//            detalle.setIdReporte(dbr.getInt32(3));
//            detalle.setIdMateria(dbr.getInt32(4));            
//
//            detalle.getReporte().setId(dbr.getInt32(5));
//            detalle.getReporte().setIdProceso(dbr.getInt32(6));
//            detalle.getReporte().setIdDocente(dbr.getInt32(7));
//            detalle.getReporte().setUrl(dbr.getString(8));
//            
//            detalle.getMateria().setId(dbr.getInt32(9));
//            detalle.getMateria().setCodigo(dbr.getString(10));
//            detalle.getMateria().setNombre(dbr.getString(11));
//            detalle.getMateria().setNivel(dbr.getInt32(12));
//            detalle.getMateria().setIdCarrera(dbr.getInt32(13));
//        } catch (Exception ex) {
//            throw ex;
//        }
//        return detalle;
//    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Detalle crear(Detalle entidad) throws Exception {
        Detalle detalle = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(DetalleParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                detalle = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return detalle;
    }

    public Detalle editar(Detalle entidad) throws Exception {
        Detalle detalle = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(DetalleParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                detalle = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return detalle;
    }

    public Boolean eliminar(Detalle entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(DetalleParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Detalle encontrar(Object unSecuencial) throws Exception {
        Detalle detalle = null;
        try {
            Detalle _detalle = new Detalle();
            _detalle.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(DetalleParametros.OPERACION_SELECT_ID, _detalle);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                detalle = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return detalle;
    }

    public Detalle encontrarPorReporteYMateria(Integer idReporte, Integer idMateria) throws Exception {
        Detalle detalle = null;
        try {
            Detalle _detalle = new Detalle();
            _detalle.setIdReporte(idReporte);
            _detalle.setIdMateria(idMateria);
            List<Parametro> parametros = this.getParametrosEntrada(DetalleParametros.OPERACION_SELECT_REPORTE_Y_MATERIA, _detalle);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                detalle = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return detalle;
    }

    public List<Detalle> encontrarPorReporteConObjetos(Integer idReporte) throws Exception {
        List<Detalle> detalles = new ArrayList<Detalle>();        
        try {            
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(DetalleParametros.CONSULTA_POR_REPORTE, idReporte));
            while (dbr.next()) {
                Detalle detalle = new Detalle();
                detalle.setId(dbr.getInt32(1));
                detalle.setValor(dbr.getDecimal(2));
                detalle.setIdReporte(dbr.getInt32(3));
                detalle.setIdMateria(dbr.getInt32(4));
                
                detalle.getMateria().setId(dbr.getInt32(5));
                detalle.getMateria().setCodigoCarrera(dbr.getString(6));
                detalle.getMateria().setNombreCarrera(dbr.getString(7));
                detalle.getMateria().setCodigoMateria(dbr.getString(8));
                detalle.getMateria().setNombreMateria(dbr.getString(9));
                detalles.add(detalle);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return detalles;
    }
    //</editor-fold>
}
