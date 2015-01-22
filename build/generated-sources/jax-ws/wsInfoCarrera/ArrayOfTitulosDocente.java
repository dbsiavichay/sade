
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfTitulosDocente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTitulosDocente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TitulosDocente" type="{http://academico.espoch.edu.ec/}TitulosDocente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTitulosDocente", propOrder = {
    "titulosDocente"
})
public class ArrayOfTitulosDocente {

    @XmlElement(name = "TitulosDocente", nillable = true)
    protected List<TitulosDocente> titulosDocente;

    /**
     * Gets the value of the titulosDocente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulosDocente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulosDocente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitulosDocente }
     * 
     * 
     */
    public List<TitulosDocente> getTitulosDocente() {
        if (titulosDocente == null) {
            titulosDocente = new ArrayList<TitulosDocente>();
        }
        return this.titulosDocente;
    }

}
