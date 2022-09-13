package com.uniam;

import com.uniam.pojo.InstituteBean;

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
    	InstituteBean ibean = (InstituteBean)context.getBean("inst");
    	ibean.display();
    }
}
