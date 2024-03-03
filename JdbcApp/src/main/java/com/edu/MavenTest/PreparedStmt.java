package com.edu.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter name:");
			 String name=s.nextLine();
			 System.out.println("Enter id: ");
			 int id=s.nextInt();
			 stmt=con.prepareStatement("update employee set ename=? where empid=?");
			 stmt.setString(1,name);
			 stmt.setInt(2, id);
			 int status=stmt.executeUpdate();
			 if(status>0) {
					System.out.println("Record updated");
				}
				else {
					System.out.println("Record not updated");
				}
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
