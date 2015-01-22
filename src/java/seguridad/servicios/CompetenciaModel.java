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
import seguridad.entidades.Competencia;
import seguridad.parametros.CompetenciaParametros;

/**
 *
 * @author Luis
 */
public class CompetenciaModel {

    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Competencia cargaDatos(DataBaseReader dbr) throws Exception {
        Competencia competencia = null;
        try {
            Integer id = dbr.getInt32("outid");
            Boolean activo = dbr.getBoolean("outactivo");
            Integer idRol = dbr.getInt32("outid_rol");
            Integer idUsuario = dbr.getInt32("outid_usuario");
            competencia = new Competencia(id, activo, idRol, idUsuario);
        } catch (Exception ex) {
            throw ex;
        }
        return competencia;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Competencia competencia) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, competencia.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, competencia.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));                
        parametrosSalida.add(new Parametro(4, competencia.getIdRol(), Boolean.TRUE, "inid_rol", Types.INTEGER));
        parametrosSalida.add(new Parametro(5, competencia.getIdUsuario(), Boolean.TRUE, "inid_usuario", Types.INTEGER));
        return parametrosSalida;
    }

    private Competencia cargaDatosConObjetos(DataBaseReader dbr) throws Exception{
        Competencia competencia = new Competencia();
        try {
            competencia.setId(dbr.getInt32(1));
            competencia.setActivo(dbr.getBoolean(2));
            competencia.setIdRol(dbr.getInt32(3));
            competencia.setIdUsuario(dbr.getInt32(4));
            
            competencia.getRol().setId(dbr.getInt32(5));
            competencia.getRol().setCodigo(dbr.getString(6));
            competencia.getRol().setNombre(dbr.getString(7));
            competencia.getRol().setActivo(dbr.getBoolean(8));
        } catch (Exception e) {
            competencia = null;
            throw e;
        }
        return competencia;
    }
            
            
    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Competencia crear(Competencia entidad) throws Exception {
        Competencia competencia = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencia = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencia;
    }

    public Competencia editar(Competencia entidad) throws Exception {
        Competencia competencia = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencia = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencia;
    }

    public Boolean eliminar(Competencia entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //   <editor-fold defaultstate="collapsed" desc="Competenciaes select">    
    public Competencia encontrar(Integer idCompetencia) throws Exception {
        Competencia competencia = null;
        try {
            Competencia _competencia = new Competencia();
            _competencia.setId(idCompetencia);
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_SELECT_ID, _competencia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencia = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencia;
    }

    public List<Competencia> encontrarPorUsuario(Integer idUsuario) throws Exception {
        List<Competencia> competencias = new ArrayList<Competencia>();
        try {
            Competencia _competencia = new Competencia();
            _competencia.setIdUsuario(idUsuario);
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_SELECT_POR_USUARIO, _competencia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencias.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencias;
    }

    public List<Competencia> encontrarPorRol(Integer idRol) throws Exception {
        List<Competencia> competencias = new ArrayList<Competencia>();
        try {
            Competencia _competencia = new Competencia();
            _competencia.setIdRol(idRol);
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_SELECT_POR_ROL, _competencia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencias.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencias;
    }

    public List<Competencia> encontrarTodos() throws Exception {
        List<Competencia> competencias = new ArrayList<Competencia>();
        try {
            Competencia _competencia = new Competencia();
            List<Parametro> parametros = this.getParametrosEntrada(CompetenciaParametros.OPERACION_SELECT_TODOS, _competencia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CompetenciaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                competencias.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencias;
    }
    
    public List<Competencia> encontrarPorUsuarioConObjetos(Integer idUsuario) throws Exception {
        List<Competencia> competencias = new ArrayList<Competencia>();
        try {            
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(CompetenciaParametros.CONSULTA_COMPETENCIAS_POR_USUARIO_CON_OBJETOS, idUsuario));
            while (dbr.next()) {
                competencias.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return competencias;
    }
    //</editor-fold>      
}
