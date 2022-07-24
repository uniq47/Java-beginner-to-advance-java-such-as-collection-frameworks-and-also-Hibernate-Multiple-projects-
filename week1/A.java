package week1;
// stackover flow error 

// Method itself its calling, have a chance generate static overflow error
public class A {

	void funA()
	{
		System.out.println("funA");
		funA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A b = new A();
     b.funA();
	}

}
