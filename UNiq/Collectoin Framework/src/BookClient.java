import java.util.LinkedHashMap;
import java.util.Map;
// both the objects are not printing here as there is an error
public class BookClient {

	public static void main(String[] args) {

		Book bk = new Book(1, "let Us C ", "yaswant kanetkar", "BPM", 8);
		Book bk1 = new Book(2, "Data communication", "uniq", "Mc GrawHill", 10);
		LinkedHashMap<Integer,Book>lh = new LinkedHashMap<Integer, Book>();
		lh.put(1, bk);
		lh.put(1,bk1);
		
		for(Map.Entry<Integer, Book> entry : lh.entrySet())
		{
			int key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(book.getId()+ "\t"+ book.getAuthor()+ "\t"+ book.getName() + "\t" + book.getPubnlisher() + "\t"+ book.getQuantity());
		}
		
	

	}

}
