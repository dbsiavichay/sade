
package wsInfoGeneral;

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
 *         &lt;element name="GetEscuelaEntidadResult" type="{http://academico.espoch.edu.ec/}ArrayOfEscuelaEntidad" minOccurs="0"/>
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
    "getEscuelaEntidadResult"
})
@XmlRootElement(name = "GetEscuelaEntidadResponse")
public class GetEscuelaEntidadResponse {

    @XmlElement(name = "GetEscuelaEntidadResult")
    protected ArrayOfEscuelaEntidad getEscuelaEntidadResult;

    /**
     * Obtiene el valor de la propiedad getEscuelaEntidadResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEscuelaEntidad }
     *     
     */
    public ArrayOfEscuelaEntidad getGetEscuelaEntidadResult() {
        return getEscuelaEntidadResult;
    }

    /**
     * Define el valor de la propiedad getEscuelaEntidadResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEscuelaEntidad }
     *     
     */
    public void setGetEscuelaEntidadResult(ArrayOfEscuelaEntidad value) {
        this.getEscuelaEntidadResult = value;
    }

}
