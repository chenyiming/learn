package com.future.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import com.future.model.Person;

@WebService
public interface PersonWS {
    @WebMethod
    @WebResult(name = "plist")
	String listPerson(@WebParam(name = "id")  String id);
}
