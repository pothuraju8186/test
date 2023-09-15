package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Model.EmployeeModel;
import com.example.Service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService ies;

	@RequestMapping(value="/")
	public String insertEmployee() {
		return "insertEmployee.jsp";
	}
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
		public String saveEmployee(EmployeeModel em,Model m) {
		if(ies.saveEmployee(em)==1) {
			
			m.addAttribute("msg","employee inserted sucessful");
		}
		else {
			m.addAttribute("msg","employee insertion failed");
		}
		return "saveEmployee";
	}

}


