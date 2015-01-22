/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.entidades;

import evidencia.entidades.Titulo;
import java.util.List;

/**
 *
 * @author dbsiavichay
 */
public class Categoria {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigo;
    private String nombre;
    private Double ponderacion;
    private Boolean estudioFormal;
    private Integer orden;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Categoria() {
    }

    public Categoria(Integer id, String codigo, String nombre, Double ponderacion, Boolean estudioFormal, Integer orden) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.ponderacion = ponderacion;
        this.estudioFormal = estudioFormal;
        this.orden = orden;
    }            
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">                
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPonderacion() {
        return ponderacion;
    }

    public void setPonderacion(Double ponderacion) {
        this.ponderacion = ponderacion;
    }

    public Boolean getEstudioFormal() {
        return estudioFormal;
    }

    public void setEstudioFormal(Boolean estudioFormal) {
        this.estudioFormal = estudioFormal;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
    //</editor-fold>            
}
