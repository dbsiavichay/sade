/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inferencia.controladores;

import configuracion.Mensajeria;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author Denis
 */
@ManagedBean
@ViewScoped
public class ReporteDocenteController {

    private String urlReporte;

    public ReporteDocenteController() {        
        try {
            this.urlReporte =  DefaultRequestContext.getCurrentInstance().getCallbackParams().get("url").toString();            
        } catch (Exception e) {
            Mensajeria.addErrorMessage(e.getMessage());
        }
    }

    public String getUrlReporte() {
        return urlReporte;
    }

    public void setUrlReporte(String urlReporte) {
        this.urlReporte = urlReporte;
    }
}
