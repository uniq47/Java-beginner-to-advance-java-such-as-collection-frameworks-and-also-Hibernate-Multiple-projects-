package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gameList= new ArrayList<String>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Hockey");
		gameList.add("chess");
		
		
		//forLoop
		// for() 1.5
		//iterator()
		//listIterator()
		// foreach
		
		System.out.println("................Iteratig by passing lambda experession.......................");
		
		gameList.forEach(g->System.out.println(g));
		
		System.out.println("................Iteratig by passing method refrences......................");
		
		gameList.forEach(System.out::println);
		
		System.out.println("................Iteratig by passingfor each refrences......................");
		gameList.stream().forEachOrdered(g->System.out.println(g));
	}

		
}
