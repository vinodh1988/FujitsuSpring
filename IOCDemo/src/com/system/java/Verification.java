package com.system.java;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Verification implements Process{

	@Override
	public void doProcess(String name) {
		// TODO Auto-generated method stub
		System.out.println("Verifying Customer for "+name+" Bank");
	}

}
