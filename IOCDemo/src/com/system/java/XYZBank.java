package com.system.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZBank implements Bank{

    @Autowired
	List<Process> processes;
	@Autowired
	Branch branch;
	
	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("XYZ Bank implemented");
		branch.startBranch("Hyderabad");
		branch.startBranch("Bengaluru");
		
		for(Process p:processes){
			p.doProcess("XYZ");
		}
	}

}
