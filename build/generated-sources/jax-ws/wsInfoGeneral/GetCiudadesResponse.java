
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
 *         &lt;element name="GetCiudadesResult" type="{http://academico.espoch.edu.ec/}ArrayOfCiudad" minOccurs="0"/>
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
    "getCiudadesResult"
})
@XmlRootElement(name = "GetCiudadesResponse")
public class GetCiudadesResponse {

    @XmlElement(name = "GetCiudadesResult")
    protected ArrayOfCiudad getCiudadesResult;

    /**
     * Obtiene el valor de la propiedad getCiudadesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCiudad }
     *     
     */
    public ArrayOfCiudad getGetCiudadesResult() {
        return getCiudadesResult;
    }

    /**
     * Define el valor de la propiedad getCiudadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCiudad }
     *     
     */
    public void setGetCiudadesResult(ArrayOfCiudad value) {
        this.getCiudadesResult = value;
    }

}
