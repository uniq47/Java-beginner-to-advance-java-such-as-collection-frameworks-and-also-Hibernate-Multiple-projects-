package practiceday1;

import java.util.Scanner;

public class Flowcontril4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Initialize two character variables in a program and display t
		//he characters in alphabetical order. Eg1) if first character
		//is s and second is e O/P: e,s Eg2) if first character is a and second is e O/P:a,e
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers1");
		char  ch1 = sc.next().charAt(0);
		System.out.println("Enter the numbers2");
		char ch2= sc.next().charAt(0);
		
		if(ch1 < ch2)
			System.out.println(ch1+"  "+ ch2 );
		else 
			System.out.println(ch2+" "+ ch1);
		
	}

}
