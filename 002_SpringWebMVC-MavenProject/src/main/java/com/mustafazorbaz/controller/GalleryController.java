package com.mustafazorbaz.controller;
 
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GalleryController {
	
	private static final Logger logger = LoggerFactory.getLogger(GalleryController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.addAttribute("resim1", "http://www.w3schools.com/bootstrap/cinqueterre.jpg" );
		model.addAttribute("resim2", "http://www.w3schools.com/bootstrap/paris.jpg" );
		model.addAttribute("resim3", "http://www.w3schools.com/bootstrap/sanfran.jpg" );
		model.addAttribute("resim4", "http://www.w3schools.com/bootstrap/sanfran.jpg" );
		model.addAttribute("resim5", "http://www.w3schools.com/bootstrap/cinqueterre.jpg" );
		model.addAttribute("resim6", "http://www.w3schools.com/bootstrap/paris.jpg" );
		return "galleryview";
	}
	
}
