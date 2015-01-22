
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Dictado_Materia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Dictado_Materia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Paralelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Docente" type="{http://academico.espoch.edu.ec/}Persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dictado_Materia", propOrder = {
    "codNivel",
    "descripcionNivel",
    "paralelo",
    "docente"
})
public class DictadoMateria {

    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "DescripcionNivel")
    protected String descripcionNivel;
    @XmlElement(name = "Paralelo")
    protected String paralelo;
    @XmlElement(name = "Docente")
    protected Persona docente;

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
     * Obtiene el valor de la propiedad descripcionNivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionNivel() {
        return descripcionNivel;
    }

    /**
     * Define el valor de la propiedad descripcionNivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionNivel(String value) {
        this.descripcionNivel = value;
    }

    /**
     * Obtiene el valor de la propiedad paralelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParalelo() {
        return paralelo;
    }

    /**
     * Define el valor de la propiedad paralelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParalelo(String value) {
        this.paralelo = value;
    }

    /**
     * Obtiene el valor de la propiedad docente.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getDocente() {
        return docente;
    }

    /**
     * Define el valor de la propiedad docente.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setDocente(Persona value) {
        this.docente = value;
    }

}
