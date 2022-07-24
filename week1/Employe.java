package week1;

public class Employe {

	int eno;
	String ename;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employe emp = new Employe();
		
		Employe emp1 = new Employe();
		System.out.println(emp.eno+ "\t" +emp.ename); //0 null
		
		System.out.println(emp.eno+ "\t" +emp.ename); //0 null
		emp.eno= 100;
		emp.ename ="uniq";
		
		System.out.println(emp.eno+ "\t" +emp.ename); //100 uniq
		
		
		System.out.println(emp1.eno+ "\t" +emp1.ename); //100 uniq
		
		System.out.println(emp+ "\t" +emp); //object name 
		
		
	}

}
