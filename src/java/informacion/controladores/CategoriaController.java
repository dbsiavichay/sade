/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import evidencia.controladores.TituloDocenteController;
import informacion.entidades.Categoria;
import informacion.servicios.CategoriaModel;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author dbsiavichay
 */
@ManagedBean
@ViewScoped
public class CategoriaController {
    
    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">
    private Categoria categoriaActual;
    private CategoriaModel categoriaModel;
    private List<Categoria> categorias;
    private List<Categoria> categoriasFiltro;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    
    public CategoriaController() {
        this.categoriaActual = new Categoria();
        this.categoriaModel = new CategoriaModel();        
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;        

        try {            
            this.categorias = this.categoriaModel.encontrarTodos();            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Categoria.class, e, TipoOrigenError.LISTADO);
        }       
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">    
                   
    public Categoria getCategoriaActual() {
        return categoriaActual;
    }

    public void setCategoriaActual(Categoria categoriaActual) {
        this.categoriaActual = categoriaActual;
    }

    public CategoriaModel getCategoriaModel() {
        return categoriaModel;
    }

    public void setCategoriaModel(CategoriaModel categoriaModel) {
        this.categoriaModel = categoriaModel;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public List<Categoria> getCategoriasFiltro() {
        return categoriasFiltro;
    }

    public void setCategoriasFiltro(List<Categoria> categoriasFiltro) {
        this.categoriasFiltro = categoriasFiltro;
    }

    public Boolean getEditar() {
        return editar;
    }

    public void setEditar(Boolean editar) {
        this.editar = editar;
    }

    public Boolean getIngresaDatos() {
        return ingresaDatos;
    }

    public void setIngresaDatos(Boolean ingresaDatos) {
        this.ingresaDatos = ingresaDatos;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.categoriaActual = new Categoria();
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;
    }

    public void preparaVer() {
        this.nuevo = false;
        this.editar = false;
        this.ingresaDatos = false;
    }
 
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarCategoria() {
        Categoria _categoria = null;
        try {
            _categoria = this.categoriaModel.crear(this.categoriaActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Categoria.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_categoria != null) {
            try {
                this.categorias = this.categoriaModel.encontrarTodos();
                this.categoriasFiltro = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Categoria.class, e, TipoOrigenError.LISTADO);
            }
            this.categoriaActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Categoria.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
            
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }
    
    public void editarCategoria() {
        Categoria _categoria = null;
        try {
            _categoria = this.categoriaModel.editar(this.categoriaActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Categoria.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_categoria != null) {
            try {
                this.categorias= this.categoriaModel.encontrarTodos();
                this.categoriasFiltro = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Categoria.class, e, TipoOrigenError.LISTADO);
            }
            this.categoriaActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Categoria.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
            
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }
    
    public void eliminarCategoria() {
        Boolean exito = false;
        try {
            exito = this.categoriaModel.eliminar(this.categoriaActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Categoria.class, ex, TipoOrigenError.ENTIDAD);
            return;
        }
        if (exito) {
            try {
                this.categorias = this.categoriaModel.encontrarTodos();
                this.categoriasFiltro = null;
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Categoria.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.categoriaActual= null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Categoria.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Categoria.class, TipoOrigenError.ENTIDAD);
        }
    }                    
    //</editor-fold>  
}
