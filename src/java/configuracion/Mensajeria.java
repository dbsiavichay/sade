package configuracion;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;

@ManagedBean(name = "util")
@SessionScoped
public class Mensajeria implements Serializable {

    private static boolean primerIngreso = false;

    public static boolean isPrimerIngreso() {
        return primerIngreso;
    }

    public static void setPrimerIngreso(boolean primerIngreso) {
        Mensajeria.primerIngreso = primerIngreso;
    }

    public static SelectItem[] getSelectItems(List<?> entities, boolean selectOne) {
        int size = selectOne ? entities.size() + 1 : entities.size();
        SelectItem[] items = new SelectItem[size];
        int i = 0;
        if (selectOne) {
            items[0] = new SelectItem("", "---");
            i++;
        }
        for (Object x : entities) {
            items[i++] = new SelectItem(x, x.toString());
        }
        return items;
    }

    public static void addErrorMessage(Exception ex, String defaultMsg) {
        String msg = ex.getLocalizedMessage();
        if (msg != null && msg.length() > 0) {
            addErrorMessage(msg);
        } else {
            addErrorMessage(defaultMsg);
        }
    }

    public static void addErrorMessages(List<String> messages) {
        for (String message : messages) {
            addErrorMessage(message);
        }
    }

    public static void addErrorMessage(Class tipoDato, Exception error, TipoOrigenError origenError) {
        ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/mensajesSeguridad");
        String mensaje;
        switch (origenError) {
            case ENTIDAD:
                mensaje = recurso.getString("errorEntidad");
                break;
            case LISTADO:
                mensaje = recurso.getString("errorListado");
                break;
            case LISTADOACTIVOS:
                mensaje = recurso.getString("errorListadoActivos");
                break;
            default:
                mensaje = "";
                break;
        }
        String salida = String.format(mensaje, tipoDato.getSimpleName(), error.getMessage());
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, salida, "Error");
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addErrorMessage(Class tipoDato, TipoOrigenError origenError) {
        ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/mensajesSeguridad");
        String mensaje;
        switch (origenError) {
            case ENTIDAD:
                mensaje = String.format(recurso.getString("errorEntidadSinRazon"), tipoDato.getSimpleName());
                break;
            case LISTADO:
                mensaje = String.format(recurso.getString("errorListadoSinRazon"), tipoDato.getSimpleName());
                break;
            case LISTADOACTIVOS:
                mensaje = String.format(recurso.getString("errorListadoActivosSinRazon"), tipoDato.getSimpleName());
                break;
            default:
                mensaje = "";
                break;
        }
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, "Error");
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addErrorMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }

    public static void addSuccessMessage(String msg) {
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg);
        FacesContext.getCurrentInstance().addMessage("successInfo", facesMsg);
    }

    public static void addSuccessMessage(Class tipoDato, OpcionesSobreTablas opcion) {
        ResourceBundle recurso = ResourceBundle.getBundle("/configuracion/mensajesSeguridad");
        String mensaje;        
        switch (opcion) {
            case SELECCION:
                mensaje = String.format(recurso.getString("entidadProcesada"), "selección", tipoDato.getSimpleName());
                break;
            case INSERCION:
                mensaje = String.format(recurso.getString("entidadProcesada"), "inserción", tipoDato.getSimpleName());
                break;
            case ACTUALIZACION:
                mensaje = String.format(recurso.getString("entidadProcesada"), "actualización", tipoDato.getSimpleName());
                break;
            case ELIMINACION:
                mensaje = String.format(recurso.getString("entidadProcesada"), "eliminación", tipoDato.getSimpleName());
                break;
            default:
                mensaje = "";
                break;
        }
        FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, "Transacción exitosa.");
        FacesContext.getCurrentInstance().addMessage(null, facesMsg);
    }       

    public static String getRequestParameter(String key) {
        return FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get(key);
    }

    public static Object getObjectFromRequestParameter(String requestParameterName, Converter converter, UIComponent component) {
        String theId = Mensajeria.getRequestParameter(requestParameterName);
        return converter.getAsObject(FacesContext.getCurrentInstance(), component, theId);
    }
}