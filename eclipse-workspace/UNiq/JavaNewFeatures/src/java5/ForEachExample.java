package java5;

import java.util.ArrayList;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12,35,21,36};
		for(int i : arr)
		{
			System.out.println(i);
		}
		
		System.out.println("______________________________________");
	
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(20);
		al.add(30);
		al.add(26);
		
		for(Integer i1 : al)
		{
			System.out.println(i1);
		}
	}

}
