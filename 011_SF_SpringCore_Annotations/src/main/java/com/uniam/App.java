package com.uniam;

import com.uniam.pojo.College;
import com.uniam.pojo.Student;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com\\uniam\\congif\\spring.xml");
    	College clg = (College)context.getBean("clg");
    	System.out.println(clg.getName());
    	
    	Student stu= clg.getStudent();
    	System.out.println(stu.getSno()+"\t"+ stu.getSname()+"\t" + stu.getSadd());
    }
}
