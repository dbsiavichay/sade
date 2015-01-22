/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denis
 */
public class CampoAmplio {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private String codigo;
    private String nombre;
    private List<CampoEspecifico> camposEspecificos;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public CampoAmplio() {
        this.camposEspecificos = new ArrayList<>();
    }
    
    public CampoAmplio(Integer id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
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
    
    public List<CampoEspecifico> getCamposEspecificos() {
        return camposEspecificos;
    }

    public void setCamposEspecificos(List<CampoEspecifico> camposEspecificos) {
        this.camposEspecificos = camposEspecificos;
    }
    //</editor-fold>

    
    
    
}
