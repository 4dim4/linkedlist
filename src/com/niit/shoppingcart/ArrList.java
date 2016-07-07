package com.niit.shoppingcart;
import java.util.Collections;
import java.util.LinkedList;

public class ArrList {
	
	public static void main(String[] args) {
		
	LinkedList<EmployeeDetails> list=new LinkedList<EmployeeDetails>();
	list.add(new EmployeeDetails("Tim",3000));
	list.add(new EmployeeDetails("Jim",7000));
	list.add(new EmployeeDetails("Dim",1000));
	Collections.sort(list, new MySalaryComp());
	for(EmployeeDetails e:list) {
		System.out.println(e.getEmpName());
		System.out.println(e.getSalary());
		
	}
	
	 }

}
