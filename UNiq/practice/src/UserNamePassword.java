import java.util.Scanner;

public class UserNamePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String uname = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		if(uname.equals("Admin") && password.equals("Aayam"))
		System.out.println("valid ");
		else 
		System.out.println("Wrong");
		
	}
	}
	

/*
 * public class UserNamePassword {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc = new Scanner(System.in); System.out.println("Enter User Name");
 * String uname = sc.next(); System.out.println("Enter PassWord"); String pass =
 * sc.next(); if (uname.equalsIgnoreCase("Admin") && pass.equals("Admin@123"))
 * System.out.println("Valid User "); else System.out.println("IN Valid User ");
 * 
 * }
 * 
 * }
 */