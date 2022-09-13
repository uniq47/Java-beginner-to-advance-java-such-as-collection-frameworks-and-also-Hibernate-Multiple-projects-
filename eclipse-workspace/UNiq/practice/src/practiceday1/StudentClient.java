package practiceday1;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();
		std.setSno(1);
		std.setSName("Uniq");
		std.setSAddress("cali");
		System.out.println(std.getSno()+"\t"+ std.getSName()+"\t"+std.getSAddress());
		
	

		Student std1 = new Student();
		std.setSno(2);
		std.setSName("Aayam");
		std.setSAddress("cali");
		System.out.println(std.getSno()+"\t"+ std.getSName()+"\t"+std.getSAddress());
		

		Student std2 = new Student();
		std.setSno(3);
		std.setSName("Aadim");
		std.setSAddress("cali");
		System.out.println(std.getSno()+"\t"+ std.getSName()+"\t"+std.getSAddress());
		
		
		Student std3 = new Student();
		std.setSno(4);
		std.setSName("Anima");
		std.setSAddress("cali");
		System.out.println(std.getSno()+"\t"+ std.getSName()+"\t"+std.getSAddress());
		
		
	}

}
