package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DatabaseEntry {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.jdbc.Driver");
Connection dbcon= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","samirsamir");
Statement stmt =  dbcon.createStatement();
String s="update contact set NAME='x'" + "where Id in(1111)";
stmt.executeUpdate(s);

ResultSet rs=stmt.executeQuery("SELECT * FROM CONTACT");
while(rs.next()) {
	int id =rs.getInt("Id");
	String name=rs.getString("Name");
	Double phone=rs.getDouble("phone");
	System.out.println(id +"-" + name +"-" + phone);
	
}
rs.close();
stmt.close();
dbcon.close();
	}

}
