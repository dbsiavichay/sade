
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Inscripcion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Inscripcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Facultad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Escuela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Carrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Inscripcion", propOrder = {
    "facultad",
    "escuela",
    "codCarrera",
    "carrera",
    "periodo",
    "fecha",
    "forma"
})
public class Inscripcion {

    @XmlElement(name = "Facultad")
    protected String facultad;
    @XmlElement(name = "Escuela")
    protected String escuela;
    @XmlElement(name = "CodCarrera")
    protected String codCarrera;
    @XmlElement(name = "Carrera")
    protected String carrera;
    @XmlElement(name = "Periodo")
    protected String periodo;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Forma")
    protected String forma;

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
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
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
     * Obtiene el valor de la propiedad forma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForma() {
        return forma;
    }

    /**
     * Define el valor de la propiedad forma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForma(String value) {
        this.forma = value;
    }

}
