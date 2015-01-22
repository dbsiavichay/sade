/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gisyt2
 */
public class Procedimiento {

    private String nombrePA;
    private List<Parametro> parametros;
    
    public String getNombrePA() {
        return nombrePA;        
    }

    public List<Parametro> getParametros() {
        return parametros;
    }

    public void setNombrePA(String nombrePA) {
        this.nombrePA = nombrePA;
    }

    public void setParametros(List<Parametro> parametros) {
        this.parametros = parametros;
    }

    public Procedimiento() {
        this.nombrePA = "S/N";
        this.parametros = new ArrayList<Parametro>();
    }

    public Procedimiento(String nombrePA, List<Parametro> parametros) {
        this.nombrePA = nombrePA;
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return this.nombrePA + " : " + this.parametros.size();
    }
}
