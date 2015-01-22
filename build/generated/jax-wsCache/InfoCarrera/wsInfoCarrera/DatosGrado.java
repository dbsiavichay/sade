
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosGrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodTipoInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profesional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaGrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Jornada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosGrado", propOrder = {
    "codInstitucion",
    "institucion",
    "codTipoInstitucion",
    "tipoInstitucion",
    "titulo",
    "profesional",
    "fechaGrado",
    "codCiudad",
    "ciudad",
    "codProvincia",
    "provincia",
    "codPais",
    "pais",
    "localidad",
    "jornada"
})
public class DatosGrado {

    @XmlElement(name = "CodInstitucion")
    protected String codInstitucion;
    @XmlElement(name = "Institucion")
    protected String institucion;
    @XmlElement(name = "CodTipoInstitucion")
    protected String codTipoInstitucion;
    @XmlElement(name = "TipoInstitucion")
    protected String tipoInstitucion;
    @XmlElement(name = "Titulo")
    protected String titulo;
    @XmlElement(name = "Profesional")
    protected String profesional;
    @XmlElement(name = "FechaGrado")
    protected String fechaGrado;
    @XmlElement(name = "CodCiudad")
    protected String codCiudad;
    @XmlElement(name = "Ciudad")
    protected String ciudad;
    @XmlElement(name = "CodProvincia")
    protected String codProvincia;
    @XmlElement(name = "Provincia")
    protected String provincia;
    @XmlElement(name = "CodPais")
    protected String codPais;
    @XmlElement(name = "Pais")
    protected String pais;
    @XmlElement(name = "Localidad")
    protected String localidad;
    @XmlElement(name = "Jornada")
    protected String jornada;

    /**
     * Obtiene el valor de la propiedad codInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodInstitucion() {
        return codInstitucion;
    }

    /**
     * Define el valor de la propiedad codInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodInstitucion(String value) {
        this.codInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitucion(String value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoInstitucion() {
        return codTipoInstitucion;
    }

    /**
     * Define el valor de la propiedad codTipoInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoInstitucion(String value) {
        this.codTipoInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    /**
     * Define el valor de la propiedad tipoInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInstitucion(String value) {
        this.tipoInstitucion = value;
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
     * Obtiene el valor de la propiedad profesional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfesional() {
        return profesional;
    }

    /**
     * Define el valor de la propiedad profesional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfesional(String value) {
        this.profesional = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaGrado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaGrado() {
        return fechaGrado;
    }

    /**
     * Define el valor de la propiedad fechaGrado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaGrado(String value) {
        this.fechaGrado = value;
    }

    /**
     * Obtiene el valor de la propiedad codCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCiudad() {
        return codCiudad;
    }

    /**
     * Define el valor de la propiedad codCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCiudad(String value) {
        this.codCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad codProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProvincia() {
        return codProvincia;
    }

    /**
     * Define el valor de la propiedad codProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProvincia(String value) {
        this.codProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad codPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPais() {
        return codPais;
    }

    /**
     * Define el valor de la propiedad codPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPais(String value) {
        this.codPais = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidad(String value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad jornada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJornada() {
        return jornada;
    }

    /**
     * Define el valor de la propiedad jornada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJornada(String value) {
        this.jornada = value;
    }

}
