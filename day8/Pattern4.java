package day8;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i= 0; i <6;++i) {
			for(int j=0; j<16;++j) {
				if(i==0||j==0||i==5||j==15)
				System.out.print("#");
				else 
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}
