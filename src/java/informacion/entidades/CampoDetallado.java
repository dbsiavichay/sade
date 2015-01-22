/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.entidades;

import java.util.Objects;

/**
 *
 * @author Denis
 */
public class CampoDetallado {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigo;
    private String nombre;
    private Integer idCampoEspecifico;
    private CampoEspecifico campoEspecifico;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public CampoDetallado() {
        this.campoEspecifico = new CampoEspecifico();
    }
    
    public CampoDetallado(Integer id, String codigo, String nombre, Integer idCampoEspecifico) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.idCampoEspecifico = idCampoEspecifico;
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
    
    public Integer getIdCampoEspecifico() {
        return idCampoEspecifico;
    }
    
    public void setIdCampoEspecifico(Integer idCampoEspecifico) {
        this.idCampoEspecifico = idCampoEspecifico;
    }

    public CampoEspecifico getCampoEspecifico() {
        return campoEspecifico;
    }

    public void setCampoEspecifico(CampoEspecifico campoEspecifico) {
        this.campoEspecifico = campoEspecifico;
    }    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Sobreescritos">
    @Override
    public int hashCode() {
        int hash = 5;
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
        final CampoDetallado other = (CampoDetallado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //</editor-fold>        
}
