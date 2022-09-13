package com.uniam;

import com.uniam.pojo.Empl;

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
    	Empl emp = (Empl)factory.getBean("emp");
    	System.out.println(emp.getEno() +"\t" +emp.getEname() +"\t" + emp.getEsal() +"\t" +emp.getDesignation() +"\t" +emp.getCity() +"\t" +emp.getHouseNo());
    
    	Empl emp1 = (Empl)factory.getBean("emp1");
    	System.out.println(emp1.getEno() +"\t" +emp1.getEname() +"\t" + emp1.getEsal() +"\t" +emp1.getDesignation() +"\t" +emp1.getCity() +"\t" +emp1.getHouseNo());
    
    	Empl emp2 = (Empl)factory.getBean("emp2");
    	System.out.println(emp2.getEno() +"\t" +emp2.getEname() +"\t" + emp2.getEsal() +"\t" +emp2.getDesignation() +"\t" +emp2.getCity() +"\t" +emp2.getHouseNo());
    
    }
}
