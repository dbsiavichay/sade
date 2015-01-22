
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfConvalidacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfConvalidacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Convalidacion" type="{http://academico.espoch.edu.ec/}Convalidacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConvalidacion", propOrder = {
    "convalidacion"
})
public class ArrayOfConvalidacion {

    @XmlElement(name = "Convalidacion", nillable = true)
    protected List<Convalidacion> convalidacion;

    /**
     * Gets the value of the convalidacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convalidacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvalidacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Convalidacion }
     * 
     * 
     */
    public List<Convalidacion> getConvalidacion() {
        if (convalidacion == null) {
            convalidacion = new ArrayList<Convalidacion>();
        }
        return this.convalidacion;
    }

}
