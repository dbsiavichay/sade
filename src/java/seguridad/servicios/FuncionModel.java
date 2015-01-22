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
import seguridad.entidades.Funcion;
import seguridad.parametros.FuncionParametros;

/**
 *
 * @author Denis
 */
public class FuncionModel {
    
    //   <editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Funcion cargaDatos(DataBaseReader dbr) throws Exception {
        Funcion funcion = null;
        try {
            Integer id = dbr.getInt32("outid");
            Boolean puedeAgregar = dbr.getBoolean("outagregar");
            Boolean puedeEditar = dbr.getBoolean("outeditar");
            Boolean puedeEliminar = dbr.getBoolean("outeliminar");
            Integer orden = dbr.getInt32("outorden");
            Boolean activo = dbr.getBoolean("outactivo");
            Integer idCategoria = dbr.getInt32("outid_grupo");
            Integer idEnlace = dbr.getInt32("outid_accion");
            Integer idRol = dbr.getInt32("outid_rol");
            funcion = new Funcion(id, puedeAgregar, puedeEditar, puedeEliminar, orden, activo, idCategoria, idEnlace, idRol);
        } catch (Exception ex) {
            throw ex;
        }
        return funcion;
    }
    
    private Funcion cargaDatosConObjetos(DataBaseReader dbr) throws Exception{
        Funcion funcion = new Funcion();
        try {
            funcion.setId(dbr.getInt32(1));
            funcion.setAgregar(dbr.getBoolean(2));
            funcion.setEditar(dbr.getBoolean(3));
            funcion.setEliminar(dbr.getBoolean(4));
            funcion.setOrden(dbr.getInt32(5));
            funcion.setActivo(dbr.getBoolean(6));
            funcion.setIdGrupo(dbr.getInt32(7));
            funcion.setIdAccion(dbr.getInt32(8));
            funcion.setIdRol(dbr.getInt32(9));
            
            funcion.getGrupo().setId(dbr.getInt32(10));
            funcion.getGrupo().setNombre(dbr.getString(11));
            funcion.getGrupo().setOrden(dbr.getInt32(12));
            funcion.getGrupo().setPadre(dbr.getInt32(13));
            
            funcion.getAccion().setId(dbr.getInt32(14));
            funcion.getAccion().setNombre(dbr.getString(15));
            funcion.getAccion().setUrl(dbr.getString(16));
            funcion.getAccion().setActivo(dbr.getBoolean(17));
            
            funcion.getRol().setId(dbr.getInt32(18));
            funcion.getRol().setCodigo(dbr.getString(19));
            funcion.getRol().setNombre(dbr.getString(20));
            funcion.getRol().setActivo(dbr.getBoolean(21));
        } catch (Exception e) {
            funcion = null;
            throw e;
        }
        return funcion;
    }

    protected List<Parametro> getParametrosEntrada(String operacion, Funcion funcion) {
        ArrayList<Parametro> parametrosSalida = new ArrayList<Parametro>();
        parametrosSalida.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametrosSalida.add(new Parametro(2, funcion.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametrosSalida.add(new Parametro(3, funcion.getAgregar(), Boolean.TRUE, "inpuede_agregar", Types.BOOLEAN));
        parametrosSalida.add(new Parametro(4, funcion.getEditar(), Boolean.TRUE, "inpuede_editar", Types.BOOLEAN));
        parametrosSalida.add(new Parametro(5, funcion.getEliminar(), Boolean.TRUE, "inpuede_eliminar", Types.BOOLEAN));
        parametrosSalida.add(new Parametro(6, funcion.getOrden(), Boolean.TRUE, "inorden", Types.INTEGER));
        parametrosSalida.add(new Parametro(7, funcion.getActivo(), Boolean.TRUE, "inactivo", Types.BOOLEAN));
        parametrosSalida.add(new Parametro(8, funcion.getIdGrupo(), Boolean.TRUE, "inid_grupo", Types.INTEGER));
        parametrosSalida.add(new Parametro(9, funcion.getIdAccion(), Boolean.TRUE, "inid_accion", Types.INTEGER));
        parametrosSalida.add(new Parametro(10, funcion.getIdRol(), Boolean.TRUE, "inid_rol", Types.INTEGER));
        return parametrosSalida;
    }

    //</editor-fold>
    
    //   <editor-fold defaultstate="collapsed" desc="Ingreso, actualizacion y eliminacion">    
    public Funcion crear(Funcion entidad) throws Exception {
        Funcion funcion = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                funcion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funcion;
    }

    public Funcion editar(Funcion entidad) throws Exception {
        Funcion funcion = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                funcion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funcion;
    }

    public Boolean eliminar(Funcion entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //   <editor-fold defaultstate="collapsed" desc="Funciones select">    
    public Funcion encontrar(Integer idFuncion) throws Exception {
        Funcion funcion = null;
        try {
            Funcion _funcion = new Funcion();
            _funcion.setId(idFuncion);
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_SELECT_ID, _funcion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                funcion = this.cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funcion;
    }

    public List<Funcion> encontrarPorGrupoYRol(Integer idGrupo, Integer idRol) throws Exception {
        List<Funcion> funciones = new ArrayList<Funcion>();
        try {
            Funcion _funcion = new Funcion();
            _funcion.setIdGrupo(idGrupo);
            _funcion.setIdRol(idRol);
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_SELECT_POR_GRUPO_Y_ROL, _funcion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                funciones.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funciones;
    }       

    public List<Funcion> encontrarTodos() throws Exception {
        List<Funcion> funciones = new ArrayList<Funcion>();
        try {
            Funcion _funcion = new Funcion();
            List<Parametro> parametros = this.getParametrosEntrada(FuncionParametros.OPERACION_SELECT_TODOS, _funcion);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(FuncionParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                funciones.add(this.cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funciones;
    }
    
    public List<Funcion> encontrarPorRolConObjetos(Integer idRol) throws Exception {
        List<Funcion> funciones = new ArrayList<Funcion>();
        try {            
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(FuncionParametros.CONSULTA_FUNCIONES_POR_ROL_CON_OBJETOS, idRol));
            while (dbr.next()) {
                funciones.add(this.cargaDatosConObjetos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return funciones;
    }
    //</editor-fold>      
}
