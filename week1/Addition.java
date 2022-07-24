package week1;

public class Addition {

	//non- static method
	void add(int x, int y )
	{
		int result = x+y;
		System.out.println(result );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a = new Addition();
		a.add(4, 6);
		
	}

}
