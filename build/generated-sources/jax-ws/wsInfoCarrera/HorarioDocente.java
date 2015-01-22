
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HorarioDocente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HorarioDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDescripcionHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strInicioFinHora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strLunes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strMartes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strMiercoles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strJueves" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strViernes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strSabado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDomingo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorarioDocente", propOrder = {
    "strCodHora",
    "strDescripcionHora",
    "strInicioFinHora",
    "strLunes",
    "strMartes",
    "strMiercoles",
    "strJueves",
    "strViernes",
    "strSabado",
    "strDomingo"
})
public class HorarioDocente {

    protected String strCodHora;
    protected String strDescripcionHora;
    protected String strInicioFinHora;
    protected String strLunes;
    protected String strMartes;
    protected String strMiercoles;
    protected String strJueves;
    protected String strViernes;
    protected String strSabado;
    protected String strDomingo;

    /**
     * Obtiene el valor de la propiedad strCodHora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodHora() {
        return strCodHora;
    }

    /**
     * Define el valor de la propiedad strCodHora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodHora(String value) {
        this.strCodHora = value;
    }

    /**
     * Obtiene el valor de la propiedad strDescripcionHora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDescripcionHora() {
        return strDescripcionHora;
    }

    /**
     * Define el valor de la propiedad strDescripcionHora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDescripcionHora(String value) {
        this.strDescripcionHora = value;
    }

    /**
     * Obtiene el valor de la propiedad strInicioFinHora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrInicioFinHora() {
        return strInicioFinHora;
    }

    /**
     * Define el valor de la propiedad strInicioFinHora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrInicioFinHora(String value) {
        this.strInicioFinHora = value;
    }

    /**
     * Obtiene el valor de la propiedad strLunes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLunes() {
        return strLunes;
    }

    /**
     * Define el valor de la propiedad strLunes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLunes(String value) {
        this.strLunes = value;
    }

    /**
     * Obtiene el valor de la propiedad strMartes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMartes() {
        return strMartes;
    }

    /**
     * Define el valor de la propiedad strMartes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMartes(String value) {
        this.strMartes = value;
    }

    /**
     * Obtiene el valor de la propiedad strMiercoles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMiercoles() {
        return strMiercoles;
    }

    /**
     * Define el valor de la propiedad strMiercoles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMiercoles(String value) {
        this.strMiercoles = value;
    }

    /**
     * Obtiene el valor de la propiedad strJueves.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrJueves() {
        return strJueves;
    }

    /**
     * Define el valor de la propiedad strJueves.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrJueves(String value) {
        this.strJueves = value;
    }

    /**
     * Obtiene el valor de la propiedad strViernes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrViernes() {
        return strViernes;
    }

    /**
     * Define el valor de la propiedad strViernes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrViernes(String value) {
        this.strViernes = value;
    }

    /**
     * Obtiene el valor de la propiedad strSabado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSabado() {
        return strSabado;
    }

    /**
     * Define el valor de la propiedad strSabado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSabado(String value) {
        this.strSabado = value;
    }

    /**
     * Obtiene el valor de la propiedad strDomingo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDomingo() {
        return strDomingo;
    }

    /**
     * Define el valor de la propiedad strDomingo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDomingo(String value) {
        this.strDomingo = value;
    }

}
