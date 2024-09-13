package com.sample2;
//Different Package Different Classes
import com.sample1.Employee;

public class Company {  //child class

	private void companyId() {

		System.out.println("company id 999");
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empId();
		
		Company c = new Company();
		c.companyId();
	}
}

