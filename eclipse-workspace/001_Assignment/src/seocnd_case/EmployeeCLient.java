package seocnd_case;

public class EmployeeCLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment ec = new HrDepartment();
		ec.setEno(47);
		ec.setEname("aayam");
		ec.setDname("HR");
		double  salary = ec.CalcualteSalary(ec.getDname());
		System.out.println(ec.getEname()+"\t"+ ec.getEname()+"\t"+ec.getDname()+"\t"+salary);
		
		
		
	}

}
