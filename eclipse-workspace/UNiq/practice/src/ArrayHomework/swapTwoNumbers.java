package ArrayHomework;

public class swapTwoNumbers {
	
	static int[] swapTwoNumbers(int[] num) 
	{
		for(int i = 0; i < 1; ++i)
		{
			for(int j=0; j <1;++j)
			{	
				
					int temp = num[i];
					num[i]= num[j];
					num[j]=temp;
				
				
				
			}
			System.out.println();
		}
		
		
		return num;
	}
	
	static void printArray(int arr[])
	{
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,2};
		System.out.println("Before swapping 1 to 2 and vise versa")
		;
		printArray(num);
		num= swapTwoNumbers(num);
		System.out.println("Afterswapping 1 to 2 and vise versa");
		printArray(num);
		
		
	}

}
