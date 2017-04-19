package com.future.ws;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class testper {

	public static void main(String[] args) throws ServiceException, RemoteException {
		// TODO Auto-generated method stub
		 PersonWS_Service service=new PersonWS_ServiceLocator();
		 PersonWS_PortType p= service.getPersonWSImpPort();
		 p.listPerson("dd");
	}

}
