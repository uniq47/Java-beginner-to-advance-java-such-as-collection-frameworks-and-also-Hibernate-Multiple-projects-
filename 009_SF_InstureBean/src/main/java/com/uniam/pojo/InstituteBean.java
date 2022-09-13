package com.uniam.pojo;

import java.util.List;
import java.util.Set;

public class InstituteBean {

	private String name;
	private List<String> courses;
	private Set<String> faculties;
	public void setName(String name) {
		this.name = name;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}
	
	public void display()
	{
		System.out.println("Institute Name :" + name);
		System.out.println("Courses   :");
		for(String cou: courses)
		{
			System.out.println(cou);
		}
		
		System.out.println("Faculty Names :");
		faculties.stream().forEach((f) -> System.out.println(f));
	}
	
}
