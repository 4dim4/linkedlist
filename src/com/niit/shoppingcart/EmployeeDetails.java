package com.niit.shoppingcart;

public class EmployeeDetails {
	private String empName;
	private int salary;
	
	public EmployeeDetails(String empName,int salary){
		this.empName=empName;
		this.salary=salary;
	}
	public void setEmpName(String empName){
		this.empName=empName;
	}
	public void setEmpName(int salary){
		this.salary=salary;
	}
	public String getEmpName(){
		return empName;
	}
	public int getSalary(){
		return salary;
	}



}
