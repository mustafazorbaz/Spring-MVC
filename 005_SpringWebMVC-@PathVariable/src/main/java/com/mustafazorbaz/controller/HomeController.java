package com.mustafazorbaz.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/index") //Bir üst dizin için kullanýlýr
public class HomeController {
	
 	
 
	@RequestMapping(value = "/welcome", method = RequestMethod.GET) // bu istenilen url'nin girilmesi sonucunda bize gel istegi ile sonuç döndürüyor.
	public String home(Locale locale, Model model) {
 		
		model.addAttribute("anasayfa", "anasayafa" );
		model.addAttribute("kategoriler", "kategoriler");
		model.addAttribute("hakkimizda", "hakkimizda");
		model.addAttribute("iletisim", "iletisim");
		return "home"; 
	}
	@RequestMapping(value = "/welcome/{name}/{surname}", method = RequestMethod.GET) // bu istenilen url'nin girilmesi sonucunda bize gel istegi ile sonuç döndürüyor.
	public String personel(Locale locale, Model model,@PathVariable("name") String name ,@PathVariable("surname") String surname) {
 		
		model.addAttribute("anasayfa", "anasayafa" );
		model.addAttribute("kategoriler", "kategoriler");
		model.addAttribute("hakkimizda", "hakkimizda");
		model.addAttribute("iletisim", "iletisim");
		model.addAttribute("message", "Hoþgeldin "+name+" "+surname);
		return "home"; 
	}
}
