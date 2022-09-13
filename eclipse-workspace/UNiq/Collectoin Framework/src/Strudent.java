
public class Strudent implements Comparable<Strudent> {

	private int sno;
	private String sname;
	private String sadd;

	public Strudent(int sno, String sname, String sadd) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
	}

	public Strudent() {
		super();
	}

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

	@Override
	public int compareTo(Strudent stu) {

		if (stu.getSno() > sno)
			return -1;
		else if (stu.getSno() < sno)
			return +1;
		return 0;
	}

}
