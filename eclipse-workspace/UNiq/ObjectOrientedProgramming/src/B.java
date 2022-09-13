
class A 
{
	public A(int i)
	{
		System.out.println("A constructor" + i);
	}
	public A()
	{
		System.out.println("A constructor with out parameter");
	}
}

public class B extends A
{
	
	public B(int s)
	{
		super(30);// when one class has perimeter then another class should have parameters
		//super(s);
		System.out.println(" B constructor " + s );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B(10);
	}

}
