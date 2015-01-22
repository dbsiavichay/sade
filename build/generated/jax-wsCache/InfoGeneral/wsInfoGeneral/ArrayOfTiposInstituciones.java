
package wsInfoGeneral;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfTipos_Instituciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipos_Instituciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipos_Instituciones" type="{http://academico.espoch.edu.ec/}Tipos_Instituciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipos_Instituciones", propOrder = {
    "tiposInstituciones"
})
public class ArrayOfTiposInstituciones {

    @XmlElement(name = "Tipos_Instituciones", nillable = true)
    protected List<TiposInstituciones> tiposInstituciones;

    /**
     * Gets the value of the tiposInstituciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposInstituciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposInstituciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TiposInstituciones }
     * 
     * 
     */
    public List<TiposInstituciones> getTiposInstituciones() {
        if (tiposInstituciones == null) {
            tiposInstituciones = new ArrayList<TiposInstituciones>();
        }
        return this.tiposInstituciones;
    }

}
