
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfPromocionesEst complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPromocionesEst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PromocionesEst" type="{http://academico.espoch.edu.ec/}PromocionesEst" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPromocionesEst", propOrder = {
    "promocionesEst"
})
public class ArrayOfPromocionesEst {

    @XmlElement(name = "PromocionesEst", nillable = true)
    protected List<PromocionesEst> promocionesEst;

    /**
     * Gets the value of the promocionesEst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promocionesEst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromocionesEst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromocionesEst }
     * 
     * 
     */
    public List<PromocionesEst> getPromocionesEst() {
        if (promocionesEst == null) {
            promocionesEst = new ArrayList<PromocionesEst>();
        }
        return this.promocionesEst;
    }

}
