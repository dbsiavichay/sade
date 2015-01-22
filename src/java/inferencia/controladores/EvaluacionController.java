/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inferencia.controladores;

import configuracion.Mensajeria;
import conocimiento.entidades.Reporte;
import conocimiento.servicios.ReporteModel;
import datasource.ReporteDataSource;
import datasource.ResultadoDataSource;
import evidencia.entidades.Titulo;
import evidencia.servicios.TituloModel;
import informacion.entidades.Proceso;
import informacion.servicios.ProcesoModel;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import org.primefaces.context.DefaultRequestContext;
import seguridad.controladores.UsuariosDataManager;

/**
 *
 * @author dbsiavichay
 */
@ManagedBean
@ViewScoped
public class EvaluacionController {

    //<editor-fold defaultstate="collapsed" desc="ATRIBUTOS">                
    private Integer procesoSeleccionado;
    @ManagedProperty(value = "#{usuariosDataManager}")
    private UsuariosDataManager usuariosDataManager;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="CONSTRUCTOR">
    public EvaluacionController() {
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="GET Y SET">
    public Integer getProcesoSeleccionado() {
        return procesoSeleccionado;
    }

    public void setProcesoSeleccionado(Integer procesoSeleccionado) {
        this.procesoSeleccionado = procesoSeleccionado;
    }

    public UsuariosDataManager getUsuariosDataManager() {
        return usuariosDataManager;
    }

    public void setUsuariosDataManager(UsuariosDataManager usuariosDataManager) {
        this.usuariosDataManager = usuariosDataManager;
    }
    //</editor-fold>

    public String generar() {
        ProcesoModel procesoModel = new ProcesoModel();
        try {
            Proceso proceso = procesoModel.encontrar(this.procesoSeleccionado);
            Date hoy = new Date();
            if (hoy.getTime() > proceso.getFinaliza().getTime()) {
                Mensajeria.addErrorMessage("Lo sentimos este proceso ya no esta disponible, pronto sera retirado de esta lista");
                return "#";
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al verificar el estado del paquete");
            return "#";
        }

        ReporteModel reporteModel = new ReporteModel();
        try {
            Reporte reporte = reporteModel.encontrarPorProcesoYDocente(this.procesoSeleccionado, this.usuariosDataManager.getUsuarioSesion().getId());
            if (reporte != null) {
                DefaultRequestContext.getCurrentInstance().execute("dlgMensaje.show()");
                return "#";
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al validar la postulación.");
            return "#";
        }

        TituloModel tituloModel = new TituloModel();
        List<Titulo> titulos;
        try {
            titulos = tituloModel.consultaTitulosPorDocenteConCampos(this.usuariosDataManager.getUsuarioSesion().getId());
            if (titulos.isEmpty()) {
                DefaultRequestContext.getCurrentInstance().execute("dlgPerfil.show()");
                return "#";
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
            return "#";
        }

        try {
            Reporte reporte = MotorInferenciaModel.evaluarPerfil(this.usuariosDataManager.getUsuarioSesion(), this.procesoSeleccionado);
            reporte.setIdProceso(this.procesoSeleccionado);

            ReporteDataSource reporteDataSource = new ReporteDataSource(titulos);
            String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
            String reports_path = path + "resources/reports/";
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("RESULTADOS", new ResultadoDataSource(reporte.getDetalles()));
            parametros.put("CEDULA", this.usuariosDataManager.getUsuarioSesion().getCedula());
            parametros.put("NOMBRE_COMPLETO", this.usuariosDataManager.getUsuarioSesion().getNombreCompleto());
            parametros.put("SUBREPORT_DIR", reports_path);
            parametros.put("PATH_LOGO", path + "resources/imagenes/logos/escudoespoch.gif");


            File file = new File(reports_path + "evaluacionReporte.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, reporteDataSource);
            JRExporter exporter = new JRPdfExporter();
            Calendar hoy = GregorianCalendar.getInstance();
            String nombreReporte = this.usuariosDataManager.getUsuarioSesion().getCedula() + "-" + hoy.getTime().getTime() + ".pdf";
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new File(reports_path + nombreReporte));
            exporter.exportReport();

            reporte.setUrl("/resources/reports/" + nombreReporte);
            reporteModel.guardar(reporte);
            DefaultRequestContext.getCurrentInstance().addCallbackParam("url", reporte.getUrl());
            return "/inferencia/reporte";
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al generar el reporte.\n" + e.getMessage());
            return "#";
        }
    }

    public String verReporte() {
        ReporteModel reporteModel = new ReporteModel();
        try {
            Reporte reporte = reporteModel.encontrarPorProcesoYDocente(this.procesoSeleccionado, this.usuariosDataManager.getUsuarioSesion().getId());
            if (reporte != null) {
                DefaultRequestContext.getCurrentInstance().addCallbackParam("url", reporte.getUrl());
                return "/inferencia/reporte";
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al validar la postulación\n" + e.getMessage());
            return "#";
        }
        return "#";
    }
}
