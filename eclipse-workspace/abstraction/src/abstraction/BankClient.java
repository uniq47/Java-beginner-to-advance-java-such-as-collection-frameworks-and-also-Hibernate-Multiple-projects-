package abstraction;

abstract class Bank {
	abstract int getRateOfInterest();

	void display() {
		System.out.println("Display");
	}
}

class WellsFargo extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 5;
	}
}

class BankOFAmerica extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 10;
	}

}

public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankOFAmerica ba = new BankOFAmerica();
		System.out.println(ba.getRateOfInterest());
		ba.display();

	}

}
