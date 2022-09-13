abstract class Bank
{
	abstract int getRateOfInterest();
	void display()
	{
		System.out.println("Display");
	}
	
	public Bank()
	{
		System.out.println("abstract constructor");
	}
}

class WellsFargo extends Bank
{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
	
class BankOfAmerica extends Bank
{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}
}

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WellsFargo ba = new WellsFargo();
		System.out.println((ba.getRateOfInterest()));
		//BankOfAmerica ba1 = new BankOfAmerica();
		//System.out.println(ba.getRateOfInterest());

		
	}

}
