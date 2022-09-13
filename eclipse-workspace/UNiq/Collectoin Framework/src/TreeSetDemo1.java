import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComp1 implements Comparator<String>
{
//decending order
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		return o2.compareTo(o1);
	}
	
}
public class TreeSetDemo1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String>tr= new TreeSet<>(new MyComp1());
	
		tr.add("aayam");
		tr.add("aadim");
		tr.add("unique");
		tr.add("shanti");
		tr.add("upendra");
		tr.add("agni");
		tr.add("anima");
		tr.add("achuta");
		System.out.println(tr);
		
		
		// for loop
		// for()
		//listUterator() ----> no, list
		//elements()----> No, Vector
		
		for(String str: tr)
		{
			
			System.out.println(str);
			System.out.println("________________________");
		}
		
		Iterator<String> itr = tr.iterator();
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
		
	}

}