/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.entidades;

import java.util.Date;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Denis
 */
public class Proceso {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    @Pattern(regexp="^[\\w\\sáíéóúñÁÉÍÓÚÑ]{3,64}$", message="El Codigo solo debe contener caracteres y minimo 3 caracteres.")
    private String codigo;
    @Pattern(regexp="^[\\w\\sáíéóúñÁÉÍÓÚÑ]{4,64}$", message="La descripcion solo debe contener caracteres y minimo 4 caracteres.")
    private String descripcion;
    private Date inicia;
    private Date finaliza;
    private Boolean activo;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Contructores">
    public Proceso() {
    }
    
    public Proceso(Integer id, String codigo, String descripcion, Date inicia, Date finaliza, Boolean activo) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.inicia = inicia;
        this.finaliza = finaliza;
        this.activo = activo;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFinaliza() {
        return finaliza;
    }

    public void setFinaliza(Date finaliza) {
        this.finaliza = finaliza;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInicia() {
        return inicia;
    }

    public void setInicia(Date inicia) {
        this.inicia = inicia;
    }
 
    //</editor-fold>
       
}
