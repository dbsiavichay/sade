
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CarreraTitulos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CarreraTitulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarreraTitulos", propOrder = {
    "codTitulo",
    "titulo"
})
public class CarreraTitulos {

    @XmlElement(name = "CodTitulo")
    protected String codTitulo;
    @XmlElement(name = "Titulo")
    protected String titulo;

    /**
     * Obtiene el valor de la propiedad codTitulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTitulo() {
        return codTitulo;
    }

    /**
     * Define el valor de la propiedad codTitulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTitulo(String value) {
        this.codTitulo = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
