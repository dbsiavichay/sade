
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
 *         &lt;element name="GetPeriodosAcademicosResult" type="{http://academico.espoch.edu.ec/}ArrayOfPeriodo" minOccurs="0"/>
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
    "getPeriodosAcademicosResult"
})
@XmlRootElement(name = "GetPeriodosAcademicosResponse")
public class GetPeriodosAcademicosResponse {

    @XmlElement(name = "GetPeriodosAcademicosResult")
    protected ArrayOfPeriodo getPeriodosAcademicosResult;

    /**
     * Obtiene el valor de la propiedad getPeriodosAcademicosResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeriodo }
     *     
     */
    public ArrayOfPeriodo getGetPeriodosAcademicosResult() {
        return getPeriodosAcademicosResult;
    }

    /**
     * Define el valor de la propiedad getPeriodosAcademicosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeriodo }
     *     
     */
    public void setGetPeriodosAcademicosResult(ArrayOfPeriodo value) {
        this.getPeriodosAcademicosResult = value;
    }

}
