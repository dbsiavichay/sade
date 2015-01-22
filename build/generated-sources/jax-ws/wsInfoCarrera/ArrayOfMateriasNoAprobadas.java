
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMaterias_no_aprobadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaterias_no_aprobadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materias_no_aprobadas" type="{http://academico.espoch.edu.ec/}materias_no_aprobadas" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaterias_no_aprobadas", propOrder = {
    "materiasNoAprobadas"
})
public class ArrayOfMateriasNoAprobadas {

    @XmlElement(name = "materias_no_aprobadas", nillable = true)
    protected List<MateriasNoAprobadas> materiasNoAprobadas;

    /**
     * Gets the value of the materiasNoAprobadas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiasNoAprobadas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriasNoAprobadas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriasNoAprobadas }
     * 
     * 
     */
    public List<MateriasNoAprobadas> getMateriasNoAprobadas() {
        if (materiasNoAprobadas == null) {
            materiasNoAprobadas = new ArrayList<MateriasNoAprobadas>();
        }
        return this.materiasNoAprobadas;
    }

}
