
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfEscuelaEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEscuelaEntidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EscuelaEntidad" type="{http://academico.espoch.edu.ec/}EscuelaEntidad" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEscuelaEntidad", propOrder = {
    "escuelaEntidad"
})
public class ArrayOfEscuelaEntidad {

    @XmlElement(name = "EscuelaEntidad", nillable = true)
    protected List<EscuelaEntidad> escuelaEntidad;

    /**
     * Gets the value of the escuelaEntidad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escuelaEntidad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscuelaEntidad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EscuelaEntidad }
     * 
     * 
     */
    public List<EscuelaEntidad> getEscuelaEntidad() {
        if (escuelaEntidad == null) {
            escuelaEntidad = new ArrayList<EscuelaEntidad>();
        }
        return this.escuelaEntidad;
    }

}
