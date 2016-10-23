package com.mustafazorbaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mustafazorbaz.model.User;

/*
CREATE - POST
READ - GET
UPDATE - PUT
DELETE
*/
@Controller
public class UserController {
	
	@RequestMapping(value="/user-form", method = RequestMethod.GET)
	public void userForm(Model model) {
		model.addAttribute(new User());
	}
	
	@RequestMapping(value="/user-sonuc.html", method = RequestMethod.POST)
	public void userSonuc(@ModelAttribute  User user,   Model model) {
		model.addAttribute("user", user);
	}
}
