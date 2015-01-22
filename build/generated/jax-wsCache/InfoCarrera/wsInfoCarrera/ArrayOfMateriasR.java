
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfMateriasR complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMateriasR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MateriasR" type="{http://academico.espoch.edu.ec/}MateriasR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMateriasR", propOrder = {
    "materiasR"
})
public class ArrayOfMateriasR {

    @XmlElement(name = "MateriasR", nillable = true)
    protected List<MateriasR> materiasR;

    /**
     * Gets the value of the materiasR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materiasR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMateriasR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MateriasR }
     * 
     * 
     */
    public List<MateriasR> getMateriasR() {
        if (materiasR == null) {
            materiasR = new ArrayList<MateriasR>();
        }
        return this.materiasR;
    }

}
