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
public class MateriaProceso {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;    
    private Integer idMateria;
    private Integer idProceso;  
    private Materia materia;
    private Proceso proceso;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public MateriaProceso() {
        this.materia = new Materia();
        this.proceso = new Proceso();
    }

    public MateriaProceso(Integer id, Integer idMateria, Integer idProceso) {
        this.id = id;
        this.idMateria = idMateria;
        this.idProceso = idProceso;
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

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }            
    //</editor-fold>       

    //<editor-fold defaultstate="collapsed" desc="Sobreescritos">
    @Override
    public int hashCode() {
        int hash = 3;
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
        final MateriaProceso other = (MateriaProceso) obj;
        if (!Objects.equals(this.idMateria, other.idMateria)) {
            return false;
        }
        if (!Objects.equals(this.idProceso, other.idProceso)) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
