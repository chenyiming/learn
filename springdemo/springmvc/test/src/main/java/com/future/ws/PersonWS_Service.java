/**
 * PersonWS_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.future.ws;

public interface PersonWS_Service extends javax.xml.rpc.Service {
    public java.lang.String getPersonWSImpPortAddress();

    public com.future.ws.PersonWS_PortType getPersonWSImpPort() throws javax.xml.rpc.ServiceException;

    public com.future.ws.PersonWS_PortType getPersonWSImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
