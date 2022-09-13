package practiceday1;

import java.util.Scanner;

public class Flowcontrol5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Intialize a character variable in a program and
		// if the value is alphabet then print "Alphabet"
		// if it’s a number then print "Digit" and
		// for other characters print "Special Character"
		// If Statement
while (true) {
		boolean counter = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Eneer a num");
		char ch1 = sc.next().charAt(0);
		Integer a = (int) -ch1;

		if (a <= -65)
			System.out.println("Alphabet");
		else if (a < -48)
			System.out.println("Digits");
		else
			System.out.println("other");
	}
	}
}
