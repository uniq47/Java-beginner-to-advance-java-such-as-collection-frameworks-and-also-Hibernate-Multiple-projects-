import java.util.TreeSet; 
// why null is comming 

public class TreeSetDemo2 {

	public static void main(String[ ] args) {
		// TODO Auto-generated method stub

		Strudent stu  = new Strudent(100,"aayam", "usa");
		Strudent stu1 = new Strudent(47, "Uniq", "usa");
		Strudent stu2 = new Strudent(101, "Upendra", "usa");
		Strudent stu3 = new Strudent(102, "Shanti", "usa");
		Strudent stu4 = new Strudent(103, "Agni", "usa");
		
		TreeSet<Strudent>tr = new TreeSet<>();
		tr.add(stu);
		tr.add(stu1);
		tr.add(stu2);
		tr.add(stu3);
		tr.add(stu4);
		
		 
		System.out.println(tr); // java.lang.ClassCastException: class Strudent cannot be cast to class java.lang.Comparable
		
		for(Strudent s :tr)
		{
			System.out.println(s.getSno()+"\t"+ s.getSname()+ "\t"+ s.getSadd());
		}
		
		
	}

}