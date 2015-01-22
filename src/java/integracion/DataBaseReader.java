/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import java.sql.*;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class DataBaseReader {

    private Connection con;
    private PreparedStatement lectora;
    private ResultSet result;
   

    public DataBaseReader() throws Exception {
        this.con = null;
        this.lectora = null;
        this.result = null;
    }

    public DataBaseReader(String cadComando) throws Exception {
        try {

            ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/sade_config");
            String url = String.format(recurso.getString("url"), recurso.getString("direccion"), recurso.getString("puerto"), recurso.getString("base"));
            Class.forName(recurso.getString("driver"));
            try {

                this.con = DriverManager.getConnection(url, recurso.getString("usuario"), recurso.getString("password"));
                PreparedStatement ptrs = con.prepareStatement(cadComando);
                result = ptrs.executeQuery();
            } catch (SQLException exConec) {
                throw new Exception(exConec.getMessage());
            }
        } catch (ClassNotFoundException exCarga) {
            throw new Exception(exCarga.getMessage());
        }
    }

    public DataBaseReader(String cadComando, List<Parametro> listaParametros) throws Exception {
        try {
            ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/sade_config");
            Class.forName(recurso.getString("driver"));
            try {
                String url = String.format(recurso.getString("url"), recurso.getString("direccion"), recurso.getString("puerto"), recurso.getString("base"));
                this.con = DriverManager.getConnection(url, recurso.getString("usuario"), recurso.getString("password"));
                lectora = con.prepareStatement(cadComando);                
                for (Parametro parametro : listaParametros) {
                    if (parametro.getEntrada()) {
                        if(parametro.getTipo()==Types.JAVA_OBJECT){
                            lectora.setObject(parametro.getPosicion(), parametro.getValor());                            
                        }else{
                        lectora.setObject(parametro.getPosicion(), parametro.getValor(), parametro.getTipo());
                        }
                    }
                }
                result = this.lectora.executeQuery();
            } catch (SQLException exConec) {
                throw new Exception(exConec.getMessage());
            }
        } catch (ClassNotFoundException exCarga) {
            throw new Exception(exCarga);
        }
    }
    
     public DataBaseReader(String cadComando, List<Parametro> listaParametros, Connection conexion) throws Exception {
        try {
            ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/sade_config");
            Class.forName(recurso.getString("driver"));
            try {
                lectora = conexion.prepareStatement(cadComando);
                for (Parametro parametro : listaParametros) {
                    if (parametro.getEntrada()) {
                        if(parametro.getTipo()==Types.JAVA_OBJECT){
                            lectora.setObject(parametro.getPosicion(), parametro.getValor());
                        }else{
                        lectora.setObject(parametro.getPosicion(), parametro.getValor(), parametro.getTipo());
                        }
                    }
                }
                result = this.lectora.executeQuery();
            } catch (SQLException exConec) {
                throw new Exception(exConec.getMessage());
            }
        } catch (ClassNotFoundException exCarga) {
            throw new Exception(exCarga);
        }
    }
     
      public ResultSet getResult() {
        return result;
    }

    public void close() throws Exception {
        if (this.result != null) {
            this.result.close();
        }
        if (this.lectora != null) {
            this.lectora.close();
        }
        this.con.close();
    }

    public boolean isClosed() throws Exception {
        return this.lectora.isClosed();
    }

    public void setResultSet(String nombrePuntero) throws Exception {
        this.result = (ResultSet) this.result.getObject(nombrePuntero);
    }

    public boolean next() throws Exception {
        return this.result.next();
    }

    public String getString(int nCol) throws Exception {

        if (this.result != null) {
            return this.result.getString(nCol);
        } else {
            return null;
        }
    }

    public Short getInt16(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getShort(nCol);
        } else {
            return null;
        }
    }

    public Integer getInt32(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getInt(nCol);
        } else {
            return null;
        }
    }

    public Long getLong(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getLong(nCol);
        } else {
            return null;
        }
    }

    public byte getByte(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getByte(nCol);
        } else {
            return new Byte("");
        }

    }

    public Date getDate(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getDate(nCol);
        } else {
            return null;
        }
    }

    public Timestamp getTimestamp(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getTimestamp(nCol);
        } else {
            return null;
        }
    }

    public double getDecimal(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getDouble(nCol);
        } else {
            return new Double(0);
        }
    }

    public boolean getBoolean(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getBoolean(nCol);
        } else {
            return false;
        }
    }

    public Object getCampo(int nCol) throws Exception {
        if (this.result != null) {
            return this.result.getObject(nCol);
        } else {
            return null;
        }
    }

    ////nombres
    public String getString(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getString(nCol);
        } else {
            return null;
        }
    }

    public Short getInt16(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getShort(nCol);
        } else {
            return null;
        }
    }

    public Integer getInt32(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getInt(nCol);
        } else {
            return null;
        }
    }

    public Long getLong(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getLong(nCol);
        } else {
            return null;
        }
    }

    public byte getByte(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getByte(nCol);
        } else {
            return new Byte("");
        }

    }

    public Date getDate(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getDate(nCol);
        } else {
            return null;
        }
    }

    public Timestamp getTimestamp(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getTimestamp(nCol);
        } else {
            return null;
        }
    }

    public double getDecimal(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getDouble(nCol);
        } else {
            return new Double(0);
        }
    }

    public boolean getBoolean(String nCol) throws Exception {
        if (this.result != null) {
            return this.result.getBoolean(nCol);
        } else {
            return false;
        }
    }

    public Object getCampo(String nCol) throws Exception {
        return this.result.getObject(nCol);
    }

    public byte[] getBytes(String string) {
        try {
            return this.result.getBytes(string);            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;                
    }
}
