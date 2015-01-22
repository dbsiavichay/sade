
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMateriasCre complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMateriasCre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MateriasCre" type="{http://academico.espoch.edu.ec/}MateriasCre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMateriasCre", propOrder = {
    "materiasCre"
})
public class ArrayOfMateriasCre {

    @XmlElement(name = "MateriasCre", nillable = true)
    protected List<MateriasCre> materiasCre;

    /**
     * Gets the value of the materiasCre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiasCre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriasCre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriasCre }
     * 
     * 
     */
    public List<MateriasCre> getMateriasCre() {
        if (materiasCre == null) {
            materiasCre = new ArrayList<MateriasCre>();
        }
        return this.materiasCre;
    }

}
