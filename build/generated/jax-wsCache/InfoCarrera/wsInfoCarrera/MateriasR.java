
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para MateriasR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MateriasR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFechaCreada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtFechaElim" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="blnActiva" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MateriasR", propOrder = {
    "strCodigo",
    "strNombre",
    "dtFechaCreada",
    "dtFechaElim",
    "blnActiva"
})
public class MateriasR {

    protected String strCodigo;
    protected String strNombre;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFechaCreada;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFechaElim;
    protected boolean blnActiva;

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
     * Obtiene el valor de la propiedad strNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * Define el valor de la propiedad strNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombre(String value) {
        this.strNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad dtFechaCreada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFechaCreada() {
        return dtFechaCreada;
    }

    /**
     * Define el valor de la propiedad dtFechaCreada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFechaCreada(XMLGregorianCalendar value) {
        this.dtFechaCreada = value;
    }

    /**
     * Obtiene el valor de la propiedad dtFechaElim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtFechaElim() {
        return dtFechaElim;
    }

    /**
     * Define el valor de la propiedad dtFechaElim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtFechaElim(XMLGregorianCalendar value) {
        this.dtFechaElim = value;
    }

    /**
     * Obtiene el valor de la propiedad blnActiva.
     * 
     */
    public boolean isBlnActiva() {
        return blnActiva;
    }

    /**
     * Define el valor de la propiedad blnActiva.
     * 
     */
    public void setBlnActiva(boolean value) {
        this.blnActiva = value;
    }

}
