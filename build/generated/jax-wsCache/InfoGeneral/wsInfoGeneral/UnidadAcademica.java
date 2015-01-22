
package wsInfoGeneral;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnidadAcademica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnidadAcademica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEscuela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadAcademica", propOrder = {
    "codigo",
    "nombre",
    "codEscuela",
    "codEstado"
})
public class UnidadAcademica {

    @XmlElement(name = "Codigo")
    protected String codigo;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "CodEscuela")
    protected String codEscuela;
    @XmlElement(name = "CodEstado")
    protected String codEstado;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codEscuela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEscuela() {
        return codEscuela;
    }

    /**
     * Define el valor de la propiedad codEscuela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEscuela(String value) {
        this.codEscuela = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstado(String value) {
        this.codEstado = value;
    }

}
