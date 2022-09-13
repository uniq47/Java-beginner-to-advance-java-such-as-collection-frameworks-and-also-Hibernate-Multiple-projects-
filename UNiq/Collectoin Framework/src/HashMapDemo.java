 import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
 public class HashMapDemo
 {
	 public static void main(String [] args)
	 {
		 HashMap<Integer,String> hm = new HashMap<>();
		 hm.put(47, "Uniq");
		 hm.put(21, "aayam");
		 hm.put(1, "Shanti");
		 hm.put(2, "Upendra");
		 String name = hm.get(47);
		 System.out.println(hm);
		 System.out.println(name);
		 
		 
		 //capacity of hash map is 16
		 
		 
		 
		 
		 //to to get all the values 
		 
		 Collection<String> Displayvalues = hm.values();
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
	 	Set<Integer> set = hm.keySet();
	 	
	 	for(Integer keys : set ) 
	 	{
	 		System.out.println(keys+ " ");
	 	}
	 	
	 	System.out.println("===========================================================");
	 	for(Map.Entry<Integer,String> addEntries : hm.entrySet())
	 	 
	 	{
	 		
	 		System.out.println(addEntries.getKey() + "\t "+addEntries.getValue());
	 	}
	 	

		
	 
	 
	 
	 
	 
	 }
 }