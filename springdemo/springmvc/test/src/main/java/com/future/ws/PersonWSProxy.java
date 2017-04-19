package com.future.ws;

public class PersonWSProxy implements com.future.ws.PersonWS_PortType {
  private String _endpoint = null;
  private com.future.ws.PersonWS_PortType personWS_PortType = null;
  
  public PersonWSProxy() {
    _initPersonWSProxy();
  }
  
  public PersonWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonWSProxy();
  }
  
  private void _initPersonWSProxy() {
    try {
      personWS_PortType = (new com.future.ws.PersonWS_ServiceLocator()).getPersonWSImpPort();
      if (personWS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personWS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personWS_PortType != null)
      ((javax.xml.rpc.Stub)personWS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.future.ws.PersonWS_PortType getPersonWS_PortType() {
    if (personWS_PortType == null)
      _initPersonWSProxy();
    return personWS_PortType;
  }
  
  public java.lang.String listPerson(java.lang.String id) throws java.rmi.RemoteException{
    if (personWS_PortType == null)
      _initPersonWSProxy();
    return personWS_PortType.listPerson(id);
  }
  
  
}