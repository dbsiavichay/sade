
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PromocionesEst complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PromocionesEst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodNivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodParalelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Acumulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromCiclo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suspencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Equivalencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Asistencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromocionesEst", propOrder = {
    "codPeriodo",
    "periodo",
    "fechaPeriodo",
    "codMateria",
    "materia",
    "codNivel",
    "codParalelo",
    "numMatricula",
    "acumulado",
    "principal",
    "promCiclo",
    "suspencion",
    "total",
    "equivalencia",
    "asistencia"
})
public class PromocionesEst {

    @XmlElement(name = "CodPeriodo")
    protected String codPeriodo;
    @XmlElement(name = "Periodo")
    protected String periodo;
    @XmlElement(name = "FechaPeriodo")
    protected String fechaPeriodo;
    @XmlElement(name = "CodMateria")
    protected String codMateria;
    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "CodNivel")
    protected String codNivel;
    @XmlElement(name = "CodParalelo")
    protected String codParalelo;
    @XmlElement(name = "NumMatricula")
    protected String numMatricula;
    @XmlElement(name = "Acumulado")
    protected String acumulado;
    @XmlElement(name = "Principal")
    protected String principal;
    @XmlElement(name = "PromCiclo")
    protected String promCiclo;
    @XmlElement(name = "Suspencion")
    protected String suspencion;
    @XmlElement(name = "Total")
    protected String total;
    @XmlElement(name = "Equivalencia")
    protected String equivalencia;
    @XmlElement(name = "Asistencia")
    protected String asistencia;

    /**
     * Obtiene el valor de la propiedad codPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPeriodo() {
        return codPeriodo;
    }

    /**
     * Define el valor de la propiedad codPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPeriodo(String value) {
        this.codPeriodo = value;
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
     * Obtiene el valor de la propiedad fechaPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPeriodo() {
        return fechaPeriodo;
    }

    /**
     * Define el valor de la propiedad fechaPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPeriodo(String value) {
        this.fechaPeriodo = value;
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
     * Obtiene el valor de la propiedad principal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Define el valor de la propiedad principal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipal(String value) {
        this.principal = value;
    }

    /**
     * Obtiene el valor de la propiedad promCiclo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromCiclo() {
        return promCiclo;
    }

    /**
     * Define el valor de la propiedad promCiclo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromCiclo(String value) {
        this.promCiclo = value;
    }

    /**
     * Obtiene el valor de la propiedad suspencion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspencion() {
        return suspencion;
    }

    /**
     * Define el valor de la propiedad suspencion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspencion(String value) {
        this.suspencion = value;
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

}
