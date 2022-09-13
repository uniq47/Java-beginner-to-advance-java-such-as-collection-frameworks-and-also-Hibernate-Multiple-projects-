package Forloop;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 29;
		for(int i = 2; i<=num/2;++i)
		{
			//condition for nonPrimenumber
			if (num % i==0)
			{
				boolean flag= true;
				break;
			}
		}
		
		
	}

}
