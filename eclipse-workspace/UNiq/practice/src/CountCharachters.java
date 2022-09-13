
public class CountCharachters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString ="unique";
		char ch= 'i';
		int count =0;
		
		for(int i=0;i < inputString.length();++i)
		{
			if(inputString.charAt(i)==ch)
				count++;
		}
				
		System.out.println("the character ' " +ch + " 'is found: " + count + "Times");
	}

}
