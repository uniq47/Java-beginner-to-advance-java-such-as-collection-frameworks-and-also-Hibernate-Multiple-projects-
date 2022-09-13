package kukebo;

public class mobile {
	int price = 40000;
	String os = "Android";
	String colour = "black";
	 
	void info() {
		System.out.println("this is samsung mobile phone");
		System.out.println("picture quality is good");
	}
	void print() {
		System.out.println("price is " + price);
		System.out.println("software is " + os);
		System.out.println("complexation is " + colour);
		
		
	}
	
	public static void main(String[] args) {
		mobile mm = new mobile();
		mm.info();
		mm.print();
		
		System.out.println("this is Iphone");
		System.out.println("expensive");
		
		
		mobile mm1 = new mobile();
		mm1.price = 90000;
		mm1.os = " IOS ";
		mm1.colour = "white";
		mm1.print();
		
		
	}

}
