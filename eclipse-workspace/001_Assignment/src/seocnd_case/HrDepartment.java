package seocnd_case;

public class HrDepartment extends Employee {

	@Override
	public double CalcualteSalary(String dname) {
		if(dname.equals("HR"))
		{
			System.out.println("your the hr");
		}
		
		return 4500;
		
	}

}
