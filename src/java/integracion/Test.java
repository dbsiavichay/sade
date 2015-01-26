/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import informacion.servicios.WebServiceModel;
import wsInfoCarrera.Persona;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {
        // TODO code application logic here   
        try {
            WebServiceModel model = new WebServiceModel();
            Persona persona = model.getDatosDocente("EISMAC", "140069014-3");
            System.out.println(persona.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }                          
    }
}

