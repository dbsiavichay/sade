/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.servicios;

import evidencia.entidades.Titulo;
import evidencia.parametros.TituloParametros;
import informacion.entidades.CampoDetallado;
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
public class TituloModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Titulo cargaDatos(DataBaseReader dbr) throws Exception {
        Titulo titulo = null;
        try {
            Integer id = dbr.getInt32("outid");
            String nombre = dbr.getString("outnombre");
            String registro = dbr.getString("outregistro");
            String urlDocumento = dbr.getString("outurl_documento");
            Integer idDocente = dbr.getInt32("outid_docente");
            Integer idCategoria = dbr.getInt32("outid_categoria");
            titulo = new Titulo(id, nombre, registro, urlDocumento, idDocente, idCategoria);
        } catch (Exception ex) {
            throw ex;
        }
        return titulo;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Titulo perfil) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, perfil.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, perfil.getNombre(), Boolean.TRUE, "innombre", Types.VARCHAR));
        parametros.add(new Parametro(4, perfil.getRegistro(), Boolean.TRUE, "inregistro", Types.VARCHAR));
        parametros.add(new Parametro(5, perfil.getUrlDocumento(), Boolean.TRUE, "inurl_documento", Types.VARCHAR));
        parametros.add(new Parametro(6, perfil.getIdDocente(), Boolean.TRUE, "inid_docente", Types.INTEGER));
        parametros.add(new Parametro(7, perfil.getIdCategoria(), Boolean.TRUE, "inid_categoria", Types.INTEGER));
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Titulo crear(Titulo entidad) throws Exception {
        Titulo titulo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                titulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulo;
    }

    public Titulo editar(Titulo entidad) throws Exception {
        Titulo titulo = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                titulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulo;
    }

    public Boolean eliminar(Titulo entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Titulo encontrar(Object unSecuencial) throws Exception {
        Titulo titulo = null;
        try {
            Titulo _perfil = new Titulo();
            _perfil.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_SELECT_ID, _perfil);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                titulo = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulo;
    }

    public List<Titulo> encontrarPorDocente(Integer idDocente) throws Exception {
        List<Titulo> titulos = new ArrayList<Titulo>();
        try {
            Titulo _titulo = new Titulo();
            _titulo.setIdDocente(idDocente);
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_SELECT_DOCENTE, _titulo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                titulos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulos;
    }

    public List<Titulo> encontrarTodos() throws Exception {
        List<Titulo> titulos = new ArrayList<Titulo>();
        try {
            Titulo _titulo = new Titulo();
            List<Parametro> parametros = this.getParametrosEntrada(TituloParametros.OPERACION_SELECT_TODOS, _titulo);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(TituloParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                titulos.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulos;
    }

    public List<Titulo> consultaTitulosPorDocenteConCampos(Integer idDocente) throws Exception {
        List<Titulo> titulos = new ArrayList<Titulo>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(TituloParametros.CONSULTA_TITULOS_POR_DOCENTE_CON_CAMPOS, idDocente));
            while (dbr.next()) {
                Titulo titulo = new Titulo();
                titulo.setId(dbr.getInt32(1));
                titulo.setNombre(dbr.getString(2));
                titulo.setRegistro(dbr.getString(3));
                titulo.setUrlDocumento(dbr.getString(4));
                titulo.setIdDocente(dbr.getInt32(5));
                titulo.setIdCategoria(dbr.getInt32(6));

                titulo.getCategoria().setId(dbr.getInt32(7));
                titulo.getCategoria().setCodigo(dbr.getString(8));
                titulo.getCategoria().setNombre(dbr.getString(9));
                titulo.getCategoria().setPonderacion(dbr.getDecimal(10));
                titulo.getCategoria().setEstudioFormal(dbr.getBoolean(11));
                titulo.getCategoria().setOrden(dbr.getInt32(12));


                String strCampos = dbr.getCampo(13).toString();
                if (!strCampos.equals("{}")) {
                    strCampos = strCampos.replace("{\"", "").replace("\"}", "").replace("\\\"", "").replace(",>,", ">");
                    strCampos = strCampos.replace("\",\"", "-").replace("(", "").replace(")", "").replace(",", ":");
                    String[] arrCampos = strCampos.split("-");
                    for (String strCampoObjeto : arrCampos) {
                        CampoDetallado campoDetallado = new CampoDetallado();
                        String strCampoDetallado = strCampoObjeto.split(">")[0];
                        String strCampoEspecifico = strCampoObjeto.split(">")[1];

                        String[] arrCampoDetallado = strCampoDetallado.split(":");
                        campoDetallado.setId(Integer.valueOf(arrCampoDetallado[0]));
                        campoDetallado.setCodigo(arrCampoDetallado[1]);
                        campoDetallado.setNombre("");
                        for (int i = 2; i < arrCampoDetallado.length-1; i++) {
                            campoDetallado.setNombre(campoDetallado.getNombre().concat(arrCampoDetallado[i].trim()));
                            if(i!=arrCampoDetallado.length-2){
                                campoDetallado.setNombre(campoDetallado.getNombre().concat(", "));
                            }
                        }                        
                        campoDetallado.setIdCampoEspecifico(Integer.valueOf(arrCampoDetallado[arrCampoDetallado.length-1]));

                        String[] arrCampoEspecifico = strCampoEspecifico.split(":");
                        campoDetallado.getCampoEspecifico().setId(Integer.valueOf(arrCampoEspecifico[0]));
                        campoDetallado.getCampoEspecifico().setCodigo(arrCampoEspecifico[1]);                        
                        campoDetallado.getCampoEspecifico().setNombre("");
                        for (int i = 2; i < arrCampoEspecifico.length-1; i++) {
                            campoDetallado.getCampoEspecifico().setNombre(campoDetallado.getCampoEspecifico().getNombre().concat(arrCampoEspecifico[i].trim()));
                            if(i!=arrCampoEspecifico.length-2){
                                campoDetallado.getCampoEspecifico().setNombre(campoDetallado.getCampoEspecifico().getNombre().concat(", "));
                            }
                        }
                        campoDetallado.getCampoEspecifico().setIdCampoAmplio(Integer.valueOf(arrCampoEspecifico[arrCampoEspecifico.length-1]));
                        titulo.getCamposDetallados().add(campoDetallado);
                    }
                }
                titulos.add(titulo);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return titulos;
    }
    //</editor-fold>    
}
