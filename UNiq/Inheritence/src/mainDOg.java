
public class mainDOg  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dog d = new Dog();
		//d.walk();
		//d.sleep();
		
		
		Dog1 d1 = new Dog1();
		d1.run();
		
		Dog dd = new Dog1();
		dd.walk();
		
		dd.sleep();
		((Dog1)dd).run();
		
		((Dog1)dd).kick();
		
	}

}
