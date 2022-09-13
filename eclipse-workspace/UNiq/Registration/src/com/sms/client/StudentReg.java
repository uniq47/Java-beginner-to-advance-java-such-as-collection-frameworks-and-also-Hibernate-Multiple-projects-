package com.sms.client;

import java.util.Scanner;

import com.sms.dao.impl.StudentImpl;
import com.sms.pojo.Student;

public class StudentReg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StudentImpl daoImpl = new StudentImpl();// added this so we can get acess to the object that we names
		// dapImpl to call the method on main.same as a single java file. Here the
		// differnece is that we have multiple files.
		while (true)// we dont know how many times we iterating so we need while
		{
			System.out.println("*****************************************************");
			System.out.println("                     1)AddStudents                   ");
			System.out.println("                     2)View All Students              ");
			System.out.println("                     3)Exit                           ");

			System.out.println("*****************************************************");
			// StudentImpl std = new StudentImpl();
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				daoImpl.addStd();
				break;

			case 2:

				Student[] viewAllStudents = daoImpl.vieweAllStd();
				for (Student stu : viewAllStudents) {
					stu.display();
				}

			case 3:
				System.out.println("Thanks for using the app");
				System.exit(0);
				break;
			default:
				System.out.println("Choose 1 to 3 Between");
			}// end of switch

		}
	}
}
