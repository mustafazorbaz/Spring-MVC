package com.mustafazorbaz.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
@RequestMapping("testform.html")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String userControl(Map<String, User> model) {
		model.put("user", new User());
		return "testform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String userResult(@Valid User user, BindingResult result, Map<String, User> model) {

		if (result.hasErrors()) {
			return "testform";
		}

		model.put("user", user);
		return "testsuccessful";

	}
}
