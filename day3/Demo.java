package day3;

public class Demo {

	int funA()
	{
		return 10;
	}
	
	String funB()
	{
		return "uniq";
	}
	
	
	
	Demo funD()
	{
		return new Demo();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo();
		int res = d.funA();
		System.out.println(res);
		
		String res1 = d.funB();
		System.out.println(res1);
	}

}