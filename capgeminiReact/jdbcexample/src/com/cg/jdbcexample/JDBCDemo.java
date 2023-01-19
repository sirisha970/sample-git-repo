package com.cg.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step1 : Register the Driver
		Class.forName("org.postgresql.Driver");
		//Step 2 : Establish the connection
		Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cg2022sqlexamples", "postgres", "postgres");
		
		//Step 3 : Create Statement
		Statement stmt =conn.createStatement();
		
		//Step 4 : Execute the Statement
		ResultSet rs = stmt.executeQuery("Select * from employees");
		
		//display the output
		System.out.println("Employees Data.....");
		System.out.println("Empid \t EmpName \t EmpSalary");
		while(rs.next()) {
			System.out.println(rs.getInt("empno") + "\t" +rs.getString("ename") + "\t" + rs.getInt("sal"));
		}
	}

}


}
