package com.uniam;

import com.uniam.pojo.College;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com\\uniam\\config\\spring.xml");
    	College clg = (College)context.getBean("clg");
    	clg.displayInfo();
    	
    	College clg1 = (College)context.getBean("clg");
    	
    }
}
