package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Person;

@Repository
@Transactional
public class PersonDAO {
@Autowired
	private SessionFactory sessionFactory;

	 public List<Person> getPerson(){
		 return sessionFactory.getCurrentSession().createCriteria(Person.class).list();
	 }
	 
	 public void save(Person p){
		 sessionFactory.getCurrentSession().save(p);
	 }
}