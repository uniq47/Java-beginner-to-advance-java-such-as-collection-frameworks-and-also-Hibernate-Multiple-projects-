package day6;

import java.util.Scanner;

public class BitwiseAndLogicalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =100;
		int b = 50;
		System.out.println(a>b && ++a<b);//false // first true then check second condistion, first fasle then ends the thing. BOth has to be true to be true
		System.out.println(a);//100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a unsername");
		String uname = sc.next();
		
		System.out.println(a>b||++a>b); // first true dont check sercond , if first false check second, then true
		System.out.println(a);
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		//if(uname.equals("Admin")& pass.equal)
	}

}

//bitwise checks "/";