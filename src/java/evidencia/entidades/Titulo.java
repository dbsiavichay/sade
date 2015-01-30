/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.entidades;

import informacion.entidades.CampoDetallado;
import informacion.entidades.Categoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luis
 */
public class Titulo {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Integer id;
    private String nombre;
    private String registro;
    private String urlDocumento;
    private Integer idDocente;
    private Integer idCategoria;    
    private Categoria categoria;
    private List<CampoDetallado> camposDetallados;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">    
    public Titulo() {
        this.categoria = new Categoria();
        this.camposDetallados = new ArrayList<CampoDetallado>();
    }

    public Titulo(Integer id, String nombre, String registro, String urlDocumento, Integer idDocente, Integer idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.registro = registro;
        this.urlDocumento = urlDocumento;
        this.idDocente = idDocente;
        this.idCategoria = idCategoria;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getUrlDocumento() {
        return urlDocumento;
    }

    public void setUrlDocumento(String urlDocumento) {
        this.urlDocumento = urlDocumento;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        final Titulo other = (Titulo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    //</editor-fold>
    
    
}
