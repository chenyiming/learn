/**
 * PersonWS_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.future.ws;

public class PersonWS_ServiceLocator extends org.apache.axis.client.Service implements com.future.ws.PersonWS_Service {

    public PersonWS_ServiceLocator() {
    }


    public PersonWS_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonWS_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonWSImpPort
    private java.lang.String PersonWSImpPort_address = "http://192.168.1.103:8089/services/PersonWS";

    public java.lang.String getPersonWSImpPortAddress() {
        return PersonWSImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonWSImpPortWSDDServiceName = "PersonWSImpPort";

    public java.lang.String getPersonWSImpPortWSDDServiceName() {
        return PersonWSImpPortWSDDServiceName;
    }

    public void setPersonWSImpPortWSDDServiceName(java.lang.String name) {
        PersonWSImpPortWSDDServiceName = name;
    }

    public com.future.ws.PersonWS_PortType getPersonWSImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonWSImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonWSImpPort(endpoint);
    }

    public com.future.ws.PersonWS_PortType getPersonWSImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.future.ws.PersonWSImpPortBindingStub _stub = new com.future.ws.PersonWSImpPortBindingStub(portAddress, this);
            _stub.setPortName(getPersonWSImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonWSImpPortEndpointAddress(java.lang.String address) {
        PersonWSImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.future.ws.PersonWS_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.future.ws.PersonWSImpPortBindingStub _stub = new com.future.ws.PersonWSImpPortBindingStub(new java.net.URL(PersonWSImpPort_address), this);
                _stub.setPortName(getPersonWSImpPortWSDDServiceName());
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
        if ("PersonWSImpPort".equals(inputPortName)) {
            return getPersonWSImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.future.com/", "PersonWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.future.com/", "PersonWSImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonWSImpPort".equals(portName)) {
            setPersonWSImpPortEndpointAddress(address);
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
