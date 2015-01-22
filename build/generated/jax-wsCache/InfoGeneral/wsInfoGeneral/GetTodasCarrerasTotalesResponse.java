
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
 *         &lt;element name="GetTodasCarrerasTotalesResult" type="{http://academico.espoch.edu.ec/}ArrayOfUnidadAcademica" minOccurs="0"/>
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
    "getTodasCarrerasTotalesResult"
})
@XmlRootElement(name = "GetTodasCarrerasTotalesResponse")
public class GetTodasCarrerasTotalesResponse {

    @XmlElement(name = "GetTodasCarrerasTotalesResult")
    protected ArrayOfUnidadAcademica getTodasCarrerasTotalesResult;

    /**
     * Obtiene el valor de la propiedad getTodasCarrerasTotalesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnidadAcademica }
     *     
     */
    public ArrayOfUnidadAcademica getGetTodasCarrerasTotalesResult() {
        return getTodasCarrerasTotalesResult;
    }

    /**
     * Define el valor de la propiedad getTodasCarrerasTotalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnidadAcademica }
     *     
     */
    public void setGetTodasCarrerasTotalesResult(ArrayOfUnidadAcademica value) {
        this.getTodasCarrerasTotalesResult = value;
    }

}
