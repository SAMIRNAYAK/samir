package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;


public class Prepared_Statement {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","samirsamir");
		PreparedStatement pstmt=dbcon.prepareStatement("insert into contact values(?,?,?)");
				pstmt.setInt(1, 222);
				pstmt.setString(2, "Tom"); 
				pstmt.setDouble(3, 20000.70); 
				int updates = pstmt.executeUpdate();
				pstmt.close();
				dbcon.close();
				


	}

}
