package com.edu.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.Scanner;



public class CallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		CallableStatement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// loading the driver ino
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");
			stmt = con.prepareCall("{call myprocedure1(?,?) }");
			stmt.setInt(1, 101);
			stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			boolean status = stmt.execute();
			System.out.println(stmt.getString(2));
		} catch (Exception e) {
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
