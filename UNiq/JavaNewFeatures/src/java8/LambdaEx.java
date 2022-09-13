package java8;

interface Addition {
	public void add();
}

interface Substraction
{
	public void sub(int fno, int sno);
}

interface Division
{
	public int div(int fno, int sno);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// with labda
		Addition a = () -> {
			System.out.println("Additoin operation");
		};

		a.add();
		//lambda with arguments
		System.out.println("=====================================");
		
		
		Substraction s = (c,d)->
		{
			System.out.println(c-d);
		};
		
		s.sub(500,200);
	
		Division d = (int l, int j)->(l/j);
		System.out.println(d.div(100, 20));
		System.out.println("=====================================");
		
		Division d1= (int k , int j)->
				{
			return k/j;
				};
		System.out.println(d.div(200, 10));
	}
	

}
