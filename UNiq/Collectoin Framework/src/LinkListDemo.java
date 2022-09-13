import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList li = new LinkedList();
		li.add(100);
		li.add(200);
		li.add(100);
		li.add(null);
		System.out.println(li);
		
		li.addFirst(900);
		System.out.println("After addin 900 " + li);
		li.addLast(700);
		System.out.println("After addin 700 " + li); 
		li.add(3,474747);//adding at index 3 
		System.out.println("After addin 474747 " + li); 
		Object obj = li.get(0);
		System.out.println("After gettign an object from index 0 " + obj);
		li.set(3, 527);// to modify replace at 3 with the desired object
		System.out.println("We are modifu" + li); 
		
		
		
		for(Object ob : li)
	
		{
			System.out.println(  ob);
		}
		System.out.println("There are all the objects in the list  " );
		
	}

}
