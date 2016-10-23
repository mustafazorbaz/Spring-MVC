package com.mustafazorbaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="cv/kariyer/programlamam-dilleri")
	public ModelAndView bildigiDiller() {
		ModelAndView modelAndView =new  ModelAndView("index");
		modelAndView.addObject("diller","Java,C#,PHP,Android,C++");
	   return modelAndView;
	}
	
	@RequestMapping(value="cv/adres")
	public ModelAndView adres()  {
		ModelAndView view=new ModelAndView("index");
		view.addObject("il", "Antalya");
		view.addObject("ilce", "Korkuteli");
		return view;
	}
	
}
