package com.config;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	Logger logger=Logger.getLogger(MyAspect.class);
	
	@Pointcut("execution(* com.control.SecondController.store(..))")
	public void point(){
		
	}
	
	@Before("point()")
	public void doIt(){
		logger.info("Person form data is about to be processed#########");
	}
	
	@AfterReturning(pointcut= "point()", returning = "retVal")
	public void check(Object retVal){
		String data=(String)retVal;
		if(data.equals("success")){
			logger.info("Form Successfully processed!!!!~~~~!!!!!!");
			//System.out.println("Validation error Occured and aspect running");
		}
	}

}




