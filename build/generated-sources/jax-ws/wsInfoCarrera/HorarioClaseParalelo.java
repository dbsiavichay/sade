
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HorarioClaseParalelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HorarioClaseParalelo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://academico.espoch.edu.ec/}HorarioClase">
 *       &lt;sequence>
 *         &lt;element name="strCodParalelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorarioClaseParalelo", propOrder = {
    "strCodParalelo"
})
public class HorarioClaseParalelo
    extends HorarioClase
{

    protected String strCodParalelo;

    /**
     * Obtiene el valor de la propiedad strCodParalelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodParalelo() {
        return strCodParalelo;
    }

    /**
     * Define el valor de la propiedad strCodParalelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodParalelo(String value) {
        this.strCodParalelo = value;
    }

}
