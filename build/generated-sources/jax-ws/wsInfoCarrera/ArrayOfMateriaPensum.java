
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMateria_Pensum complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMateria_Pensum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Materia_Pensum" type="{http://academico.espoch.edu.ec/}Materia_Pensum" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMateria_Pensum", propOrder = {
    "materiaPensum"
})
public class ArrayOfMateriaPensum {

    @XmlElement(name = "Materia_Pensum", nillable = true)
    protected List<MateriaPensum> materiaPensum;

    /**
     * Gets the value of the materiaPensum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiaPensum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriaPensum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriaPensum }
     * 
     * 
     */
    public List<MateriaPensum> getMateriaPensum() {
        if (materiaPensum == null) {
            materiaPensum = new ArrayList<MateriaPensum>();
        }
        return this.materiaPensum;
    }

}
