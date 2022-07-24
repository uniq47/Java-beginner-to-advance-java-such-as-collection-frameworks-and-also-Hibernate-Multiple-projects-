package day9;

import java.util.Scanner;

public class PrimeNumberEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//we are finding prime numbeers with in the limit
		//the for loop iterates from i = 2 to i <=100
		int i, count;
		// System.out.println("Enter A value");
		// Scanner sc = new Scanner(System.in);

		for (int j = 2; j < 100; j++) {
			count = 0;
			for (i = 1; i <= j; ++i) {
				if (j % i == 0) {
					count++;
				}
			}
			if(count==2)
				System.out.print(j+" ");
		}
	}

}
