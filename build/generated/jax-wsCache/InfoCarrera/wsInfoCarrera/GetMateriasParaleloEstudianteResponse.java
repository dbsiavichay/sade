
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
 *         &lt;element name="GetMateriasParaleloEstudianteResult" type="{http://academico.espoch.edu.ec/}ArrayOfMateriaParalelo" minOccurs="0"/>
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
    "getMateriasParaleloEstudianteResult"
})
@XmlRootElement(name = "GetMateriasParaleloEstudianteResponse")
public class GetMateriasParaleloEstudianteResponse {

    @XmlElement(name = "GetMateriasParaleloEstudianteResult")
    protected ArrayOfMateriaParalelo getMateriasParaleloEstudianteResult;

    /**
     * Obtiene el valor de la propiedad getMateriasParaleloEstudianteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMateriaParalelo }
     *     
     */
    public ArrayOfMateriaParalelo getGetMateriasParaleloEstudianteResult() {
        return getMateriasParaleloEstudianteResult;
    }

    /**
     * Define el valor de la propiedad getMateriasParaleloEstudianteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMateriaParalelo }
     *     
     */
    public void setGetMateriasParaleloEstudianteResult(ArrayOfMateriaParalelo value) {
        this.getMateriasParaleloEstudianteResult = value;
    }

}
