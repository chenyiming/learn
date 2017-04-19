package com.future.ws;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Component;

import com.future.model.Person;


@Component
@SOAPBinding(style = Style.DOCUMENT, parameterStyle = ParameterStyle.WRAPPED)
@WebService(serviceName = "PersonWS", endpointInterface = "com.future.ws.PersonWS")
public class PersonWSImp implements PersonWS {

	@Override
	public String listPerson(String id) {
		// TODO Auto-generated method stub
		System.out.println("http://192.168.9.169:8089/services/PersonWS?wsdl   id="+id);
		return id;
	}

}
