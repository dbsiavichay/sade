/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Daniel
 */
public class AccesoDatos {

    private static Connection conexion = null;

    public static void preparaTransaccion() throws SQLException {
        ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/sade_config");
        String url = String.format(recurso.getString("url"), recurso.getString("direccion"), recurso.getString("puerto"), recurso.getString("base"));
        conexion = DriverManager.getConnection(url, recurso.getString("usuario"), recurso.getString("password"));
        conexion.setAutoCommit(false);
    }

    public static void haceCommitConClose() throws SQLException {
        conexion.commit();
        conexion.close();
        conexion = null;
    }

    public static void haceRollbackConClose() throws SQLException {
        conexion.rollback();
        conexion.close();
        conexion = null;
    }

//    public static boolean ejecutaComando(String comando, List<Parametro> parametros) throws Exception {
//
//        boolean respuesta = false;
//        ResourceBundle recurso = ResourceBundle.getBundle("/ec/edu/espoch/talentoHumano/configuracion/talento_config");
//        String url = String.format(recurso.getString("url"), recurso.getString("direccion"), recurso.getString("puerto"), recurso.getString("base"));
//        Connection con = DriverManager.getConnection(url, recurso.getString("usuario"), recurso.getString("password"));
//        try {
//            Class.forName(recurso.getString("driver"));
//            try {
//                PreparedStatement ptrs = con.prepareStatement(comando);
//                for (Parametro parametro : parametros) {
//                    ptrs.setObject(parametro.getPosicion(), parametro.getValor());
//                }
//                ResultSet rst = ptrs.executeQuery();
//                if (rst.next()) {
//                    String bandera = rst.getString(1);
//                    respuesta = bandera.equals("t") ? true : false;
//                }
//                rst.close();
//                con.close();
//
//            } catch (SQLException exConec) {
//                con.close();
//                throw new Exception(exConec.getMessage());
//            }
//        } catch (ClassNotFoundException exCarga) {
//            throw new Exception(exCarga.getMessage());
//        }
//
//        return respuesta;
//    }
    public static DataBaseReader ejecutaQuery(String query) throws Exception {
        DataBaseReader rs = null;
        try {
            rs = new DataBaseReader(query);
        } catch (Exception ex) {
            throw ex;
        }

        return rs;
    }

    public static DataBaseReader ejecutaQuery(String query, List<Parametro> parametros) throws Exception {
        DataBaseReader rs = null;
        try {
            rs = new DataBaseReader(query, parametros);
        } catch (Exception ex) {
            throw ex;
        }
        return rs;
    }

    public static DataBaseReader ejecutaQueryTransaccion(Procedimiento comando) throws Exception {
        DataBaseReader dbr = null;
        if (conexion == null) {
            throw new Exception("No se ha preparado el accesos a datos para realizar transacciones.");
        }
        ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/sade_config");
        try {
            Class.forName(recurso.getString("driver"));
            try {
                dbr = new DataBaseReader(comando.getNombrePA(), comando.getParametros(), conexion);
            } catch (SQLException exConec) {
                throw new Exception(exConec.getMessage());
            }
        } catch (Exception ex) {
            throw ex;
        }
        return dbr;
    }
//    public static boolean ejecutaQueryTransaccion(List<Procedimiento> comandos) throws Exception {
//        boolean respuesta = false;
//        ResourceBundle recurso = ResourceBundle.getBundle("/ec/edu/espoch/talentohumano/configuracion/talento_config");
//        String url = String.format(recurso.getString("url"), recurso.getString("direccion"), recurso.getString("puerto"), recurso.getString("base"));
//        Connection con = DriverManager.getConnection(url, recurso.getString("usuario"), recurso.getString("password"));
//        try {
//            Class.forName(recurso.getString("driver"));
//            try {
//                if (con.getAutoCommit()) {
//                    con.setAutoCommit(false);
//                }
//                for (Procedimiento comando : comandos) {
//                    CallableStatement ptrs = con.prepareCall(comando.getNombrePA());
//                    for (Parametro parametro : comando.getParametros()) {
//                        if (parametro.getEntrada()) {
//                            ptrs.setObject(parametro.getNombre(), parametro.getValor());
//                        }
//                    }
//                    for (Parametro parametro : comando.getParametros()) {
//                        if (!parametro.getEntrada()) {
//                            ptrs.registerOutParameter(parametro.getNombre(), parametro.getTipo());
//                        }
//                    }
//                    respuesta = ptrs.execute();
//                }
//                con.commit();
//                con.close();
//                respuesta = true;
//
//            } catch (SQLException exConec) {
//                con.rollback();
//                con.close();
//                return false;
//            }
//        } catch (Exception ex) {
//            throw ex;
//        }
//        return respuesta;
//    }
}
