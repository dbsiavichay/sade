
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMateria_Requisito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMateria_Requisito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Materia_Requisito" type="{http://academico.espoch.edu.ec/}Materia_Requisito" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMateria_Requisito", propOrder = {
    "materiaRequisito"
})
public class ArrayOfMateriaRequisito {

    @XmlElement(name = "Materia_Requisito", nillable = true)
    protected List<MateriaRequisito> materiaRequisito;

    /**
     * Gets the value of the materiaRequisito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiaRequisito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriaRequisito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriaRequisito }
     * 
     * 
     */
    public List<MateriaRequisito> getMateriaRequisito() {
        if (materiaRequisito == null) {
            materiaRequisito = new ArrayList<MateriaRequisito>();
        }
        return this.materiaRequisito;
    }

}
