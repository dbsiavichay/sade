
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
 *         &lt;element name="GetDictadosMateriaResult" type="{http://academico.espoch.edu.ec/}ArrayOfDictado_Materia" minOccurs="0"/>
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
    "getDictadosMateriaResult"
})
@XmlRootElement(name = "GetDictadosMateriaResponse")
public class GetDictadosMateriaResponse {

    @XmlElement(name = "GetDictadosMateriaResult")
    protected ArrayOfDictadoMateria getDictadosMateriaResult;

    /**
     * Obtiene el valor de la propiedad getDictadosMateriaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDictadoMateria }
     *     
     */
    public ArrayOfDictadoMateria getGetDictadosMateriaResult() {
        return getDictadosMateriaResult;
    }

    /**
     * Define el valor de la propiedad getDictadosMateriaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDictadoMateria }
     *     
     */
    public void setGetDictadosMateriaResult(ArrayOfDictadoMateria value) {
        this.getDictadosMateriaResult = value;
    }

}
