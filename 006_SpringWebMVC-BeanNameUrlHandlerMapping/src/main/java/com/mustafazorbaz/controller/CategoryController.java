package com.mustafazorbaz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
  
public class CategoryController  {

 

	@RequestMapping(value="/category", method = RequestMethod.GET)
	private String category(Model model) {
		 
		model.addAttribute("page","WELCOME CATEGORY");
 
		return "homeview";
 
	}
	
	
}
