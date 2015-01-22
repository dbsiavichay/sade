
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
 *         &lt;element name="CodCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodPeriodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "codCarrera",
    "cedula",
    "codPeriodo"
})
@XmlRootElement(name = "GetMateriasEstudiante")
public class GetMateriasEstudiante {

    @XmlElement(name = "CodCarrera")
    protected String codCarrera;
    @XmlElement(name = "Cedula")
    protected String cedula;
    @XmlElement(name = "CodPeriodo")
    protected String codPeriodo;

    /**
     * Obtiene el valor de la propiedad codCarrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCarrera() {
        return codCarrera;
    }

    /**
     * Define el valor de la propiedad codCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCarrera(String value) {
        this.codCarrera = value;
    }

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
     * Obtiene el valor de la propiedad codPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPeriodo() {
        return codPeriodo;
    }

    /**
     * Define el valor de la propiedad codPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPeriodo(String value) {
        this.codPeriodo = value;
    }

}
