/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import informacion.entidades.CampoDetallado;
import informacion.entidades.Materia;
import informacion.entidades.MateriaProceso;
import informacion.servicios.CampoDetalladoModel;
import informacion.servicios.MateriaModel;
import informacion.servicios.MateriaProcesoModel;
import informacion.servicios.WebServiceModel;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;
import wsInfoGeneral.UnidadAcademica;

/**
 *
 * @author dbsiavichay
 */
@ManagedBean
@ViewScoped
public class MateriaProcesoController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">    
    private MateriaProcesoModel materiaProcesoModel;
    private List<Materia> materias;
    private List<Materia> materiasFiltrado;
    private List<String> materiasSeleccionadas;
    private Integer materiaEliminada;
    private List<UnidadAcademica> carreras;
    private List<Materia> materiasCarrera;
    private Integer procesoSeleccionado;
    private String carreraSeleccionada;
    private WebServiceModel webServiceModel;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">    
    public MateriaProcesoController() {
        this.materiaProcesoModel = new MateriaProcesoModel();
        String idProceso = Mensajeria.getRequestParameter("proceso");
        try {
            if (idProceso != null) {
                MateriaModel materiaModel = new MateriaModel();
                this.procesoSeleccionado = Integer.valueOf(idProceso);
                this.materias = materiaModel.encontrarPorProceso(this.procesoSeleccionado);
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
        }

        try {
            this.webServiceModel = new WebServiceModel();
            this.carreras = this.webServiceModel.getCarrerasFie();
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public MateriaProcesoModel getMateriaProcesoModel() {
        return materiaProcesoModel;
    }

    public void setMateriaProcesoModel(MateriaProcesoModel materiaProcesoModel) {
        this.materiaProcesoModel = materiaProcesoModel;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Materia> getMateriasFiltrado() {
        return materiasFiltrado;
    }

    public void setMateriasFiltrado(List<Materia> materiasFiltrado) {
        this.materiasFiltrado = materiasFiltrado;
    }

    public List<String> getMateriasSeleccionadas() {
        return materiasSeleccionadas;
    }

    public void setMateriasSeleccionadas(List<String> materiasSeleccionadas) {
        this.materiasSeleccionadas = materiasSeleccionadas;
    }

    public Integer getMateriaEliminada() {
        return materiaEliminada;
    }

    public void setMateriaEliminada(Integer materiaEliminada) {
        this.materiaEliminada = materiaEliminada;
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

    public Integer getProcesoSeleccionado() {
        return procesoSeleccionado;
    }

    public void setProcesoSeleccionado(Integer procesoSeleccionado) {
        this.procesoSeleccionado = procesoSeleccionado;
    }

    public String getCarreraSeleccionada() {
        return carreraSeleccionada;
    }

    public void setCarreraSeleccionada(String carreraSeleccionada) {
        this.carreraSeleccionada = carreraSeleccionada;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void guardarMateriaProceso() {
        if (this.materiasSeleccionadas == null) {
            return;
        }

        Boolean exito = false;
        try {
            List<MateriaProceso> materiasBase = this.materiaProcesoModel.encontrarPorProcesoYCarrera(this.procesoSeleccionado, this.carreraSeleccionada);

            for (String idMateria : this.materiasSeleccionadas) {
                MateriaProceso mp = new MateriaProceso(null, Integer.valueOf(idMateria), this.procesoSeleccionado);
                if (materiasBase.contains(mp)) {
                    materiasBase.remove(mp);
                } else {
                    materiasBase.add(mp);
                }
            }

            CampoDetalladoModel campoDetalladoModel = new CampoDetalladoModel();
            MateriaModel materiaModel = new MateriaModel();
            for (MateriaProceso mp : materiasBase) {
                if (mp.getId() != null) {
                    this.materiaProcesoModel.eliminar(mp);
                } else {
                    MateriaProceso matprc = this.materiaProcesoModel.encontrarPorMateria(mp.getIdMateria());
                    if (matprc != null) {
                        this.materiasSeleccionadas.remove(mp.getIdMateria().toString());
                        Mensajeria.addErrorMessage("La materia " + matprc.getMateria().getNombreMateria() + " ya se encuentra en el paquete\n"
                                + matprc.getProceso().getCodigo() + ", " + matprc.getProceso().getDescripcion());
                    } else {
                        List<CampoDetallado> camposMateria = campoDetalladoModel.encontrarPorMateria(mp.getIdMateria());
                        if (!camposMateria.isEmpty()) {
                            this.materiaProcesoModel.crear(mp);
                        } else {
                            Materia materia = materiaModel.encontrar(mp.getIdMateria());
                            Mensajeria.addErrorMessage("La materia " + materia.getNombreMateria() + "\n"
                                    + "no se encuentra clasificada bajo ningun campo por lo cual no se ha podido agregar.\n"
                                    + "Dirijase a la sección de clasificación de materias.");
                        }
                    }
                }
            }
            exito = true;
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al guardar las materias seleccionadas.");
        }
        if (exito) {
            try {
                MateriaModel materiaModel = new MateriaModel();
                this.materias = materiaModel.encontrarPorProceso(this.procesoSeleccionado);
                this.materiasFiltrado = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(MateriaProceso.class, e, TipoOrigenError.LISTADO);
            }
            Mensajeria.addSuccessMessage("La acción ha sido realizada con éxito");
        } else {
            Mensajeria.addErrorMessage(MateriaProceso.class, TipoOrigenError.LISTADO);
        }
    }

    public void eliminarMateriaProceso() {
        Boolean exito = false;
        try {
            MateriaProceso mp = new MateriaProceso();
            mp.setIdMateria(this.materiaEliminada);
            mp.setIdProceso(this.procesoSeleccionado);
            exito = this.materiaProcesoModel.eliminarPorMateriaYProceso(mp);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(MateriaProceso.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            try {
                MateriaModel materiaModel = new MateriaModel();
                this.materias = materiaModel.encontrarPorProceso(this.procesoSeleccionado);
                this.materiasFiltrado = null;
                this.materiasSeleccionadas.remove(this.materiaEliminada.toString());
            } catch (Exception e) {
                Mensajeria.addErrorMessage(MateriaProceso.class, e, TipoOrigenError.LISTADO);
            }
            Mensajeria.addSuccessMessage(MateriaProceso.class, OpcionesSobreTablas.ELIMINACION);
            DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");
        } else {
            Mensajeria.addErrorMessage(Materia.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaMateriasProceso() {
        if (this.procesoSeleccionado != null) {
            MateriaModel materiaModel = new MateriaModel();
            try {
                this.materias = materiaModel.encontrarPorProceso(this.procesoSeleccionado);
                this.materiasFiltrado = null;
                this.materiasCarrera = null;
                this.materiasSeleccionadas = null;
                this.carreraSeleccionada = null;
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
        }
    }

    public void cambiarListaMateriasCarrera() {
        if (this.carreraSeleccionada != null) {
            MateriaModel materiaModel = new MateriaModel();
            try {
                this.materiasCarrera = materiaModel.encontrarPorCarrera(this.carreraSeleccionada);
                this.materiasSeleccionadas = new ArrayList<>();
                for (Materia materia : this.materias) {
                    if (this.materiasCarrera.contains(materia)) {
                        this.materiasSeleccionadas.add(materia.getId().toString());
                    }
                }
            } catch (Exception e) {
                Mensajeria.addErrorMessage(Materia.class, e, TipoOrigenError.LISTADO);
            }
        }
    }
    //</editor-fold>
}
