package com.cg.jdbcexample.preparedstatementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteUsingPreparedStmt {
	public static void main(String[] args) {
		try {
			// Step1 : Register the Driver
			Class.forName("org.postgresql.Driver");
			//Step 2 : Establish the connection
			Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cg2022sqlexamples", "postgres", "postgres");
			//Step 3 : Create Statement
			PreparedStatement pstmt = conn.prepareStatement("delete employees set where empno = ?;");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter emp number");
			int eno = sc.nextInt();
			pstmt.setInt(2, eno);
			int result =pstmt.executeDelete();
			if(result !=0 ) {
				System.out.println("Data deleted successfully");
			}else {
				System.out.println("Data not deleted successfully");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}


}
