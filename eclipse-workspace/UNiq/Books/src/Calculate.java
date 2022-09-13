
public class Calculate {

	void add(int fno, int sno)
	{
		System.out.println("Addition of two numbers : " + fno +sno);
	}
	// method overloading 
	void add(int fno, int sno, int tno )
	{
		System.out.println("Additin of two Numbers :" + (fno+sno+tno));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate demo = new Calculate();
		demo.add(100,200);
		demo.add(100,200,300);
	}

	
}
