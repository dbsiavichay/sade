
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
 *         &lt;element name="GetActaGradoEstudianteResult" type="{http://academico.espoch.edu.ec/}Acta" minOccurs="0"/>
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
    "getActaGradoEstudianteResult"
})
@XmlRootElement(name = "GetActaGradoEstudianteResponse")
public class GetActaGradoEstudianteResponse {

    @XmlElement(name = "GetActaGradoEstudianteResult")
    protected Acta getActaGradoEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getActaGradoEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link Acta }
     *     
     */
    public Acta getGetActaGradoEstudianteResult() {
        return getActaGradoEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getActaGradoEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Acta }
     *     
     */
    public void setGetActaGradoEstudianteResult(Acta value) {
        this.getActaGradoEstudianteResult = value;
    }

}
