package com.system.java;

import org.springframework.stereotype.Component;

@Component
public class BranchCreator implements Branch{

	@Override
	public void startBranch(String n) {
		// TODO Auto-generated method stub
		System.out.println("Started "+n+ " branch");
	}

}
