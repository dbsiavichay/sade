
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para MateriasCre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MateriasCre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bytNumMat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fltCreditos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bytHorasTeo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bytHorasPrac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFechaCreada" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MateriasCre", propOrder = {
    "strCodigo",
    "strNombre",
    "bytNumMat",
    "fltCreditos",
    "bytHorasTeo",
    "bytHorasPrac",
    "strCodEstado",
    "dtFechaCreada"
})
public class MateriasCre {

    protected String strCodigo;
    protected String strNombre;
    protected String bytNumMat;
    protected String fltCreditos;
    protected String bytHorasTeo;
    protected String bytHorasPrac;
    protected String strCodEstado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFechaCreada;

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
     * Obtiene el valor de la propiedad bytNumMat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytNumMat() {
        return bytNumMat;
    }

    /**
     * Define el valor de la propiedad bytNumMat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytNumMat(String value) {
        this.bytNumMat = value;
    }

    /**
     * Obtiene el valor de la propiedad fltCreditos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltCreditos() {
        return fltCreditos;
    }

    /**
     * Define el valor de la propiedad fltCreditos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltCreditos(String value) {
        this.fltCreditos = value;
    }

    /**
     * Obtiene el valor de la propiedad bytHorasTeo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytHorasTeo() {
        return bytHorasTeo;
    }

    /**
     * Define el valor de la propiedad bytHorasTeo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytHorasTeo(String value) {
        this.bytHorasTeo = value;
    }

    /**
     * Obtiene el valor de la propiedad bytHorasPrac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBytHorasPrac() {
        return bytHorasPrac;
    }

    /**
     * Define el valor de la propiedad bytHorasPrac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBytHorasPrac(String value) {
        this.bytHorasPrac = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodEstado() {
        return strCodEstado;
    }

    /**
     * Define el valor de la propiedad strCodEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodEstado(String value) {
        this.strCodEstado = value;
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

}
