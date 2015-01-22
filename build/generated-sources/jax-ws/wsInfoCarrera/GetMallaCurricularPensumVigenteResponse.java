
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
 *         &lt;element name="GetMallaCurricularPensumVigenteResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateria_Pensum" minOccurs="0"/>
 *         &lt;element name="Pensum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMallaCurricularPensumVigenteResult",
    "pensum"
})
@XmlRootElement(name = "GetMallaCurricularPensumVigenteResponse")
public class GetMallaCurricularPensumVigenteResponse {

    @XmlElement(name = "GetMallaCurricularPensumVigenteResult")
    protected ArrayOfMateriaPensum getMallaCurricularPensumVigenteResult;
    @XmlElement(name = "Pensum")
    protected String pensum;

    /**
     * Obtiene el valor de la propiedad getMallaCurricularPensumVigenteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriaPensum }
     *     
     */
    public ArrayOfMateriaPensum getGetMallaCurricularPensumVigenteResult() {
        return getMallaCurricularPensumVigenteResult;
    }

    /**
     * Define el valor de la propiedad getMallaCurricularPensumVigenteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriaPensum }
     *     
     */
    public void setGetMallaCurricularPensumVigenteResult(ArrayOfMateriaPensum value) {
        this.getMallaCurricularPensumVigenteResult = value;
    }

    /**
     * Obtiene el valor de la propiedad pensum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensum() {
        return pensum;
    }

    /**
     * Define el valor de la propiedad pensum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensum(String value) {
        this.pensum = value;
    }

}
