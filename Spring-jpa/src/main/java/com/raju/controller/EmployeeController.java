package com.raju.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raju.dao.IEmployeeRepo;
import com.raju.model.Employee;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeRepo repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee) {
	repo.save(employee);
		return "home.jsp";
		
	}

}
