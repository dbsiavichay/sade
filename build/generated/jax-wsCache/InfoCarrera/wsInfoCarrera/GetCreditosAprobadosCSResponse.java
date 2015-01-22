
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
 *         &lt;element name="GetCreditosAprobadosCSResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "getCreditosAprobadosCSResult"
})
@XmlRootElement(name = "GetCreditosAprobadosCSResponse")
public class GetCreditosAprobadosCSResponse {

    @XmlElement(name = "GetCreditosAprobadosCSResult")
    protected double getCreditosAprobadosCSResult;

    /**
     * Obtiene el valor de la propiedad getCreditosAprobadosCSResult.
     * 
     */
    public double getGetCreditosAprobadosCSResult() {
        return getCreditosAprobadosCSResult;
    }

    /**
     * Define el valor de la propiedad getCreditosAprobadosCSResult.
     * 
     */
    public void setGetCreditosAprobadosCSResult(double value) {
        this.getCreditosAprobadosCSResult = value;
    }

}
