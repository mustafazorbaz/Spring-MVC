package com.mustafazorbaz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
 
@Controller
@RequestMapping("/hasta")
public class HastaController  extends MultiActionController{

	@RequestMapping("/ekle.zrbz")
	public ModelAndView ekle(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta EKLE dir...");
		
	}
	@RequestMapping("/sil.zrbz")
	public ModelAndView sil(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta SÝL dir...");
		
	}
	@RequestMapping("/guncelle.zrbz")
	public ModelAndView guncelle(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta GÜNCELLE dir...");
		
	}
	
}
