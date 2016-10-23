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
@RequestMapping("loginform.html") // B�yle bir sayfam�z yok linkten a���d�g�m�z
									// zaman bu linki bu controller'e g�re
									// de�erlendirir.
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String openLoginPage(Map<String, User> model) {
		User user = new User();
		model.put("user", user);
		return "loginformView";
	}

	/*
	 * Burada valid User dedigimiz bizim kontrollerimizi saglayarak
	 * kulland�g�m�z nesnemiz
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String denetleLoginForm(@Valid User user, BindingResult result, Map<String, User> model) {
		/*
		 * Hata varsa tekrar ayn� sayfaya gidecek
		 */
		if (result.hasErrors()) {
			return "loginformView";
		}

		String userName = "mustafa";
		String password = "123";

		user = model.get("user");
		if (!user.getUserName().equals(userName) || !user.getPassword().equals(password)) {
			return "loginformView";
		}

		model.put("user", user);

		return "homepage";// i�lem ba�ar�l� ise sayfaya giri� yapar
	}
}