
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
 *         &lt;element name="GetMallaCurricularPensumVigenteSinDescripcionResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateria_Pensum" minOccurs="0"/>
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
    "getMallaCurricularPensumVigenteSinDescripcionResult"
})
@XmlRootElement(name = "GetMallaCurricularPensumVigenteSinDescripcionResponse")
public class GetMallaCurricularPensumVigenteSinDescripcionResponse {

    @XmlElement(name = "GetMallaCurricularPensumVigenteSinDescripcionResult")
    protected ArrayOfMateriaPensum getMallaCurricularPensumVigenteSinDescripcionResult;

    /**
     * Obtiene el valor de la propiedad getMallaCurricularPensumVigenteSinDescripcionResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriaPensum }
     *     
     */
    public ArrayOfMateriaPensum getGetMallaCurricularPensumVigenteSinDescripcionResult() {
        return getMallaCurricularPensumVigenteSinDescripcionResult;
    }

    /**
     * Define el valor de la propiedad getMallaCurricularPensumVigenteSinDescripcionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriaPensum }
     *     
     */
    public void setGetMallaCurricularPensumVigenteSinDescripcionResult(ArrayOfMateriaPensum value) {
        this.getMallaCurricularPensumVigenteSinDescripcionResult = value;
    }

}
