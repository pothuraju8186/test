package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class LoginController {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String addingNames() 
	{
		System.out.println("iam in index");
		return "Login";
	}
	@RequestMapping(value="/loginpage",method=RequestMethod.POST)
	public String loginpage(LoginPageModel lpm,Model m) {
		if (lpm.getUname().equals("admin")&& lpm.getPwd().equals("admin")) {
			m.addAttribute("msg","your are a valid user");
		}
		else {
			m.addAttribute("invalidmsg","you are an invalid user please check your username and password");
		}
			
		return "Login2";	
		}
	}

