
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfProvincia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProvincia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Provincia" type="{http://academico.espoch.edu.ec/}Provincia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProvincia", propOrder = {
    "provincia"
})
public class ArrayOfProvincia {

    @XmlElement(name = "Provincia", nillable = true)
    protected List<Provincia> provincia;

    /**
     * Gets the value of the provincia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provincia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvincia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Provincia }
     * 
     * 
     */
    public List<Provincia> getProvincia() {
        if (provincia == null) {
            provincia = new ArrayList<Provincia>();
        }
        return this.provincia;
    }

}
