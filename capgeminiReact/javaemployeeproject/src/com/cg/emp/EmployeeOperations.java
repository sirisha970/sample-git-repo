package com.cg.emp;

import java.util.Scanner;

public class EmployeeOperations {
	
	
	Employee[] employeeData = new Employee[30];
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	Employee p = null;
	int n = 0;
	public void storeEmployeeData() {
		
		System.out.println("Enter number of employees");
		n = sc.nextInt();
		for(int i = 0;i<n;i++) {
			p = new Employee();
		System.out.println("Enter Employee Info");
		System.out.println("Enter Employee Id");
		p.setEmployeeId(sc.nextInt());
		System.out.println("Enter Employee Name");
		sc.nextLine();
		p.setEmployeeName(sc.nextLine());
		System.out.println("Enter Employee Salary");
		p.setEmployeeSalary(sc.nextFloat());
		employeeData[i] = p;
		}
		
	}
	
	public void readEmployeeData() {
		System.out.println("Display Employee Info");
		for(int i = 0;i<n;i++) {
			System.out.println(employeeData[i].getEmployeeName());
		}

	}
	
	public void employeeOperations() {
		
		while(ch == 'y') {
			System.out.println("Enter the Choice");
			System.out.println("Add : Adding Employees");
			System.out.println("View : Viewing Employees");
			String choice = sc.next();
			switch (choice) {
			case "Add":
				storeEmployeeData();
				break;
			case "View":
				readEmployeeData();
				break;
			default:
				System.out.println("not a right choice");
				break;
			}
			System.out.println("do u want to continue y - yes or n - no");
			ch = sc.next().charAt(0);
		}
	}

}
