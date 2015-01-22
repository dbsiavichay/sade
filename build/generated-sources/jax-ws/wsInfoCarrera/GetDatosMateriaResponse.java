
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
 *         &lt;element name="GetDatosMateriaResult" type="{http://academico.espoch.edu.ec/}Materia" minOccurs="0"/>
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
    "getDatosMateriaResult"
})
@XmlRootElement(name = "GetDatosMateriaResponse")
public class GetDatosMateriaResponse {

    @XmlElement(name = "GetDatosMateriaResult")
    protected Materia getDatosMateriaResult;

    /**
     * Obtiene el valor de la propiedad getDatosMateriaResult.
     * 
     * @return
     *     possible object is
     *     {@link Materia }
     *     
     */
    public Materia getGetDatosMateriaResult() {
        return getDatosMateriaResult;
    }

    /**
     * Define el valor de la propiedad getDatosMateriaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Materia }
     *     
     */
    public void setGetDatosMateriaResult(Materia value) {
        this.getDatosMateriaResult = value;
    }

}
