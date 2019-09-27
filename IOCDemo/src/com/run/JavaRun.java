package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.system.java.Bank;
import com.system.java.JavaConfig;

public class JavaRun {
   public static void main(String[] args) {
	 ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	 Bank ref=(Bank)ac.getBean("abc");
	 ref.establish();
	 
	 System.out.println("--------------------------------------");
	 ref=(Bank)ac.getBean("xyz");
	 ref.establish();
   }
}
