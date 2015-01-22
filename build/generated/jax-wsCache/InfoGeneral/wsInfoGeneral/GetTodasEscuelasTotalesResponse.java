
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
 *         &lt;element name="GetTodasEscuelasTotalesResult" type="{http://academico.espoch.edu.ec/}ArrayOfEscuela" minOccurs="0"/>
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
    "getTodasEscuelasTotalesResult"
})
@XmlRootElement(name = "GetTodasEscuelasTotalesResponse")
public class GetTodasEscuelasTotalesResponse {

    @XmlElement(name = "GetTodasEscuelasTotalesResult")
    protected ArrayOfEscuela getTodasEscuelasTotalesResult;

    /**
     * Obtiene el valor de la propiedad getTodasEscuelasTotalesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEscuela }
     *     
     */
    public ArrayOfEscuela getGetTodasEscuelasTotalesResult() {
        return getTodasEscuelasTotalesResult;
    }

    /**
     * Define el valor de la propiedad getTodasEscuelasTotalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEscuela }
     *     
     */
    public void setGetTodasEscuelasTotalesResult(ArrayOfEscuela value) {
        this.getTodasEscuelasTotalesResult = value;
    }

}
