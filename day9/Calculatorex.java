package day9;

import java.util.Scanner;

public class Calculatorex {

	int fno;
	int sno;
	int result = 0;
	Scanner sc= new Scanner(System.in);
	void add()
	{
		System.out.println("Enter the first Number");
		fno= sc.nextInt();
		System.out.println("Enter the second Number");
		sno= sc.nextInt();
		result= fno+sno;
		System.out.println("Addition of two numbers"+ result);
	}
	
	void subtract()
	{
		System.out.println("Enter the first Number");
		fno= sc.nextInt();
		System.out.println("Enter the second Number");
		sno= sc.nextInt();
		result= fno-sno;
		System.out.println("Substraction of two numbers"+ result);
	}
	
	void multiplicatoin()
	{
		System.out.println("Enter the first Number");
		fno= sc.nextInt();
		System.out.println("Enter the second Number");
		sno= sc.nextInt();
		result= fno*sno;
		System.out.println("Multiplicatoin of two numbers"+ result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Calculatorex c = new Calculatorex();
		
		
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
		c.add();
		break;
	
	case 2:
		c.subtract();
		break;
		
	case 3:
		c.multiplicatoin();
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

