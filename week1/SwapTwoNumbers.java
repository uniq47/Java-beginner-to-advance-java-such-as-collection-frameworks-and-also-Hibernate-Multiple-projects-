package week1;

public class SwapTwoNumbers {

	int fno = 1 ;
	int sno = 2 ;
	int temp;
	
	void swap()
	{
		temp = fno;
		fno= sno;
		sno= temp;
	System.out.println(" After swapping firstnum =" + fno + "secondnum = " + sno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwapTwoNumbers s = new SwapTwoNumbers();
		s.swap();
	}

}
