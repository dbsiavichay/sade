
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Matricula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Matricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Orden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstudiante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Autorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Matricula", propOrder = {
    "orden",
    "codEstudiante",
    "codNivel",
    "nivel",
    "fecha",
    "autorizacion"
})
public class Matricula {

    @XmlElement(name = "Orden")
    protected String orden;
    @XmlElement(name = "CodEstudiante")
    protected String codEstudiante;
    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "Nivel")
    protected String nivel;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Autorizacion")
    protected String autorizacion;

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrden(String value) {
        this.orden = value;
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

    /**
     * Obtiene el valor de la propiedad nivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define el valor de la propiedad nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivel(String value) {
        this.nivel = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad autorizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacion() {
        return autorizacion;
    }

    /**
     * Define el valor de la propiedad autorizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacion(String value) {
        this.autorizacion = value;
    }

}
