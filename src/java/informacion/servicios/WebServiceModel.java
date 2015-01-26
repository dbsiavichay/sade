/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.servicios;

import com.sun.xml.bind.api.JAXBRIContext;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;
import informacion.entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import wsInfoCarrera.ArrayOfMateriaPensum;
import wsInfoCarrera.InfoCarreraSoap;
import wsInfoCarrera.MateriaPensum;
import wsInfoCarrera.Persona;
import wsInfoGeneral.ArrayOfEscuela;
import wsInfoGeneral.ArrayOfUnidadAcademica;
import wsInfoGeneral.Escuela;
import wsInfoGeneral.InfoGeneralSoap;
import wsInfoGeneral.UnidadAcademica;
import wsInfoSeguridad.ArrayOfRolCarrera;
import wsInfoSeguridad.RolCarrera;
import wsInfoSeguridad.SeguridadSoap;

/**
 *
 * @author Denis
 */
public class WebServiceModel {

    private InfoGeneralSoap portGeneral;
    private InfoCarreraSoap portCarrera;
    private SeguridadSoap portSeguridad;

    public WebServiceModel() throws Exception {
        wsInfoGeneral.InfoGeneral serviceGeneral = new wsInfoGeneral.InfoGeneral();
        this.portGeneral = serviceGeneral.getInfoGeneralSoap();

        wsInfoCarrera.InfoCarrera serviceCarrera = new wsInfoCarrera.InfoCarrera();
        this.portCarrera = serviceCarrera.getInfoCarreraSoap();

        wsInfoSeguridad.Seguridad serviceSeguridad = new wsInfoSeguridad.Seguridad();
        this.portSeguridad = serviceSeguridad.getSeguridadSoap();

        try {
            WSBindingProvider bpGeneral = (WSBindingProvider) this.portGeneral;
            WSBindingProvider bpCarerra = (WSBindingProvider) this.portCarrera;
            WSBindingProvider bpSeguridad = (WSBindingProvider) this.portSeguridad;

            JAXBContext jcGeneral = JAXBContext.newInstance(serviceGeneral.getClass().getPackage().getName());
            JAXBContext jcCarrera = JAXBContext.newInstance(serviceCarrera.getClass().getPackage().getName());
            JAXBContext jcSeguridad = JAXBContext.newInstance(serviceSeguridad.getClass().getPackage().getName());


            wsInfoGeneral.ObjectFactory ofGeneral = new wsInfoGeneral.ObjectFactory();
            wsInfoGeneral.Credentials creGeneral = ofGeneral.createCredentials();
            creGeneral.setUsername("webmail");
            creGeneral.setPassword("webmail");

            wsInfoCarrera.ObjectFactory ofCarrera = new wsInfoCarrera.ObjectFactory();
            wsInfoCarrera.Credentials creCarrera = ofCarrera.createCredentials();
            creCarrera.setUsername("webmail");
            creCarrera.setPassword("webmail");

            wsInfoSeguridad.ObjectFactory ofSeguridad = new wsInfoSeguridad.ObjectFactory();
            wsInfoSeguridad.Credentials creSeguridad = ofSeguridad.createCredentials();
            creSeguridad.setUsername("webmail");
            creSeguridad.setPassword("webmail");

            JAXBElement<wsInfoGeneral.Credentials> jaxbGeneral = ofGeneral.createCredentials(creGeneral);
            JAXBElement<wsInfoCarrera.Credentials> jaxbCarrera = ofCarrera.createCredentials(creCarrera);
            JAXBElement<wsInfoSeguridad.Credentials> jaxbSeguridad = ofSeguridad.createCredentials(creSeguridad);

            bpGeneral.setOutboundHeaders(Headers.create((JAXBRIContext) jcGeneral, jaxbGeneral));
            bpCarerra.setOutboundHeaders(Headers.create((JAXBRIContext) jcCarrera, jaxbCarrera));
            bpSeguridad.setOutboundHeaders(Headers.create((JAXBRIContext) jcSeguridad, jaxbSeguridad));
        } catch (Exception e) {
            throw new Exception("Error en el constructor.\n" + e.getMessage());
        }
    }

