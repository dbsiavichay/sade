
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfActaNotasEscritasGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActaNotasEscritasGrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActaNotasEscritasGrado" type="{http://academico.espoch.edu.ec/}ActaNotasEscritasGrado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActaNotasEscritasGrado", propOrder = {
    "actaNotasEscritasGrado"
})
public class ArrayOfActaNotasEscritasGrado {

    @XmlElement(name = "ActaNotasEscritasGrado", nillable = true)
    protected List<ActaNotasEscritasGrado> actaNotasEscritasGrado;

    /**
     * Gets the value of the actaNotasEscritasGrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actaNotasEscritasGrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActaNotasEscritasGrado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActaNotasEscritasGrado }
     * 
     * 
     */
    public List<ActaNotasEscritasGrado> getActaNotasEscritasGrado() {
        if (actaNotasEscritasGrado == null) {
            actaNotasEscritasGrado = new ArrayList<ActaNotasEscritasGrado>();
        }
        return this.actaNotasEscritasGrado;
    }

}
