
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
 *         &lt;element name="strCodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodParalelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodNivel",
    "strCodParalelo",
    "strCodPeriodo",
    "strCodMateria"
})
@XmlRootElement(name = "GetAlumnosMateria")
public class GetAlumnosMateria {

    protected String strCodCarrera;
    protected String strCodNivel;
    protected String strCodParalelo;
    protected String strCodPeriodo;
    protected String strCodMateria;

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
     * Obtiene el valor de la propiedad strCodNivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodNivel() {
        return strCodNivel;
    }

    /**
     * Define el valor de la propiedad strCodNivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodNivel(String value) {
        this.strCodNivel = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodParalelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodParalelo() {
        return strCodParalelo;
    }

    /**
     * Define el valor de la propiedad strCodParalelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodParalelo(String value) {
        this.strCodParalelo = value;
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

    /**
     * Obtiene el valor de la propiedad strCodMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodMateria() {
        return strCodMateria;
    }

    /**
     * Define el valor de la propiedad strCodMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodMateria(String value) {
        this.strCodMateria = value;
    }

}
