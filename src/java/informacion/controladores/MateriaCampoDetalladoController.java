/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.CampoDetallado;
import informacion.entidades.CampoEspecifico;
import informacion.entidades.Materia;
import informacion.entidades.MateriaCampoDetallado;
import informacion.servicios.CampoDetalladoModel;
import informacion.servicios.CampoEspecificoModel;
import informacion.servicios.MateriaCampoDetalladoModel;
import informacion.servicios.MateriaModel;
import informacion.servicios.WebServiceModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import wsInfoGeneral.UnidadAcademica;

/**
 *
 * @author Luis
 */
@ManagedBean
@ViewScoped
public class MateriaCampoDetalladoController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">       
    private MateriaCampoDetalladoModel materiaCampoDetalladoModel;
    private MateriaModel materiaModel;
    private List<MateriaCampoDetallado> materias;
    private List<MateriaCampoDetallado> materiasFiltrado;
    private String carreraSeleccionada;
    private Integer campoAmplioSeleccionado;
    private Integer campoEspecificoSeleccionado;
    private Integer campoDetalladoSeleccionado;
    private MateriaCampoDetallado materiaCampoDetalladoSeleccionado;
    private List<CampoEspecifico> camposEspecificos;
    private List<CampoDetallado> camposDetallados;
    private List<UnidadAcademica> carreras;
    private List<Materia> materiasCarrera;
    private List<String> materiasSeleccionadas;
    private WebServiceModel webServiceModel;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">  
    public MateriaCampoDetalladoController() {
        this.materiaCampoDetalladoModel = new MateriaCampoDetalladoModel();
        this.materiaModel = new MateriaModel();
        this.materiaCampoDetalladoSeleccionado = new MateriaCampoDetallado();
        try {
            this.webServiceModel = new WebServiceModel();
            this.carreras = this.webServiceModel.getCarrerasFie();
            this.materiasCarrera = this.materiaModel.encontrarSinCampoDetallado();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(UnidadAcademica.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">         
    public MateriaCampoDetalladoModel getMateriaCampoDetalladoModel() {
        return materiaCampoDetalladoModel;
    }

    public void setMateriaCampoDetalladoModel(MateriaCampoDetalladoModel materiaCampoDetalladoModel) {
        this.materiaCampoDetalladoModel = materiaCampoDetalladoModel;
    }

    public MateriaModel getMateriaModel() {
        return materiaModel;
    }

    public void setMateriaModel(MateriaModel materiaModel) {
        this.materiaModel = materiaModel;
    }

    public WebServiceModel getWebServiceModel() {
        return webServiceModel;
    }

    public void setWebServiceModel(WebServiceModel webServiceModel) {
        this.webServiceModel = webServiceModel;
    }

    public List<MateriaCampoDetallado> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaCampoDetallado> materias) {
        this.materias = materias;
    }

    public List<MateriaCampoDetallado> getMateriasFiltrado() {
        return materiasFiltrado;
    }

    public MateriaCampoDetallado getMateriaCampoDetalladoSeleccionado() {
        return materiaCampoDetalladoSeleccionado;
    }

    public void setMateriaCampoDetalladoSeleccionado(MateriaCampoDetallado materiaCampoDetalladoSeleccionado) {
        this.materiaCampoDetalladoSeleccionado = materiaCampoDetalladoSeleccionado;
    }

    public void setMateriasFiltrado(List<MateriaCampoDetallado> materiasFiltrado) {
        this.materiasFiltrado = materiasFiltrado;
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

    public Integer getCampoDetalladoSeleccionado() {
        return campoDetalladoSeleccionado;
    }

    public void setCampoDetalladoSeleccionado(Integer campoDetalladoSeleccionado) {
        this.campoDetalladoSeleccionado = campoDetalladoSeleccionado;
    }

    public String getCarreraSeleccionada() {
        return carreraSeleccionada;
    }

    public void setCarreraSeleccionada(String carreraSeleccionada) {
        this.carreraSeleccionada = carreraSeleccionada;
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

    public List<UnidadAcademica> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<UnidadAcademica> carreras) {
        this.carreras = carreras;
    }

    public List<Materia> getMateriasCarrera() {
        return materiasCarrera;
    }

    public void setMateriasCarrera(List<Materia> materiasCarrera) {
        this.materiasCarrera = materiasCarrera;
    }

    public List<String> getMateriasSeleccionadas() {
        return materiasSeleccionadas;
    }

    public void setMateriasSeleccionadas(List<String> materiasSeleccionadas) {
        this.materiasSeleccionadas = materiasSeleccionadas;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarMateriaCampoDetallado() {
        if (this.materiasSeleccionadas == null || this.materiasSeleccionadas.isEmpty()) {
            Mensajeria.addErrorMessage("Debe seleccionar al menos una materia para realizar la acción.");
            return;
        }

        if (this.campoDetalladoSeleccionado == null) {
            Mensajeria.addErrorMessage("Debe seleccionar un area en donde clasificar.");
            return;
        }

        Boolean exito = false;
        try {
            for (String idMateria : this.materiasSeleccionadas) {
                MateriaCampoDetallado mcd = new MateriaCampoDetallado(null, Integer.valueOf(idMateria), this.campoDetalladoSeleccionado);
                this.materiaCampoDetalladoModel.crear(mcd);
            }
            exito = true;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(MateriaCampoDetallado.class, e, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.materias = this.materiaCampoDetalladoModel.consultaPorCampoDetallado(this.campoDetalladoSeleccionado);
                this.materiasFiltrado = null;
                this.cambiarListaMateriasCarrera();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(MateriaCampoDetallado.class, e, TipoOrigenError.LISTADO);
            }
            Mensajeria.addSuccessMessage("La acción ha sido realizada con éxito");
        } else {
            Mensajeria.addErrorMessage(MateriaCampoDetallado.class, TipoOrigenError.LISTADO);
        }
    }

    public void editarMateriaCampoDetallado() {
        MateriaCampoDetallado _mcd = null;
        try {
            _mcd = this.materiaCampoDetalladoModel.editar(this.materiaCampoDetalladoSeleccionado);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(MateriaCampoDetallado.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (_mcd != null) {
            try {
                this.materias = this.materiaCampoDetalladoModel.consultaPorCampoDetallado(this.campoDetalladoSeleccionado);
                this.materiasFiltrado = null;
                this.cambiarListaMateriasCarrera();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
            Mensajeria.addSuccessMessage(Materia.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");
        } else {
            Mensajeria.addErrorMessage(Materia.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarMateriaCampoDetallado() {
        Boolean exito = false;
        try {
            exito = this.materiaCampoDetalladoModel.eliminar(this.materiaCampoDetalladoSeleccionado);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(MateriaCampoDetallado.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                this.materias = this.materiaCampoDetalladoModel.consultaPorCampoDetallado(this.campoDetalladoSeleccionado);
                this.materiasFiltrado = null;
                this.cambiarListaMateriasCarrera();
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
            Mensajeria.addSuccessMessage(Materia.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Materia.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaMateriaCampoDetallados() {
        if (this.campoDetalladoSeleccionado != null) {
            try {
                this.materias = this.materiaCampoDetalladoModel.consultaPorCampoDetallado(this.campoDetalladoSeleccionado);
                this.materiasFiltrado = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
        }
    }

    public void cambiarListaCamposEspecificos() {
        if (this.campoAmplioSeleccionado != null) {
            CampoEspecificoModel campoEspecificoModel = new CampoEspecificoModel();
            try {
                this.camposEspecificos = campoEspecificoModel.encontrarPorCampoAmplio(this.campoAmplioSeleccionado);
                this.campoEspecificoSeleccionado = null;
                this.campoDetalladoSeleccionado = null;
                this.camposDetallados = null;
                this.materias = new ArrayList<MateriaCampoDetallado>();
                this.materiasFiltrado = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.LISTADO);
            }
        }
    }

    public void cambiarListaCamposDetallados() {
        if (this.campoEspecificoSeleccionado != null) {
            CampoDetalladoModel campoDetalladoModel = new CampoDetalladoModel();
            try {
                this.camposDetallados = campoDetalladoModel.encontrarPorCampoEspecifico(this.campoEspecificoSeleccionado);
                this.campoDetalladoSeleccionado = null;
                this.materias = new ArrayList<MateriaCampoDetallado>();
                this.materiasFiltrado = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(CampoDetallado.class, e, TipoOrigenError.LISTADO);
            }
        }
    }

    public void cambiarListaMateriasCarrera() {
        try {
            this.materiasCarrera = this.carreraSeleccionada != null ? this.materiaModel.encontrarSinCampoDetalladoPorCarrera(this.carreraSeleccionada) : this.materiaModel.encontrarSinCampoDetallado();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
        }
    }
    //</editor-fold>    
}
