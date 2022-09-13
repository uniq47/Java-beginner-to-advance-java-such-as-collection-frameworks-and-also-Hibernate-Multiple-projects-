package seocnd_case;

public class ItDepartMent extends Employee {

	@Override
	public double CalcualteSalary(String dname) {
		// TODO Auto-generated method stub
		if(dname.equals("IT"))
		{
			System.out.println("your the IT");
		}
		return 5000;
		
	}

}
