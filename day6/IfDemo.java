package day6;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//w.a.p based on age Major or Minor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();// read from the keyworkd and store in the varibale
		
		if(age>18)
			System.out.println("He/she is a can buy alc");
		else
			System.out.println("He/she can't buy alc");
	}

}
