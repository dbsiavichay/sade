/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evidencia.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import evidencia.entidades.CampoDetalladoTitulo;
import evidencia.entidades.Titulo;
import evidencia.servicios.CampoDetalladoTituloModel;
import evidencia.servicios.TituloModel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class TituloController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">    
    private Titulo tituloActual;
    private TituloModel tituloModel;
    private List<Titulo> titulos;
    private List<Titulo> titulosFiltro;    
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;  
    private UploadedFile documento;
    private List<String> camposSeleccionados;
    private Integer docenteSeleccionado;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">      
    public TituloController() {
        this.tituloActual = new Titulo();
        this.tituloModel = new TituloModel();
        this.nuevo = false;
        this.ingresaDatos = false;
        this.editar = false;        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">  
    public Titulo getTituloActual() {
        return tituloActual;
    }

    public void setTituloActual(Titulo tituloActual) {
        this.tituloActual = tituloActual;
    }

    public TituloModel getTituloModel() {
        return tituloModel;
    }

    public void setTituloModel(TituloModel tituloModel) {
        this.tituloModel = tituloModel;
    }

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
    }

    public List<Titulo> getTitulosFiltro() {
        return titulosFiltro;
    }

    public void setTitulosFiltro(List<Titulo> titulosFiltro) {
        this.titulosFiltro = titulosFiltro;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
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

    public UploadedFile getDocumento() {
        return documento;
    }

    public void setDocumento(UploadedFile documento) {
        this.documento = documento;
    }

    public List<String> getCamposSeleccionados() {
        return camposSeleccionados;
    }

    public void setCamposSeleccionados(List<String> camposSeleccionados) {
        this.camposSeleccionados = camposSeleccionados;
    }    

    public Integer getDocenteSeleccionado() {
        return this.docenteSeleccionado;
    }

    public void setDocenteSeleccionado(Integer docenteSeleccionado) {
        this.docenteSeleccionado = docenteSeleccionado;
    }       
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaNuevo() {
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.tituloActual = new Titulo();
        this.tituloActual.setIdDocente(this.docenteSeleccionado);
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;
        this.documento = null;
        this.prepararCampos();
    }

    public void preparaVer() {
        this.nuevo = false;
        this.editar = false;
        this.ingresaDatos = false;
        this.documento = null;
        this.prepararCampos();
    }
    
    private void prepararCampos(){
        CampoDetalladoTituloModel campoDetalladoTituloModel = new CampoDetalladoTituloModel();
        try {
            List<CampoDetalladoTitulo> campos = campoDetalladoTituloModel.encontrarPorTitulo(this.tituloActual.getId());
            this.camposSeleccionados = new ArrayList<>();
            for (CampoDetalladoTitulo cdt : campos) {
               this.camposSeleccionados.add(cdt.getIdCampoDetallado().toString());
            }            
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al preparar los campos del título");
        }
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarTitulo() {        
        Titulo _titulo = null;
        try {                        
            if (this.documento != null) {
                this.guardarArchivo(this.tituloActual.getIdDocente());
                this.tituloActual.setUrlDocumento("/resources/pdf/" + this.tituloActual.getIdDocente() + "/" + documento.getFileName());
            }
            _titulo = this.tituloModel.crear(this.tituloActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_titulo != null) {
            CampoDetalladoTituloModel campoDetalladoTituloModel = new CampoDetalladoTituloModel();
            try {                
                for (String campo : this.camposSeleccionados) {
                    CampoDetalladoTitulo cdt = new CampoDetalladoTitulo();
                    cdt.setIdCampoDetallado(Integer.valueOf(campo));
                    cdt.setIdTitulo(_titulo.getId());
                    campoDetalladoTituloModel.crear(cdt);
                }
                
                this.titulos = this.tituloModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.LISTADO);
            }
            this.tituloActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.INSERCION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");

        } else {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarTitulo() {
        Titulo _titulo = null;
        try {
            if (this.documento != null) {
                this.guardarArchivo(this.tituloActual.getIdDocente());
                this.tituloActual.setUrlDocumento("/resources/pdf/" + this.tituloActual.getIdDocente() + "/" + documento.getFileName());
            }
            _titulo = this.tituloModel.editar(this.tituloActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_titulo != null) {
            CampoDetalladoTituloModel campoDetalladoTituloModel = new CampoDetalladoTituloModel();
            try {
                List<CampoDetalladoTitulo> camposBase = campoDetalladoTituloModel.encontrarPorTitulo(_titulo.getId());
                for (String idCampo:this.camposSeleccionados) {
                    CampoDetalladoTitulo cdt = new CampoDetalladoTitulo(null, Integer.valueOf(idCampo), _titulo.getId());
                    if(camposBase.contains(cdt)){
                        camposBase.remove(cdt);
                    }else{
                        camposBase.add(cdt);
                    }
                }
                
                for (CampoDetalladoTitulo cdt : camposBase) {
                    if(cdt.getId()!=null){
                        campoDetalladoTituloModel.eliminar(cdt);
                    }else{
                        campoDetalladoTituloModel.crear(cdt);
                    }
                }
                
                this.titulos = this.tituloModel.encontrarTodos();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.LISTADO);
            }
            this.tituloActual = null;
            this.editar = false;
            this.nuevo = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.ACTUALIZACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");

        } else {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarTitulo() {
        Boolean exito = false;
        try {
            exito = this.tituloModel.eliminar(this.tituloActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Titulo.class, ex, TipoOrigenError.ENTIDAD);
            return;
        }
        if (exito) {
            try {
                this.titulos = this.tituloModel.encontrarTodos();
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Titulo.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.tituloActual = null;
            this.nuevo = false;
            this.editar = false;
            this.ingresaDatos = false;
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaTitulos() {
        try {
            this.titulos = this.docenteSeleccionado != 0 ? this.tituloModel.encontrarPorDocente(this.docenteSeleccionado) : this.tituloModel.encontrarTodos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void subirDocumento(FileUploadEvent event) {
        this.documento = event.getFile();
    }

    private void guardarArchivo(Integer idDocente) throws Exception {
        String root = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
        String basePath = root + "resources/pdf/";
        try {
            File file = new File(basePath + idDocente);
            if (!file.exists()) {
                file.mkdir();
            }
            FileOutputStream fileOuputStream = new FileOutputStream(basePath + idDocente + "/" + this.documento.getFileName());
            fileOuputStream.write(this.documento.getContents());
            fileOuputStream.close();
        } catch (Exception e) {
            throw new Exception("Error al subir el archivo\n" + e.getMessage());
        }
    }
    //</editor-fold>    
}
