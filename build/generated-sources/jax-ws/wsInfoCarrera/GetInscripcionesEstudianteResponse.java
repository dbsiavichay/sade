
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
 *         &lt;element name="GetInscripcionesEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfInscripcion" minOccurs="0"/>
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
    "getInscripcionesEstudianteResult"
})
@XmlRootElement(name = "GetInscripcionesEstudianteResponse")
public class GetInscripcionesEstudianteResponse {

    @XmlElement(name = "GetInscripcionesEstudianteResult")
    protected ArrayOfInscripcion getInscripcionesEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getInscripcionesEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInscripcion }
     *     
     */
    public ArrayOfInscripcion getGetInscripcionesEstudianteResult() {
        return getInscripcionesEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getInscripcionesEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInscripcion }
     *     
     */
    public void setGetInscripcionesEstudianteResult(ArrayOfInscripcion value) {
        this.getInscripcionesEstudianteResult = value;
    }

}
