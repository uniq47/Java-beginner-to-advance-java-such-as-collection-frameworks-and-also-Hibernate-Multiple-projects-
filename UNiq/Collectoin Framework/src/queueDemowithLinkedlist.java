import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueDemowithLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList();
		
		//q.add(100);
		q.offer(25);
		q.offer(50);
		q.offer(30);
		q.offer(5); 
		q.offer(25);
		System.out.println(q);
		  
	}

}