

@FunctionalInterface
interface X
{
	void funX();// interface method by defult abstract method;
}

public class FunctionalExample{
	
	public static void main(String[] args) {
		
		X x = new X()
				{

					@Override
					public void funX() {
						// TODO Auto-generated method stub
						
					}
			
				};
				x.funX();
		
	}
}

















//public class FunctionalExample implements X {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FunctionalExample f = new FunctionalExample();
//		f.funX();
//		
//		
//	}
//
//	@Override
//	public void funX() {
//		// TODO Auto-generated method stub
//		System.out.println("funX");
//	}
//
//}
 