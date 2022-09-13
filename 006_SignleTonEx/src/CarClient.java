

public class CarClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj1 = Car.getInstace();// calling singleton logic
		Car obj2 = Car.getInstace();
		Car obj3 = Car.getInstace();
		
		System.out.println(obj1);

		System.out.println(obj2);

		System.out.println(obj3);
		
	}

}
