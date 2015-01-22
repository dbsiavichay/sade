/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.entidades;

import informacion.entidades.CampoEspecifico;
import java.util.Objects;

/**
 *
 * @author dbsiavichay
 */
public class Regla implements Comparable<Regla> {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Integer id;
    private Integer idCampoEspecificoTitulo;
    private Integer idCampoEspecificoMateria;
    private Double certeza;
    private CampoEspecifico campoTitulo;
    private CampoEspecifico campoMateria;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONTRUCTORES">
    public Regla() {
        this.campoTitulo = new CampoEspecifico();
        this.campoMateria = new CampoEspecifico();
        
    }

    public Regla(Integer id, Integer idCampoEspecificoTitulo, Integer idCampoEspecificoMateria, Double certeza) {
        this.id = id;
        this.idCampoEspecificoTitulo = idCampoEspecificoTitulo;
        this.idCampoEspecificoMateria = idCampoEspecificoMateria;
        this.certeza = certeza;
    }            
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">                        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCampoEspecificoTitulo() {
        return idCampoEspecificoTitulo;
    }

    public void setIdCampoEspecificoTitulo(Integer idCampoEspecificoTitulo) {
        this.idCampoEspecificoTitulo = idCampoEspecificoTitulo;
    }

    public Integer getIdCampoEspecificoMateria() {
        return idCampoEspecificoMateria;
    }

    public void setIdCampoEspecificoMateria(Integer idCampoEspecificoMateria) {
        this.idCampoEspecificoMateria = idCampoEspecificoMateria;
    }

    public Double getCerteza() {
        return certeza;
    }

    public void setCerteza(Double certeza) {
        this.certeza = certeza;
    }

    public CampoEspecifico getCampoTitulo() {
        return campoTitulo;
    }

    public void setCampoTitulo(CampoEspecifico campoTitulo) {
        this.campoTitulo = campoTitulo;
    }

    public CampoEspecifico getCampoMateria() {
        return campoMateria;
    }

    public void setCampoMateria(CampoEspecifico campoMateria) {
        this.campoMateria = campoMateria;
    }    
    //</editor-fold>           

    //<editor-fold defaultstate="collapsed" desc="SOBREESCRITOS">
    @Override
    public int compareTo(Regla o) {
        return o.getCerteza().compareTo(this.certeza);
    }
    
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
        final Regla other = (Regla) obj;
        if (!Objects.equals(this.idCampoEspecificoTitulo, other.idCampoEspecificoTitulo)) {
            return false;
        }
        if (!Objects.equals(this.idCampoEspecificoMateria, other.idCampoEspecificoMateria)) {
            return false;
        }
        return true;
    }
    //</editor-fold>

    
}
