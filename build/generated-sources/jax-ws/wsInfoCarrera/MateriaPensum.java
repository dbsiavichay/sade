
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Materia_Pensum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Materia_Pensum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Creditos" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="HorasTeoricas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HorasPracticas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Requisitos" type="{http://academico.espoch.edu.ec/}ArrayOfMateria_Requisito" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Materia_Pensum", propOrder = {
    "codMateria",
    "materia",
    "codNivel",
    "nivel",
    "codArea",
    "area",
    "creditos",
    "horasTeoricas",
    "horasPracticas",
    "requisitos"
})
public class MateriaPensum {

    @XmlElement(name = "CodMateria")
    protected String codMateria;
    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "Nivel")
    protected String nivel;
    @XmlElement(name = "CodArea")
    protected String codArea;
    @XmlElement(name = "Area")
    protected String area;
    @XmlElement(name = "Creditos")
    protected float creditos;
    @XmlElement(name = "HorasTeoricas")
    protected int horasTeoricas;
    @XmlElement(name = "HorasPracticas")
    protected int horasPracticas;
    @XmlElement(name = "Requisitos")
    protected ArrayOfMateriaRequisito requisitos;

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
     * Obtiene el valor de la propiedad codArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodArea() {
        return codArea;
    }

    /**
     * Define el valor de la propiedad codArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodArea(String value) {
        this.codArea = value;
    }

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     */
    public float getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     */
    public void setCreditos(float value) {
        this.creditos = value;
    }

    /**
     * Obtiene el valor de la propiedad horasTeoricas.
     * 
     */
    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    /**
     * Define el valor de la propiedad horasTeoricas.
     * 
     */
    public void setHorasTeoricas(int value) {
        this.horasTeoricas = value;
    }

    /**
     * Obtiene el valor de la propiedad horasPracticas.
     * 
     */
    public int getHorasPracticas() {
        return horasPracticas;
    }

    /**
     * Define el valor de la propiedad horasPracticas.
     * 
     */
    public void setHorasPracticas(int value) {
        this.horasPracticas = value;
    }

    /**
     * Obtiene el valor de la propiedad requisitos.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriaRequisito }
     *     
     */
    public ArrayOfMateriaRequisito getRequisitos() {
        return requisitos;
    }

    /**
     * Define el valor de la propiedad requisitos.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriaRequisito }
     *     
     */
    public void setRequisitos(ArrayOfMateriaRequisito value) {
        this.requisitos = value;
    }

}
