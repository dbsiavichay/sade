
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TitulosDocente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TitulosDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strApellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitulosDocente", propOrder = {
    "strCedula",
    "strNombres",
    "strApellidos",
    "strCodigo",
    "strDescripcion"
})
public class TitulosDocente {

    protected String strCedula;
    protected String strNombres;
    protected String strApellidos;
    protected String strCodigo;
    protected String strDescripcion;

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
     * Obtiene el valor de la propiedad strNombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombres() {
        return strNombres;
    }

    /**
     * Define el valor de la propiedad strNombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombres(String value) {
        this.strNombres = value;
    }

    /**
     * Obtiene el valor de la propiedad strApellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrApellidos() {
        return strApellidos;
    }

    /**
     * Define el valor de la propiedad strApellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrApellidos(String value) {
        this.strApellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigo() {
        return strCodigo;
    }

    /**
     * Define el valor de la propiedad strCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigo(String value) {
        this.strCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad strDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDescripcion() {
        return strDescripcion;
    }

    /**
     * Define el valor de la propiedad strDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDescripcion(String value) {
        this.strDescripcion = value;
    }

}
