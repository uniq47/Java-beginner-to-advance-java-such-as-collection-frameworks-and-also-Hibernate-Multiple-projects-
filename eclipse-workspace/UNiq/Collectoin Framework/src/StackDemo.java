import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	
		Stack<String> s= new Stack<String>();
		s.push("A");
		s.push("C");
		s.push("D");
		s.push("E");
		//s.push(10);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("D"));
		
	}

}
