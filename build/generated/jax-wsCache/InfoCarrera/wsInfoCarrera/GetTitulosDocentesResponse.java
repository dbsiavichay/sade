
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetTitulosDocentesResult" type="{http://academico.espoch.edu.ec/}ArrayOfTitulosDocente" minOccurs="0"/>
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
    "getTitulosDocentesResult"
})
@XmlRootElement(name = "GetTitulosDocentesResponse")
public class GetTitulosDocentesResponse {

    @XmlElement(name = "GetTitulosDocentesResult")
    protected ArrayOfTitulosDocente getTitulosDocentesResult;

    /**
     * Obtiene el valor de la propiedad getTitulosDocentesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTitulosDocente }
     *     
     */
    public ArrayOfTitulosDocente getGetTitulosDocentesResult() {
        return getTitulosDocentesResult;
    }

    /**
     * Define el valor de la propiedad getTitulosDocentesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTitulosDocente }
     *     
     */
    public void setGetTitulosDocentesResult(ArrayOfTitulosDocente value) {
        this.getTitulosDocentesResult = value;
    }

}
