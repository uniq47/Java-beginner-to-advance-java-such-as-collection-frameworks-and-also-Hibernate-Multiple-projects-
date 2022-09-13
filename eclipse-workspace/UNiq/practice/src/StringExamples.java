
public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("Uniq");
		String str1= new String("uniq");
		String str2= new String("uniq");
		System.out.println( str.equalsIgnoreCase(str1));
		System.out.println( str.equals(str2));
		
		
		System.out.println("Uniq".charAt(0));
		
		System.out.println("Uniq".toUpperCase());
		
		System.out.println("Uniq".toLowerCase());
		
		System.out.println("Uniq".replace('n','N'));
		
		System.out.println("Uniq".substring(1,2));
		
		String str4 = "welcomeBoss";
		char ch[] = str4.toCharArray();
		for(char c : ch)
			System.out.println(c);
		//Convert Array to Stirng
		String s = String.copyValueOf(ch);
		System.out.println(s);
		System.out.println("Krishna".concat("radha"));
		//Primitive Data types convert String format 
		System.out.println(String.valueOf(100));
		System.out.println("uniq".indexOf('u'));
		System.out.println("uniq".lastIndexOf('n'));
		System.out.println("uniq".lastIndexOf("ni"));
		System.out.println("uniq".length());
		
		
	}

}
