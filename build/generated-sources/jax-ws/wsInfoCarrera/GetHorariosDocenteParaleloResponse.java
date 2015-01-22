
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
 *         &lt;element name="GetHorariosDocenteParaleloResult" type="{http://academico.espoch.edu.ec/}ArrayOfHorarioClaseParalelo" minOccurs="0"/>
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
    "getHorariosDocenteParaleloResult"
})
@XmlRootElement(name = "GetHorariosDocenteParaleloResponse")
public class GetHorariosDocenteParaleloResponse {

    @XmlElement(name = "GetHorariosDocenteParaleloResult")
    protected ArrayOfHorarioClaseParalelo getHorariosDocenteParaleloResult;

    /**
     * Obtiene el valor de la propiedad getHorariosDocenteParaleloResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHorarioClaseParalelo }
     *     
     */
    public ArrayOfHorarioClaseParalelo getGetHorariosDocenteParaleloResult() {
        return getHorariosDocenteParaleloResult;
    }

    /**
     * Define el valor de la propiedad getHorariosDocenteParaleloResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHorarioClaseParalelo }
     *     
     */
    public void setGetHorariosDocenteParaleloResult(ArrayOfHorarioClaseParalelo value) {
        this.getHorariosDocenteParaleloResult = value;
    }

}
