package com.pms.pojo;

public class Product {

	private int pid;
	private String pname;
	private int qty;
	private int price;

	public void setSno(int pid) { // seters methoid can set the value to the object
		this.pid = pid;
	}

	public void getPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void getPname(String pname) {
		this.pname = pname;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void getQty(int qty) {
		this.qty = qty;
	}

	public void setPrice(int Price) {
		this.price = price;
	}

	public void getPrice(int Price) {
		this.price = price;
	}

}
