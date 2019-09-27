package com.system.xml;

import org.springframework.beans.factory.annotation.Autowired;

public class Van implements Vehicle{
Manufacture m;

@Autowired
Marketing vma;

	public Van(Manufacture m) {
	super();
	this.m = m;
}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		manufacture();
		vma.advertise();
		System.out.println("Van Details");
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		m.procure();
		m.assemble();
		m.paint();
	}

}
