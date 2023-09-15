package com.raju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerBean {
@RequestMapping(value="/url1")

    public String handler1() {
	return "home.jsp";	
}

}
