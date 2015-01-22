
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HorarioExamenesEstudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HorarioExamenesEstudiante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodMateria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFechaExPrinc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtFechaExSusp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorarioExamenesEstudiante", propOrder = {
    "strCodMateria",
    "strNombre",
    "dtFechaExPrinc",
    "dtFechaExSusp"
})
public class HorarioExamenesEstudiante {

    protected String strCodMateria;
    protected String strNombre;
    protected String dtFechaExPrinc;
    protected String dtFechaExSusp;

    /**
     * Obtiene el valor de la propiedad strCodMateria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodMateria() {
        return strCodMateria;
    }

    /**
     * Define el valor de la propiedad strCodMateria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodMateria(String value) {
        this.strCodMateria = value;
    }

    /**
     * Obtiene el valor de la propiedad strNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrNombre() {
        return strNombre;
    }

    /**
     * Define el valor de la propiedad strNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrNombre(String value) {
        this.strNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad dtFechaExPrinc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtFechaExPrinc() {
        return dtFechaExPrinc;
    }

    /**
     * Define el valor de la propiedad dtFechaExPrinc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFechaExPrinc(String value) {
        this.dtFechaExPrinc = value;
    }

    /**
     * Obtiene el valor de la propiedad dtFechaExSusp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtFechaExSusp() {
        return dtFechaExSusp;
    }

    /**
     * Define el valor de la propiedad dtFechaExSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtFechaExSusp(String value) {
        this.dtFechaExSusp = value;
    }

}
