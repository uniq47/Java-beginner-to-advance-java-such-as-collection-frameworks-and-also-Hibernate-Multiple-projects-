package array;

public class SingleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[3];
		//display array element
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		//System.out.println(ar[3]);// Array out of bound
		
		ar[0]= 100;
		ar[1]=200;
		ar[2]= 300;
		//displaying array element
		//length: to know the length of the array
		for(int i= 0; i < ar.length;++i)
		{
			System.out.println(ar[i]);
		}
		
		
				}

}
