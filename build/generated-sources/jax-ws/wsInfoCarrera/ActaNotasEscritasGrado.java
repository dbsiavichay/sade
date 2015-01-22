
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActaNotasEscritasGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActaNotasEscritasGrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuncionMiembro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Evaluacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActaNotasEscritasGrado", propOrder = {
    "cedula",
    "funcionMiembro",
    "evaluacion"
})
public class ActaNotasEscritasGrado {

    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "FuncionMiembro")
    protected String funcionMiembro;
    @XmlElement(name = "Evaluacion")
    protected String evaluacion;

    /**
     * Obtiene el valor de la propiedad cedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Define el valor de la propiedad cedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedula(String value) {
        this.cedula = value;
    }

    /**
     * Obtiene el valor de la propiedad funcionMiembro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuncionMiembro() {
        return funcionMiembro;
    }

    /**
     * Define el valor de la propiedad funcionMiembro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuncionMiembro(String value) {
        this.funcionMiembro = value;
    }

    /**
     * Obtiene el valor de la propiedad evaluacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluacion() {
        return evaluacion;
    }

    /**
     * Define el valor de la propiedad evaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluacion(String value) {
        this.evaluacion = value;
    }

}
