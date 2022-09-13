package com.uniam;

import com.uniam.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Step1: read the Configuratoin file 
    	
    	Configuration cfg = new Configuration();
    	//cfg.configure("");
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    	cfg.configure("com\\uniam\\config\\hibernate.cfg.xml");
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    	
    	// step 2 : Build Session Factory
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	// step 3 : Create a Session Object 
    	
    	Session ses = factory.openSession();
    	//everysessoin transaction is disabled,
    	Transaction tx = ses.beginTransaction();
    	
    	// Step 4  single row operation 
    		Employee emp = new Employee();//trainest Obejct 
    		emp.setEno(3);
    		emp.setFirstname("aadim");
    		emp.setLastname("Chaulagain");
    		
//    	Integer id =	(Integer) ses.save(emp);
//    	System.out.println("Generated" + id );
    		
    	 ses.persist(emp);
    	tx.commit();// data will be stored in the database 
    		
    	
    		
    	
;
    	
    }
}
