
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tipos_Instituciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Tipos_Instituciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tipos_Instituciones", propOrder = {
    "strCodigo",
    "strDescripcion"
})
public class TiposInstituciones {

    protected String strCodigo;
    protected String strDescripcion;

    /**
     * Obtiene el valor de la propiedad strCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigo() {
        return strCodigo;
    }

    /**
     * Define el valor de la propiedad strCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigo(String value) {
        this.strCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad strDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDescripcion() {
        return strDescripcion;
    }

    /**
     * Define el valor de la propiedad strDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDescripcion(String value) {
        this.strDescripcion = value;
    }

}
