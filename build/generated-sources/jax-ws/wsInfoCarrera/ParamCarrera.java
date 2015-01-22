
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamCarrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamCarrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Residencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NivelSuperior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SisAprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SisEvaluacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamCarrera", propOrder = {
    "residencia",
    "modalidad",
    "nivelSuperior",
    "sisAprobacion",
    "sisEvaluacion"
})
public class ParamCarrera {

    @XmlElement(name = "Residencia")
    protected String residencia;
    @XmlElement(name = "Modalidad")
    protected String modalidad;
    @XmlElement(name = "NivelSuperior")
    protected String nivelSuperior;
    @XmlElement(name = "SisAprobacion")
    protected String sisAprobacion;
    @XmlElement(name = "SisEvaluacion")
    protected String sisEvaluacion;

    /**
     * Obtiene el valor de la propiedad residencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidencia() {
        return residencia;
    }

    /**
     * Define el valor de la propiedad residencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidencia(String value) {
        this.residencia = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelSuperior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelSuperior() {
        return nivelSuperior;
    }

    /**
     * Define el valor de la propiedad nivelSuperior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelSuperior(String value) {
        this.nivelSuperior = value;
    }

    /**
     * Obtiene el valor de la propiedad sisAprobacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSisAprobacion() {
        return sisAprobacion;
    }

    /**
     * Define el valor de la propiedad sisAprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSisAprobacion(String value) {
        this.sisAprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sisEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSisEvaluacion() {
        return sisEvaluacion;
    }

    /**
     * Define el valor de la propiedad sisEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSisEvaluacion(String value) {
        this.sisEvaluacion = value;
    }

}
