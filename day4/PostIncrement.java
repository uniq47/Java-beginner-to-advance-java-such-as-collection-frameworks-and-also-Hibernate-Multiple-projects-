package day4;

public class PostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = x++;
		System.out.println(x);// 11
		System.out.println(y); //10
		
		//pre increment
		
		int a = 10;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		//post decrement
		
		int c = 100;
		int d= c--;
		System.out.println(c);
		System.out.println(d);
		
		//pre decrement 
		int e = 100;
		int f = --e;
		System.out.println(e);
		System.out.println(f);
		}

}
