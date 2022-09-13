package com.uniam.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class College {

	private String name;
	
	@Autowired //dynamically want to inject student object//
	@Qualifier("std1")
	private Student student;

	@Required
	public void setName(String name) {
		this.name = name;
	}
	

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public Student getStudent() {
		return student;
	}
	
//	public void display()
//	{
//		System.out.println("College Name:  "+ name);
//		
//		System.out.println("Student Detauls : ");
//		System.out.println(student.getSno()+"\t" +student.getSname() +"\t" + student.getSadd());
//	}
}