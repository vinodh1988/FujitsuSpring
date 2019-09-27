package com.app.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
  @RequestMapping("/hello")
  public String greet(){
	  return "first";
  }
}
