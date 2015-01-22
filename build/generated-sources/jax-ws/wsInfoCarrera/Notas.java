
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Notas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Notas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodParalelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumMatricula" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Acumulado" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Suspension" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Equivalencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asistencia" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notas", propOrder = {
    "codMateria",
    "materia",
    "codNivel",
    "codParalelo",
    "numMatricula",
    "acumulado",
    "principal",
    "suspension",
    "total",
    "equivalencia",
    "asistencia",
    "periodo"
})
public class Notas {

    @XmlElement(name = "CodMateria")
    protected String codMateria;
    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "CodParalelo")
    protected String codParalelo;
    @XmlElement(name = "NumMatricula")
    @XmlSchemaType(name = "unsignedByte")
    protected short numMatricula;
    @XmlElement(name = "Acumulado")
    @XmlSchemaType(name = "unsignedByte")
    protected short acumulado;
    @XmlElement(name = "Principal")
    @XmlSchemaType(name = "unsignedByte")
    protected short principal;
    @XmlElement(name = "Suspension")
    @XmlSchemaType(name = "unsignedByte")
    protected short suspension;
    @XmlElement(name = "Total")
    @XmlSchemaType(name = "unsignedByte")
    protected short total;
    @XmlElement(name = "Equivalencia")
    protected String equivalencia;
    @XmlElement(name = "Asistencia")
    @XmlSchemaType(name = "unsignedByte")
    protected short asistencia;
    @XmlElement(name = "Periodo")
    protected String periodo;

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
     * Obtiene el valor de la propiedad codParalelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodParalelo() {
        return codParalelo;
    }

    /**
     * Define el valor de la propiedad codParalelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodParalelo(String value) {
        this.codParalelo = value;
    }

    /**
     * Obtiene el valor de la propiedad numMatricula.
     * 
     */
    public short getNumMatricula() {
        return numMatricula;
    }

    /**
     * Define el valor de la propiedad numMatricula.
     * 
     */
    public void setNumMatricula(short value) {
        this.numMatricula = value;
    }

    /**
     * Obtiene el valor de la propiedad acumulado.
     * 
     */
    public short getAcumulado() {
        return acumulado;
    }

    /**
     * Define el valor de la propiedad acumulado.
     * 
     */
    public void setAcumulado(short value) {
        this.acumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad principal.
     * 
     */
    public short getPrincipal() {
        return principal;
    }

    /**
     * Define el valor de la propiedad principal.
     * 
     */
    public void setPrincipal(short value) {
        this.principal = value;
    }

    /**
     * Obtiene el valor de la propiedad suspension.
     * 
     */
    public short getSuspension() {
        return suspension;
    }

    /**
     * Define el valor de la propiedad suspension.
     * 
     */
    public void setSuspension(short value) {
        this.suspension = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public short getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(short value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalencia() {
        return equivalencia;
    }

    /**
     * Define el valor de la propiedad equivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalencia(String value) {
        this.equivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad asistencia.
     * 
     */
    public short getAsistencia() {
        return asistencia;
    }

    /**
     * Define el valor de la propiedad asistencia.
     * 
     */
    public void setAsistencia(short value) {
        this.asistencia = value;
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

}
