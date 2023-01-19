package javabasicsproject;

public class MainEmployee {
	
	public static void main(String[] args) {
		// Create an object for the employee class
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
			
		emp.readEmployeeDetails();
		emp.printEmployeeDetails();
		emp1.readEmployeeDetails();
		emp1.printEmployeeDetails();
		emp2.readEmployeeDetails();
		emp2.printEmployeeDetails();
		}

}
