import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> testString = new PriorityQueue<>();
		testString.add("u");
		testString.add("a");
		testString.add("s");
		testString.add("d");
		testString.add("h");
		testString.add("n");
		
		System.out.println(testString);
		
		
		while(!testString.isEmpty())
		{
			System.out.println(testString.poll());
		}
		
	}

}
