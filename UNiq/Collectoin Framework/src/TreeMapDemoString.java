import java.util.Comparator;
import java.util.TreeMap;

// we can do it two ways type casting and with out type casting 
/*class MyComp7 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String i1 = (String)o1;
		String i2 = (String)o2;
		return i1.compareTo(i2);
	}
	
}
*/
class MyComp7 implements Comparator<String>
{

	@Override
	public int compare(String i1, String i2) {
		// TODO Auto-generated method stub
		return i1.compareTo(i2);
	}
	
}

public class TreeMapDemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> tm = new TreeMap<>(new MyComp7());
		tm.put("Uniq", 47);
		tm.put("aayam", 21);
		tm.put("Shanti", 1);
		tm.put("Upendra", 100);
		System.out.println(tm);
		
	}

}
