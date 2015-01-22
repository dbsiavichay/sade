
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Materias_aprobadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Materias_aprobadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asistencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormaAprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acumulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Materias_aprobadas", propOrder = {
    "codNivel",
    "nivel",
    "codMateria",
    "materia",
    "numMatricula",
    "asistencia",
    "formaAprobacion",
    "acumulado",
    "nota",
    "total",
    "creditos"
})
public class MateriasAprobadas {

    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "Nivel")
    protected String nivel;
    @XmlElement(name = "CodMateria")
    protected String codMateria;
    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "NumMatricula")
    protected String numMatricula;
    @XmlElement(name = "Asistencia")
    protected String asistencia;
    @XmlElement(name = "FormaAprobacion")
    protected String formaAprobacion;
    @XmlElement(name = "Acumulado")
    protected String acumulado;
    @XmlElement(name = "Nota")
    protected String nota;
    @XmlElement(name = "Total")
    protected String total;
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
     * Obtiene el valor de la propiedad numMatricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumMatricula() {
        return numMatricula;
    }

    /**
     * Define el valor de la propiedad numMatricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumMatricula(String value) {
        this.numMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad asistencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsistencia() {
        return asistencia;
    }

    /**
     * Define el valor de la propiedad asistencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsistencia(String value) {
        this.asistencia = value;
    }

    /**
     * Obtiene el valor de la propiedad formaAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaAprobacion() {
        return formaAprobacion;
    }

    /**
     * Define el valor de la propiedad formaAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaAprobacion(String value) {
        this.formaAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad acumulado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcumulado() {
        return acumulado;
    }

    /**
     * Define el valor de la propiedad acumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcumulado(String value) {
        this.acumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad nota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNota() {
        return nota;
    }

    /**
     * Define el valor de la propiedad nota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNota(String value) {
        this.nota = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotal(String value) {
        this.total = value;
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
