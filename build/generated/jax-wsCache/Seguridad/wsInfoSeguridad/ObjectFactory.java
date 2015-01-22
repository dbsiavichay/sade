
package wsInfoSeguridad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsInfoSeguridad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfRolCarrera_QNAME = new QName("http://academico.espoch.edu.ec/", "ArrayOfRolCarrera");
    private final static QName _Credentials_QNAME = new QName("http://academico.espoch.edu.ec/", "credentials");
    private final static QName _Persona_QNAME = new QName("http://academico.espoch.edu.ec/", "Persona");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsInfoSeguridad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUsuarioFacultadResponse }
     * 
     */
    public GetUsuarioFacultadResponse createGetUsuarioFacultadResponse() {
        return new GetUsuarioFacultadResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link GetRolUsuarioCarreraResponse }
     * 
     */
    public GetRolUsuarioCarreraResponse createGetRolUsuarioCarreraResponse() {
        return new GetRolUsuarioCarreraResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRolCarrera }
     * 
     */
    public ArrayOfRolCarrera createArrayOfRolCarrera() {
        return new ArrayOfRolCarrera();
    }

    /**
     * Create an instance of {@link GetRolUsuarioCarrera }
     * 
     */
    public GetRolUsuarioCarrera createGetRolUsuarioCarrera() {
        return new GetRolUsuarioCarrera();
    }

    /**
     * Create an instance of {@link GetUsuarioFacultad }
     * 
     */
    public GetUsuarioFacultad createGetUsuarioFacultad() {
        return new GetUsuarioFacultad();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioCarreraResponse }
     * 
     */
    public AutenticarUsuarioCarreraResponse createAutenticarUsuarioCarreraResponse() {
        return new AutenticarUsuarioCarreraResponse();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioCarrera }
     * 
     */
    public AutenticarUsuarioCarrera createAutenticarUsuarioCarrera() {
        return new AutenticarUsuarioCarrera();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link RolCarrera }
     * 
     */
    public RolCarrera createRolCarrera() {
        return new RolCarrera();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRolCarrera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "ArrayOfRolCarrera")
    public JAXBElement<ArrayOfRolCarrera> createArrayOfRolCarrera(ArrayOfRolCarrera value) {
        return new JAXBElement<ArrayOfRolCarrera>(_ArrayOfRolCarrera_QNAME, ArrayOfRolCarrera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Credentials }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "credentials")
    public JAXBElement<Credentials> createCredentials(Credentials value) {
        return new JAXBElement<Credentials>(_Credentials_QNAME, Credentials.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://academico.espoch.edu.ec/", name = "Persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

}
