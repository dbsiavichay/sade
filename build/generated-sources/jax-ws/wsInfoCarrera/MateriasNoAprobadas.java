
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para materias_no_aprobadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="materias_no_aprobadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Creditos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "materias_no_aprobadas", propOrder = {
    "codNivel",
    "nivel",
    "codMateria",
    "materia",
    "creditos"
})
public class MateriasNoAprobadas {

    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "Nivel")
    protected String nivel;
    @XmlElement(name = "CodMateria")
    protected String codMateria;
    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "Creditos")
    protected String creditos;

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
     * Obtiene el valor de la propiedad codMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMateria() {
        return codMateria;
    }

    /**
     * Define el valor de la propiedad codMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMateria(String value) {
        this.codMateria = value;
    }

    /**
     * Obtiene el valor de la propiedad materia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Define el valor de la propiedad materia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateria(String value) {
        this.materia = value;
    }

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditos(String value) {
        this.creditos = value;
    }

}
