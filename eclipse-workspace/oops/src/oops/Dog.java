package oops;
public class Dog {
	
	int eyes=2;
	int leg=4;
	String color ="white";
	
	void run()
	{
		System.out.println("This is a dog");
	}
	
	void walk()
	{
		System.out.println("This is a dog walking ");
	}
	
	void print()
	{
		System.out.println("nu mber of legs are  "+  leg );
		System.out.println("nu mber of eyes are  "+  eyes );
	}
	public static void main(String[] args)
	{
		
	Dog d = new Dog ();
	d.run();
	d.print();
	
}
}