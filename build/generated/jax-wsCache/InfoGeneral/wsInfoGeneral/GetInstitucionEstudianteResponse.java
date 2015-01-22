
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
 *         &lt;element name="GetInstitucionEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfInstitucionEstudiante" minOccurs="0"/>
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
    "getInstitucionEstudianteResult"
})
@XmlRootElement(name = "GetInstitucionEstudianteResponse")
public class GetInstitucionEstudianteResponse {

    @XmlElement(name = "GetInstitucionEstudianteResult")
    protected ArrayOfInstitucionEstudiante getInstitucionEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getInstitucionEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstitucionEstudiante }
     *     
     */
    public ArrayOfInstitucionEstudiante getGetInstitucionEstudianteResult() {
        return getInstitucionEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getInstitucionEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstitucionEstudiante }
     *     
     */
    public void setGetInstitucionEstudianteResult(ArrayOfInstitucionEstudiante value) {
        this.getInstitucionEstudianteResult = value;
    }

}
