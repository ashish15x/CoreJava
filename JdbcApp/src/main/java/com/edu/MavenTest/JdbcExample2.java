package com.edu.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcExample2 {
	public static void main(String[] args) {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection established successfully");
		
		Statement stmt=null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	   
		try {
			int status=stmt.executeUpdate("insert into employee(empid,ename,age)" + "values(104,'Edu',34)");
			if(status>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
}
