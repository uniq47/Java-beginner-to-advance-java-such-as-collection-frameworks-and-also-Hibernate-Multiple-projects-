package array;

public class MultiDimensionArrayEx3 {

	public static void main(String[] args) {

		int arr[][] = {{2,1,2},{1,2,3}};
		
		for(int i=0;i<2;i++)
		
			{
				for(int j= 0; j<3;++j)
				{
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}

	}


