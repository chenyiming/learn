/**
 * ITopService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ITop;

public interface ITopService extends javax.xml.rpc.Service {
    public java.lang.String getWebServicePortAddress();

    public ITop.WebServicePortType getWebServicePort() throws javax.xml.rpc.ServiceException;

    public ITop.WebServicePortType getWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
