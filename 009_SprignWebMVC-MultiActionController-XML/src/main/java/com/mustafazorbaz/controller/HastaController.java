package com.mustafazorbaz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
 

public class HastaController  extends MultiActionController{

	public ModelAndView ekle(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta EKLE dir...");
		
	}
	public ModelAndView sil(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta SÝL dir...");
		
	}
	public ModelAndView guncelle(HttpServletRequest request,HttpServletResponse response)
	{
		return new ModelAndView("hasta", "modelHastaMesaj", "Burasý Hasta GÜNCELLE dir...");
		
	}
	
}
