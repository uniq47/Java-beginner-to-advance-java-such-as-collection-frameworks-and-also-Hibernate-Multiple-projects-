package day7;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A Number");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i = num; i>=1;--i)
		{
			//fact= fact*i;
			fact*=i;
			
		}
		System.out.println(fact);
	
	}

}
