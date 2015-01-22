
package wsInfoSeguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetUsuarioFacultadResult" type="{http://academico.espoch.edu.ec/}Persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getUsuarioFacultadResult"
})
@XmlRootElement(name = "GetUsuarioFacultadResponse")
public class GetUsuarioFacultadResponse {

    @XmlElement(name = "GetUsuarioFacultadResult")
    protected Persona getUsuarioFacultadResult;

    /**
     * Obtiene el valor de la propiedad getUsuarioFacultadResult.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getGetUsuarioFacultadResult() {
        return getUsuarioFacultadResult;
    }

    /**
     * Define el valor de la propiedad getUsuarioFacultadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setGetUsuarioFacultadResult(Persona value) {
        this.getUsuarioFacultadResult = value;
    }

}
