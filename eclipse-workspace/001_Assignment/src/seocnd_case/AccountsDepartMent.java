package seocnd_case;

public class AccountsDepartMent extends Employee {

	@Override
	public double CalcualteSalary(String dname) {
	
		if(dname.equals("Accounts"))
		{
			System.out.println("your the Accounts");
		}
		return 20000;
	}

}
