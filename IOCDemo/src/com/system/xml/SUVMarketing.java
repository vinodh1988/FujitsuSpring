package com.system.xml;

import org.springframework.stereotype.Component;

@Component("sma")
public class SUVMarketing implements Marketing {

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("SUV model is being advertised");
	}

}
