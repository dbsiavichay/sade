
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="strCodCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strcedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodCarrera",
    "strcedula"
})
@XmlRootElement(name = "GetMateriasReprobados")
public class GetMateriasReprobados {

    protected String strCodCarrera;
    protected String strcedula;

    /**
     * Obtiene el valor de la propiedad strCodCarrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodCarrera() {
        return strCodCarrera;
    }

    /**
     * Define el valor de la propiedad strCodCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodCarrera(String value) {
        this.strCodCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad strcedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrcedula() {
        return strcedula;
    }

    /**
     * Define el valor de la propiedad strcedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrcedula(String value) {
        this.strcedula = value;
    }

}
