
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
 *         &lt;element name="GetHorarioExamenesEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfHorarioExamenesEstudiante" minOccurs="0"/>
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
    "getHorarioExamenesEstudianteResult"
})
@XmlRootElement(name = "GetHorarioExamenesEstudianteResponse")
public class GetHorarioExamenesEstudianteResponse {

    @XmlElement(name = "GetHorarioExamenesEstudianteResult")
    protected ArrayOfHorarioExamenesEstudiante getHorarioExamenesEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getHorarioExamenesEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHorarioExamenesEstudiante }
     *     
     */
    public ArrayOfHorarioExamenesEstudiante getGetHorarioExamenesEstudianteResult() {
        return getHorarioExamenesEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getHorarioExamenesEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHorarioExamenesEstudiante }
     *     
     */
    public void setGetHorarioExamenesEstudianteResult(ArrayOfHorarioExamenesEstudiante value) {
        this.getHorarioExamenesEstudianteResult = value;
    }

}
