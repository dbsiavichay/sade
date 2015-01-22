
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
 *         &lt;element name="GetMateriasEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateria" minOccurs="0"/>
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
    "getMateriasEstudianteResult"
})
@XmlRootElement(name = "GetMateriasEstudianteResponse")
public class GetMateriasEstudianteResponse {

    @XmlElement(name = "GetMateriasEstudianteResult")
    protected ArrayOfMateria getMateriasEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getMateriasEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateria }
     *     
     */
    public ArrayOfMateria getGetMateriasEstudianteResult() {
        return getMateriasEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getMateriasEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateria }
     *     
     */
    public void setGetMateriasEstudianteResult(ArrayOfMateria value) {
        this.getMateriasEstudianteResult = value;
    }

}
