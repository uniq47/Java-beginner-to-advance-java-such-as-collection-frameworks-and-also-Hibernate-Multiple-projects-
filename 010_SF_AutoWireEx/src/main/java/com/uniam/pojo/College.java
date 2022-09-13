package com.uniam.pojo;

public class College {

	private String name;
	
	
	private Student student; // One class object if we use another class has a relation ship 


	public void setName(String name) {
		this.name = name;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public void displayInfo()
	{
		System.out.println("College Name        : " + name);
		System.out.println("Student Information     :" );
		
		
	System.out.println(student.getSno()+"\t" +student.getSname());
	}
	
	
}
