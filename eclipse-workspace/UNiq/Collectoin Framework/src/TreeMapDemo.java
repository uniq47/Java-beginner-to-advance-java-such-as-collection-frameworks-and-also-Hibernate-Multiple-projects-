import java.util.Comparator;
import java.util.TreeMap;
//we can do it two ways type casting and with out type casting 
/*
class MyComp6 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i2.compareTo(i1);
	}
	
	
}
*/

class MyComp6 implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
		return i2.compareTo(i1);
	}
	
}

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap <Integer, String> tm = new TreeMap<>(new MyComp6());
		tm.put(47, "uniq");
		tm.put(21, "aayam");
		tm.put(1, "Shanti");
		tm.put(100, "Upendra");
		System.out.println(tm);
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());
	}

}
 