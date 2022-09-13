import java.util.TreeSet;

public class EmployeetreeSetDemo   {

	public static void main(String[] args) {
		
		Employee emp = new Employee(47, "uniq", "Cali");
		Employee emp1 = new Employee(21, "aayam", "Cali");
		
		TreeSet<Employee> tr = new TreeSet<>();
		tr.add(emp);
		tr.add(emp1);
		
		for(Employee e : tr)
		{
			//System.out.println(e);
			System.out.println(e.getEno()+"\t"+ e.getEname()+ "\t" + e.getEadd());
		}
	}

}
