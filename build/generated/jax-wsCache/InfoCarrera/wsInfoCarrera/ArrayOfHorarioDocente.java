
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfHorarioDocente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHorarioDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HorarioDocente" type="{http://academico.espoch.edu.ec/}HorarioDocente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHorarioDocente", propOrder = {
    "horarioDocente"
})
public class ArrayOfHorarioDocente {

    @XmlElement(name = "HorarioDocente", nillable = true)
    protected List<HorarioDocente> horarioDocente;

    /**
     * Gets the value of the horarioDocente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarioDocente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarioDocente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioDocente }
     * 
     * 
     */
    public List<HorarioDocente> getHorarioDocente() {
        if (horarioDocente == null) {
            horarioDocente = new ArrayList<HorarioDocente>();
        }
        return this.horarioDocente;
    }

}
