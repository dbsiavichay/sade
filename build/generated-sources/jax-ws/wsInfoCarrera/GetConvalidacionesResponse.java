
package wsInfoCarrera;

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
 *         &lt;element name="GetConvalidacionesResult" type="{http://academico.espoch.edu.ec/}ArrayOfConvalidacion" minOccurs="0"/>
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
    "getConvalidacionesResult"
})
@XmlRootElement(name = "GetConvalidacionesResponse")
public class GetConvalidacionesResponse {

    @XmlElement(name = "GetConvalidacionesResult")
    protected ArrayOfConvalidacion getConvalidacionesResult;

    /**
     * Obtiene el valor de la propiedad getConvalidacionesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConvalidacion }
     *     
     */
    public ArrayOfConvalidacion getGetConvalidacionesResult() {
        return getConvalidacionesResult;
    }

    /**
     * Define el valor de la propiedad getConvalidacionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConvalidacion }
     *     
     */
    public void setGetConvalidacionesResult(ArrayOfConvalidacion value) {
        this.getConvalidacionesResult = value;
    }

}
