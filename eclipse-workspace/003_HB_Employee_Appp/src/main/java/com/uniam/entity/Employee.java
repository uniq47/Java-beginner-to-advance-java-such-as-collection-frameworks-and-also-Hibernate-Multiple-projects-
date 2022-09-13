package com.uniam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
@Id
@Column(name="eno")
	private int eno;
@Column(name = "firstname")
	private String firstname;
@Column(name="lastname")
	private String lastname;
@Column(name="email")
	private String email;
	
	
	
	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	public Employee(int eno, String firstname, String lastname, String email) {
		super();
		this.eno = eno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
