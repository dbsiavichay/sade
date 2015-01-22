/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.MateriaProceso;
import informacion.parametros.MateriaProcesoParametros;
import integracion.AccesoDatos;
import integracion.DataBaseReader;
import integracion.Parametro;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dbsiavichay
 */
public class MateriaProcesoModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private MateriaProceso cargaDatos(DataBaseReader dbr) throws Exception {
        MateriaProceso materiaProceso = null;
        try {
            Integer id = dbr.getInt32("outid");     
            Integer idMateria = dbr.getInt32("outid_materia"); 
            Integer idProceso = dbr.getInt32("outid_proceso"); 
            materiaProceso = new MateriaProceso(id, idMateria, idProceso);
        } catch (Exception ex) {
            throw ex;
        }
        return materiaProceso;
    }

    private List<Parametro> getParametrosEntrada(String operacion, MateriaProceso materiaProceso) {
        ArrayList<Parametro> parametros = new ArrayList<>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, materiaProceso.getId(), Boolean.TRUE, "inid", Types.INTEGER));           
        parametros.add(new Parametro(3, materiaProceso.getIdMateria(), Boolean.TRUE, "inid_materia", Types.INTEGER));        
        parametros.add(new Parametro(4, materiaProceso.getIdProceso(), Boolean.TRUE, "inid_proceso", Types.INTEGER));        
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public MateriaProceso crear(MateriaProceso entidad) throws Exception {
        MateriaProceso materiaProceso = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaProceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaProceso;
    }

    public MateriaProceso editar(MateriaProceso entidad) throws Exception {
        MateriaProceso materiaProceso = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaProceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaProceso;
    }

    public Boolean eliminar(MateriaProceso entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }

    public Boolean eliminarPorMateriaYProceso(MateriaProceso entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_ELIMINAR_POR_MATERIA_Y_PROCESO, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public MateriaProceso encontrar(Object unSecuencial) throws Exception {
        MateriaProceso materiaProceso = null;
        try {
            MateriaProceso _materiaProceso = new MateriaProceso();
            _materiaProceso.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_SELECT_ID, _materiaProceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materiaProceso = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materiaProceso;
    }      

    public List<MateriaProceso> encontrarPorProceso(Integer idProceso) throws Exception {
        List<MateriaProceso> materias = new ArrayList<MateriaProceso>();
        try {
            MateriaProceso _materiaProceso = new MateriaProceso();            
            _materiaProceso.setIdProceso(idProceso);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_SELECT_PROCESO, _materiaProceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }   

    public List<MateriaProceso> encontrarPorProcesoYCarrera(Integer idProceso, String codigoCarrera) throws Exception {
        List<MateriaProceso> materias = new ArrayList<MateriaProceso>();
        try {                        
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(MateriaProcesoParametros.CONSULTA_POR_PROCESO_Y_CARRERA,idProceso,codigoCarrera));
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }   

    public List<MateriaProceso> encontrarTodos() throws Exception {
        List<MateriaProceso> materias = new ArrayList<MateriaProceso>();
        try {
            MateriaProceso _materiaProceso = new MateriaProceso();
            List<Parametro> parametros = this.getParametrosEntrada(MateriaProcesoParametros.OPERACION_SELECT_TODOS, _materiaProceso);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaProcesoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }                
    //</editor-fold>
}
