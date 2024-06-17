

package com.solidpincliples.singleresponsibility;

public class Employee {
	
	public void addEmployee(Employee e)
	{
		// functionality of adding an employee
	}

	public void printEmployeeDetails(Employee e)
	{
		// functionality of printing an employee detail
	}
	
	public double calculateEmployeeSalary(double  basicSalary)
	{
		// functionality of calculating an employee salary
		Double salary = basicSalary * 10;
		return salary;
		
	}
}

