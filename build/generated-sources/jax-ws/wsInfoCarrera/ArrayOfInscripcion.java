
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfInscripcion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInscripcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inscripcion" type="{http://academico.espoch.edu.ec/}Inscripcion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInscripcion", propOrder = {
    "inscripcion"
})
public class ArrayOfInscripcion {

    @XmlElement(name = "Inscripcion", nillable = true)
    protected List<Inscripcion> inscripcion;

    /**
     * Gets the value of the inscripcion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inscripcion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInscripcion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inscripcion }
     * 
     * 
     */
    public List<Inscripcion> getInscripcion() {
        if (inscripcion == null) {
            inscripcion = new ArrayList<Inscripcion>();
        }
        return this.inscripcion;
    }

}
