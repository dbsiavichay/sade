
package wsInfoSeguridad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRolCarrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRolCarrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RolCarrera" type="{http://academico.espoch.edu.ec/}RolCarrera" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRolCarrera", propOrder = {
    "rolCarrera"
})
public class ArrayOfRolCarrera {

    @XmlElement(name = "RolCarrera", nillable = true)
    protected List<RolCarrera> rolCarrera;

    /**
     * Gets the value of the rolCarrera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolCarrera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolCarrera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolCarrera }
     * 
     * 
     */
    public List<RolCarrera> getRolCarrera() {
        if (rolCarrera == null) {
            rolCarrera = new ArrayList<RolCarrera>();
        }
        return this.rolCarrera;
    }

}
