package com.uniam;

import com.uniam.pojo.Student;

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
       Student std = (Student) factory.getBean("stu");
       System.out.println(std.getSno()+"\t"+ std.getSname()+"\t"+ std.getSadd());
    }
}
