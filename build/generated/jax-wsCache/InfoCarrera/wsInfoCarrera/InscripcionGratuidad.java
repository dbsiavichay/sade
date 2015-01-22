
package wsInfoCarrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InscripcionGratuidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InscripcionGratuidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strCedula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodCarrera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confirmada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Forma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="booGratuidad" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="boolPorcentajeP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InscripcionGratuidad", propOrder = {
    "strCedula",
    "strCodCarrera",
    "periodo",
    "confirmada",
    "fecha",
    "observacion",
    "forma",
    "booGratuidad",
    "boolPorcentajeP"
})
public class InscripcionGratuidad {

    protected String strCedula;
    protected String strCodCarrera;
    @XmlElement(name = "Periodo")
    protected String periodo;
    protected boolean confirmada;
    @XmlElement(name = "Fecha")
    protected String fecha;
    @XmlElement(name = "Observacion")
    protected String observacion;
    @XmlElement(name = "Forma")
    protected String forma;
    protected boolean booGratuidad;
    protected boolean boolPorcentajeP;

    /**
     * Obtiene el valor de la propiedad strCedula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCedula() {
        return strCedula;
    }

    /**
     * Define el valor de la propiedad strCedula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCedula(String value) {
        this.strCedula = value;
    }

    /**
     * Obtiene el valor de la propiedad strCodCarrera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodCarrera() {
        return strCodCarrera;
    }

    /**
     * Define el valor de la propiedad strCodCarrera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodCarrera(String value) {
        this.strCodCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad confirmada.
     * 
     */
    public boolean isConfirmada() {
        return confirmada;
    }

    /**
     * Define el valor de la propiedad confirmada.
     * 
     */
    public void setConfirmada(boolean value) {
        this.confirmada = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Obtiene el valor de la propiedad forma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForma() {
        return forma;
    }

    /**
     * Define el valor de la propiedad forma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForma(String value) {
        this.forma = value;
    }

    /**
     * Obtiene el valor de la propiedad booGratuidad.
     * 
     */
    public boolean isBooGratuidad() {
        return booGratuidad;
    }

    /**
     * Define el valor de la propiedad booGratuidad.
     * 
     */
    public void setBooGratuidad(boolean value) {
        this.booGratuidad = value;
    }

    /**
     * Obtiene el valor de la propiedad boolPorcentajeP.
     * 
     */
    public boolean isBoolPorcentajeP() {
        return boolPorcentajeP;
    }

    /**
     * Define el valor de la propiedad boolPorcentajeP.
     * 
     */
    public void setBoolPorcentajeP(boolean value) {
        this.boolPorcentajeP = value;
    }

}
