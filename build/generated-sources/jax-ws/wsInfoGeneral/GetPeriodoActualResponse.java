
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
 *         &lt;element name="GetPeriodoActualResult" type="{http://academico.espoch.edu.ec/}Periodo" minOccurs="0"/>
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
    "getPeriodoActualResult"
})
@XmlRootElement(name = "GetPeriodoActualResponse")
public class GetPeriodoActualResponse {

    @XmlElement(name = "GetPeriodoActualResult")
    protected Periodo getPeriodoActualResult;

    /**
     * Obtiene el valor de la propiedad getPeriodoActualResult.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getGetPeriodoActualResult() {
        return getPeriodoActualResult;
    }

    /**
     * Define el valor de la propiedad getPeriodoActualResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setGetPeriodoActualResult(Periodo value) {
        this.getPeriodoActualResult = value;
    }

}
