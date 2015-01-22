
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
 *         &lt;element name="GetCarrerasAbiertasResult" type="{http://academico.espoch.edu.ec/}ArrayOfCarrera" minOccurs="0"/>
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
    "getCarrerasAbiertasResult"
})
@XmlRootElement(name = "GetCarrerasAbiertasResponse")
public class GetCarrerasAbiertasResponse {

    @XmlElement(name = "GetCarrerasAbiertasResult")
    protected ArrayOfCarrera getCarrerasAbiertasResult;

    /**
     * Obtiene el valor de la propiedad getCarrerasAbiertasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarrera }
     *     
     */
    public ArrayOfCarrera getGetCarrerasAbiertasResult() {
        return getCarrerasAbiertasResult;
    }

    /**
     * Define el valor de la propiedad getCarrerasAbiertasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarrera }
     *     
     */
    public void setGetCarrerasAbiertasResult(ArrayOfCarrera value) {
        this.getCarrerasAbiertasResult = value;
    }

}
