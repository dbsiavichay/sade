
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Facultad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Facultad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vicedecano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facultad", propOrder = {
    "codigo",
    "nombre",
    "decano",
    "vicedecano",
    "fechaCreacion",
    "ubicacion",
    "codEstado"
})
public class Facultad {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Decano")
    protected String decano;
    @XmlElement(name = "Vicedecano")
    protected String vicedecano;
    @XmlElement(name = "FechaCreacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(name = "Ubicacion")
    protected String ubicacion;
    @XmlElement(name = "CodEstado")
    protected String codEstado;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad decano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecano() {
        return decano;
    }

    /**
     * Define el valor de la propiedad decano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecano(String value) {
        this.decano = value;
    }

    /**
     * Obtiene el valor de la propiedad vicedecano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVicedecano() {
        return vicedecano;
    }

    /**
     * Define el valor de la propiedad vicedecano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVicedecano(String value) {
        this.vicedecano = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstado(String value) {
        this.codEstado = value;
    }

}
