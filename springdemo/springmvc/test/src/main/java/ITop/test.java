package ITop;

import java.net.URL;

import javax.xml.rpc.ServiceException;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ITopService loc=new ITopServiceLocator();
		WebServicePortType  ws=loc.getWebServicePort(new URL("http://127.0.0.1:81/webservices/itop.wsdl.php"));
	System.out.println(	ws.getVersion());
	}

}
