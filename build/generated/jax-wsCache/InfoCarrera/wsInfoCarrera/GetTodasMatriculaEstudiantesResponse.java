
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
 *         &lt;element name="GetTodasMatriculaEstudiantesResult" type="{http://academico.espoch.edu.ec/}ArrayOfTodasMatriculaEstudiantes" minOccurs="0"/>
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
    "getTodasMatriculaEstudiantesResult"
})
@XmlRootElement(name = "GetTodasMatriculaEstudiantesResponse")
public class GetTodasMatriculaEstudiantesResponse {

    @XmlElement(name = "GetTodasMatriculaEstudiantesResult")
    protected ArrayOfTodasMatriculaEstudiantes getTodasMatriculaEstudiantesResult;

    /**
     * Obtiene el valor de la propiedad getTodasMatriculaEstudiantesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTodasMatriculaEstudiantes }
     *     
     */
    public ArrayOfTodasMatriculaEstudiantes getGetTodasMatriculaEstudiantesResult() {
        return getTodasMatriculaEstudiantesResult;
    }

    /**
     * Define el valor de la propiedad getTodasMatriculaEstudiantesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTodasMatriculaEstudiantes }
     *     
     */
    public void setGetTodasMatriculaEstudiantesResult(ArrayOfTodasMatriculaEstudiantes value) {
        this.getTodasMatriculaEstudiantesResult = value;
    }

}
