
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
 *         &lt;element name="strCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCedula",
    "strCodPeriodo"
})
@XmlRootElement(name = "GetHorariosDocente")
public class GetHorariosDocente {

    protected String strCodCarrera;
    protected String strCedula;
    protected String strCodPeriodo;

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
     * Obtiene el valor de la propiedad strCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCedula() {
        return strCedula;
    }

    /**
     * Define el valor de la propiedad strCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCedula(String value) {
        this.strCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodPeriodo() {
        return strCodPeriodo;
    }

    /**
     * Define el valor de la propiedad strCodPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodPeriodo(String value) {
        this.strCodPeriodo = value;
    }

}
