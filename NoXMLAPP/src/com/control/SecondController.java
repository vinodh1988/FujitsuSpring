package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.PersonDAO;
import com.model.Person;

@Controller
public class SecondController {
	@Autowired 
	   PersonDAO dao;
	@Autowired 
	   Person person;
	
	@RequestMapping("peopleform")
    public ModelAndView mymethod(){
	  System.out.println("PEOPLE FORM LOADED");
	   return new ModelAndView("form","person",person);
	
    }
	
	@RequestMapping(value="process",method=RequestMethod.POST)
	public String store(@ModelAttribute("person")Person person){
		try{
		dao.save(person);
		return "success";
		}
		catch(Exception e){
			return "fail";
		}
	}
}









