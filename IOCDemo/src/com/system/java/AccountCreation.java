package com.system.java;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AccountCreation implements Process{

	@Override
	public void doProcess(String name) {
		// TODO Auto-generated method stub
		System.out.println("Account Created for Customer in "+name+ " Bank");
	}

}
