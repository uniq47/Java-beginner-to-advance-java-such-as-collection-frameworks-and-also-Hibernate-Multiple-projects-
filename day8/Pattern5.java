package day8;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; ++i) {
			for (int j = 0; i < 16; ++j) {
				if (i == 0 || j == 0 || i == 5 || j == 15)
				System.out.println("$");
				else
				System.out.println(" ");
			}

			System.out.println();

		}

	}

}

