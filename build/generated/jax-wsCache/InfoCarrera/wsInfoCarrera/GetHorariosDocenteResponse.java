
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
 *         &lt;element name="GetHorariosDocenteResult" type="{http://academico.espoch.edu.ec/}ArrayOfHorarioClase" minOccurs="0"/>
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
    "getHorariosDocenteResult"
})
@XmlRootElement(name = "GetHorariosDocenteResponse")
public class GetHorariosDocenteResponse {

    @XmlElement(name = "GetHorariosDocenteResult")
    protected ArrayOfHorarioClase getHorariosDocenteResult;

    /**
     * Obtiene el valor de la propiedad getHorariosDocenteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHorarioClase }
     *     
     */
    public ArrayOfHorarioClase getGetHorariosDocenteResult() {
        return getHorariosDocenteResult;
    }

    /**
     * Define el valor de la propiedad getHorariosDocenteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHorarioClase }
     *     
     */
    public void setGetHorariosDocenteResult(ArrayOfHorarioClase value) {
        this.getHorariosDocenteResult = value;
    }

}
