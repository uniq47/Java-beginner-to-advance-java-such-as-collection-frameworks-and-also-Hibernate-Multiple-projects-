
public class FastTractBatchsStudent extends Student {

	@Override
	public int calculateFee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("java"))
			return 55000;
		else if(course.equals("Net"))
				return 35000;
		else 
		return 15000;
		
	}

}
