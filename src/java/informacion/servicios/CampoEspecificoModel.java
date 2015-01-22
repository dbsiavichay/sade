/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.CampoDetallado;
import informacion.entidades.CampoEspecifico;
import informacion.parametros.CampoEspecificoParametros;
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
public class CampoEspecificoModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private CampoEspecifico cargaDatos(DataBaseReader dbr) throws Exception {
        CampoEspecifico campoEspecifico = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigo = dbr.getString("outcodigo");
            String nombre = dbr.getString("outnombre");
            Integer idCampoAmplio = dbr.getInt32("outid_campo_amplio");
            campoEspecifico = new CampoEspecifico(id, codigo, nombre, idCampoAmplio);
        } catch (Exception ex) {
            throw ex;
        }
        return campoEspecifico;
    }

    private List<Parametro> getParametrosEntrada(String operacion, CampoEspecifico campoEspecifico) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, campoEspecifico.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, campoEspecifico.getCodigo(), Boolean.TRUE, "incodigo", Types.VARCHAR));
        parametros.add(new Parametro(4, campoEspecifico.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));
        parametros.add(new Parametro(5, campoEspecifico.getIdCampoAmplio(), Boolean.TRUE, "inid_campo_amplio", Types.INTEGER));
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public CampoEspecifico crear(CampoEspecifico entidad) throws Exception {
        CampoEspecifico campoEspecifico = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoEspecifico = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoEspecifico;
    }

    public CampoEspecifico editar(CampoEspecifico entidad) throws Exception {
        CampoEspecifico campoEspecifico = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoEspecifico = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoEspecifico;
    }

    public Boolean eliminar(CampoEspecifico entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public CampoEspecifico encontrar(Object unSecuencial) throws Exception {
        CampoEspecifico campoEspecifico = null;
        try {
            CampoEspecifico _campoEspecifico = new CampoEspecifico();
            _campoEspecifico.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_SELECT_ID, _campoEspecifico);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                campoEspecifico = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return campoEspecifico;
    }

    public List<CampoEspecifico> encontrarPorCampoAmplio(Integer idCampoAmplio) throws Exception {
        List<CampoEspecifico> camposEspecificos = new ArrayList<CampoEspecifico>();
        try {
            CampoEspecifico _campoEspecifico = new CampoEspecifico();
            _campoEspecifico.setIdCampoAmplio(idCampoAmplio);
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_SELECT_POR_CAMPO_AMPLIO, _campoEspecifico);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposEspecificos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposEspecificos;
    }

    public List<CampoEspecifico> encontrarTodos() throws Exception {
        List<CampoEspecifico> camposEspecificos = new ArrayList<CampoEspecifico>();
        try {
            CampoEspecifico _campoEspecifico = new CampoEspecifico();
            List<Parametro> parametros = this.getParametrosEntrada(CampoEspecificoParametros.OPERACION_SELECT_TODOS, _campoEspecifico);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(CampoEspecificoParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                camposEspecificos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposEspecificos;
    }

    public List<CampoEspecifico> encontrarPorCampoAmplioConObjetos(Integer idCampoAmplio) throws Exception {
        List<CampoEspecifico> camposEspecificos = new ArrayList<CampoEspecifico>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(CampoEspecificoParametros.CONSULTA_CAMPOS_ESPECIFICOS_POR_CAMPO_AMPLIO_CON_OBJETOS, idCampoAmplio));
            while (dbr.next()) {
                CampoEspecifico campoEspecifico = new CampoEspecifico();
                campoEspecifico.setId(dbr.getInt32(1));
                campoEspecifico.setCodigo(dbr.getString(2));
                campoEspecifico.setNombre(dbr.getString(3));
                campoEspecifico.setIdCampoAmplio(dbr.getInt32(4));

                Object objCamposDetallados = dbr.getCampo(5);
                String strCamposDetallados = objCamposDetallados.toString();
                strCamposDetallados = strCamposDetallados.replace("\"", "").replace("\\", "").replace("),(", "-").replace("(", "").replace(")", "");
                strCamposDetallados = strCamposDetallados.replace("{", "").replace("}", "");
                String[] arrayCamposDetallados = strCamposDetallados.split("-");
                for (String strCampoDetallado : arrayCamposDetallados) {
                    CampoDetallado campoDetallado = new CampoDetallado();
                    String[] array = strCampoDetallado.replace(",", ":").split(":");
                    campoDetallado.setId(Integer.valueOf(array[0]));
                    campoDetallado.setCodigo(array[1]);
                    String nombre = "";
                    for (int i = 2; i < array.length - 1; i++) {
                        nombre = nombre + ", " + array[i];
                    }
                    nombre = nombre.replaceFirst(", ", "").trim();
                    campoDetallado.setNombre(nombre);
                    campoDetallado.setIdCampoEspecifico(Integer.valueOf(array[array.length - 1]));
                    campoEspecifico.getCamposDetallados().add(campoDetallado);
                }
                camposEspecificos.add(campoEspecifico);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return camposEspecificos;
    }
    //</editor-fold>    
}
