import java.util.PriorityQueue;

public class PrioryQueueEx {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		
		//q.add(100);
		q.offer(25);
		q.offer(50);
		q.offer(30);
		q.offer(5); 
		q.offer(25);
		System.out.println(q);
		System.out.println(q.element());  
		System.out.println(q.peek());
		System.out.println(q);
		
	}

}
