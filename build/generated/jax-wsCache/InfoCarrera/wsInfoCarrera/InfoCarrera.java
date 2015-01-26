
package wsInfoCarrera;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Este servicio provee información sobre una carrera
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InfoCarrera", targetNamespace = "http://academico.espoch.edu.ec/", wsdlLocation = "http://academico.espoch.edu.ec/OAS_Interop/InfoCarrera.wsdl")
public class InfoCarrera
    extends Service
{

    private final static URL INFOCARRERA_WSDL_LOCATION;
    private final static WebServiceException INFOCARRERA_EXCEPTION;
    private final static QName INFOCARRERA_QNAME = new QName("http://academico.espoch.edu.ec/", "InfoCarrera");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://academico.espoch.edu.ec/OAS_Interop/InfoCarrera.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INFOCARRERA_WSDL_LOCATION = url;
        INFOCARRERA_EXCEPTION = e;
    }

    public InfoCarrera() {
        super(__getWsdlLocation(), INFOCARRERA_QNAME);
    }

    public InfoCarrera(WebServiceFeature... features) {
        super(__getWsdlLocation(), INFOCARRERA_QNAME, features);
    }

    public InfoCarrera(URL wsdlLocation) {
        super(wsdlLocation, INFOCARRERA_QNAME);
    }

    public InfoCarrera(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INFOCARRERA_QNAME, features);
    }

    public InfoCarrera(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InfoCarrera(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InfoCarreraSoap
     */
    @WebEndpoint(name = "InfoCarreraSoap")
    public InfoCarreraSoap getInfoCarreraSoap() {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraSoap"), InfoCarreraSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoCarreraSoap
     */
    @WebEndpoint(name = "InfoCarreraSoap")
    public InfoCarreraSoap getInfoCarreraSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraSoap"), InfoCarreraSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns InfoCarreraHttpGet
     */
    @WebEndpoint(name = "InfoCarreraHttpGet")
    public InfoCarreraHttpGet getInfoCarreraHttpGet() {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraHttpGet"), InfoCarreraHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoCarreraHttpGet
     */
    @WebEndpoint(name = "InfoCarreraHttpGet")
    public InfoCarreraHttpGet getInfoCarreraHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraHttpGet"), InfoCarreraHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns InfoCarreraHttpPost
     */
    @WebEndpoint(name = "InfoCarreraHttpPost")
    public InfoCarreraHttpPost getInfoCarreraHttpPost() {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraHttpPost"), InfoCarreraHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InfoCarreraHttpPost
     */
    @WebEndpoint(name = "InfoCarreraHttpPost")
    public InfoCarreraHttpPost getInfoCarreraHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://academico.espoch.edu.ec/", "InfoCarreraHttpPost"), InfoCarreraHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INFOCARRERA_EXCEPTION!= null) {
            throw INFOCARRERA_EXCEPTION;
        }
        return INFOCARRERA_WSDL_LOCATION;
    }

}
