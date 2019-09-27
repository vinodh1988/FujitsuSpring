package com.system.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class SUV implements Vehicle{
Manufacture m;

@Autowired
Marketing sma;


	public Manufacture getM() {
	return m;
}

public void setM(Manufacture m) {
	this.m = m;
}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		manufacture();
		sma.advertise();
		System.out.println("SUV works");
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		m.procure();
		m.assemble();
		m.paint();
	}

}
