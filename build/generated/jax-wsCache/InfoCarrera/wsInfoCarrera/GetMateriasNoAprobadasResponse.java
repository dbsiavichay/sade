
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
 *         &lt;element name="GetMateriasNoAprobadasResult" type="{http://academico.espoch.edu.ec/}ArrayOfMaterias_no_aprobadas" minOccurs="0"/>
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
    "getMateriasNoAprobadasResult"
})
@XmlRootElement(name = "GetMateriasNoAprobadasResponse")
public class GetMateriasNoAprobadasResponse {

    @XmlElement(name = "GetMateriasNoAprobadasResult")
    protected ArrayOfMateriasNoAprobadas getMateriasNoAprobadasResult;

    /**
     * Obtiene el valor de la propiedad getMateriasNoAprobadasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriasNoAprobadas }
     *     
     */
    public ArrayOfMateriasNoAprobadas getGetMateriasNoAprobadasResult() {
        return getMateriasNoAprobadasResult;
    }

    /**
     * Define el valor de la propiedad getMateriasNoAprobadasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriasNoAprobadas }
     *     
     */
    public void setGetMateriasNoAprobadasResult(ArrayOfMateriasNoAprobadas value) {
        this.getMateriasNoAprobadasResult = value;
    }

}
