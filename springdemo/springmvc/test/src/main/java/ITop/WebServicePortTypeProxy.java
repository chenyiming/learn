package ITop;

public class WebServicePortTypeProxy implements ITop.WebServicePortType {
  private String _endpoint = null;
  private ITop.WebServicePortType webServicePortType = null;
  
  public WebServicePortTypeProxy() {
    _initWebServicePortTypeProxy();
  }
  
  public WebServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServicePortTypeProxy();
  }
  
  private void _initWebServicePortTypeProxy() {
    try {
      webServicePortType = (new ITop.ITopServiceLocator()).getWebServicePort();
      if (webServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServicePortType != null)
      ((javax.xml.rpc.Stub)webServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ITop.WebServicePortType getWebServicePortType() {
    if (webServicePortType == null)
      _initWebServicePortTypeProxy();
    return webServicePortType;
  }
  
  public java.lang.String getVersion() throws java.rmi.RemoteException{
    if (webServicePortType == null)
      _initWebServicePortTypeProxy();
    return webServicePortType.getVersion();
  }
  
  public ITop.Result createRequestTicket(java.lang.String login, java.lang.String password, java.lang.String title, java.lang.String description, ITop.ExternalKeySearch caller, ITop.ExternalKeySearch customer, ITop.ExternalKeySearch service, ITop.ExternalKeySearch service_subcategory, java.lang.String product, ITop.ExternalKeySearch workgroup, ITop.LinkCreationSpec[] impacted_cis, java.lang.String impact, java.lang.String urgency) throws java.rmi.RemoteException{
    if (webServicePortType == null)
      _initWebServicePortTypeProxy();
    return webServicePortType.createRequestTicket(login, password, title, description, caller, customer, service, service_subcategory, product, workgroup, impacted_cis, impact, urgency);
  }
  
  public ITop.Result createIncidentTicket(java.lang.String login, java.lang.String password, java.lang.String title, java.lang.String description, ITop.ExternalKeySearch caller, ITop.ExternalKeySearch customer, ITop.ExternalKeySearch service, ITop.ExternalKeySearch service_subcategory, java.lang.String product, ITop.ExternalKeySearch workgroup, ITop.LinkCreationSpec[] impacted_cis, java.lang.String impact, java.lang.String urgency) throws java.rmi.RemoteException{
    if (webServicePortType == null)
      _initWebServicePortTypeProxy();
    return webServicePortType.createIncidentTicket(login, password, title, description, caller, customer, service, service_subcategory, product, workgroup, impacted_cis, impact, urgency);
  }
  
  public ITop.Result searchObjects(java.lang.String login, java.lang.String password, java.lang.String oql) throws java.rmi.RemoteException{
    if (webServicePortType == null)
      _initWebServicePortTypeProxy();
    return webServicePortType.searchObjects(login, password, oql);
  }
  
  
}