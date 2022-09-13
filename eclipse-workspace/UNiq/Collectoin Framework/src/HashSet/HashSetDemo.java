package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("Uniq");
		hs.add("Aayam");
		hs.add("Shanti");
		hs.add("Upendra");
		System.out.println(hs);
		//display hash object
		
		// for loop
		//for()
		// iterator()--> Iterable(I) 	
		
		
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			System.out.println(name);
		}
	
	
	}

}
