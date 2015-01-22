/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Denis
 */
public class NodoMenu {   
    
    private String codigo;
    @Pattern(regexp="^[\\w\\sáíéóúñÁÉÍÓÚÑ]{4,64}$", message="La Descripcion solo debe contener caracteres y minimo 4 caracteres.")
    private String descripcion;
    private String url;
    private List<NodoMenu> hijos;

    public NodoMenu() {
        this.codigo = "";
        this.descripcion = "";
        this.url="#";
        this.hijos = new ArrayList<NodoMenu>();
    }

    public NodoMenu(String codigo, String descripcion, String url, List<NodoMenu> hijos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.url = url;
        this.hijos = hijos;
    }   

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
                
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<NodoMenu> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoMenu> hijos) {
        this.hijos = hijos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }                
}
