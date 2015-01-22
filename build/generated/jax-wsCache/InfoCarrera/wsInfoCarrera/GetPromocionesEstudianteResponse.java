
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
 *         &lt;element name="GetPromocionesEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfPromocionesEst" minOccurs="0"/>
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
    "getPromocionesEstudianteResult"
})
@XmlRootElement(name = "GetPromocionesEstudianteResponse")
public class GetPromocionesEstudianteResponse {

    @XmlElement(name = "GetPromocionesEstudianteResult")
    protected ArrayOfPromocionesEst getPromocionesEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getPromocionesEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPromocionesEst }
     *     
     */
    public ArrayOfPromocionesEst getGetPromocionesEstudianteResult() {
        return getPromocionesEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getPromocionesEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPromocionesEst }
     *     
     */
    public void setGetPromocionesEstudianteResult(ArrayOfPromocionesEst value) {
        this.getPromocionesEstudianteResult = value;
    }

}
