/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.Categoria;
import informacion.parametros.CategoriaParametros;
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
public class CategoriaModel {

    //<editor-fold defaultstate="collapsed" desc="Configuraciones">    
    private Categoria cargaDatos(DataBaseReader dbr) throws Exception {
        Categoria categoria = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigo = dbr.getString("outcodigo");
            String nombre = dbr.getString("outnombre");
            Double ponderacion = dbr.getDecimal("outponderacion");
            Boolean estudioFormal = dbr.getBoolean("outestudio_formal");
            Integer orden = dbr.getInt32("outorden");
            categoria = new Categoria(id, codigo, nombre, ponderacion, estudioFormal, orden);
        } catch (Exception ex) {
            throw ex;
        }
        return categoria;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Categoria categoria) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, categoria.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, categoria.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametros.add(new Parametro(4, categoria.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));
        parametros.add(new Parametro(5, categoria.getPonderacion(), Boolean.TRUE, "inponderacion", Types.NUMERIC));
        parametros.add(new Parametro(6, categoria.getEstudioFormal(), Boolean.TRUE, "inestudio_formal", Types.BOOLEAN));
        parametros.add(new Parametro(7, categoria.getOrden(), Boolean.TRUE, "inorden", Types.INTEGER));
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Ingreso, Actualizacion, Eliminacion">         
    public Categoria crear(Categoria entidad) throws Exception {
        Categoria categoria = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CategoriaParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CategoriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                categoria = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return categoria;
    }

    public Categoria editar(Categoria entidad) throws Exception {
        Categoria categoria = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CategoriaParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CategoriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                categoria = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return categoria;
    }

    public Boolean eliminar(Categoria entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CategoriaParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CategoriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            dbr.close();
            exito = true;
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc="Funciones Select">       
    public Categoria encontrar(Object unSecuencial) throws Exception {
        Categoria categoria = null;
        try {
            Categoria _categoria = new Categoria();
            _categoria.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(CategoriaParametros.OPERACION_SELECT_ID, _categoria);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CategoriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                categoria = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return categoria;
    }        

    public List<Categoria> encontrarTodos() throws Exception {
        List<Categoria> categorias = new ArrayList<Categoria>();
        try {
            Categoria _categoria = new Categoria();
            List<Parametro> parametros = this.getParametrosEntrada(CategoriaParametros.OPERACION_SELECT_TODOS, _categoria);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CategoriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                categorias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return categorias;
    }    
    //</editor-fold>
}
