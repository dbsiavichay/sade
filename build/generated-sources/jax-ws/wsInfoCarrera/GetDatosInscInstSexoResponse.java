
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
 *         &lt;element name="GetDatosInscInstSexoResult" type="{http://academico.espoch.edu.ec/}ArrayOfDatosInscritosInstSexo" minOccurs="0"/>
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
    "getDatosInscInstSexoResult"
})
@XmlRootElement(name = "GetDatosInscInstSexoResponse")
public class GetDatosInscInstSexoResponse {

    @XmlElement(name = "GetDatosInscInstSexoResult")
    protected ArrayOfDatosInscritosInstSexo getDatosInscInstSexoResult;

    /**
     * Obtiene el valor de la propiedad getDatosInscInstSexoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDatosInscritosInstSexo }
     *     
     */
    public ArrayOfDatosInscritosInstSexo getGetDatosInscInstSexoResult() {
        return getDatosInscInstSexoResult;
    }

    /**
     * Define el valor de la propiedad getDatosInscInstSexoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDatosInscritosInstSexo }
     *     
     */
    public void setGetDatosInscInstSexoResult(ArrayOfDatosInscritosInstSexo value) {
        this.getDatosInscInstSexoResult = value;
    }

}
