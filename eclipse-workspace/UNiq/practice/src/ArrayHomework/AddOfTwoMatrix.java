package ArrayHomework;

public class AddOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][] = { { 1, 3, 5 }, { 3, 4, 5 } };
		int br[][] = { { 1, 3, 5 }, { 3, 4, 5 } };
// creating another matrix to strore the sum of two matrices

		int bc[][] = new int[2][3];
		// additioin and printing addition of 2 matrics

		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 3; ++j) {
				
				bc[i][j] = ar[i][j] + br[i][j];
				System.out.print(bc[i][j] + " ");
			}
			System.out.println();
		}

	}

}
