
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDictado_Materia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDictado_Materia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dictado_Materia" type="{http://academico.espoch.edu.ec/}Dictado_Materia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDictado_Materia", propOrder = {
    "dictadoMateria"
})
public class ArrayOfDictadoMateria {

    @XmlElement(name = "Dictado_Materia", nillable = true)
    protected List<DictadoMateria> dictadoMateria;

    /**
     * Gets the value of the dictadoMateria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictadoMateria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictadoMateria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictadoMateria }
     * 
     * 
     */
    public List<DictadoMateria> getDictadoMateria() {
        if (dictadoMateria == null) {
            dictadoMateria = new ArrayList<DictadoMateria>();
        }
        return this.dictadoMateria;
    }

}
