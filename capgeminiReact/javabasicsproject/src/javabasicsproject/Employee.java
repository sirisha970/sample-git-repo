package javabasicsproject;

import java.util.Scanner;
public class Employee {
    int empId;
	String empName;
	String empCity;
	float empSal;
			
	Scanner sc = new Scanner(System.in);
			
	void readEmployeeDetails(){
		System.out.println("Enter empId");
		empId = sc.nextInt();
		System.out.println("Enter empName");
		empName = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter EmpCity");
		empCity = sc.nextLine();
		System.out.println("Enter empSal");
		empSal = sc.nextFloat();
	}
	
	void printEmployeeDetails(){
		System.out.println("EmpId = " + empId);
		System.out.println("EmpName = " + empName);
		System.out.println("EmpCity = " + empCity);
		System.out.println("EmpSal = "+empSal);
	}

}
