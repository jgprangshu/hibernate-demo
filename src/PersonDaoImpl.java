package com.capgemini.hibernate.dao.impl;
import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.service.*;
import com.capgemini.hibernate.util.*;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;

public class PersonDaoImpl implements PersonDao{
	SessionFactory factory;
	@Override
	public void addNew(Person person){
	    factory = HibernateUtil.getSessionFactory();
	    Session session = factory.openSession();
	    Transaction tx = session.beginTransaction();
	    session.save(person);
	    tx.commit();
	}

	/*List<Person> getAll(){
	}*/
}