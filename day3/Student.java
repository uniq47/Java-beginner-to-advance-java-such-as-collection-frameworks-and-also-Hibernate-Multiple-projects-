package day3;

public class Student {

	int sno= 100;
	String sname= "uniq";
	String email = "uniqe@gmaiul";
	//static variable can access directly from static Methods
	//static Address address = new Address();
	//or 
	Address address = new Address();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.println("stu "+ stu.sno + " sname " + stu.sname);
		//address.city= "Banepa";
		//address.display();
		stu.address = new Address();
		stu.address.city= "Banepa";
	}

}