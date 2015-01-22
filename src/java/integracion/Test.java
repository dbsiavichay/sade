/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion;

import informacion.servicios.WebServiceModel;
import java.util.List;
import wsInfoCarrera.MateriaPensum;

/**
 *
 * @author Denis
 */
public class Test {

    public static void main(String[] args) {
        // TODO code application logic here   

//        wsInfoGeneral.InfoGeneral service = new wsInfoGeneral.InfoGeneral();
//        wsInfoGeneral.InfoGeneralSoap port = service.getInfoGeneralSoap();
//
//        WSBindingProvider bp = (WSBindingProvider) port;
//        JAXBContext jc = null;
//        try {
//            jc = JAXBContext.newInstance(service.getClass().getPackage().getName());
//        } catch (JAXBException ex) {
//        }
//
//        wsInfoGeneral.ObjectFactory of = new wsInfoGeneral.ObjectFactory();
//        wsInfoGeneral.Credentials cre = of.createCredentials();
//        cre.setUsername("webmail");
//        cre.setPassword("webmail");
//        JAXBElement<wsInfoGeneral.Credentials> jaxbah = of.createCredentials(cre);
//        bp.setOutboundHeaders(Headers.create((JAXBRIContext) jc, jaxbah));
//
//        wsInfoGeneral.ArrayOfUnidadAcademica carreras = port.getTodasCarreras();
//        wsInfoGeneral.ArrayOfFacultad facultades = port.getTodasFacultades();        
// 
//        for (wsInfoGeneral.Facultad facultad : facultades.getFacultad()) {
//            System.out.println(facultad.getNombre());
//        }


//        wsInfoCarrera.InfoCarrera service = new wsInfoCarrera.InfoCarrera();
//        wsInfoCarrera.InfoCarreraSoap port = service.getInfoCarreraSoap();
//        
//        
//        WSBindingProvider bp = (WSBindingProvider) port;
//        
//        JAXBContext jc = null;
//        try {
//            jc = JAXBContext.newInstance(service.getClass().getPackage().getName());
//        } catch (JAXBException ex) {
//        }
//        
//        wsInfoCarrera.ObjectFactory of = new wsInfoCarrera.ObjectFactory();
//        wsInfoCarrera.Credentials cre = of.createCredentials();
//        cre.setUsername("webmail");
//        cre.setPassword("webmail");
//        JAXBElement<wsInfoCarrera.Credentials> jaxbah = of.createCredentials(cre);
//        bp.setOutboundHeaders(Headers.create((JAXBRIContext) jc, jaxbah));
//                                             
//        wsInfoCarrera.ArrayOfTitulosDocente titulos = port.getTitulosDocentes("EIS", "180339867-4");
//        
//        for(wsInfoCarrera.TitulosDocente titulo: titulos.getTitulosDocente()){
//            System.out.println(titulo.getStrDescripcion());       
//        }       



    }
}
