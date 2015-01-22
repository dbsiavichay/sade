/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.entidades;

import java.util.Objects;


/**
 *
 * @author Luis
 */
public class CampoDetalladoTitulo {
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
	private Integer id;
	private Integer idCampoDetallado;
	private Integer idTitulo;
    //</editor-fold> 
        
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public CampoDetalladoTitulo() {
    }

    public CampoDetalladoTitulo(Integer id, Integer idCampoDetallado, Integer idTitulo) {
        this.id = id;
        this.idCampoDetallado = idCampoDetallado;
        this.idTitulo = idTitulo;
    }       
     //</editor-fold>    
        
    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCampoDetallado() {
        return idCampoDetallado;
    }

    public void setIdCampoDetallado(Integer idCampoDetallado) {
        this.idCampoDetallado = idCampoDetallado;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
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
        final CampoDetalladoTitulo other = (CampoDetalladoTitulo) obj;
        if (!Objects.equals(this.idCampoDetallado, other.idCampoDetallado)) {
            return false;
        }
        if (!Objects.equals(this.idTitulo, other.idTitulo)) {
            return false;
        }
        return true;
    }
    //</editor-fold>        

}
