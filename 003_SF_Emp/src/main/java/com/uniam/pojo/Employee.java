package com.uniam.pojo;

public class Employee {

	private int eno;
	private String ename;
	private int esal;
	private String disignation;
	
	
	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Employee(int eno, String ename, int esal, String disignation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.disignation = disignation;
		
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public int getEsal() {
		return esal;
	}
	public String getDisignation() {
		return disignation;
	}
}