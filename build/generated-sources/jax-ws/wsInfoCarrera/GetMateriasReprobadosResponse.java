
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
 *         &lt;element name="GetMateriasReprobadosResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateriasR" minOccurs="0"/>
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
    "getMateriasReprobadosResult"
})
@XmlRootElement(name = "GetMateriasReprobadosResponse")
public class GetMateriasReprobadosResponse {

    @XmlElement(name = "GetMateriasReprobadosResult")
    protected ArrayOfMateriasR getMateriasReprobadosResult;

    /**
     * Obtiene el valor de la propiedad getMateriasReprobadosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriasR }
     *     
     */
    public ArrayOfMateriasR getGetMateriasReprobadosResult() {
        return getMateriasReprobadosResult;
    }

    /**
     * Define el valor de la propiedad getMateriasReprobadosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriasR }
     *     
     */
    public void setGetMateriasReprobadosResult(ArrayOfMateriasR value) {
        this.getMateriasReprobadosResult = value;
    }

}
