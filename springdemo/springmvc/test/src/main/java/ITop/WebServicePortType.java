/**
 * WebServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ITop;

public interface WebServicePortType extends java.rmi.Remote {
    public java.lang.String getVersion() throws java.rmi.RemoteException;
    public ITop.Result createRequestTicket(java.lang.String login, java.lang.String password, java.lang.String title, java.lang.String description, ITop.ExternalKeySearch caller, ITop.ExternalKeySearch customer, ITop.ExternalKeySearch service, ITop.ExternalKeySearch service_subcategory, java.lang.String product, ITop.ExternalKeySearch workgroup, ITop.LinkCreationSpec[] impacted_cis, java.lang.String impact, java.lang.String urgency) throws java.rmi.RemoteException;
    public ITop.Result createIncidentTicket(java.lang.String login, java.lang.String password, java.lang.String title, java.lang.String description, ITop.ExternalKeySearch caller, ITop.ExternalKeySearch customer, ITop.ExternalKeySearch service, ITop.ExternalKeySearch service_subcategory, java.lang.String product, ITop.ExternalKeySearch workgroup, ITop.LinkCreationSpec[] impacted_cis, java.lang.String impact, java.lang.String urgency) throws java.rmi.RemoteException;
    public ITop.Result searchObjects(java.lang.String login, java.lang.String password, java.lang.String oql) throws java.rmi.RemoteException;
}
