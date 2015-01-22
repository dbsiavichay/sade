/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conocimiento.controladores;

import configuracion.Mensajeria;
import configuracion.OpcionesSobreTablas;
import configuracion.TipoOrigenError;
import conocimiento.entidades.Regla;
import conocimiento.servicios.ReglaModel;
import informacion.entidades.CampoEspecifico;
import informacion.servicios.CampoEspecificoModel;
import java.util.ArrayList;
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
public class ReglaController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">    
    private ReglaModel reglaModel;
    private Regla reglaActual;
    private List<Regla> reglas;
    private List<Regla> reglasFiltro;
    private List<CampoEspecifico> camposEspecificos;
    private Integer campoAmplioSeleccionado;
    private Integer campoEspecificoSeleccionado;
    private Integer factorCerteza;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">    
    public ReglaController() {
        this.reglaModel = new ReglaModel();
        try {
            this.reglas = this.reglaModel.encontrarTodosConObjetos();
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al listar reglas.");
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="GET Y SET">        
    public ReglaModel getReglaModel() {
        return reglaModel;
    }

    public void setReglaModel(ReglaModel reglaModel) {
        this.reglaModel = reglaModel;
    }

    public Regla getReglaActual() {
        return reglaActual;
    }

    public void setReglaActual(Regla reglaActual) {
        this.reglaActual = reglaActual;
    }

    public List<Regla> getReglas() {
        return reglas;
    }

    public void setReglas(List<Regla> reglas) {
        this.reglas = reglas;
    }

    public List<Regla> getReglasFiltro() {
        return reglasFiltro;
    }

    public void setReglasFiltro(List<Regla> reglasFiltro) {
        this.reglasFiltro = reglasFiltro;
    }

    public List<CampoEspecifico> getCamposEspecificos() {
        return camposEspecificos;
    }

    public void setCamposEspecificos(List<CampoEspecifico> camposEspecificos) {
        this.camposEspecificos = camposEspecificos;
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

    public Integer getFactorCerteza() {
        return factorCerteza;
    }

    public void setFactorCerteza(Integer factorCerteza) {
        this.factorCerteza = factorCerteza;
    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc="FUNCIONES">
    public void editarRegla() {
        Regla _regla = null;
        try {
            _regla = this.reglaModel.editar(this.reglaActual);
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Regla.class, e, TipoOrigenError.ENTIDAD);
        }
        if (_regla != null) {
            this.reglaActual = null;
            this.reglasFiltro = null;
            Mensajeria.addSuccessMessage(Regla.class, OpcionesSobreTablas.ACTUALIZACION);
            try {
                if (this.campoEspecificoSeleccionado != null) {
                    this.reglas = this.reglaModel.encontrarPorCampoEspecificoConObjetos(this.campoEspecificoSeleccionado);
                } else {
                    this.reglas = this.reglaModel.encontrarTodosConObjetos();
                    this.campoAmplioSeleccionado = null;
                    this.campoEspecificoSeleccionado = null;
                    this.camposEspecificos = null;
                }
                DefaultRequestContext.getCurrentInstance().execute("dlgDialog.hide()");     
            } catch (Exception e) {
                Mensajeria.addErrorMessage("Error al listar reglas.");
            }
        } else {
            Mensajeria.addErrorMessage(Regla.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void eliminarRegla() {
        Boolean exito = false;
        try {
            exito = this.reglaModel.eliminar(this.reglaActual);
        } catch (Exception ex) {
            Mensajeria.addErrorMessage(Regla.class, ex, TipoOrigenError.ENTIDAD);
        }
        if (exito) {
            this.reglaActual = null;
            this.reglasFiltro = null;
            Mensajeria.addSuccessMessage(Regla.class, OpcionesSobreTablas.ELIMINACION);
            try {
                if (this.campoEspecificoSeleccionado != null) {
                    this.reglas = this.reglaModel.encontrarPorCampoEspecificoConObjetos(this.campoEspecificoSeleccionado);
                } else {
                    this.reglas = this.reglaModel.encontrarTodosConObjetos();
                    this.campoAmplioSeleccionado = null;
                    this.campoEspecificoSeleccionado = null;
                    this.camposEspecificos = null;
                }
                DefaultRequestContext.getCurrentInstance().execute("dlgPregunta.hide()");     
            } catch (Exception e) {
                Mensajeria.addErrorMessage("Error al listar reglas.");
            }
        } else {
            Mensajeria.addErrorMessage(Regla.class, TipoOrigenError.ENTIDAD);
        }
    }

    public void cambiarListaCampoEspecifico() {
        try {
            if (this.campoAmplioSeleccionado != null) {
                CampoEspecificoModel campoEspecificoModel = new CampoEspecificoModel();
                this.camposEspecificos = campoEspecificoModel.encontrarPorCampoAmplio(this.campoAmplioSeleccionado);
                this.campoEspecificoSeleccionado = null;
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage(CampoEspecifico.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void cambiarListaReglas() {
        try {
            this.reglas = this.reglaModel.encontrarPorCampoEspecificoConObjetos(this.campoEspecificoSeleccionado);
            this.reglasFiltro = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage(Regla.class, e, TipoOrigenError.LISTADO);
        }
    }

    public void generarReglas() {
        CampoEspecificoModel model = new CampoEspecificoModel();
        List<Regla> reglasB = new ArrayList<Regla>();
        List<Regla> reglasG = new ArrayList<Regla>();
        try {            
            reglasB = this.reglaModel.encontrarTodos();
            int contadorInicial = reglasB.size();
            
            List<CampoEspecifico> campos = model.encontrarTodos();
            for (CampoEspecifico campoTitulo : campos) {
                for (CampoEspecifico campoMateria : campos) {
                    if (campoTitulo.getId() != campoMateria.getId()) {
                        Regla regla = new Regla(null, campoTitulo.getId(), campoMateria.getId(), 0.00);                        
                        reglasG.add(regla);
                    }else{
                        Regla regla = new Regla(null, campoTitulo.getId(), campoMateria.getId(), 1.00);
                        reglasG.add(regla);
                    }
                    
                }
            }

            
            for (Regla regla : reglasG) {
                if (reglasB.contains(regla)) {
                    reglasB.remove(regla);
                } else {
                    reglasB.add(regla);
                }
            }

            for (Regla regla : reglasB) {
                if (regla.getId() != null) {
                    this.reglaModel.eliminar(regla);
                } else {
                    this.reglaModel.crear(regla);
                }
            }

            this.reglas = this.reglaModel.encontrarTodosConObjetos();
            int contadorFinal = this.reglas.size();
            Mensajeria.addSuccessMessage(Regla.class, OpcionesSobreTablas.INSERCION);
            int count = contadorFinal - contadorInicial;
            if (count >= 0) {
                Mensajeria.addSuccessMessage("Se agregaron: " + count + " items nuevos.");
            } else {
                Mensajeria.addSuccessMessage("Se quitaron: " + Math.abs(count) + " items nuevos.");
            }
            this.campoAmplioSeleccionado = null;
            this.campoEspecificoSeleccionado = null;
            this.camposEspecificos = null;
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al generar reglas.");
        }

    }
    //</editor-fold>
}
