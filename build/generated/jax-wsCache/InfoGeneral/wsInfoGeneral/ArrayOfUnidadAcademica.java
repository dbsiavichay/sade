
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfUnidadAcademica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnidadAcademica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnidadAcademica" type="{http://academico.espoch.edu.ec/}UnidadAcademica" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnidadAcademica", propOrder = {
    "unidadAcademica"
})
public class ArrayOfUnidadAcademica {

    @XmlElement(name = "UnidadAcademica", nillable = true)
    protected List<UnidadAcademica> unidadAcademica;

    /**
     * Gets the value of the unidadAcademica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadAcademica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadAcademica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadAcademica }
     * 
     * 
     */
    public List<UnidadAcademica> getUnidadAcademica() {
        if (unidadAcademica == null) {
            unidadAcademica = new ArrayList<UnidadAcademica>();
        }
        return this.unidadAcademica;
    }

}
