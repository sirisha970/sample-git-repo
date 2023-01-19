package com.cg.jdbcexample.preparedstatementexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertInDBUsingPreparedStatement {
public static void main(String[] args) {
		
		try {
			// Step1 : Register the Driver
			Class.forName("org.postgresql.Driver");
			//Step 2 : Establish the connection
			Connection conn =DriverManager.getConnection("jdbc:postgresql://localhost:5432/cg2022sqlexamples", "postgres", "postgres");
			//Step 3 : Create Statement
			PreparedStatement pstmt = conn.prepareStatement("insert into employees values(?,?,?,?,?,?,?);");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee details...");
			System.out.println("enter emp number");
			int eno = sc.nextInt();
			pstmt.setInt(1, eno);
			System.out.println("enter emp name");
			sc.nextLine();
			String ename = sc.nextLine();
			pstmt.setString(2, ename);
			System.out.println("enter emp name");
			String ejob = sc.nextLine();
			pstmt.setString(3, ejob);
			System.out.println("enter emp mgr");
			int mgr = sc.nextInt();
			pstmt.setInt(4, mgr);
			System.out.println("enter emp sal");
			int esal = sc.nextInt();
			pstmt.setInt(5, esal);
			System.out.println("enter emp comm");
			int ecomm = sc.nextInt();
			pstmt.setInt(6, ecomm);
			System.out.println("enter emp gender");
			sc.nextLine();
			String egender = sc.nextLine();
			pstmt.setString(7, egender);
			int result = pstmt.executeUpdate();
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


}
