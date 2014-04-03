/**
 * 
 */
package org.drait.source.rest.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author DEEPAK
 * 
 */
@Controller(value = "Login Controller")
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView loginController() {

		System.out.println("inside login controller");
		return new ModelAndView("login");
	}

}
