
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
 *         &lt;element name="GetProvinciasResult" type="{http://academico.espoch.edu.ec/}ArrayOfProvincia" minOccurs="0"/>
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
    "getProvinciasResult"
})
@XmlRootElement(name = "GetProvinciasResponse")
public class GetProvinciasResponse {

    @XmlElement(name = "GetProvinciasResult")
    protected ArrayOfProvincia getProvinciasResult;

    /**
     * Obtiene el valor de la propiedad getProvinciasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProvincia }
     *     
     */
    public ArrayOfProvincia getGetProvinciasResult() {
        return getProvinciasResult;
    }

    /**
     * Define el valor de la propiedad getProvinciasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProvincia }
     *     
     */
    public void setGetProvinciasResult(ArrayOfProvincia value) {
        this.getProvinciasResult = value;
    }

}
