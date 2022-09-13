 package com.sms.pojo;

public class Student {

	int sno;
	String sname;
	String saddress;
	
	public Student(int sno, String sname, String saddress)
	{
		this.sno = sno;
		this.sname = sname;
		this.saddress= saddress;
	}
	
	
	public void display()
	{
		System.out.println(sno+"\t"+sname+"\t"+saddress);
	}
}
