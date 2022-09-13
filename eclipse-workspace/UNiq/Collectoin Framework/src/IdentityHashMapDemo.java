import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashMap hm = new HashMap(); Integer i1 = new Integer(10); Integer i2 = new
		 * Integer(10); System.out.println(i1 + "\t" + i2); // keys are same dublpicate
		 * not allowed so aayam will be strored in 10 key hm.put(i1, "uniq");
		 * hm.put(i2,"aayam"); System.out.println(hm);// duplicate key not allowed
		 */
		// using identity hash map we can can two

		IdentityHashMap hm = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		// System.out.println(i1.hashCode() + "\t" + i2.hashCode()); // keys are same
		// dublpicate not allowed so aayam will be strored in 10 key
		hm.put(i1, "uniq");
		hm.put(i2, "aayam");
		System.out.println(hm);// duplicate key not allowed

	}

}
 