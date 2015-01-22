
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
 *         &lt;element name="GetAlumnosMateriaResult" type="{http://academico.espoch.edu.ec/}ArrayOfEstudiante" minOccurs="0"/>
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
    "getAlumnosMateriaResult"
})
@XmlRootElement(name = "GetAlumnosMateriaResponse")
public class GetAlumnosMateriaResponse {

    @XmlElement(name = "GetAlumnosMateriaResult")
    protected ArrayOfEstudiante getAlumnosMateriaResult;

    /**
     * Obtiene el valor de la propiedad getAlumnosMateriaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEstudiante }
     *     
     */
    public ArrayOfEstudiante getGetAlumnosMateriaResult() {
        return getAlumnosMateriaResult;
    }

    /**
     * Define el valor de la propiedad getAlumnosMateriaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEstudiante }
     *     
     */
    public void setGetAlumnosMateriaResult(ArrayOfEstudiante value) {
        this.getAlumnosMateriaResult = value;
    }

}
