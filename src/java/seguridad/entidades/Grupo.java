/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

/**
 *
 * @author Denis
 */
public class Grupo {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Integer id;        
    private String nombre;
    private Integer orden;
    private Integer padre;    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Grupo() {
    }

    public Grupo(Integer id, String nombre, Integer orden, Integer padre) {
        this.id = id;
        this.nombre = nombre;
        this.orden = orden;
        this.padre = padre;
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

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getPadre() {
        return padre;
    }

    public void setPadre(Integer padre) {
        this.padre = padre;
    }                    
    //</editor-fold>                          
}
