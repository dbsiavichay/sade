
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
 *         &lt;element name="GetEvaluacionesEscritasGradoResult" type="{http://academico.espoch.edu.ec/}ArrayOfActaNotasEscritasGrado" minOccurs="0"/>
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
    "getEvaluacionesEscritasGradoResult"
})
@XmlRootElement(name = "GetEvaluacionesEscritasGradoResponse")
public class GetEvaluacionesEscritasGradoResponse {

    @XmlElement(name = "GetEvaluacionesEscritasGradoResult")
    protected ArrayOfActaNotasEscritasGrado getEvaluacionesEscritasGradoResult;

    /**
     * Obtiene el valor de la propiedad getEvaluacionesEscritasGradoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActaNotasEscritasGrado }
     *     
     */
    public ArrayOfActaNotasEscritasGrado getGetEvaluacionesEscritasGradoResult() {
        return getEvaluacionesEscritasGradoResult;
    }

    /**
     * Define el valor de la propiedad getEvaluacionesEscritasGradoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActaNotasEscritasGrado }
     *     
     */
    public void setGetEvaluacionesEscritasGradoResult(ArrayOfActaNotasEscritasGrado value) {
        this.getEvaluacionesEscritasGradoResult = value;
    }

}
