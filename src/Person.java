package com.capgemini.hibernate.service;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;

@Entity
public class Person{
	@Id
   	int personId;
   	String personName;
	
	public Person(){

	}

	public Person(int pId, String pName){
		personId = pId;
		personName = pName;
	}

	public String toString(){
		return ("PersonName =" + personName +"Name is" +personName );
	}

}