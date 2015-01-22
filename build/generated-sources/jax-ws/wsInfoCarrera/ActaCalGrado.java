
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActaCalGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActaCalGrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormaGrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromedioE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromedioO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PorcentajeO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromedioRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PorcentajeRA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActaCalGrado", propOrder = {
    "cedula",
    "nombre",
    "formaGrado",
    "titulo",
    "fecha",
    "totalE",
    "promedioE",
    "totalO",
    "promedioO",
    "porcentajeO",
    "promedioRA",
    "porcentajeRA",
    "total"
})
public class ActaCalGrado {

    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "FormaGrado")
    protected String formaGrado;
    @XmlElement(name = "Titulo")
    protected String titulo;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "TotalE")
    protected String totalE;
    @XmlElement(name = "PromedioE")
    protected String promedioE;
    @XmlElement(name = "TotalO")
    protected String totalO;
    @XmlElement(name = "PromedioO")
    protected String promedioO;
    @XmlElement(name = "PorcentajeO")
    protected String porcentajeO;
    @XmlElement(name = "PromedioRA")
    protected String promedioRA;
    @XmlElement(name = "PorcentajeRA")
    protected String porcentajeRA;
    @XmlElement(name = "Total")
    protected String total;

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
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad formaGrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaGrado() {
        return formaGrado;
    }

    /**
     * Define el valor de la propiedad formaGrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaGrado(String value) {
        this.formaGrado = value;
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
     * Obtiene el valor de la propiedad totalE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalE() {
        return totalE;
    }

    /**
     * Define el valor de la propiedad totalE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalE(String value) {
        this.totalE = value;
    }

    /**
     * Obtiene el valor de la propiedad promedioE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromedioE() {
        return promedioE;
    }

    /**
     * Define el valor de la propiedad promedioE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromedioE(String value) {
        this.promedioE = value;
    }

    /**
     * Obtiene el valor de la propiedad totalO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalO() {
        return totalO;
    }

    /**
     * Define el valor de la propiedad totalO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalO(String value) {
        this.totalO = value;
    }

    /**
     * Obtiene el valor de la propiedad promedioO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromedioO() {
        return promedioO;
    }

    /**
     * Define el valor de la propiedad promedioO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromedioO(String value) {
        this.promedioO = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeO() {
        return porcentajeO;
    }

    /**
     * Define el valor de la propiedad porcentajeO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeO(String value) {
        this.porcentajeO = value;
    }

    /**
     * Obtiene el valor de la propiedad promedioRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromedioRA() {
        return promedioRA;
    }

    /**
     * Define el valor de la propiedad promedioRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromedioRA(String value) {
        this.promedioRA = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeRA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeRA() {
        return porcentajeRA;
    }

    /**
     * Define el valor de la propiedad porcentajeRA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeRA(String value) {
        this.porcentajeRA = value;
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

}
