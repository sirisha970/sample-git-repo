package com.cg.oopsexample.inheritanceexample;

import java.util.Scanner;

public class Employee {
	
	int empId;
	String empName;
	float empSal;
	int empAge;
	
	Scanner sc = new Scanner(System.in);
	
	void readEmpDetails()
	{
		System.out.println("Enter empId");
		empId = sc.nextInt();
		System.out.println("Enter empName");
		sc.nextLine();
		empName = sc.nextLine();
		System.out.println("Enter EmpSal");
		empSal = sc.nextFloat();
		System.out.println("Enter empAge");
		empAge = sc.nextInt();
	}

	void DisplayEmpDetails(){
		System.out.println("EmpId = " + empId);
		System.out.println("EmpName = " + empName);
		System.out.println("EmpSal = " + empSal);
		System.out.println("EmpAge = "+empAge);
	}
	

}

