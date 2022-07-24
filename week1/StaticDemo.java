package week1;

public class StaticDemo {

	static int sno = 21;
	
	static void display()
	{
		System.out.println("Static Methods");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(":Directly :"+ sno);
display();

System.out.println(" Using ClassName :"+ StaticDemo.sno);
StaticDemo.display();

StaticDemo demo = new StaticDemo();
System.out.println("Using ObjectRefrence: " + demo.sno);
demo.display();

StaticDemo demo1 = null;
System.out.println("using nullRefrence:" + demo1.sno);
demo1.display();

}

}

