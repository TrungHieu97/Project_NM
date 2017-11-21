package controller;

import java.sql.DriverManager;
import java.sql.SQLException;

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