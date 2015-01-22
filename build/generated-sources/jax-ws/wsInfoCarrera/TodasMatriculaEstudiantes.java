
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TodasMatriculaEstudiantes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TodasMatriculaEstudiantes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaAutorizada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutorizadaPor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreadaPor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCreada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TodasMatriculaEstudiantes", propOrder = {
    "cedula",
    "nombres",
    "apellidos",
    "codigo",
    "nacionalidad",
    "codEstado",
    "fechaAutorizada",
    "autorizadaPor",
    "creadaPor",
    "fechaCreada",
    "codNivel"
})
public class TodasMatriculaEstudiantes {

    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "Nombres")
    protected String nombres;
    @XmlElement(name = "Apellidos")
    protected String apellidos;
    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nacionalidad")
    protected String nacionalidad;
    @XmlElement(name = "CodEstado")
    protected String codEstado;
    @XmlElement(name = "FechaAutorizada")
    protected String fechaAutorizada;
    @XmlElement(name = "AutorizadaPor")
    protected String autorizadaPor;
    @XmlElement(name = "CreadaPor")
    protected String creadaPor;
    @XmlElement(name = "FechaCreada")
    protected String fechaCreada;
    @XmlElement(name = "CodNivel")
    protected String codNivel;

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

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
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidad(String value) {
        this.nacionalidad = value;
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

    /**
     * Obtiene el valor de la propiedad fechaAutorizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAutorizada() {
        return fechaAutorizada;
    }

    /**
     * Define el valor de la propiedad fechaAutorizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAutorizada(String value) {
        this.fechaAutorizada = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizadaPor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizadaPor() {
        return autorizadaPor;
    }

    /**
     * Define el valor de la propiedad autorizadaPor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizadaPor(String value) {
        this.autorizadaPor = value;
    }

    /**
     * Obtiene el valor de la propiedad creadaPor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreadaPor() {
        return creadaPor;
    }

    /**
     * Define el valor de la propiedad creadaPor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreadaPor(String value) {
        this.creadaPor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCreada() {
        return fechaCreada;
    }

    /**
     * Define el valor de la propiedad fechaCreada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCreada(String value) {
        this.fechaCreada = value;
    }

    /**
     * Obtiene el valor de la propiedad codNivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNivel() {
        return codNivel;
    }

    /**
     * Define el valor de la propiedad codNivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNivel(String value) {
        this.codNivel = value;
    }

}
