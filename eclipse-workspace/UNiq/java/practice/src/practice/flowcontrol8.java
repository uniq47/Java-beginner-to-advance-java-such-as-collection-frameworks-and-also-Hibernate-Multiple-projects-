package practice;

import java.util.Scanner;

public class flowcontrol8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code".
		//R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
		//Switch Statement 
		System.out.println("Enter the colore code");
		Scanner sc = new Scanner(System.in);	
		char color = sc.next().charAt(0);
		String colorCode = Character.toString(color);
				


		//System.out.println("Blue");
	
		
		
			switch(colorCode)
			{
				case "B":
					System.out.println("Blue");
					break;
				case "G":
					System.out.println("Green");
					break;
				case "O":
					System.out.println("Orange");
					break;
				case "Y":
					System.out.println("Yellow");
					break;
				case "W":
					System.out.println("White");
					break;
				default :
					System.out.println("Invalid Code");
					
		
		}
		
		
}
	}

