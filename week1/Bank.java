package week1;

public class Bank {
double openingBalance; 


void deposit()
{
	System.out.println("User is depositing 30 bucks ");
	openingBalance +=30;
	System.out.println("total balance is: " + openingBalance);
}

void whithdraw()
{
	System.out.println("User is whithdraw 20 bucks ");
	openingBalance -=20;
	System.out.println("total balance is: " + openingBalance);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// object creating of  bank  as b  to get acess to bank's blueprint or its variables 
		Bank b = new Bank();
	// calling method deposit to deposit $
		b.deposit();
		System.out.println(b.openingBalance);
		
		b.whithdraw();
		System.out.println(b.openingBalance);
	}

}
