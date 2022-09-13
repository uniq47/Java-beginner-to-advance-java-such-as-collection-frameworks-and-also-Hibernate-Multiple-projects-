package com.uniam;

import com.uniam.config.SpringCongfig;
import com.uniam.pojo.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCongfig.class);
        HelloWorld hello = context.getBean(HelloWorld.class);
        System.out.println(hello.getMessage());
        
        
    }
}
