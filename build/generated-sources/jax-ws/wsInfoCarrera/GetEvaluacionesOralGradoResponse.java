
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
 *         &lt;element name="GetEvaluacionesOralGradoResult" type="{http://academico.espoch.edu.ec/}ArrayOfActasNotasOralesGrado" minOccurs="0"/>
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
    "getEvaluacionesOralGradoResult"
})
@XmlRootElement(name = "GetEvaluacionesOralGradoResponse")
public class GetEvaluacionesOralGradoResponse {

    @XmlElement(name = "GetEvaluacionesOralGradoResult")
    protected ArrayOfActasNotasOralesGrado getEvaluacionesOralGradoResult;

    /**
     * Obtiene el valor de la propiedad getEvaluacionesOralGradoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActasNotasOralesGrado }
     *     
     */
    public ArrayOfActasNotasOralesGrado getGetEvaluacionesOralGradoResult() {
        return getEvaluacionesOralGradoResult;
    }

    /**
     * Define el valor de la propiedad getEvaluacionesOralGradoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActasNotasOralesGrado }
     *     
     */
    public void setGetEvaluacionesOralGradoResult(ArrayOfActasNotasOralesGrado value) {
        this.getEvaluacionesOralGradoResult = value;
    }

}
