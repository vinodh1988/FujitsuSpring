package com.run;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.SessionProvider;
import com.model.Dept;
import com.model.Emp;

public class SecondRun {
  public static void main(String[] args) {
	  SessionFactory s=SessionProvider.getSessionFactory();
	  Session s1=s.openSession();
	  
	  Query q=s1.createQuery("from Dept");
	  List<Dept> l=q.list();
	  
	  for(Dept x:l)
	  {
		  System.out.println(x.getName());
		  for(Emp e:x.getEmployees())
			   System.out.println("       "+e.getName());
	  }
	  /*Transaction t=s1.beginTransaction();
	  
	 Dept d=new Dept(1,"Marketing");
	 Emp e1=new Emp(1,"Rajesh","Manager");
	  Emp e2=new Emp(2,"Rahul","Clerk");
	  
	  e1.setDept(d);
	  e2.setDept(d);
	  
	  Set<Emp> set=new HashSet<Emp>();
	  set.add(e1);
	  set.add(e2);
	  
	  d.setEmployees(set);
	  
	  s1.save(d);
	  Emp e3=new Emp(3,"Roger","Executive");
	  e3.setDept(d);
	  s1.save(e3);
	  t.commit();*/
	  
	  //System.out.println("Rows Stored");
	  
	  
  }
}