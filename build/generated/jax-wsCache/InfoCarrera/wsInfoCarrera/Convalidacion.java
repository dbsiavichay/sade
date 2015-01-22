
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Convalidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Convalidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Materia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Resolucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodForma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Convalidacion", propOrder = {
    "materia",
    "resolucion",
    "codForma"
})
public class Convalidacion {

    @XmlElement(name = "Materia")
    protected String materia;
    @XmlElement(name = "Resolucion")
    protected String resolucion;
    @XmlElement(name = "CodForma")
    protected String codForma;

    /**
     * Obtiene el valor de la propiedad materia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Define el valor de la propiedad materia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMateria(String value) {
        this.materia = value;
    }

    /**
     * Obtiene el valor de la propiedad resolucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolucion() {
        return resolucion;
    }

    /**
     * Define el valor de la propiedad resolucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolucion(String value) {
        this.resolucion = value;
    }

    /**
     * Obtiene el valor de la propiedad codForma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodForma() {
        return codForma;
    }

    /**
     * Define el valor de la propiedad codForma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodForma(String value) {
        this.codForma = value;
    }

}
