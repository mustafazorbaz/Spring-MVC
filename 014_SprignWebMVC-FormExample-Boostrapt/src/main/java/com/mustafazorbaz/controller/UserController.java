package com.mustafazorbaz.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mustafazorbaz.model.User;

/*
CREATE - POST
READ - GET
UPDATE - PUT
DELETE
*/
@Controller
@RequestMapping("listele.html")
public class UserController {

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView ekle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		User user = new User();
		
		 String name = request.getParameter("name") ;
		 String surname = request.getParameter("surname") ;
		 String email = request.getParameter("email") ;
		
		user.setName(name);
		user.setSurname(surname);
		user.setEmail(email);
		 
		return new ModelAndView("userView", "userModel", user);
	
	}
	
}
