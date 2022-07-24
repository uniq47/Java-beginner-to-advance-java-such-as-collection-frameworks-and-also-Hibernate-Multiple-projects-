package day4;

public class PostAndPre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		System.out.println(x++);//10(11)
		System.out.println(++x);//12
		System.out.println(x--);//12(11)
		System.out.println(--x);////10
		
		char ch = 'a';
		ch++;
		System.out.println(ch);
		
		int m = 10;
		int n= 10;
		System.out.println(m++ + ++m);//22 (10 + 12)
		System.out.println(m++ + ++m);//21 (10 + 11)
	}

}
