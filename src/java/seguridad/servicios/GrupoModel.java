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
import seguridad.entidades.Grupo;
import seguridad.parametros.GrupoParametros;

/**
 *
 * @author Denis
 */
public class GrupoModel {
    
    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Grupo cargaDatos(DataBaseReader dbr) throws Exception {
        Grupo grupo = null;
        try {
            Integer id = dbr.getInt32("outid");
            String nombre = dbr.getString("outnombre");
            Integer orden = dbr.getInt32("outorden");
            Integer padre = dbr.getInt32("outpadre");            
            grupo = new Grupo(id, nombre, orden, padre);
        } catch (Exception ex) {
            throw ex;
        }
        return grupo;
    }        
        
    protected List<Parametro> getParametrosEntrada(String operacion, Grupo grupo) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, grupo.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, grupo.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));
        parametrosSalida.add(new Parametro(4, grupo.getOrden(), Boolean.TRUE, "inorden", Types.INTEGER));
        parametrosSalida.add(new Parametro(5, grupo.getPadre(), Boolean.TRUE, "inpadre", Types.INTEGER));        
        return parametrosSalida;
    }

    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Grupo crear(Grupo entidad) throws Exception {
        Grupo grupo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupo = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupo;
    }

    
    public Grupo editar(Grupo entidad) throws Exception {
        Grupo grupo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupo = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupo;
    }
    
    public Boolean eliminar(Grupo entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Funciones select">    
    public Grupo encontrar(Integer idGrupo) throws Exception {
        Grupo grupo = null;
        try {
            Grupo _grupo = new Grupo();
            _grupo.setId(idGrupo);
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_SELECT_ID, _grupo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupo = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupo;
    }
    
    public List<Grupo> encontrarPorPadre(Integer padre) throws Exception {
        List<Grupo> grupos = new ArrayList<Grupo>();
        try {
            Grupo _grupo = new Grupo();
            _grupo.setPadre(padre);
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_SELECT_POR_PADRE, _grupo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupos.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupos;
    }
    
     public List<Grupo> encontrarPorRol(Integer idRol) throws Exception {
        List<Grupo> grupos = new ArrayList<Grupo>();
        try {
            Grupo _grupo = new Grupo();
            _grupo.setId(idRol);
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_SELECT_POR_ROL, _grupo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupos.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupos;
    }
               
            
    public List<Grupo> encontrarTodos() throws Exception {
        List<Grupo> grupos = new ArrayList<Grupo>();
        try {
            Grupo _grupo = new Grupo();
            List<Parametro> parametros = this.getParametrosEntrada(GrupoParametros.OPERACION_SELECT_TODOS, _grupo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(GrupoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                grupos.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return grupos;
    }
    //</editor-fold> 
}
