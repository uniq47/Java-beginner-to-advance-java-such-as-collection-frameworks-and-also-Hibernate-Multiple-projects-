package week1;

public class Stu {

	static void display(int sno, String sname)
	{
		System.out.println(sno+ "/t"+ sname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1,"uniq");
		Stu.display(2,"aayam");
		Stu s = new Stu();
		s.display(3,"shanti");
	}

}
