package com.waszczyk.hackspringlogger.controllers;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waszczyk.hackspringlogger.utils.AutowiredLogger;

@Controller
public class MainController {

	
	//hacked logger
	
	@AutowiredLogger
	Logger logger;
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Hello Hack Spring Logger Tutorial ;-)");
		return "hello";
	}

}
