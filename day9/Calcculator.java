package day9;

import java.util.Scanner;

public class Calcculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true) 
{

	System.out.println("*********************************************");
	System.out.println("                          1)Add               ");
	System.out.println("                          2)Subtract          ");
	System.out.println("                          3)Multiply           ");
	System.out.println("                          4)Exit               ");
	System.out.println("*********************************************");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a choice ");
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Under cunsctructing  ");
		break;
	
	case 2:
		System.out.println("Under cunsctructing  ");
		break;
		
	case 3:
		System.out.println("Under cunsctruction");
		break;
		
	case 4:
		System.out.println("Thanks for using ");
		System.exit(0);
		break;
	default:
		System.out.println("Chose 1 to 4");
		
	
	}
}
		
		
	}
	
	

}
