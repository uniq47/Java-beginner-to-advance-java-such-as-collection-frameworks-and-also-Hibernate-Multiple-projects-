package com.uniam;

import com.uniam.pojo.SpringBeam;

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
    	SpringBeam obj1 = (SpringBeam)factory.getBean("sb");
    	SpringBeam obj2 = (SpringBeam)factory.getBean("sb");
    	SpringBeam obj3 = (SpringBeam)factory.getBean("sb");
    	
    	
    	System.out.println(obj1);
    	System.out.println(obj2);
    	System.out.println(obj3);
    	
    }
}