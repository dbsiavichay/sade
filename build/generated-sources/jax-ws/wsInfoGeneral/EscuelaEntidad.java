
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EscuelaEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EscuelaEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Facultad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEscuela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Escuela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodTipoEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EscuelaEntidad", propOrder = {
    "facultad",
    "codEscuela",
    "escuela",
    "codCarrera",
    "carrera",
    "codTipoEntidad"
})
public class EscuelaEntidad {

    @XmlElement(name = "Facultad")
    protected String facultad;
    @XmlElement(name = "CodEscuela")
    protected String codEscuela;
    @XmlElement(name = "Escuela")
    protected String escuela;
    @XmlElement(name = "CodCarrera")
    protected String codCarrera;
    @XmlElement(name = "Carrera")
    protected String carrera;
    @XmlElement(name = "CodTipoEntidad")
    protected String codTipoEntidad;

    /**
     * Obtiene el valor de la propiedad facultad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * Define el valor de la propiedad facultad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultad(String value) {
        this.facultad = value;
    }

    /**
     * Obtiene el valor de la propiedad codEscuela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEscuela() {
        return codEscuela;
    }

    /**
     * Define el valor de la propiedad codEscuela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEscuela(String value) {
        this.codEscuela = value;
    }

    /**
     * Obtiene el valor de la propiedad escuela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * Define el valor de la propiedad escuela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscuela(String value) {
        this.escuela = value;
    }

    /**
     * Obtiene el valor de la propiedad codCarrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCarrera() {
        return codCarrera;
    }

    /**
     * Define el valor de la propiedad codCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCarrera(String value) {
        this.codCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad carrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Define el valor de la propiedad carrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrera(String value) {
        this.carrera = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoEntidad() {
        return codTipoEntidad;
    }

    /**
     * Define el valor de la propiedad codTipoEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoEntidad(String value) {
        this.codTipoEntidad = value;
    }

}
