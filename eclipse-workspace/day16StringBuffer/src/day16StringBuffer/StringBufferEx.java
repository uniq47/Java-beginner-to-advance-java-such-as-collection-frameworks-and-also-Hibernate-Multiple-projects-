package day16StringBuffer;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// by defult the capacity is 16
		
		System.out.println(sb.length());
		
		sb.append("abcdefghijklmnop");
		//sb.append(true);
		
	System.out.println(sb.capacity());
		
		System.out.println(sb);
	System.out.println(sb.capacity());
		System.out.println(sb.length());
	System.out.println(sb.capacity());
		sb.append("qr");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(1, "uniq");
		System.out.println(sb);
		sb.delete(1, 5);
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.deleteCharAt(0));
		sb.ensureCapacity(2000);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(5,10));
		//System.out.println(sb.substring(5));
		System.out.println(sb.indexOf("gh"));
		
		
		StringBuffer sb1 = new StringBuffer(5);
		sb1.capacity();//current capacity +1 *2 
		sb1.append("abcdeghij"); 
		System.out.println(sb1.capacity());
		
				
	}
	


}
