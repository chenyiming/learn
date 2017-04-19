package ITop;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WebServicePortTypeProxyTest {

	static private WebServicePortType  ws;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ITopService loc=new ITopServiceLocator();
		ws=loc.getWebServicePort();//new WebServicePortTypeProxy("http://192.168.13.179/webservices/itop.wsdl.php");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWebServicePortTypeProxyString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVersion() throws RemoteException {
		//System.out.println(ws.getVersion());
	}

	@Test
	public void testCreateRequestTicket() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateIncidentTicket() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchObjects() {
		fail("Not yet implemented");
	}

}
