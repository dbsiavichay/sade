
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
 *         &lt;element name="GetTodasCarrerasResult" type="{http://academico.espoch.edu.ec/}ArrayOfUnidadAcademica" minOccurs="0"/>
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
    "getTodasCarrerasResult"
})
@XmlRootElement(name = "GetTodasCarrerasResponse")
public class GetTodasCarrerasResponse {

    @XmlElement(name = "GetTodasCarrerasResult")
    protected ArrayOfUnidadAcademica getTodasCarrerasResult;

    /**
     * Obtiene el valor de la propiedad getTodasCarrerasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidadAcademica }
     *     
     */
    public ArrayOfUnidadAcademica getGetTodasCarrerasResult() {
        return getTodasCarrerasResult;
    }

    /**
     * Define el valor de la propiedad getTodasCarrerasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidadAcademica }
     *     
     */
    public void setGetTodasCarrerasResult(ArrayOfUnidadAcademica value) {
        this.getTodasCarrerasResult = value;
    }

}
