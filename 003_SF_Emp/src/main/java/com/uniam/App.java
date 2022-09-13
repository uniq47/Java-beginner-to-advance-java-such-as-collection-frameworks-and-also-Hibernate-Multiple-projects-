package com.uniam;

import com.uniam.pojo.Employee;

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
    	 Employee emp = (Employee) factory.getBean("emp");
    	 System.out.println(emp.getEno()+"\t" + emp.getEname()+"\t" + emp.getEsal() +"\t" + emp.getDisignation());
    }
}
