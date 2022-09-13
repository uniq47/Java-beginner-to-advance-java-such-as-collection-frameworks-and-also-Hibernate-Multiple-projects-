package practiceday1;

import java.util.Scanner;

public class Flowcontrol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num >0)
			System.out.println("It's positive");
		else if (num==0)
			System.out.println("Its zero");
		else
			System.out.println("its negative");
		
		
		
		
	}

}
