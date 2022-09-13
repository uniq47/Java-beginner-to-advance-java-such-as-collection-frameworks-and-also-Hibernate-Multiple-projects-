package java8;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private double sfee;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public Student(int sno, String sname, String sadd, double sfee) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.sfee = sfee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
