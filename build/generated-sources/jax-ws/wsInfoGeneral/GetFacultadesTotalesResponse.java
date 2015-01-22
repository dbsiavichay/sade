
package wsInfoGeneral;

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
 *         &lt;element name="GetFacultadesTotalesResult" type="{http://academico.espoch.edu.ec/}ArrayOfFacultad" minOccurs="0"/>
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
    "getFacultadesTotalesResult"
})
@XmlRootElement(name = "GetFacultadesTotalesResponse")
public class GetFacultadesTotalesResponse {

    @XmlElement(name = "GetFacultadesTotalesResult")
    protected ArrayOfFacultad getFacultadesTotalesResult;

    /**
     * Obtiene el valor de la propiedad getFacultadesTotalesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacultad }
     *     
     */
    public ArrayOfFacultad getGetFacultadesTotalesResult() {
        return getFacultadesTotalesResult;
    }

    /**
     * Define el valor de la propiedad getFacultadesTotalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacultad }
     *     
     */
    public void setGetFacultadesTotalesResult(ArrayOfFacultad value) {
        this.getFacultadesTotalesResult = value;
    }

}
