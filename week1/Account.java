package week1;

public class Account {
 int accNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc= null; 
		// refrence variable once have null in this case acc is null so  cannot access 
		//non static variables and methodes , if we access it generates pointer exception
		System.out.println(acc.accNo);
		
	}

}
