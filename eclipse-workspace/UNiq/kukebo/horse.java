package kukebo;

	public class horse {
	int legs = 4;
	int tail = 2;
	String colour = "brown";
	
	void run() {
		System.out.println("this horse can run");
	}
	void walk () {
		System.out.println("this horse can walk");
	}
	void print () {
		System.out.println("number of legs are " + legs);
		System.out.println("number of tails are " + tail);
		System.out.println("complexion is " + colour);
	}
	public static void main(String[] args) {
		horse hh = new horse ();
		hh.run();
		hh.print();
	
		System.out.println("this is second horse");
		// I want a new horse with 1 tail and still want previous horse
		horse hh2 = new horse ();
		hh2.tail = 1;
		hh2.colour = "black";
		hh2.print();
		
		
		
		
		

	}

}
