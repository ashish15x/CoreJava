package com.edu.MavenTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.FileInputStream;

public class InsertPicture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hughes", "root", "ashish26");
			 
			 stmt=con.prepareStatement("insert into profile values(?,?)");
			 stmt.setString(1,"Hughes");
			 FileInputStream fs=new FileInputStream("D:\\profile\\Hughes.png");
			 stmt.setBinaryStream(2, fs);
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
