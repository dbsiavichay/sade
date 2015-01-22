/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import informacion.entidades.CampoDetallado;
import informacion.entidades.Materia;
import informacion.parametros.MateriaParametros;
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
public class MateriaModel {

    //<editor-fold defaultstate="collapsed" desc="CONFIGURACIONES">
    private Materia cargaDatos(DataBaseReader dbr) throws Exception {
        Materia materia = null;
        try {
            Integer id = dbr.getInt32("outid");
            String codigoCarrera = dbr.getString("outcodigo_carrera");
            String nombreCarrera = dbr.getString("outnombre_carrera");
            String codigoMateria = dbr.getString("outcodigo_materia");
            String nombreMateria = dbr.getString("outnombre_materia");
            materia = new Materia(id, codigoCarrera, nombreCarrera, codigoMateria, nombreMateria);
        } catch (Exception ex) {
            throw ex;
        }
        return materia;
    }

    private List<Parametro> getParametrosEntrada(String operacion, Materia materia) {
        ArrayList<Parametro> parametros = new ArrayList<Parametro>();
        parametros.add(new Parametro(1, operacion, Boolean.TRUE, "inoperacion", Types.VARCHAR));
        parametros.add(new Parametro(2, materia.getId(), Boolean.TRUE, "inid", Types.INTEGER));
        parametros.add(new Parametro(3, materia.getCodigoCarrera(), Boolean.TRUE, "incodigo_carrera", Types.VARCHAR));
        parametros.add(new Parametro(4, materia.getNombreCarrera(), Boolean.TRUE, "innombre_carerra", Types.VARCHAR));
        parametros.add(new Parametro(5, materia.getCodigoMateria(), Boolean.TRUE, "incodigo_materia", Types.VARCHAR));
        parametros.add(new Parametro(6, materia.getNombreMateria(), Boolean.TRUE, "innombre_materia", Types.VARCHAR));
        return parametros;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="INGRESO, ACTUALIZACION, ELIMINACION">
    public Materia crear(Materia entidad) throws Exception {
        Materia materia = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_INGRESA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materia = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materia;
    }

    public Materia editar(Materia entidad) throws Exception {
        Materia materia = null;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_ACTUALIZA, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materia = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materia;
    }

    public Boolean eliminar(Materia entidad) throws Exception {
        Boolean exito = false;
        try {
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_ELIMINAR, entidad);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            exito = true;
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return exito;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES SELECT">
    public Materia encontrar(Object unSecuencial) throws Exception {
        Materia materia = null;
        try {
            Materia _materia = new Materia();
            _materia.setId((Integer) unSecuencial);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_ID, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            if (dbr.next()) {
                materia = cargaDatos(dbr);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materia;
    }

    public List<Materia> encontrarPorCarrera(String codigoCarrera) throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            Materia _materia = new Materia();
            _materia.setCodigoCarrera(codigoCarrera);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_POR_CARRERA, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }   

    public List<Materia> encontrarPorProceso(Integer idProceso) throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            Materia _materia = new Materia();
            _materia.setId(idProceso);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_POR_PROCESO, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }
    
    public List<Materia> encontrarSinCampoDetalladoPorCarrera(String codigoCarrera) throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            Materia _materia = new Materia();
            _materia.setCodigoCarrera(codigoCarrera);
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_SIN_CAMPO_DETALLADO_POR_CARRERA, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }
    
    public List<Materia> encontrarSinCampoDetallado() throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            Materia _materia = new Materia();
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_SIN_CAMPO_DETALLADO, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }

    public List<Materia> encontrarTodos() throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            Materia _materia = new Materia();
            List<Parametro> parametros = this.getParametrosEntrada(MateriaParametros.OPERACION_SELECT_TODOS, _materia);
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(MateriaParametros.NOMBRE_PROCEDIMIENTO, parametros);
            while (dbr.next()) {
                materias.add(cargaDatos(dbr));
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }

    public List<Materia> consultaMateriaPorProcesoConCampos(Integer idProceso) throws Exception {
        List<Materia> materias = new ArrayList<Materia>();
        try {
            DataBaseReader dbr = AccesoDatos.ejecutaQuery(String.format(MateriaParametros.CONSULTA_MATERIAS_POR_PROCESO_CON_CAMPOS_DETALLADOS, idProceso));
            while (dbr.next()) {
                Materia materia = new Materia();
                materia.setId(dbr.getInt32(1));
                materia.setCodigoCarrera(dbr.getString(2));
                materia.setNombreCarrera(dbr.getString(3));
                materia.setCodigoMateria(dbr.getString(4));
                materia.setNombreMateria(dbr.getString(5));

                String strCampos = dbr.getCampo(6).toString();
                if (!strCampos.equals("{}")) {
                    strCampos = strCampos.replace("{\"", "").replace("\"}", "").replace("\\\"", "").replace(",>,", ">");
                    strCampos = strCampos.replace("\",\"", "-").replace("(", "").replace(")", "").replace(",", ":");
                    String[] arrCammpos = strCampos.split("-");
                    for (String strCampoObjeto : arrCammpos) {
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
                        materia.getCamposDetallados().add(campoDetallado);
                    }
                }
                materias.add(materia);
            }
            dbr.close();
        } catch (Exception e) {
            throw e;
        }
        return materias;
    }
    //</editor-fold>    
}
