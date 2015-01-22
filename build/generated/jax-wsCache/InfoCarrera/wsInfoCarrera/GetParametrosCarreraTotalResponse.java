
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
 *         &lt;element name="GetParametrosCarreraTotalResult" type="{http://academico.espoch.edu.ec/}ArrayOfParametro" minOccurs="0"/>
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
    "getParametrosCarreraTotalResult"
})
@XmlRootElement(name = "GetParametrosCarreraTotalResponse")
public class GetParametrosCarreraTotalResponse {

    @XmlElement(name = "GetParametrosCarreraTotalResult")
    protected ArrayOfParametro getParametrosCarreraTotalResult;

    /**
     * Obtiene el valor de la propiedad getParametrosCarreraTotalResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfParametro }
     *     
     */
    public ArrayOfParametro getGetParametrosCarreraTotalResult() {
        return getParametrosCarreraTotalResult;
    }

    /**
     * Define el valor de la propiedad getParametrosCarreraTotalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfParametro }
     *     
     */
    public void setGetParametrosCarreraTotalResult(ArrayOfParametro value) {
        this.getParametrosCarreraTotalResult = value;
    }

}
