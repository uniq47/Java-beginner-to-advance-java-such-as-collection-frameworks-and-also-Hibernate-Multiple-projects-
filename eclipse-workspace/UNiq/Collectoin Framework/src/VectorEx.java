import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(120);
		v.add(30);
		v.add(5);
		
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer no= e.nextElement();
			System.out.println(no);
		}
		
	}

}
