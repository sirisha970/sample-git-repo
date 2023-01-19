package com.cg.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsert {

	public static void main(String[] args) {
		
		try {
			// Step1 : Register the Driver
			Class.forName("org.postgresql.Driver");
			//Step 2 : Establish the connection
			Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cg2022sqlexamples", "postgres", "postgres");
			
			//Step 3 : Create Statement
			Statement stmt =conn.createStatement();
			//Step 4 : Execute the Statement
			//executeUpdate() is the method to execute DDL and DML commands using JDBC
			int result = stmt.executeUpdate("insert into employees values(234532,'Shivika','Admin',433256,45000,0,'female');");
			
			if(result !=0 ) {
				System.out.println("Data inserted successfully");
			}else {
				System.out.println("Data not inserted successfully");
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
