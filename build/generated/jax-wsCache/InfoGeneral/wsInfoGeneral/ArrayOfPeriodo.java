
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPeriodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Periodo" type="{http://academico.espoch.edu.ec/}Periodo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPeriodo", propOrder = {
    "periodo"
})
public class ArrayOfPeriodo {

    @XmlElement(name = "Periodo", nillable = true)
    protected List<Periodo> periodo;

    /**
     * Gets the value of the periodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Periodo }
     * 
     * 
     */
    public List<Periodo> getPeriodo() {
        if (periodo == null) {
            periodo = new ArrayList<Periodo>();
        }
        return this.periodo;
    }

}
