
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TitulosEst complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TitulosEst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TitulosEst", propOrder = {
    "cedula",
    "titulo",
    "codEstudiante",
    "nombres",
    "apellidos",
    "codTitulo"
})
public class TitulosEst {

    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "Titulo")
    protected String titulo;
    @XmlElement(name = "CodEstudiante")
    protected String codEstudiante;
    @XmlElement(name = "Nombres")
    protected String nombres;
    @XmlElement(name = "Apellidos")
    protected String apellidos;
    @XmlElement(name = "CodTitulo")
    protected String codTitulo;

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
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstudiante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstudiante() {
        return codEstudiante;
    }

    /**
     * Define el valor de la propiedad codEstudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstudiante(String value) {
        this.codEstudiante = value;
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
     * Obtiene el valor de la propiedad codTitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTitulo() {
        return codTitulo;
    }

    /**
     * Define el valor de la propiedad codTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTitulo(String value) {
        this.codTitulo = value;
    }

}
