
public class ReverseStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "uniq";
		String reverseString = "";
		for(int i = inputString.length()-1;i>=0;--i)
		{
			reverseString = reverseString + inputString.charAt(i);
		}
		
	
		System.out.println(reverseString);
	}
	

}
