package com.cg.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableUsingJDBC {
	public static void main(String[] args) {
		try {
			// Step1 : Register the Driver
			Class.forName("org.postgresql.Driver");
			//Step 2 : Establish the connection
			Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cg2022sqlexamples", "postgres", "postgres");
			
			//Step 3 : Create Statement
			Statement stmt =conn.createStatement();
			//Step 4 : Execute the Statement
			//execute() is the method to execute DDL and DML commands using JDBC
		boolean result = stmt.execute("create table book(bookid int,bookname varchar(50),bookprice float);");
		if(result ) {
			System.out.println("Table not created successfully");
		}else {
			System.out.println("Table created successfully");
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}


}
