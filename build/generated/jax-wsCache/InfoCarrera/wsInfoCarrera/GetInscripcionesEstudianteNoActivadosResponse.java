
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
 *         &lt;element name="GetInscripcionesEstudianteNoActivadosResult" type="{http://academico.espoch.edu.ec/}ArrayOfInscripcion" minOccurs="0"/>
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
    "getInscripcionesEstudianteNoActivadosResult"
})
@XmlRootElement(name = "GetInscripcionesEstudianteNoActivadosResponse")
public class GetInscripcionesEstudianteNoActivadosResponse {

    @XmlElement(name = "GetInscripcionesEstudianteNoActivadosResult")
    protected ArrayOfInscripcion getInscripcionesEstudianteNoActivadosResult;

    /**
     * Obtiene el valor de la propiedad getInscripcionesEstudianteNoActivadosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInscripcion }
     *     
     */
    public ArrayOfInscripcion getGetInscripcionesEstudianteNoActivadosResult() {
        return getInscripcionesEstudianteNoActivadosResult;
    }

    /**
     * Define el valor de la propiedad getInscripcionesEstudianteNoActivadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInscripcion }
     *     
     */
    public void setGetInscripcionesEstudianteNoActivadosResult(ArrayOfInscripcion value) {
        this.getInscripcionesEstudianteNoActivadosResult = value;
    }

}
