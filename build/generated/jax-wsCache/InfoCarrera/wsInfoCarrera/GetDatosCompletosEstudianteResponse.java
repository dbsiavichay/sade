
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
 *         &lt;element name="GetDatosCompletosEstudianteResult" type="{http://academico.espoch.edu.ec/}Estudiante" minOccurs="0"/>
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
    "getDatosCompletosEstudianteResult"
})
@XmlRootElement(name = "GetDatosCompletosEstudianteResponse")
public class GetDatosCompletosEstudianteResponse {

    @XmlElement(name = "GetDatosCompletosEstudianteResult")
    protected Estudiante getDatosCompletosEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getDatosCompletosEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link Estudiante }
     *     
     */
    public Estudiante getGetDatosCompletosEstudianteResult() {
        return getDatosCompletosEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getDatosCompletosEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Estudiante }
     *     
     */
    public void setGetDatosCompletosEstudianteResult(Estudiante value) {
        this.getDatosCompletosEstudianteResult = value;
    }

}
