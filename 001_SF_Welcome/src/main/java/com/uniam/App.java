package com.uniam;

import com.uniam.pojo.Welcome;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class App 
{
    

    	public static void main(String[] args) {
//Instatiate the container
    	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\uniam\\config\\spring.xml"));
    	//loads the config file, using get bean method create the bean class method and inject the value inside the object 
    	Welcome  hello= (Welcome)factory.getBean("sb");	
    	System.out.println(hello.getMessage());
    	
    }
}
