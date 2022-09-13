package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.pojo.Student;

public class StudentImpl {

	Scanner sc = new Scanner(System.in);
	Student addStudent[] = new Student[3];// here instead of making student object We are making N but this case 3  objects. 

	public void addStd() {
		for (int i = 0; i < addStudent.length; ++i) {
			System.out.println("Enter the student's number");
			int sno = sc.nextInt();
			System.out.println("Enter the student's Name");
			String sname = sc.next();
			System.out.println("Enter the Student Address");
			String sadd = sc.next();
			// object creation time we are trying to initilize the value;
			Student student = new Student(sno, sname, sadd);// here we are making copies of multiple objects and storing values, and doing things with it.
			addStudent[i] = student;
			System.out.println("Student added sucessfully");
		}
	}
// the student  of object with values stored in arrays from line 10
	public Student[] vieweAllStd() { 
		
		//System.out.println(addStudent);
		return addStudent;
		
	}

}
