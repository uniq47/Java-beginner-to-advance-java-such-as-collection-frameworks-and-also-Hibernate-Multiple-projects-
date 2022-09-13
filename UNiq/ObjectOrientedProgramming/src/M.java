
public class M {

	public M()
	{
		this(10);//, 20 );
		System.out.println("M default Constructor");
	}
	// constructor overloading 
	public M(int i)//, int y)
	{
		// calling constructor from another constructor so don'y have to create multiple objects  
	//	this(); // calling constructor so don'y have to create multiple objects  
		System.out.println("paramiterized Construciotr " + i );//+y);
	}
	
	void funM(M m) // null or address  userdefined data type can be  null and address  object 
	{
		System.out.println("funM");
	}
	
	void funC()
	{
		System.out.println("FunC");
		//fun<(new M()); new M is printing new object.
		funM(this);
	}
	
	public static void main(String[] args) 
	{
		
		M m = new M();
		m.funC();
		//m.funM(new M());
	//	M m1 = new M(47,47);
		
		
		
	}
}
