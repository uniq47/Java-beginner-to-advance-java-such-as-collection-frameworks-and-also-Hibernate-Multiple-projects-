import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// decending order
class MyComp2 implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}

public class ArrayListDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> al = new ArrayList<>();
	
	al.add(100);
	al.add(10);
	al.add(200);
	al.add(20);
	al.add(150);
	al.add(140);
	
	System.out.println(al);
	Collections.sort(al); // assending order
	System.out.println(al);
	Collections.sort(al,new MyComp2());
	System.out.println(al); 
	}

}
