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
public class MateriaCampoDetallado {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private Integer idMateria;
    private Integer idCampoDetallado;
    private Materia materia;
    private CampoDetallado campoDetallado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public MateriaCampoDetallado() {
        this.materia = new Materia();
        this.campoDetallado = new CampoDetallado();
    }
    
    public MateriaCampoDetallado(Integer id, Integer idMateria, Integer idCampoDetallado) {
        this.id = id;
        this.idMateria = idMateria;
        this.idCampoDetallado = idCampoDetallado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getIdMateria() {
        return idMateria;
    }
    
    public void setIdMateria(Integer idMateria) {
        this.idMateria = idMateria;
    }
    
    public Integer getIdCampoDetallado() {
        return idCampoDetallado;
    }
    
    public void setIdCampoDetallado(Integer idCampoDetallado) {
        this.idCampoDetallado = idCampoDetallado;
    }
    
    public Materia getMateria() {
        return materia;
    }
    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    public CampoDetallado getCampoDetallado() {
        return campoDetallado;
    }
    
    public void setCampoDetallado(CampoDetallado campoDetallado) {
        this.campoDetallado = campoDetallado;
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
        final MateriaCampoDetallado other = (MateriaCampoDetallado) obj;
        if (!Objects.equals(this.idMateria, other.idMateria)) {
            return false;
        }
        if (!Objects.equals(this.idCampoDetallado, other.idCampoDetallado)) {
            return false;
        }
        return true;
    }
    //</editor-fold>        
}
