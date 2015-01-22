
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
 *         &lt;element name="GetHorarioEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfHorarioEstudiante" minOccurs="0"/>
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
    "getHorarioEstudianteResult"
})
@XmlRootElement(name = "GetHorarioEstudianteResponse")
public class GetHorarioEstudianteResponse {

    @XmlElement(name = "GetHorarioEstudianteResult")
    protected ArrayOfHorarioEstudiante getHorarioEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getHorarioEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHorarioEstudiante }
     *     
     */
    public ArrayOfHorarioEstudiante getGetHorarioEstudianteResult() {
        return getHorarioEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getHorarioEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHorarioEstudiante }
     *     
     */
    public void setGetHorarioEstudianteResult(ArrayOfHorarioEstudiante value) {
        this.getHorarioEstudianteResult = value;
    }

}
