package com.run;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.SessionProvider;
import com.model.Dept;
import com.model.Details;
import com.model.Emp;

public class ThirdRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory s=SessionProvider.getSessionFactory();
		  Session s1=s.openSession();
		  Transaction t=s1.beginTransaction();
		  Dept d=new Dept(4,"IT");
		  Emp e1=new Emp(7,"Prem","Architect");
		  Emp e2=new Emp(8,"Rishi","Programmer");
		  Details d1=new Details(7,"Gandhi Road","Chennai","8309480384");
		  Details d2=new Details(8,"Peters Road","Mumbai","9448904804");
		  
		  Set<Emp> set=new HashSet<Emp>();
		  
		  
		  set.add(e1);
		  set.add(e2);
		  d.setEmployees(set);
		  
		  e1.setDept(d);
		  e1.setDetails(d1);
		  
		  e2.setDept(d);
		  e2.setDetails(d2);
		  
		  s1.save(d);
		  t.commit();
		  System.out.println("inserted everything");
		  
		  
		  
		  
	}

}
