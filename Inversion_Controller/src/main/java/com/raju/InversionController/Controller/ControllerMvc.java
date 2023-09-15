package com.raju.InversionController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMvc {
	@GetMapping(value="/")
	public String gethome() {
		return "home.jsp";
	}

}
