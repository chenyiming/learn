package com.future.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "home";
	}
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/p1", method = RequestMethod.GET)
	public String home2(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "jsp/home";
	}
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/p2", method = RequestMethod.GET)
	public String home3(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "thy/test";
	}
	
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Model model) {
		logger.info("Welcome home!");
		System.out.println("test.html");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		return "test";
	}
	

}
