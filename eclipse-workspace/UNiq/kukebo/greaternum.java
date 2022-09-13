package kukebo;

public class greaternum {

	public static void main(String[] args) {
		greater (5, 10, 15);
		greater (10, 8, 5);
		greater (20, 22, 30);
	}
	static void greater(int x , int y , int z) {
		if (x > y && x > z) {
			System.out.println("x is greater");
		}else if (y > x && y > z) {
			System.out.println("y is greater");
		}else {
			System.out.println("z is greater");
				
			}
		}

	}


