/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

import javax.validation.constraints.Pattern;

/**
 *
 * @author Denis
 */
public class Accion {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Integer id;
    @Pattern(regexp="^[\\w\\sáíéóúñÁÉÍÓÚÑ]{1,32}$", message="El Nombre solo debe contener caracteres.")
    private String nombre;
    private String url;
    private Boolean activo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Accion() {
    }

    public Accion(Integer id, String nombre, String url, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.url = url;
        this.activo = activo;
    }        
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">              
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    //</editor-fold>   
}
