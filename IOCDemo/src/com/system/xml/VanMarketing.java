package com.system.xml;

import org.springframework.stereotype.Component;

@Component("vma")
public class VanMarketing implements Marketing{

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Advertising the new Van model..!!!");
	}

}
