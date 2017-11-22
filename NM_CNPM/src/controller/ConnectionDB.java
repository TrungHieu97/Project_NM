package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import java.sql.Connection ;

public class ConnectionDB {
	public static void getConnection() {
		final String url = "jdbc:mysql://localhost:3306/login?useSSL=false";
		final String user = "root";
		final String pass = "mysql";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pass);
			 System.out.println("success");
			 Statement state=(Statement) connect.createStatement();
			 ResultSet rs= state.executeQuery("select * from user");
			 while(rs.next()) {
				 System.out.println(rs.getString("name")+" "+rs.getString("password"));
			 }
			 
		   
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		ConnectionDB c = new ConnectionDB();
		c.getConnection();
	}
}