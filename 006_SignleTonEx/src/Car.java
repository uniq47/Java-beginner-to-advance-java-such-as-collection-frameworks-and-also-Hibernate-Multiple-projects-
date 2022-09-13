

public class Car {

	
	static Car c = new Car();
	//cant create objecto f car classs as we have private constructor
	private Car()
	{
		System.out.println("Car Default Constructor");
	}
	
	public static Car getInstace()
	{
		return c;
	}
}
