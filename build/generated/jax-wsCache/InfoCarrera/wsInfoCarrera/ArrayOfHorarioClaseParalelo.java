
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfHorarioClaseParalelo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHorarioClaseParalelo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HorarioClaseParalelo" type="{http://academico.espoch.edu.ec/}HorarioClaseParalelo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHorarioClaseParalelo", propOrder = {
    "horarioClaseParalelo"
})
public class ArrayOfHorarioClaseParalelo {

    @XmlElement(name = "HorarioClaseParalelo", nillable = true)
    protected List<HorarioClaseParalelo> horarioClaseParalelo;

    /**
     * Gets the value of the horarioClaseParalelo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horarioClaseParalelo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorarioClaseParalelo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorarioClaseParalelo }
     * 
     * 
     */
    public List<HorarioClaseParalelo> getHorarioClaseParalelo() {
        if (horarioClaseParalelo == null) {
            horarioClaseParalelo = new ArrayList<HorarioClaseParalelo>();
        }
        return this.horarioClaseParalelo;
    }

}
