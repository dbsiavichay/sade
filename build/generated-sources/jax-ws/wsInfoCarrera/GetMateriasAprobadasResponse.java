
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
 *         &lt;element name="GetMateriasAprobadasResult" type="{http://academico.espoch.edu.ec/}ArrayOfMaterias_aprobadas" minOccurs="0"/>
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
    "getMateriasAprobadasResult"
})
@XmlRootElement(name = "GetMateriasAprobadasResponse")
public class GetMateriasAprobadasResponse {

    @XmlElement(name = "GetMateriasAprobadasResult")
    protected ArrayOfMateriasAprobadas getMateriasAprobadasResult;

    /**
     * Obtiene el valor de la propiedad getMateriasAprobadasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriasAprobadas }
     *     
     */
    public ArrayOfMateriasAprobadas getGetMateriasAprobadasResult() {
        return getMateriasAprobadasResult;
    }

    /**
     * Define el valor de la propiedad getMateriasAprobadasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriasAprobadas }
     *     
     */
    public void setGetMateriasAprobadasResult(ArrayOfMateriasAprobadas value) {
        this.getMateriasAprobadasResult = value;
    }

}
