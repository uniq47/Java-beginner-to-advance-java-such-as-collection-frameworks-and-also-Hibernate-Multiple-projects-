package week1;

public class Student {
// non- static variables/ instance variables 
	int snum = 100;
	String sname;

	
//non-static method/ instance method 
	void displayDetail()
	{
		System.out.println(snum +"\t"+ sname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student stu=new Student();
	System.out.println(stu.snum+ stu.sname);
	stu.sname = "uniq";
	stu.snum= 21;
	System.out.println(stu.snum+ stu.sname);
	stu.displayDetail();
	}

}
