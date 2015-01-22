/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad.entidades;

/**
 *
 * @author Denis
 */
public class Funcion {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Integer id;
    private Boolean agregar;
    private Boolean editar;
    private Boolean eliminar;
    private Integer orden;
    private Boolean activo;
    private Integer idGrupo;
    private Integer idAccion;
    private Integer idRol;        
    private Grupo grupo;
    private Accion accion;
    private Rol rol;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTORES">
    public Funcion() {
        this.grupo = new Grupo();
        this.accion = new Accion();
        this.rol = new Rol();
    }

    public Funcion(Integer id, Boolean agregar, Boolean editar, Boolean eliminar, Integer orden, Boolean activo, Integer idGrupo, Integer idAccion, Integer idRol) {
        this.id = id;
        this.agregar = agregar;
        this.editar = editar;
        this.eliminar = eliminar;
        this.orden = orden;
        this.activo = activo;
        this.idGrupo = idGrupo;
        this.idAccion = idAccion;
        this.idRol = idRol;
    }        
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">                    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAgregar() {
        return agregar;
    }

    public void setAgregar(Boolean agregar) {
        this.agregar = agregar;
    }

    public Boolean getEditar() {
        return editar;
    }

    public void setEditar(Boolean editar) {
        this.editar = editar;
    }

    public Boolean getEliminar() {
        return eliminar;
    }

    public void setEliminar(Boolean eliminar) {
        this.eliminar = eliminar;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(Integer idAccion) {
        this.idAccion = idAccion;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    //</editor-fold>
        
}