    public List<Materia> getMateriasFie() throws Exception {
        List<Materia> materias = new ArrayList<>();
        try {
            List<UnidadAcademica> carreras = this.getCarrerasFie();

            for (UnidadAcademica carrera : carreras) {                
                ArrayOfMateriaPensum array = this.portCarrera.getMallaCurricularPensumVigenteSinDescripcion(carrera.getCodigo());
                for (MateriaPensum materia : array.getMateriaPensum()) {
                    Materia mat = new Materia();
                    mat.setCodigoCarrera(carrera.getCodigo());
                    mat.setNombreCarrera(carrera.getNombre());
                    mat.setCodigoMateria(materia.getCodMateria());
                    mat.setNombreMateria(materia.getMateria());
                    materias.add(mat);
                }
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener Materias.\n" + e.getMessage());
        }
        return materias;
    }

    public List<Materia> getMateriasCarrera(UnidadAcademica carrera) throws Exception {
        List<Materia> materias = new ArrayList<>();
        try {
            ArrayOfMateriaPensum array = this.portCarrera.getMallaCurricularPensumVigenteSinDescripcion(carrera.getCodigo());
            for (MateriaPensum materia : array.getMateriaPensum()) {
                Materia mat = new Materia();
                mat.setCodigoCarrera(carrera.getCodigo());
                mat.setNombreCarrera(carrera.getNombre());
                mat.setCodigoMateria(materia.getCodMateria());
                mat.setNombreMateria(materia.getMateria());
                materias.add(mat);
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener Materias.\n" + e.getMessage());
        }
        return materias;
    }

    public List<UnidadAcademica> getCarrerasFie() throws Exception {
        List<UnidadAcademica> carreras = new ArrayList<>();
        try {
            ArrayOfUnidadAcademica unidades = this.portGeneral.getTodasCarreras();
            List<UnidadAcademica> cars = unidades.getUnidadAcademica();
            List<Escuela> escuelasFie = this.getEscuelasFie();
            for (Escuela escuela : escuelasFie) {
                for (int i = 0; i < cars.size(); i++) {
                    if (cars.get(i).getCodEscuela().equals(escuela.getCodigo()) && cars.get(i).getCodEstado().equals("ABI")) {
                        carreras.add(cars.get(i));
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener Carreras.\n" + e.getMessage());
        }
        return carreras;
    }

    public List<Escuela> getEscuelasFie() throws Exception {
        List<Escuela> escuelas = new ArrayList<>();
        try {
            ArrayOfEscuela unidades = this.portGeneral.getTodasEscuelas();
            escuelas = unidades.getEscuela();
            for (int i = 0; i < escuelas.size(); i++) {
                if (!escuelas.get(i).getCodFacultad().equals("FIE")) {
                    escuelas.remove(i);
                    i = i - 1;
                }
            }
        } catch (Exception e) {
            throw new Exception("Error al obtener Escuelas Fie.\n" + e.getMessage());
        }
        return escuelas;
    }
    
    
    
    public String autenticarDocente(String usuario, String password) throws Exception{        
        String codigoCarrera = null;
        try {
            ArrayOfRolCarrera array = this.portSeguridad.autenticarUsuarioCarrera(usuario, password);
            if (array == null){
                return codigoCarrera;
            }
            List<RolCarrera> roles = array.getRolCarrera();            
            for (RolCarrera rol : roles) {
                if(rol.getNombreRol().equals("DOC")){
                    codigoCarrera = rol.getCodigoCarrera();
                    break;
                }
            }         
        } catch (Exception e) {
            throw e;
        }
        return codigoCarrera;
    }
    
    public Persona getDatosDocente(String codigoCarrera, String cedula) throws Exception{
        Persona persona = null;
        try {            
            persona = this.portCarrera.getDatosUsuarioCarrera(codigoCarrera, cedula);            
        } catch (Exception e) {
            throw e;
        }
        return persona;
    }
}
