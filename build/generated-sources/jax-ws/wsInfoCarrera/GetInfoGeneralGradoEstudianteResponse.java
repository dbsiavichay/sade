
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
 *         &lt;element name="GetInfoGeneralGradoEstudianteResult" type="{http://academico.espoch.edu.ec/}ActaCalGrado" minOccurs="0"/>
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
    "getInfoGeneralGradoEstudianteResult"
})
@XmlRootElement(name = "GetInfoGeneralGradoEstudianteResponse")
public class GetInfoGeneralGradoEstudianteResponse {

    @XmlElement(name = "GetInfoGeneralGradoEstudianteResult")
    protected ActaCalGrado getInfoGeneralGradoEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getInfoGeneralGradoEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ActaCalGrado }
     *     
     */
    public ActaCalGrado getGetInfoGeneralGradoEstudianteResult() {
        return getInfoGeneralGradoEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getInfoGeneralGradoEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ActaCalGrado }
     *     
     */
    public void setGetInfoGeneralGradoEstudianteResult(ActaCalGrado value) {
        this.getInfoGeneralGradoEstudianteResult = value;
    }

}
