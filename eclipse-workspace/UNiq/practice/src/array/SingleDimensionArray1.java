package array;

import java.util.Scanner;

public class SingleDimensionArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[3];
		// Read the data from the console and store the array

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; ++i) {
			System.out.println("Enter the number");
			ar[i] = sc.nextInt();
			// System.out.println(ar);

		}
		System.out.println("Display the array elements ");

		for (int a : ar) // same as the bottom
		// for(int a= 1;a<=ar.length;++a) // display purpose use this
		{
			System.out.println(a);
		}

	}

}