package java5;

import java.util.ArrayList;

public class VaragsEx {
	
	static void  display(String ... values)
	{
		for(String s : values )
		{
			System.out.println(s);
		}
		System.out.println("... Display  Method Invoked ... ");
	}
	
	
//	static void  display1(String s, ArrayList ... values )
//	{
//		System.out.println(s);
//		for(ArrayList s1 : values )
//		{
//			System.out.println(s1);
//		}
//		System.out.println("... Display  Method Invoked ... ");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display();
		System.out.println("==================================================");
		display("yooo", "What's up from uniq", "lets have fun");
		System.out.println("==================================================");
		display("Whats the plan");
		System.out.println("==================================================");
		display("Seee yahhh"); 
		
		
	//	System.out.println("====================using array list ==============================");
	//	display1("suprise");
	//	System.out.println("==================================================");
	//	display1("suprise"); error will come so add like this 
		//display1(new ArrayList().add("uniq"));
//		ArrayList al = new ArrayList();
//		al.add("uniq");
//		al.add("aayam");
//		display1("what a easy  confusion", al);
//		
//		
	}

}