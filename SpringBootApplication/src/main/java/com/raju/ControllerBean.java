package com.raju;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerBean {
	@RequestMapping("/useName")
	public String home() {
		return "home";                                          
	}
	
    @RequestMapping("/action1")
      public String login(@RequestParam String name,@RequestParam String password,Model m){
	m.addAttribute("k1=",name);
	m.addAttribute("k2=",password);
	if(name.equals("admin") && password.equals("admin"))
	{
		return "success";
		
	}
	else
	{
		return " wrong";
	}
    }
}
	

