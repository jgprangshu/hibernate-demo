package com.capgemini.hibernate.main;
import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.dao.impl.*;
import com.capgemini.hibernate.service.*;

public class Main{

	public static void main(String arrgs[]){
		
		PersonDao dao = new PersonDaoImpl();
		dao.addNew(new Person(102,"Doraemon"));	
		System.out.println("Congrats !!");
	}


}