
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfActasNotasOralesGrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfActasNotasOralesGrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActasNotasOralesGrado" type="{http://academico.espoch.edu.ec/}ActasNotasOralesGrado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfActasNotasOralesGrado", propOrder = {
    "actasNotasOralesGrado"
})
public class ArrayOfActasNotasOralesGrado {

    @XmlElement(name = "ActasNotasOralesGrado", nillable = true)
    protected List<ActasNotasOralesGrado> actasNotasOralesGrado;

    /**
     * Gets the value of the actasNotasOralesGrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actasNotasOralesGrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActasNotasOralesGrado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActasNotasOralesGrado }
     * 
     * 
     */
    public List<ActasNotasOralesGrado> getActasNotasOralesGrado() {
        if (actasNotasOralesGrado == null) {
            actasNotasOralesGrado = new ArrayList<ActasNotasOralesGrado>();
        }
        return this.actasNotasOralesGrado;
    }

}
