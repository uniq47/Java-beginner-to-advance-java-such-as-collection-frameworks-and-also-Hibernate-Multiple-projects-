
public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastTractBatchsStudent ft = new FastTractBatchsStudent();
		ft.setSid(47);
		ft.setName("Uniq");
		ft.setMobileNumber(98413999);
		ft.setAddress("USA");
		ft.setCourse("Java");
		int sfee= ft.calculateFee(ft.getCourse());
		System.out.println(ft.getSid()+"\t"+ft.getName() +"\t" + ft.getAddress()+"\t"+ft.getCourse()+"\t"+ sfee);
	}

}
