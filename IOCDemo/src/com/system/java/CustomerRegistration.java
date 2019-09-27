package com.system.java;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CustomerRegistration implements Process{

	@Override
	public void doProcess(String name) {
		// TODO Auto-generated method stub
		System.out.println("Registering customer for "+ name + " Bank");
	}

}
