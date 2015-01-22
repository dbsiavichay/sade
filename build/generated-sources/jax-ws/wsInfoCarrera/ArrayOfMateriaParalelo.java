
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMateriaParalelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMateriaParalelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MateriaParalelo" type="{http://academico.espoch.edu.ec/}MateriaParalelo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMateriaParalelo", propOrder = {
    "materiaParalelo"
})
public class ArrayOfMateriaParalelo {

    @XmlElement(name = "MateriaParalelo", nillable = true)
    protected List<MateriaParalelo> materiaParalelo;

    /**
     * Gets the value of the materiaParalelo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiaParalelo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriaParalelo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriaParalelo }
     * 
     * 
     */
    public List<MateriaParalelo> getMateriaParalelo() {
        if (materiaParalelo == null) {
            materiaParalelo = new ArrayList<MateriaParalelo>();
        }
        return this.materiaParalelo;
    }

}
