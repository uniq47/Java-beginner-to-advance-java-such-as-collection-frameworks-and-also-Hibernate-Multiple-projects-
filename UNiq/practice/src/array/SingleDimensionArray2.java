package array;

import java.util.Scanner;

public class SingleDimensionArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read the String related data and display
		
		String[] str = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<str.length;++i)
		{
			System.out.println("Enter the name");
			str[i]= sc.nextLine();// why we using nextLine here; // nextLine = reading and storing 

		}
		System.out.println("Display the name");
		for(String name : str)
		{
			System.out.println(name);
		}
			
	}

}
