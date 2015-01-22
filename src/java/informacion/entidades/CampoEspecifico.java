/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Denis
 */
public class CampoEspecifico {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigo;
    private String nombre;
    private Integer idCampoAmplio;
    private List<CampoDetallado> camposDetallados;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public CampoEspecifico() {
        this.camposDetallados = new ArrayList<>();
    }
    
    public CampoEspecifico(Integer id, String codigo, String nombre, Integer idCampoAmplio) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.idCampoAmplio = idCampoAmplio;
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
    
    public Integer getIdCampoAmplio() {
        return idCampoAmplio;
    }
    
    public void setIdCampoAmplio(Integer idCampoAmplio) {
        this.idCampoAmplio = idCampoAmplio;
    }
    
    public List<CampoDetallado> getCamposDetallados() {
        return camposDetallados;
    }

    public void setCamposDetallados(List<CampoDetallado> camposDetallados) {
        this.camposDetallados = camposDetallados;
    }
    //</editor-fold>        

    //<editor-fold defaultstate="collapsed" desc="Sobreescritos">
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
        final CampoEspecifico other = (CampoEspecifico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //</editor-fold>    
}
