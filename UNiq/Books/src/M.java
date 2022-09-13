
 class N
 {
	 void funA()
	 {
		 System.out.println("Fun A of Class N");
	 }
	 void funB()
	 {
		 System.out.println(" finB of Class N ");
	 }
 }

public class M extends N {
	// method overriding
	void funA()
	{
		super.funA(); // super is a keyword to acess parent class method from child or sub class 
		super.funB();
		funB();
		 System.out.println("Fun A of Class M");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		M m = new M();
		m.funA();
		m.funB();
	}

}
