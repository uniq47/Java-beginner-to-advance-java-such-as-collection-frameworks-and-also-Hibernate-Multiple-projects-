package array;

public class MaxAndMin {

	static int max(int ar[])
	{
		int max = ar[0];// 100
		
		for(int i=0; i<ar.length;++i)
		{
			if(max<ar[i])//100<200 
			{
				max= ar[i];
			}
		}
		
		return max;
	}
	
	
	static int min(int ar[])
	{
		int min = ar[0];
		
		for(int i = 0; i<ar.length;++i)
		{
			if(min>ar[i])
			{
				min=ar[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[]= {100, 200,300,400,50 ,23,500};
		
		int maxValue= max(ar);
		System.out.println("Max Value: "+ maxValue );
		
		int minValue = min(ar);
		System.out.println("Min Value:" + minValue);
		
	}

}
