
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfEscuela complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEscuela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Escuela" type="{http://academico.espoch.edu.ec/}Escuela" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEscuela", propOrder = {
    "escuela"
})
public class ArrayOfEscuela {

    @XmlElement(name = "Escuela", nillable = true)
    protected List<Escuela> escuela;

    /**
     * Gets the value of the escuela property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the escuela property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEscuela().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Escuela }
     * 
     * 
     */
    public List<Escuela> getEscuela() {
        if (escuela == null) {
            escuela = new ArrayList<Escuela>();
        }
        return this.escuela;
    }

}
