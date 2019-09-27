package com.system.java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ABCBank implements Bank{
	
@Autowired
List<Process> processes;

@Autowired
Branch branch;
	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("ABC Bank Established");
		branch.startBranch("Chennai");
		branch.startBranch("Bengaluru");
		branch.startBranch("Nagpur");
		
		for(Process p:processes)
			p.doProcess("ABC");
		
	}

}
