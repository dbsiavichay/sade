
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
 *         &lt;element name="GetGradosEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfDatosGrado" minOccurs="0"/>
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
    "getGradosEstudianteResult"
})
@XmlRootElement(name = "GetGradosEstudianteResponse")
public class GetGradosEstudianteResponse {

    @XmlElement(name = "GetGradosEstudianteResult")
    protected ArrayOfDatosGrado getGradosEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getGradosEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatosGrado }
     *     
     */
    public ArrayOfDatosGrado getGetGradosEstudianteResult() {
        return getGradosEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getGradosEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatosGrado }
     *     
     */
    public void setGetGradosEstudianteResult(ArrayOfDatosGrado value) {
        this.getGradosEstudianteResult = value;
    }

}
