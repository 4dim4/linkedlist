package com.niit.shoppingcart;

import java.util.Comparator;

public class MySalaryComp implements Comparator<EmployeeDetails> {
	public int compare(EmployeeDetails e1,EmployeeDetails e2) {
		if(e1.getSalary()<e2.getSalary()){
			return 1;
		}
		else {
			return -1;
		}
	}

}
