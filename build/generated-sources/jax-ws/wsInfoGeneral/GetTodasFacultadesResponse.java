
package wsInfoGeneral;

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
 *         &lt;element name="GetTodasFacultadesResult" type="{http://academico.espoch.edu.ec/}ArrayOfFacultad" minOccurs="0"/>
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
    "getTodasFacultadesResult"
})
@XmlRootElement(name = "GetTodasFacultadesResponse")
public class GetTodasFacultadesResponse {

    @XmlElement(name = "GetTodasFacultadesResult")
    protected ArrayOfFacultad getTodasFacultadesResult;

    /**
     * Obtiene el valor de la propiedad getTodasFacultadesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFacultad }
     *     
     */
    public ArrayOfFacultad getGetTodasFacultadesResult() {
        return getTodasFacultadesResult;
    }

    /**
     * Define el valor de la propiedad getTodasFacultadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFacultad }
     *     
     */
    public void setGetTodasFacultadesResult(ArrayOfFacultad value) {
        this.getTodasFacultadesResult = value;
    }

}
