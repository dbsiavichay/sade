
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
 *         &lt;element name="GetMateriasDocenteResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateria" minOccurs="0"/>
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
    "getMateriasDocenteResult"
})
@XmlRootElement(name = "GetMateriasDocenteResponse")
public class GetMateriasDocenteResponse {

    @XmlElement(name = "GetMateriasDocenteResult")
    protected ArrayOfMateria getMateriasDocenteResult;

    /**
     * Obtiene el valor de la propiedad getMateriasDocenteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateria }
     *     
     */
    public ArrayOfMateria getGetMateriasDocenteResult() {
        return getMateriasDocenteResult;
    }

    /**
     * Define el valor de la propiedad getMateriasDocenteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateria }
     *     
     */
    public void setGetMateriasDocenteResult(ArrayOfMateria value) {
        this.getMateriasDocenteResult = value;
    }

}
