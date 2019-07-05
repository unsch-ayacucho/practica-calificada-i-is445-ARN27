package pe.edu.unsch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view")
public class IndexController {
	
	@GetMapping("/indexString")
	//@RequestMapping(value="/indexString", method=RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("titulo", "Spring Boot");
		return "views/index";
	}
	
	@GetMapping("/indexMAV")
	//@RequestMapping(value="/indexMAV", method=RequestMethod.GET)
	public ModelAndView indexMAV() {
		return new ModelAndView("views/index");
	}

}
