package day6;

import java.util.Scanner;

public class evenDemo {

	void isLeap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter and find if the year is leap");
		int year = sc.nextInt();
		if(year % 4==0 && year%400==0 || year % 100!=0)
			System.out.println("This is leap");
		else
			System.out.println("This is not leap");
	}
	
	void isEven()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter and number and find if its even or odd");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("It is even");
		else 
			System.out.println("Its odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
evenDemo demo = new evenDemo();
//demo.isEven();
demo.isLeap();
	}

}
