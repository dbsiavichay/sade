/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.entidades;

import informacion.entidades.Proceso;
import java.util.ArrayList;
import java.util.List;
import seguridad.entidades.Usuario;

/**
 *
 * @author Denis
 */
public class Reporte implements Comparable<Reporte> {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private Integer idProceso;
    private Integer idDocente;
    private String url;    
    private Proceso proceso;
    private Usuario docente;
    private List<Detalle> detalles;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Reporte() {
        this.proceso = new Proceso();
        this.docente = new Usuario();
        this.detalles = new ArrayList<Detalle>();
    }
    
    public Reporte(Integer id, Integer idProceso, Integer idDocente, String url) {
        this.id = id;
        this.idProceso = idProceso;
        this.idDocente = idDocente;
        this.url = url;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getIdProceso() {
        return idProceso;
    }
    
    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }
    
    public Integer getIdDocente() {
        return idDocente;
    }
    
    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Proceso getProceso() {
        return proceso;
    }
    
    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }
    
    public Usuario getDocente() {
        return docente;
    }
    
    public void setDocente(Usuario docente) {
        this.docente = docente;
    }
    
    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }
    //</editor-fold>            

    //<editor-fold defaultstate="collapsed" desc="Sobreescritos">
    @Override
    public int compareTo(Reporte o) {
        if(o.getDetalles().size()!=1 || this.detalles.size()!=1){
            return 0;
        }
        return o.getDetalles().get(0).getValor().compareTo(this.getDetalles().get(0).getValor());
    }
    //</editor-fold>
}
