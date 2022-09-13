package array;

import java.util.Scanner;

public class MultiDimensionArrayex2 {

	public static void main(String[] args) {

		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Read the data from the concolse");

		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				System.out.println("Enter the number");
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Display the array elements ");
		int count= 0;
		for (int i = 0; i < 3; ++i) {
			int sum=0;
			for (int j = 0; j < 3; ++j) {
				System.out.print(arr[i][j] + " ");
				sum+=arr[i][j];
			}
			System.out.print("= "+sum);
			count+=sum;
			System.out.println();
		}
		System.out.println("Sum of all the rows: "+ count);

	}

}
