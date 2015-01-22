
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strPeriodo"
})
@XmlRootElement(name = "GetDatosInscInstSexo")
public class GetDatosInscInstSexo {

    protected String strPeriodo;

    /**
     * Obtiene el valor de la propiedad strPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPeriodo() {
        return strPeriodo;
    }

    /**
     * Define el valor de la propiedad strPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPeriodo(String value) {
        this.strPeriodo = value;
    }

}
