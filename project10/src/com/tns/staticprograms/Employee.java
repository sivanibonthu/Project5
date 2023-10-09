package com.tns.staticprograms;
//program to demonstrate static variable
public class Employee {
	//instance variable
	private String name;
	private int id;
	
	//declare static variable
	static String companyName="Tns";

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",company="+companyName + "]";
	}
	

}
