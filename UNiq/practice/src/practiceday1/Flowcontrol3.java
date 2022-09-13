package practiceday1;

import java.util.Scanner;

public class Flowcontrol3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a program to check if the program has received command line arguments or not.
		 If the program has not received the values then print "No Values", else print all the values
		 in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2) java Example Mumbai Bangalor
		e O/P: Mumbai,Bangalore [Note: You can use length property of an array to check its length
		If Statement 	
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("IS the Command line working ");
	//	String[] values = new String[];
		//System.out.println(values[1]);
		if (sc == null)
			System.out.println("Noting is here");
		else
			System.out.println("yes valyes and here rare the values ");
	}

}
