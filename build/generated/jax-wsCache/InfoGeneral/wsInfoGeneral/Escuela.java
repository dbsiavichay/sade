
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Escuela complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Escuela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodFacultad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Escuela", propOrder = {
    "codigo",
    "nombre",
    "director",
    "codFacultad",
    "fechaCreacion",
    "ubicacion",
    "codEstado"
})
public class Escuela {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Director")
    protected String director;
    @XmlElement(name = "CodFacultad")
    protected String codFacultad;
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
     * Obtiene el valor de la propiedad director.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Define el valor de la propiedad director.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Obtiene el valor de la propiedad codFacultad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFacultad() {
        return codFacultad;
    }

    /**
     * Define el valor de la propiedad codFacultad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFacultad(String value) {
        this.codFacultad = value;
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
