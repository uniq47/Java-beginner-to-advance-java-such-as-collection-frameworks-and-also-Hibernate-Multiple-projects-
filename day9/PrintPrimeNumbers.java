package day9;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for every number betweeen 
		int i,j,isPrime,n;
		for(i=2;i<=100;++i) {
			isPrime = 0;
			for(j=2;j<=1/2;j++)
			{
				if(i%j==0)
				{
					isPrime=1;
				break;
				}	
		}
			if(isPrime==0)
				System.out.println(i+"");
	}
	}}


