
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InstitucionEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstitucionEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strApellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strTipo_institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blnprofesional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCiudadProc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCiudadInst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstitucionEstudiante", propOrder = {
    "strCedula",
    "strNombres",
    "strApellidos",
    "strTitulo",
    "strInstitucion",
    "strNacionalidad",
    "strTipoInstitucion",
    "blnprofesional",
    "strCiudadProc",
    "strCiudadInst"
})
public class InstitucionEstudiante {

    protected String strCedula;
    protected String strNombres;
    protected String strApellidos;
    protected String strTitulo;
    protected String strInstitucion;
    protected String strNacionalidad;
    @XmlElement(name = "strTipo_institucion")
    protected String strTipoInstitucion;
    protected String blnprofesional;
    protected String strCiudadProc;
    protected String strCiudadInst;

    /**
     * Obtiene el valor de la propiedad strCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCedula() {
        return strCedula;
    }

    /**
     * Define el valor de la propiedad strCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCedula(String value) {
        this.strCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad strNombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombres() {
        return strNombres;
    }

    /**
     * Define el valor de la propiedad strNombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombres(String value) {
        this.strNombres = value;
    }

    /**
     * Obtiene el valor de la propiedad strApellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrApellidos() {
        return strApellidos;
    }

    /**
     * Define el valor de la propiedad strApellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrApellidos(String value) {
        this.strApellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad strTitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTitulo() {
        return strTitulo;
    }

    /**
     * Define el valor de la propiedad strTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTitulo(String value) {
        this.strTitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad strInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrInstitucion() {
        return strInstitucion;
    }

    /**
     * Define el valor de la propiedad strInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrInstitucion(String value) {
        this.strInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad strNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNacionalidad() {
        return strNacionalidad;
    }

    /**
     * Define el valor de la propiedad strNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNacionalidad(String value) {
        this.strNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad strTipoInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTipoInstitucion() {
        return strTipoInstitucion;
    }

    /**
     * Define el valor de la propiedad strTipoInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTipoInstitucion(String value) {
        this.strTipoInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad blnprofesional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlnprofesional() {
        return blnprofesional;
    }

    /**
     * Define el valor de la propiedad blnprofesional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlnprofesional(String value) {
        this.blnprofesional = value;
    }

    /**
     * Obtiene el valor de la propiedad strCiudadProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCiudadProc() {
        return strCiudadProc;
    }

    /**
     * Define el valor de la propiedad strCiudadProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCiudadProc(String value) {
        this.strCiudadProc = value;
    }

    /**
     * Obtiene el valor de la propiedad strCiudadInst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCiudadInst() {
        return strCiudadInst;
    }

    /**
     * Define el valor de la propiedad strCiudadInst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCiudadInst(String value) {
        this.strCiudadInst = value;
    }

}
