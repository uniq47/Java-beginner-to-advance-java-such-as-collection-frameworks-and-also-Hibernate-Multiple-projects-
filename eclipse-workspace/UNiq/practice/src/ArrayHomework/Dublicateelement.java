package ArrayHomework;

public class Dublicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1,2,3,4,7,8,8,3};
		System.out.println("Duplicate Elements in given Array");
		
		for(int i=0; i<arr.length;++i)
		{
			for(int j = i+1; j<arr.length;++j)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	}

}