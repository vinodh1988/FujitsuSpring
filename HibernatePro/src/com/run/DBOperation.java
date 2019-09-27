package com.run;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.config.SessionProvider;
import com.model.Person;

public class DBOperation {
  public static void main(String[] args) {
	  SessionFactory s=SessionProvider.getSessionFactory();
	  Session s1=s.openSession();
	 // Query q=s1.createQuery("from Person where length(name)>=5");
	 // List<Person> l= q.list();
	  
	  Criteria c=s1.createCriteria(Person.class);
	  Criterion c1=Restrictions.gt("sno",15);
	  c.add(c1);
	  List<Person> l= c.list();
	  for(Person x:l)
		  System.out.println(x.getName()+" "+x.getCity());
	  
	  
	  
	  
	  
	  
	  //Transaction t=s1.beginTransaction();
	 //Person p1=new Person(12,"Ramesh","Chennai");
	  //Person p2=new Person(14,"Lara","Chennai");
	  //s1.save(p1);
	 // s1.save(p2);
	  //Person p=(Person) s1.get(Person.class,12);
	  //s1.delete(p);
	  //t.commit();
	  ///System.out.println("New rows inserted");
  }
}
