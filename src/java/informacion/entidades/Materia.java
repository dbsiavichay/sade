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
public class Materia {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigoCarrera;
    private String nombreCarrera;
    private String codigoMateria;
    private String nombreMateria;
    private List<CampoDetallado> camposDetallados;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Materia() {
        this.camposDetallados = new ArrayList<CampoDetallado>();
    }
    
    public Materia(Integer id, String codigoCarrera, String nombreCarrera, String codigoMateria, String nombreMateria) {
        this.id = id;
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCodigoCarrera() {
        return codigoCarrera;
    }
    
    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }
    
    public String getNombreCarrera() {
        return nombreCarrera;
    }
    
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    public String getCodigoMateria() {
        return codigoMateria;
    }
    
    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }
    
    public String getNombreMateria() {
        return nombreMateria;
    }
    
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
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
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.codigoMateria, other.codigoMateria)) {
            return false;
        }
        if (!Objects.equals(this.nombreMateria, other.nombreMateria)) {
            return false;
        }
        return true;
    }
    //</editor-fold>
                
}
