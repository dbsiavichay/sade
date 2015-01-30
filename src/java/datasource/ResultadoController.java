/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

import configuracion.Mensajeria;
import conocimiento.entidades.Detalle;
import conocimiento.servicios.ReporteModel;
import informacion.entidades.Materia;
import informacion.entidades.Proceso;
import informacion.servicios.MateriaModel;
import informacion.servicios.ProcesoModel;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class ResultadoController {

    private Integer docenteSeleccionado;
    private List<Detalle> resultados;
    private List<Materia> materias;
    private Integer procesoSeleccionado;
    private String urlReporte;
    private ReporteModel reporteModel;

    public ResultadoController() {
        this.reporteModel = new ReporteModel();

//        String proceso = DefaultRequestContext.getCurrentInstance().getCallbackParams().get("proceso").toString();
//        if(proceso != null){
//            this.procesoSeleccionado = Integer.valueOf(proceso);
//            ReporteModel reporteModel = new ReporteModel();
//            try {
//                this.reportes = reporteModel.encontrarPorProcesoConObjetos(procesoSeleccionado);
//            } catch (Exception e) {
//                Mensajeria.addErrorMessage(e.getMessage());
//            }  
//            
//            MateriaProcesoModel materiaModel = new MateriaProcesoModel();
//            try {
//                this.materias = materiaModel.encontrarPorProceso(procesoSeleccionado);
//            } catch (Exception e) {
//                Mensajeria.addErrorMessage(e.getMessage());
//            }            
//        }
//        this.vistaReporte = false;
    }

    //<editor-fold defaultstate="collapsed" desc="Get y set">
    public Integer getDocenteSeleccionado() {
        return docenteSeleccionado;
    }

    public void setDocenteSeleccionado(Integer docenteSeleccionado) {
        this.docenteSeleccionado = docenteSeleccionado;
    }

    public List<Detalle> getResultados() {
        return resultados;
    }

    public void setResultados(List<Detalle> resultados) {
        this.resultados = resultados;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }        

    public Integer getProcesoSeleccionado() {
        return procesoSeleccionado;
    }

    public void setProcesoSeleccionado(Integer procesoSeleccionado) {
        this.procesoSeleccionado = procesoSeleccionado;
    }

    public String getUrlReporte() {
        return urlReporte;
    }

    public void setUrlReporte(String urlReporte) {
        this.urlReporte = urlReporte;
    }

    public ReporteModel getReporteModel() {
        return reporteModel;
    }

    public void setReporteModel(ReporteModel reporteModel) {
        this.reporteModel = reporteModel;
    }
    //</editor-fold>

    public void cambiarListaResultados() {
        MateriaModel materiaModel = new MateriaModel();        

        try {
            this.resultados = this.reporteModel.encontrarPorProcesoConPromedio(this.procesoSeleccionado);
            if (this.resultados.isEmpty()) {
                Mensajeria.addSuccessMessage("Aun no existen resultados en este paquete.");
            }else{
                this.materias = materiaModel.encontrarPorProceso(this.procesoSeleccionado);
            }
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al buscar resultados de paquete.");
        }
    }

    public String generarPorPaquete() {
        ProcesoModel procesoModel = new ProcesoModel();

        try {
            Proceso proceso = procesoModel.encontrar(this.procesoSeleccionado);

            PaqueteDataSource dataSource = new PaqueteDataSource(this.resultados);
            String path = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
            String reports_path = path + "resources/reports/";
            Map<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("CODIGO", proceso.getCodigo());
            parametros.put("PAQUETE", proceso.getDescripcion());
            parametros.put("PATH_LOGO", path + "resources/imagenes/logos/escudoespoch.gif");


            File file = new File(reports_path + "reportePaquete.jasper");
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource);
            JRExporter exporter = new JRPdfExporter();
            String nombreReporte = proceso.getCodigo().toLowerCase() + ".pdf";
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new File(reports_path + nombreReporte));
            exporter.exportReport();
            return "../resources/reports/" + nombreReporte;
        } catch (Exception e) {
            Mensajeria.addErrorMessage("Error al generar el reporte.\n" + e.getMessage());
            return "../404Reporte.xhtml";
        }
    }
}
