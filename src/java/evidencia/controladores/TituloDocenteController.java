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
import informacion.entidades.CampoDetallado;
import informacion.entidades.CampoEspecifico;
import informacion.servicios.CampoDetalladoModel;
import informacion.servicios.CampoEspecificoModel;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import seguridad.controladores.UsuariosDataManager;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class TituloDocenteController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">    
    private Titulo tituloActual;
    private TituloModel tituloModel;
    private List<Titulo> titulos;
    private Boolean nuevo;
    private Boolean editar;
    private Boolean ingresaDatos;
    private UploadedFile documento;
    private String categoriaSeleccionada;
    private Boolean regitroObligatorio;
    private Integer campoAmplioSeleccionado;
    private Integer campoEspecificoSeleccionado;
    private List<String> camposDetalladosSelected;
    private List<CampoDetallado> camposDetalladosSeleccionados;
    private List<CampoEspecifico> camposEspecificos;
    private List<CampoDetallado> camposDetallados;
    @ManagedProperty(value = "#{usuariosDataManager}")
    private UsuariosDataManager usuariosDataManager;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">      
    public TituloDocenteController() {
        this.tituloActual = new Titulo();
        this.tituloModel = new TituloModel();
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
    }

    @PostConstruct
    public void init() {
        try {
            this.titulos = this.tituloModel.consultaTitulosPorDocenteConCampos(this.usuariosDataManager.getUsuarioSesion().getId());
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.LISTADO);
        }
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

    public UploadedFile getDocumento() {
        return documento;
    }

    public void setDocumento(UploadedFile documento) {
        this.documento = documento;
    }

    public String getCategoriaSeleccionada() {
        return categoriaSeleccionada;
    }

    public void setCategoriaSeleccionada(String categoriaSeleccionada) {
        this.categoriaSeleccionada = categoriaSeleccionada;
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

    public Boolean getRegitroObligatorio() {
        return regitroObligatorio;
    }

    public void setRegitroObligatorio(Boolean regitroObligatorio) {
        this.regitroObligatorio = regitroObligatorio;
    }

    public UsuariosDataManager getUsuariosDataManager() {
        return usuariosDataManager;
    }

    public void setUsuariosDataManager(UsuariosDataManager usuariosDataManager) {
        this.usuariosDataManager = usuariosDataManager;
    }

    public Integer getCampoAmplioSeleccionado() {
        return campoAmplioSeleccionado;
    }

    public void setCampoAmplioSeleccionado(Integer campoAmplioSeleccionado) {
        this.campoAmplioSeleccionado = campoAmplioSeleccionado;
    }

    public Integer getCampoEspecificoSeleccionado() {
        return campoEspecificoSeleccionado;
    }

    public void setCampoEspecificoSeleccionado(Integer campoEspecificoSeleccionado) {
        this.campoEspecificoSeleccionado = campoEspecificoSeleccionado;
    }

    public List<String> getCamposDetalladosSelected() {
        return camposDetalladosSelected;
    }

    public void setCamposDetalladosSelected(List<String> camposDetalladosSelected) {
        this.camposDetalladosSelected = camposDetalladosSelected;
    }

    public List<CampoDetallado> getCamposDetalladosSeleccionados() {
        return camposDetalladosSeleccionados;
    }

    public void setCamposDetalladosSeleccionados(List<CampoDetallado> camposDetalladosSeleccionados) {
        this.camposDetalladosSeleccionados = camposDetalladosSeleccionados;
    }

    public List<CampoEspecifico> getCamposEspecificos() {
        return camposEspecificos;
    }

    public void setCamposEspecificos(List<CampoEspecifico> camposEspecificos) {
        this.camposEspecificos = camposEspecificos;
    }

    public List<CampoDetallado> getCamposDetallados() {
        return camposDetallados;
    }

    public void setCamposDetallados(List<CampoDetallado> camposDetallados) {
        this.camposDetallados = camposDetallados;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES DE PREPARACION">
    public void preparaSeleccionCampos() {
        this.campoAmplioSeleccionado = null;
        this.campoEspecificoSeleccionado = null;
        this.camposEspecificos = null;
        this.camposDetallados = null;
        this.camposDetalladosSelected = null;
    }

    public void preparaNuevo() {
        this.tituloActual = new Titulo();
        this.nuevo = true;
        this.ingresaDatos = true;
        this.editar = false;
        this.documento = null;
        this.categoriaSeleccionada = null;
        this.camposDetalladosSeleccionados = new ArrayList<>();
    }

    public void preparaEditar() {
        this.nuevo = false;
        this.ingresaDatos = true;
        this.editar = true;    
        this.documento = null;
        this.categoriaSeleccionada = this.tituloActual.getIdCategoria().toString()
                + ":" + this.tituloActual.getCategoria().getEstudioFormal().toString();
        this.camposDetalladosSeleccionados = this.tituloActual.getCamposDetallados();
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarTitulo() {
        Titulo _titulo = null;
        try {
            if (this.regitroObligatorio && this.documento == null) {
                Mensajeria.addErrorMessage("Debe subir un archivo pdf de su titulo");
                return;
            }
            this.tituloActual.setIdDocente(this.usuariosDataManager.getUsuarioSesion().getId());
            this.tituloActual.setIdCategoria(Integer.valueOf(this.categoriaSeleccionada.split(":")[0]));
            if (this.documento != null) {
                this.guardarArchivo(this.tituloActual.getIdDocente());
                this.tituloActual.setUrlDocumento("/resources/pdf/" + this.tituloActual.getIdDocente() + "/" + documento.getFileName());
            }
            _titulo = this.tituloModel.crear(this.tituloActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_titulo != null) {
            this.tituloActual = _titulo;
            this.editar = true;
            this.nuevo = false;
            this.ingresaDatos = true;
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.INSERCION);
            try {
                this.titulos = this.tituloModel.consultaTitulosPorDocenteConCampos(this.usuariosDataManager.getUsuarioSesion().getId());
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.LISTADO);
            }
        } else {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void editarTitulo() {
        Titulo _titulo = null;
        try {            
            this.tituloActual.setIdCategoria(Integer.valueOf(this.categoriaSeleccionada.split(":")[0]));
            if (this.documento != null) {
                this.guardarArchivo(this.tituloActual.getIdDocente());
                this.tituloActual.setUrlDocumento("/resources/pdf/" + this.tituloActual.getIdDocente() + "/" + documento.getFileName());
            }
            _titulo = this.tituloModel.editar(this.tituloActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Titulo.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_titulo != null) {
            this.tituloActual = _titulo;
            this.editar = true;
            this.nuevo = false;
            this.ingresaDatos = true;
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.ACTUALIZACION);
            try {
                this.titulos = this.tituloModel.consultaTitulosPorDocenteConCampos(this.usuariosDataManager.getUsuarioSesion().getId());
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.LISTADO);
            }
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
                this.titulos = this.tituloModel.consultaTitulosPorDocenteConCampos(this.usuariosDataManager.getUsuarioSesion().getId());
            } catch (Exception ex) {
                Mensajeria.addErrorMessage(Titulo.class, ex, TipoOrigenError.LISTADO);
                return;
            }
            this.preparaNuevo();
            Mensajeria.addSuccessMessage(Titulo.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Titulo.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void validarRegistro() {
        this.regitroObligatorio = Boolean.valueOf(this.categoriaSeleccionada.split(":")[1]);
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

    public void cambiarListaCamposEspecificos() {
        if (this.campoAmplioSeleccionado == null) {
            return;
        }
        try {
            CampoEspecificoModel campoEspecificoModel = new CampoEspecificoModel();
            this.camposEspecificos = campoEspecificoModel.encontrarPorCampoAmplio(this.campoAmplioSeleccionado);
            this.camposDetallados = null;
            this.camposDetalladosSelected = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void cambiarListaCamposDetallados() {
        if (this.campoEspecificoSeleccionado == null) {
            return;
        }
        try {
            CampoDetalladoModel campoDetalladoModel = new CampoDetalladoModel();
            this.camposDetallados = campoDetalladoModel.encontrarPorCampoEspecifico(this.campoEspecificoSeleccionado);

            if (this.camposDetalladosSeleccionados != null) {
                this.camposDetalladosSelected = new ArrayList<String>();
                for (CampoDetallado campo : this.camposDetalladosSeleccionados) {
                    this.camposDetalladosSelected.add(campo.getId().toString());
                }
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoDetallado.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void guardarCampos() {
        CampoDetalladoTituloModel campoDetalladoTituloModel = new CampoDetalladoTituloModel();
        CampoDetalladoModel campoDetalladoModel = new CampoDetalladoModel();

        try {
            List<CampoDetalladoTitulo> camposDetalladosTitulo = campoDetalladoTituloModel.encontrarPorTitulo(this.tituloActual.getId());
            List<CampoDetallado> camposDetalladosActuales = campoDetalladoModel.encontrarPorTitulo(this.tituloActual.getId());
            for (int i = 0; i < camposDetalladosActuales.size(); i++) {
                if (camposDetalladosActuales.get(i).getIdCampoEspecifico() != this.campoEspecificoSeleccionado) {
                    camposDetalladosActuales.remove(i);
                    i = i - 1;
                }
            }

            for (int i = 0; i < camposDetalladosTitulo.size(); i++) {
                CampoDetallado campoDetallado = new CampoDetallado();
                campoDetallado.setId(camposDetalladosTitulo.get(i).getIdCampoDetallado());
                if (!camposDetalladosActuales.contains(campoDetallado)) {
                    camposDetalladosTitulo.remove(i);
                    i = i - 1;
                }
            }


            for (String idCampoDetallado : this.camposDetalladosSelected) {
                CampoDetalladoTitulo campoDetalladoTitulo = new CampoDetalladoTitulo();
                campoDetalladoTitulo.setIdTitulo(this.tituloActual.getId());
                campoDetalladoTitulo.setIdCampoDetallado(Integer.valueOf(idCampoDetallado));
                if (camposDetalladosTitulo.contains(campoDetalladoTitulo)) {
                    camposDetalladosTitulo.remove(campoDetalladoTitulo);
                } else {
                    camposDetalladosTitulo.add(campoDetalladoTitulo);
                }
            }

            for (CampoDetalladoTitulo campo : camposDetalladosTitulo) {
                if (campo.getId() != null) {
                    campoDetalladoTituloModel.eliminar(campo);
                } else {
                    campoDetalladoTituloModel.crear(campo);
                }
            }

            this.camposDetalladosSeleccionados = campoDetalladoModel.encontrarPorTitulo(this.tituloActual.getId());
            this.camposDetalladosSelected = null;
            Mensajeria.addSuccessMessage("Las areas seleccionadas se han guardado correctamente");
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al guardar campos.");
        }
    }

    public void eliminarCampos() {
        CampoDetalladoTituloModel campoDetalladoTituloModel = new CampoDetalladoTituloModel();
        try {
            for (String idCampoDetallado : this.camposDetalladosSelected) {
                CampoDetalladoTitulo campoDetalladoTitulo = new CampoDetalladoTitulo();
                campoDetalladoTitulo.setIdTitulo(this.tituloActual.getId());
                campoDetalladoTitulo.setIdCampoDetallado(Integer.valueOf(idCampoDetallado));
                campoDetalladoTituloModel.eliminarPorCampoTitulo(campoDetalladoTitulo);
            }
            CampoDetalladoModel campoDetalladoModel = new CampoDetalladoModel();
            this.camposDetalladosSeleccionados = campoDetalladoModel.encontrarPorTitulo(this.tituloActual.getId());
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al eliminar campos.");
        }
    }
    //</editor-fold>              
}
