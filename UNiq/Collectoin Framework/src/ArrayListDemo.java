import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(1);
		al.add("Uniq"); 
		al.add(null);
		al.add(100)	;
		al.add(100)	; 
		System.out.println(al);
		//fetching data from collection ( object get(int index)) sysout
		Object obj = al.get(0);
		Integer sno =(Integer)obj; //hetegrnorous objects are allowed    
		System.out.println(obj);//trype casting 
		
		
		al.add(1,250.25); 
		System.out.println(al);
		
		// how to retrive data for loop
		System.out.println("======================================================================");
		for(int i=0;i<al.size();++i)
		{
			Object ob = al.get(i);// we can use get to gethc the data object get (int index)
			System.out.println(ob); 
		}
	 
		for(Object ob :al)
		{
			System.out.println(ob);
		}
	
		}

}
