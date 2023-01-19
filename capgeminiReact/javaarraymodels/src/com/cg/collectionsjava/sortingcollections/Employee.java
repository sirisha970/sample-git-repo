package com.cg.collectionsjava.sortingcollections;

public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
@Override
public int compareTo(Employee emp) {
	if(this.employeeSalary == emp.employeeSalary)
		return 0;
	else
		return this.employeeSalary > emp.employeeSalary ? 1 : -1;
	}
	
	

}