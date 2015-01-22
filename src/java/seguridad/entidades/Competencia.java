/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

/**
 *
 * @author Luis
 */
public class Competencia {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private Integer id;
    private Boolean activo;
    private Integer idRol;
    private Integer idUsuario;
    private Rol rol;
    private Usuario usuario;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public Competencia() {
        this.rol = new Rol();
        this.usuario = new Usuario();
    }

    public Competencia(Integer id, Boolean activo, Integer idRol, Integer idUsuario) {
        this.id = id;
        this.activo = activo;
        this.idRol = idRol;
        this.idUsuario = idUsuario;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Set y Get">                        
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //</editor-fold>
}
