package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddControl {
	@RequestMapping(value="/print",method=RequestMethod.GET)
	public String print() {
	return "Addition";
}
	@RequestMapping(value="/sum",method=RequestMethod.GET)
	public String addition(Summodel sum,Model m) {
		
		int add=sum.getFno()+sum.getSno();
		System.out.println(add);
		m.addAttribute("sum",add);
		return "sum";
		
	}

	

}

