
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
 *         &lt;element name="GetMateriasEstudianteCreditosResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateriasCre" minOccurs="0"/>
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
    "getMateriasEstudianteCreditosResult"
})
@XmlRootElement(name = "GetMateriasEstudianteCreditosResponse")
public class GetMateriasEstudianteCreditosResponse {

    @XmlElement(name = "GetMateriasEstudianteCreditosResult")
    protected ArrayOfMateriasCre getMateriasEstudianteCreditosResult;

    /**
     * Obtiene el valor de la propiedad getMateriasEstudianteCreditosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriasCre }
     *     
     */
    public ArrayOfMateriasCre getGetMateriasEstudianteCreditosResult() {
        return getMateriasEstudianteCreditosResult;
    }

    /**
     * Define el valor de la propiedad getMateriasEstudianteCreditosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriasCre }
     *     
     */
    public void setGetMateriasEstudianteCreditosResult(ArrayOfMateriasCre value) {
        this.getMateriasEstudianteCreditosResult = value;
    }

}
