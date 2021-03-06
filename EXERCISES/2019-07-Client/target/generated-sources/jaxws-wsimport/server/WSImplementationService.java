
package server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSImplementationService", targetNamespace = "http://server/", wsdlLocation = "http://localhost:8080/WSInterface?WSDL")
public class WSImplementationService
    extends Service
{

    private final static URL WSIMPLEMENTATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSIMPLEMENTATIONSERVICE_EXCEPTION;
    private final static QName WSIMPLEMENTATIONSERVICE_QNAME = new QName("http://server/", "WSImplementationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WSInterface?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSIMPLEMENTATIONSERVICE_WSDL_LOCATION = url;
        WSIMPLEMENTATIONSERVICE_EXCEPTION = e;
    }

    public WSImplementationService() {
        super(__getWsdlLocation(), WSIMPLEMENTATIONSERVICE_QNAME);
    }

    public WSImplementationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSIMPLEMENTATIONSERVICE_QNAME, features);
    }

    public WSImplementationService(URL wsdlLocation) {
        super(wsdlLocation, WSIMPLEMENTATIONSERVICE_QNAME);
    }

    public WSImplementationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSIMPLEMENTATIONSERVICE_QNAME, features);
    }

    public WSImplementationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSImplementationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WSImplementationPort")
    public WSInterface getWSImplementationPort() {
        return super.getPort(new QName("http://server/", "WSImplementationPort"), WSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSInterface
     */
    @WebEndpoint(name = "WSImplementationPort")
    public WSInterface getWSImplementationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "WSImplementationPort"), WSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSIMPLEMENTATIONSERVICE_EXCEPTION!= null) {
            throw WSIMPLEMENTATIONSERVICE_EXCEPTION;
        }
        return WSIMPLEMENTATIONSERVICE_WSDL_LOCATION;
    }

}
