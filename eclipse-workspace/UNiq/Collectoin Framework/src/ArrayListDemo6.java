import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomp5 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}

public class ArrayListDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("Uniq");
		al.add("Aayam");
		al.add("Shanti");
		al.add("Upendra");

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, new Mycomp5()); //sort in decending order
		System.out.println(al);
	}

}