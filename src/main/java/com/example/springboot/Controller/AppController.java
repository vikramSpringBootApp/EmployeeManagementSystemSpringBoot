package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title","CRUD Example");
		return "HomePage";
	}

	/*@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}
*/
	/*@RequestMapping("/")
	public ModelAndView exception2()
	{
	    ModelAndView modelAndview = new ModelAndView("HomePage.jsp");
	    try {
	       // generateException();
	       // modelAndView = new ModelAndView("success.jsp");
	    } catch(IndexOutOfBoundsException e) {
	        //modelAndView = handleException();
	    }
	    return modelAndview;
	}*/
	
	/*@RequestMapping("/")
	public String index(Model model) {
		//logger.debug("index()");
		return "redirect:/index";
	}*/
}
