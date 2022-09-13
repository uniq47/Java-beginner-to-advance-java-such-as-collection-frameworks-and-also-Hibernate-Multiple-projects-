package array;

public class MultiDimensionArrayEx {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[0][2]);
		
		System.out.println();
		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.print(arr[1][2]);
		
		System.out.println();
		System.out.print(arr[2][0]);
		System.out.print(arr[2][1]);
		System.out.print(arr[2][2]);
		System.out.println();
		
		for(int i=0; i<3;++i) {
			for(int j=0; j<3; ++j)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
				

	}

}
