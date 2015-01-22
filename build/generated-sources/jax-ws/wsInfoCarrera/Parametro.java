
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parametro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDescrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parametro", propOrder = {
    "strCodigo",
    "strValor",
    "strDescrip"
})
public class Parametro {

    protected String strCodigo;
    protected String strValor;
    protected String strDescrip;

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
     * Obtiene el valor de la propiedad strValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrValor() {
        return strValor;
    }

    /**
     * Define el valor de la propiedad strValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrValor(String value) {
        this.strValor = value;
    }

    /**
     * Obtiene el valor de la propiedad strDescrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDescrip() {
        return strDescrip;
    }

    /**
     * Define el valor de la propiedad strDescrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDescrip(String value) {
        this.strDescrip = value;
    }

}
