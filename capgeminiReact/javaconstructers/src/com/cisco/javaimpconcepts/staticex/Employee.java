package com.cisco.javaimpconcepts.staticex;

public class Employee {
	
	private int empId;
	private String empName;
	private static String companyName =  "CapGemini";
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int empId, String empName, String companyName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
	}



	//getter and setters for accessing above private variables 
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	

}
