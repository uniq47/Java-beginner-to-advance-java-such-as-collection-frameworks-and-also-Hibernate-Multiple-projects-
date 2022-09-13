
public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SpeicalEditionBook"+ "\t"+ "Book Id" + "\t"+"Book Name"+"\t"+ "Book Type"+ "Price " );
		AnnualEdisionBook ae = new AnnualEdisionBook();
		ae.setBid(100);
		ae.setBname("Hibernate");
		ae.setBtype("ORM");
		ae.setPrice(250);
		ae.setDiscount(5);
		
		
		System.out.println(ae.getBid()+"\t"+ ae.getBname()+"\t"+ae.getBtype()+"\t"+ae.getPrice());
	
		Book b = new Book();
		b.setBid(1);
		b.setBname("Java");
		b.setBtype("ProgramminLanguage");
		b.setPrice(4700);
		System.out.println(b.getBid()+"\t"+b.getBname()+"\t"+ b.getBtype()+"\t"+ b.getPrice());

		SpecialEditionBook seb = new SpecialEditionBook();
		seb.setCds(1);
		seb.setBid(2);
		seb.setBname("The Power Of Now");
		seb.setBtype("Spritual Awakening ");
		seb.setPrice(47.47);
		System.out.println(seb.getBid()+ "\t"+ seb.getBid()+"\t"+seb.getBname()+"\t"+seb.getBtype()+"\t"+seb.getPrice());
		
		

	}
}
