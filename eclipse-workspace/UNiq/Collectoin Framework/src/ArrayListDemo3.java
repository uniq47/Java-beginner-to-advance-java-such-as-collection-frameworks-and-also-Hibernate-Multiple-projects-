import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(10);
		al.add(200);
		al.add(100);
		al.add(300);

		System.out.println(al);
		// we can iterate using for loop
		// we can iterate using for each
		// like this we can use iterate() listIterator();
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {

			Integer obj = iterator.next();
			System.out.println(obj);

		}

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ListIterator<Integer> lt = al.listIterator();
		while (lt.hasNext()) {
			Integer next = lt.next();
			System.out.println(next);
		}

		System.out.println("data backwards direction");
		while (lt.hasPrevious()) {
			Integer previous = lt.previous();
			System.out.println(previous);
		}

	}

}
