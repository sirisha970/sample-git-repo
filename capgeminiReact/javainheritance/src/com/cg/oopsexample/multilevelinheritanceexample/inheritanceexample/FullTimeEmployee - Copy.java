package com.cg.oopsexample.inheritanceexample;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
	
	int noOfWorkingDays;
	
	Scanner sc=new Scanner(System.in);
	
	void ReadNoOfWorkingDays()
	{
		System.out.println("Enter no of working days: ");
		noOfWorkingDays=sc.nextInt();
	}
	
	void DisplayNoOfWorkingDays()
	{
		System.out.println("Enter no of working days: "+noOfWorkingDays);
	}

}
