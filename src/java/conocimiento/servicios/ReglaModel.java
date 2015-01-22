/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.servicios;

import conocimiento.entidades.Regla;
import conocimiento.parametros.ReglaParametros;
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
public class ReglaModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Regla cargaDatos(DataBaseReader dbr) throws Exception {
        Regla regla = null;
        try {
            Integer id = dbr.getInt32("outid");
            Integer idCampoEspecificoTitulo = dbr.getInt32("outid_campo_especifico_titulo");
            Integer idCampoEspecificoMateria = dbr.getInt32("outid_campo_especifico_materia");
            Double certeza = dbr.getDecimal("outcerteza");
            regla = new Regla(id, idCampoEspecificoTitulo, idCampoEspecificoMateria , certeza);
        } catch (Exception ex) {
            throw ex;
        }
        return regla;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Regla regla) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, regla.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, regla.getIdCampoEspecificoTitulo(), Boolean.TRUE, "inid_campo_especifico_titulo", Types.INTEGER));
        parametros.add(new Parametro(4, regla.getIdCampoEspecificoMateria(), Boolean.TRUE, "inid_campo_especifico_materia", Types.INTEGER));
        parametros.add(new Parametro(5, regla.getCerteza(), Boolean.TRUE, "incerteza", Types.NUMERIC));       
        return parametros;
    }

    private Regla cargaDatosConObjetos(DataBaseReader dbr) throws Exception {
        Regla regla = new Regla();
        try { 
            regla.setId(dbr.getInt32(1));
            regla.setIdCampoEspecificoTitulo(dbr.getInt32(2));
            regla.setIdCampoEspecificoMateria(dbr.getInt32(3));
            regla.setCerteza(dbr.getDecimal(4));
            
            regla.getCampoTitulo().setId(dbr.getInt32(5));
            regla.getCampoTitulo().setCodigo(dbr.getString(6));
            regla.getCampoTitulo().setNombre(dbr.getString(7));
            regla.getCampoTitulo().setIdCampoAmplio(dbr.getInt32(8));
            
            regla.getCampoMateria().setId(dbr.getInt32(9));
            regla.getCampoMateria().setCodigo(dbr.getString(10));
            regla.getCampoMateria().setNombre(dbr.getString(11));
            regla.getCampoMateria().setIdCampoAmplio(dbr.getInt32(12));            
        } catch (Exception ex) {
            throw ex;
        }
        return regla;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Regla crear(Regla entidad) throws Exception {
        Regla regla = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                regla = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return regla;
    }

    public Regla editar(Regla entidad) throws Exception {
        Regla regla = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                regla = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return regla;
    }

    public Boolean eliminar(Regla entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Regla encontrar(Object unSecuencial) throws Exception {
        Regla regla = null;
        try {
            Regla _regla = new Regla();
            _regla.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_SELECT_ID, _regla);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                regla = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return regla;
    }   
    
    
    public List<Regla> encontrarPorCampoEspecifico(Integer IdCampoEspecifico) throws Exception {
        List<Regla> reglas = new ArrayList<Regla>();
        try {
            Regla _regla = new Regla();
            _regla.setIdCampoEspecificoTitulo(IdCampoEspecifico);
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_SELECT_POR_CAMPO_ESPECIFICO, _regla);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                reglas.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reglas;
    }    

    public Regla encontrarRegla(Integer idCampoEspecificoTitulo, Integer idCampoEspecificoMateria) throws Exception {
        Regla regla = null;
        try {
            Regla _regla = new Regla();
            _regla.setIdCampoEspecificoTitulo(idCampoEspecificoTitulo);
            _regla.setIdCampoEspecificoMateria(idCampoEspecificoMateria);
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_SELECT_CAMPO_MATERIA_CAMPO_TITULO, _regla);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                regla = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return regla;
    }

    public List<Regla> encontrarTodos() throws Exception {
        List<Regla> reglas = new ArrayList<Regla>();
        try {
            Regla _regla = new Regla();
            List<Parametro> parametros = this.getParametrosEntrada(ReglaParametros.OPERACION_SELECT_TODOS, _regla);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                reglas.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reglas;
    }
    
 
    public List<Regla> encontrarPorCampoEspecificoConObjetos(Integer idCampoEspecifico) throws Exception {
        List<Regla> reglas = new ArrayList<Regla>();
        try {                        
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(ReglaParametros.CONSULTA_REGLAS_POR_CAMPO_ESPECIFICO, idCampoEspecifico));
            while (dbr.next()) {
                reglas.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reglas;
    }    

    public List<Regla> encontrarTodosConObjetos() throws Exception {
        List<Regla> reglas = new ArrayList<Regla>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(ReglaParametros.CONSULTA_REGLAS_TODOS);
            while (dbr.next()) {                
                reglas.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return reglas;
    }
    //</editor-fold>
}
