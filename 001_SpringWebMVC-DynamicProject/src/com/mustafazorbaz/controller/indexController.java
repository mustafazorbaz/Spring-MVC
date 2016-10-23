package com.mustafazorbaz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class indexController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView view =new ModelAndView("indexView");
		view.addObject("title", "Gallery");
		view.addObject("resim1","http://www.w3schools.com/bootstrap/cinqueterre.jpg");
		view.addObject("resim2", "http://www.w3schools.com/bootstrap/paris.jpg");
		return view;
	}

}
