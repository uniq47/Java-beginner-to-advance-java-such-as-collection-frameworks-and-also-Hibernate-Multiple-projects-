import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
//sychnorized 
public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht = new Hashtable <Integer, String >();
		 ht.put(47, "Uniq");
		 ht.put(21, "aayam");
		 ht.put(1, "Shanti");
		 ht.put(2, "Upendra");
		 String name = ht.get(47);
		 System.out.println(ht);
		 System.out.println(name);
		 
		 Collection<String> Displayvalues = ht.values();
		 // collection we can use iterator,for loop, for each, can't use list iterator
		 for(String str : Displayvalues)
		 {
			 System.out.println(str+ " ");
		 }
	 System.out.println();
	 System.out.println("===========================================================");

	 // getting keys 
	 //so return type is set data structures
	 // set we can use iterator,for loop, for each, can't use list iterator
	 	Set<Integer> set = ht.keySet();
	 	
	 	for(Integer keys : set ) 
	 	{
	 		System.out.println(keys+ " ");
	 	}
	 	
	 	System.out.println("===========================================================");
	 	for(Map.Entry<Integer,String> addEntries : ht.entrySet())
	 	 
	 	{
	 		
	 		System.out.println(addEntries.getKey() + "\t "+addEntries.getValue());
	 	}
	 	

		
		 
	}

}
