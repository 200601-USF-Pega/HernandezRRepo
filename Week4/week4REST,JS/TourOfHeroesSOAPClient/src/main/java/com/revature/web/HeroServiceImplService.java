
package com.revature.web;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HeroServiceImplService", targetNamespace = "http://service.tourofheroes.revature.com/", wsdlLocation = "http://localhost:9999/service?wsdl")
public class HeroServiceImplService
    extends Service
{

    private final static URL HEROSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HEROSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName HEROSERVICEIMPLSERVICE_QNAME = new QName("http://service.tourofheroes.revature.com/", "HeroServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/service?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HEROSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        HEROSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public HeroServiceImplService() {
        super(__getWsdlLocation(), HEROSERVICEIMPLSERVICE_QNAME);
    }

    public HeroServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HEROSERVICEIMPLSERVICE_QNAME, features);
    }

    public HeroServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, HEROSERVICEIMPLSERVICE_QNAME);
    }

    public HeroServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HEROSERVICEIMPLSERVICE_QNAME, features);
    }

    public HeroServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HeroServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HeroService
     */
    @WebEndpoint(name = "HeroServiceImplPort")
    public HeroService getHeroServiceImplPort() {
        return super.getPort(new QName("http://service.tourofheroes.revature.com/", "HeroServiceImplPort"), HeroService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HeroService
     */
    @WebEndpoint(name = "HeroServiceImplPort")
    public HeroService getHeroServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.tourofheroes.revature.com/", "HeroServiceImplPort"), HeroService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HEROSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw HEROSERVICEIMPLSERVICE_EXCEPTION;
        }
        return HEROSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
