
public class RegularBatchStudent extends Student {

	@Override
	public int calculateFee(String course) {
		if(course.equals("java"))
			return 3500;
		else if(course.equals("Net"))
				return 2500;
		else 
		return 10000;
	}
	
}
