
public class Book {

	int id;
	String name,author, pubnlisher;
	int quantity;
	public Book(int id, String name, String author, String pubnlisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.pubnlisher = pubnlisher;
		this.quantity = quantity;
	}
	public Book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubnlisher() {
		return pubnlisher;
	}
	public void setPubnlisher(String pubnlisher) {
		this.pubnlisher = pubnlisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
