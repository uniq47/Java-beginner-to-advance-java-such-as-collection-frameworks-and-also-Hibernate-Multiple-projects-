package day7;

import java.util.Scanner;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter what you got");
Scanner sc = new Scanner(System.in);

int marks = sc.nextInt();
String msg= "";
if(marks>90)
	msg="A+_";
else if(marks<90 && marks>=80)
	msg="A";
else if (marks<80 && marks >=70)
	msg= "B";
else if (marks<70 && marks >=60)
	msg="C";
else 
	msg="Fail";

System.out.println(msg);


	}

}
