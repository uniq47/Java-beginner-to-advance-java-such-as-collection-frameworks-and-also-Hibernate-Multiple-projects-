
public class Arrayex1 {

	public static void main(String[] args) {
		//single
		
		int ar[] = new int [3];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		ar[0] = 2;
		ar[1] = 3;
		ar[2] = 4;
		
				
		// display array element 
		
		for(int i= 0;i < ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		for(int i : ar)
		{
			System.out.println(i);
		}
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

		
	}

}
