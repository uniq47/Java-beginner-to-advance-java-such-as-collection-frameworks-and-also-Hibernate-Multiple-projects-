package array;

import java.util.Scanner;

public class Student {

	int sno;
	String sname;
	String address;
	String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student addStudent[] = new Student[1];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < addStudent.length; ++i) {
			System.out.println("Enter the student number");
			int sno = sc.nextInt();
			System.out.println("Enter Student name");
			String sname = sc.next();
			System.out.println("Enter Student address");
			String address = sc.next();
			System.out.println("Enter student email");
			String email = sc.next();
			
			Student st = new Student();
			st.sno = sno;
			st.sname = sname;
			st.address = address;
			st.email = email;

			addStudent[i] = st;
			System.out.println("Stuent Resistration Sucessfull");
		}
		System.out.println("Display Student Informatoin");
		for(Student std: addStudent)
		System.out.println(std.sno + "\t"+ std.sname +"\t"+ std.address+"\t"+ std.email);

	}

}