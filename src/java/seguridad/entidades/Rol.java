
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

import javax.validation.constraints.Pattern;

/**
 *
 * @author Luis
 */
public class Rol {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigo;
    @Pattern(regexp="^[\\w\\sáíéóúñÁÉÍÓÚÑ]{1,64}$", message="El Nombre solo debe contener caracteres")
    private String nombre;
    private Boolean activo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Rol() {
    }

    public Rol(Integer id, String codigo, String nombre, Boolean activo) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Set y Get">
    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="SOBREESCRITOS">
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rol other = (Rol) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.codigo == null) ? (other.codigo != null) : !this.codigo.equals(other.codigo)) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if (this.activo != other.activo && (this.activo == null || !this.activo.equals(other.activo))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    //</editor-fold>

    
    
    
}
