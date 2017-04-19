/**
 * ITopServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ITop;

public class ITopServiceLocator extends org.apache.axis.client.Service implements ITop.ITopService {

    public ITopServiceLocator() {
    }


    public ITopServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ITopServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServicePort
    private java.lang.String WebServicePort_address = "http://127.0.0.1:81/webservices/soapserver.php";

    public java.lang.String getWebServicePortAddress() {
        return WebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServicePortWSDDServiceName = "WebServicePort";

    public java.lang.String getWebServicePortWSDDServiceName() {
        return WebServicePortWSDDServiceName;
    }

    public void setWebServicePortWSDDServiceName(java.lang.String name) {
        WebServicePortWSDDServiceName = name;
    }

    public ITop.WebServicePortType getWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServicePort(endpoint);
    }

    public ITop.WebServicePortType getWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ITop.WebServiceBindingStub _stub = new ITop.WebServiceBindingStub(portAddress, this);
            _stub.setPortName(getWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServicePortEndpointAddress(java.lang.String address) {
        WebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ITop.WebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ITop.WebServiceBindingStub _stub = new ITop.WebServiceBindingStub(new java.net.URL(WebServicePort_address), this);
                _stub.setPortName(getWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServicePort".equals(inputPortName)) {
            return getWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:ITop", "ITopService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:ITop", "WebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServicePort".equals(portName)) {
            setWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
