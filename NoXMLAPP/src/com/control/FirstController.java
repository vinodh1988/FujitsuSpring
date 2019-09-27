package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import com.dao.PersonDAO;
import com.model.Person;

@Controller
public class FirstController {
	
@Autowired 
   PersonDAO dao;


	@RequestMapping("first")
	   public String first(){
		  return "home";
	}
	
	@RequestMapping("people")
	   public String report(ModelMap m){
		  m.addAttribute("people",dao.getPerson());
		  return "dreport";
	   }
	
	
	
	

}
