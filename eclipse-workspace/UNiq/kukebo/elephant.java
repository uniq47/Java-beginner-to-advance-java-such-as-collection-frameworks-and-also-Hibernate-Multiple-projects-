package kukebo;

public class elephant {
	int legs = 4;
	int tail = 1;
	String colour = "black";
	
	void info() {
		System.out.println("this elephant can go for jungle safari");
	}
	void print() {
		System.out.println("number of legs are " + 4);
		System.out.println("number of tail are " + 1 );
		System.out.println("complexation is " + colour);
		
	}

	public static void main(String[] args) {
		elephant ee = new elephant();
		ee.info();
		ee.print();

		System.out.println("this is second elephant");
		elephant ee1 = new elephant();
		ee1.colour = "brown";
		ee1.print();
		
		System.out.println("this is third elephant");
		elephant ee2 = new elephant();
		ee2.colour ="white";
		ee2.print();
		 
		System.out.println("this is fourrth elephant");
		elephant ee3 = new elephant();
		ee3.colour = "yellow";
		ee3.print();
		
		
	}

}
