/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.servicios;

import conocimiento.entidades.Detalle;
import conocimiento.entidades.Reporte;
import conocimiento.parametros.DetalleParametros;
import conocimiento.parametros.ReporteParametros;
import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import integracion.Procedimiento;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denis
 */
public class ReporteModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Reporte cargaDatos(DataBaseReader dbr) throws Exception {
        Reporte reporte = null;
        try {
            Integer id = dbr.getInt32("outid");
            Integer idProceso = dbr.getInt32("outid_proceso");
            Integer idDocente = dbr.getInt32("outid_docente");
            String url = dbr.getString("outurl");
            reporte = new Reporte(id, idProceso, idDocente, url);
        } catch (Exception ex) {
            throw ex;
        }
        return reporte;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Reporte reporte) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, reporte.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, reporte.getIdProceso(), Boolean.TRUE, "inid_proceso", Types.INTEGER));
        parametros.add(new Parametro(4, reporte.getIdDocente(), Boolean.TRUE, "inid_docente", Types.INTEGER));
        parametros.add(new Parametro(5, reporte.getUrl(), Boolean.TRUE, "inurl", Types.VARCHAR));
        return parametros;
    }

    private Reporte cargaDatosConObjetos(DataBaseReader dbr) throws Exception {
        Reporte reporte = new Reporte();
        try {
            reporte.setId(dbr.getInt32(1));
            reporte.setIdProceso(dbr.getInt32(2));
            reporte.setIdDocente(dbr.getInt32(3));
            reporte.setUrl(dbr.getString(4));

            reporte.getProceso().setId(dbr.getInt32(5));
            reporte.getProceso().setCodigo(dbr.getString(6));
            reporte.getProceso().setDescripcion(dbr.getString(7));
            reporte.getProceso().setInicia(dbr.getDate(8));
            reporte.getProceso().setFinaliza(dbr.getDate(9));
            reporte.getProceso().setActivo(dbr.getBoolean(10));

            reporte.getDocente().setId(dbr.getInt32(11));
            reporte.getDocente().setCedula(dbr.getString(12));
            reporte.getDocente().setContrasena(dbr.getString(13));
            reporte.getDocente().setNombres(dbr.getString(14));
            reporte.getDocente().setApellidos(dbr.getString(15));
            reporte.getDocente().setTelefonoFijo(dbr.getString(16));
            reporte.getDocente().setTelefonoCelular(dbr.getString(17));
            reporte.getDocente().setEmail(dbr.getString(18));
            reporte.getDocente().setActivo(dbr.getBoolean(19));
        } catch (Exception ex) {
            throw ex;
        }
        return reporte;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Reporte crear(Reporte entidad) throws Exception {
        Reporte reporte = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                reporte = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reporte;
    }

    public Reporte guardar(Reporte entidad) throws Exception {
        Reporte reporte = null;
        try {
            AccesoDatos.preparaTransaccion();
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_INGRESA, entidad);
            Procedimiento procedimiento = new Procedimiento(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            DataBaseReader dbr = AccesoDatos.ejecutaQueryTransaccion(procedimiento);
            if (dbr.next()) {
                reporte = cargaDatos(dbr);
            }

            if (reporte != null) {
                DetalleModel detalleModel = new DetalleModel();
                for (Detalle detalle : entidad.getDetalles()) {
                    detalle.setIdReporte(reporte.getId());
                    parametros = detalleModel.getParametrosEntrada(DetalleParametros.OPERACION_INGRESA, detalle);
                    procedimiento = new Procedimiento(DetalleParametros.NOMBRE_PROCEDIMIENTO, parametros);
                    dbr = AccesoDatos.ejecutaQueryTransaccion(procedimiento);
                }
            }
            AccesoDatos.haceCommitConClose();
        } catch (Exception e) {
            AccesoDatos.haceRollbackConClose();
            reporte = null;
            throw e;
        }
        return reporte;
    }

    public Reporte editar(Reporte entidad) throws Exception {
        Reporte reporte = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                reporte = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reporte;
    }

    public Boolean eliminar(Reporte entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Reporte encontrar(Object unSecuencial) throws Exception {
        Reporte reporte = null;
        try {
            Reporte _reporte = new Reporte();
            _reporte.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_SELECT_ID, _reporte);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                reporte = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reporte;
    }

    public Reporte encontrarPorProcesoYDocente(Integer idProceso, Integer idDocente) throws Exception {
        Reporte reporte = null;
        try {
            Reporte _reporte = new Reporte();
            _reporte.setIdProceso(idProceso);
            _reporte.setIdDocente(idDocente);
            List<Parametro> parametros = this.getParametrosEntrada(ReporteParametros.OPERACION_SELECT_POR_PROCESO_Y_DOCENTE, _reporte);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                reporte = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reporte;
    }

    public Reporte encontrarConObjetos(Integer id) throws Exception {
        Reporte reporte = null;
        try {                        
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(ReporteParametros.CONSULTA_REPORTE, id));
            if (dbr.next()) {
                reporte = cargaDatosConObjetos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reporte;
    }
    
    public List<Reporte> encontrarPorProcesoConObjetos(Integer idProceso) throws Exception {
        List<Reporte> reportes = new ArrayList<Reporte>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(ReporteParametros.CONSULTA_REPORTES_POR_PROCESO, idProceso));
            while (dbr.next()) {
                reportes.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reportes;
    }

    public List<Detalle> encontrarPorProcesoConPromedio(Integer idProceso) throws Exception {
        List<Detalle> reportes = new ArrayList<Detalle>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(ReporteParametros.CONSULTA_REPORTES_POR_PROCESO_PROMEDIO, idProceso));
            while (dbr.next()) {
                Detalle detalle = new Detalle();
                detalle.getReporte().getDocente().setId(dbr.getInt32(1));
                detalle.getReporte().getDocente().setCedula(dbr.getString(2));
                detalle.getReporte().getDocente().setNombres(dbr.getString(3));
                detalle.getReporte().getDocente().setApellidos(dbr.getString(4));                     

                detalle.setValor(dbr.getDecimal(5));
                reportes.add(detalle);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reportes;
    }

    public List<Reporte> encontrarTodosConObjetos() throws Exception {
        List<Reporte> reportes = new ArrayList<Reporte>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReporteParametros.CONSULTA_REPORTES_TODOS);
            while (dbr.next()) {
                reportes.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reportes;
    }
    //</editor-fold>
}
