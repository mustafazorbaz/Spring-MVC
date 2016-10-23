package com.mustafazorbaz.controller;
 
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
 
 
public class HomeController  {
 
	 
	@RequestMapping(value="/home", method = RequestMethod.GET)
	private String home(Model model) {
		 
		model.addAttribute("page","WELCOME HOME ");
 
		return "homeview";
 
	} 
	
}
