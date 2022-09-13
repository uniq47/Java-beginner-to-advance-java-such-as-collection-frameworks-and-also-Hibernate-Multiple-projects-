package practicingPackage;

public class Ptime {
	//prime numbers
			//agenda
			//a. the number divisible by 1 and itself
			//b. 5,7,11,29
			//even and odd write a forloop for even number/odd number
			//write a logic to apply
			//case 1 as flag false
			//case 2 as flag true
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		boolean flag = false;
		for(int i=2;i<=num/2;++i) {
			if(num%i==0) 
			{
				flag= true;
				break;
			}
			
		}
		if (!flag)
		System.out.println(num + "is a prime number");
		else
		System.out.println(num + "is not a prime number");
	}

}
