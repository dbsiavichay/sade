
package wsInfoSeguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RolCarrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RolCarrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NombreRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RolCarrera", propOrder = {
    "codigoCarrera",
    "nombreRol"
})
public class RolCarrera {

    @XmlElement(name = "CodigoCarrera")
    protected String codigoCarrera;
    @XmlElement(name = "NombreRol")
    protected String nombreRol;

    /**
     * Obtiene el valor de la propiedad codigoCarrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    /**
     * Define el valor de la propiedad codigoCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCarrera(String value) {
        this.codigoCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreRol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * Define el valor de la propiedad nombreRol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRol(String value) {
        this.nombreRol = value;
    }

}
