package com.cg.collectionsjava.sortingcollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(34242,"Rama",45067f);
		Employee emp1 = new Employee(34243,"Kavya",55567f);
		Employee emp2 = new Employee(34244,"Raj",45067f);
		ArrayList<Employee> data = new ArrayList<Employee>();
		data.add(emp);
		data.add(emp1);
		data.add(emp2);
		
		System.out.println("Elements of the arraylist");
		for(Employee e:data) {
			System.out.println(e.getEmployeeId() + "\t" + e.getEmployeeName() + "\t" + e.getEmployeeSalary());
		}
		
		//The method sort(List<T>) in the type Collections 
		//is not applicable for the arguments (ArrayList<Student>)
		Collections.sort(data);
		
		System.out.println("Elements of Employee after sort");
		for(Employee e:data) {
			System.out.println(e.getEmployeeId() + "\t" + e.getEmployeeName() + "\t" + e.getEmployeeSalary());
		}
	}

}
