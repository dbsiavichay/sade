
package wsInfoCarrera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosInscritosInstSexo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosInscritosInstSexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosInscritosInstSexo" type="{http://academico.espoch.edu.ec/}DatosInscritosInstSexo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosInscritosInstSexo", propOrder = {
    "datosInscritosInstSexo"
})
public class ArrayOfDatosInscritosInstSexo {

    @XmlElement(name = "DatosInscritosInstSexo", nillable = true)
    protected List<DatosInscritosInstSexo> datosInscritosInstSexo;

    /**
     * Gets the value of the datosInscritosInstSexo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosInscritosInstSexo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosInscritosInstSexo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosInscritosInstSexo }
     * 
     * 
     */
    public List<DatosInscritosInstSexo> getDatosInscritosInstSexo() {
        if (datosInscritosInstSexo == null) {
            datosInscritosInstSexo = new ArrayList<DatosInscritosInstSexo>();
        }
        return this.datosInscritosInstSexo;
    }

}
