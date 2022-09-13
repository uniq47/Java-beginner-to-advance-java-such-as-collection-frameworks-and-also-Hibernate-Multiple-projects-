package array;


public class Student1 {

	int sno;
	String sname;

	public int getSno() 
	{// get the value from the object 
		return sno;
	}

	public void setSno(int sno) 
	{// setter method can set the value 
		this.sno = sno;
		
	}

	public String getSname()
	{
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public Student1(int sno,String sname)
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 stu = new Student1(1,"shanti");
		stu.setSno(47);
		stu.setSname("Uniq");
		stu.setSno(21);
		String aayamName;
		stu.setSname("Aayam");
	}

}
