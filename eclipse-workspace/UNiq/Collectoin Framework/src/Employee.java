
public class Employee implements Comparable<Employee> {

	private int eno;
	private String ename;
	private String eadd;

	public Employee(int eno, String ename, String eadd) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.eadd = eadd;
	}

	public Employee() {
		super();
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEadd() {
		return eadd;
	}

	public void setEadd(String eadd) {
		this.eadd = eadd;
	}

	@Override // if not this will only print 
	public int compareTo(Employee emp) {
		if (emp.getEno() > eno)
			return -1;
		else if (emp.getEno() < eno)
			return +1;
		return 0;
	}

}