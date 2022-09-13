package com.uniam;

import com.uniam.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Step1: read the Configuratoin file 
    	
    	Configuration cfg = new Configuration();
    	//cfg.configure("");
    
    	cfg.configure("com\\uniam\\config\\hibernate.cfg.xml");

    	
    	// step 2 : Build Session Factory
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	// step 3 : Create a Session Object 
    	
    	Session ses = factory.openSession();
    	//everysessoin transaction is disabled,
    	Transaction tx = ses.beginTransaction();
    	
    	// fetch data from the database 
    	//eager
//    	Employee emp = ses.get(Employee.class, 1);
//    	if(emp!=null)
//    	System.out.println(emp.getEno() +"\t" + emp.getFirstname() + "\t" + emp.getLastname());
//    	else
//    		System.out.println("record not found ");
    	//lazy loading
    	//fetch data from the database 
//    	Employee emp = ses.load(Employee.class, 10);
//    	System.out.println(emp.getEno() +"\t" + emp.getFirstname() + "\t" + emp.getLastname());
    	
//    	Employee emp = ses.get(Employee.class, 1);
//    	if(emp!=null)
//    	System.out.println(emp.getEno() +"\t" + emp.getFirstname() + "\t" + emp.getLastname());
//    	else
//    		System.out.println("record not found ");
//    	
//    emp.setFirstname("Upendra");
//    ses.update(emp);
    
   // ses.flush();//updating 
 //   tx.commit();// commit internally called flush()  to reflect data into the data base 
    
    	
    	

    	
	}

}
