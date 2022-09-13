package com.uniam._SF;

import com.uniam._SF.pojo.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\uniam\\config\\spring.xml"));
    	Employee emp = (Employee)factory.getBean("emp");
    	System.out.println(emp.getEno()+"\t" +emp.getEname()+"\t" +emp.getEsal()+"\t"+ emp.getDesignation()+"\t"+emp.getCity()+"\t"+ emp.getHouseNo());
    	
		
		
		  Employee emp1 = (Employee)factory.getBean("emp1");
		  System.out.println(emp1.getEno()+"\t" +emp1.getEname()+"\t"
		  +emp1.getEsal()+"\t"+ emp1.getDesignation()+"\t"+emp1.getCity()+"\t"+
		  emp1.getHouseNo());
		  
		  Employee emp2 = (Employee)factory.getBean("emp2");
		  System.out.println(emp2.getEno()+"\t" +emp2.getEname()+"\t"
		  +emp2.getEsal()+"\t"+ emp2.getDesignation()+"\t"+emp2.getCity()+"\t"+
		  emp2.getHouseNo());
		 
		  
		 
    }
}
