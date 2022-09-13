
public class Student {

	void display(int sno,String sname)
	{
		System.out.println(sno+"\t"+ sname);
	}
	
	//if num of arguments matching then checks for data type its called method overloading 
	void display(String address, double sfee )
	{
		System.out.println(address +"\t"+ sfee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		
		stu.display(20, "uniq");

	}

}
