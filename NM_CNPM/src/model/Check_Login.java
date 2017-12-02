package model;
import java.sql.*;
import java.util.Scanner;
public class Check_Login {
	
		public boolean check(String str1,String str2){
			boolean boo=false;
			Connection cons=null;
			Statement state=null;
			ResultSet rs=null;
			String str3="select password from user where name =\'"+str1+"\'";
			String str4="";
			final String url = "jdbc:mysql://localhost:3306/login?useSSL=false";
			final String user = "root";
			final String pass = "mysql";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cons = DriverManager.getConnection(url,user,pass);
				state=(Statement) cons.createStatement();
				rs=state.executeQuery(str3);
				while(rs.next()){
					str4=rs.getString("password");
					if(str4.equals(str2)){
						boo = true;
					}
				}
				rs.close();
				state.close();
				cons.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				try{
					if(state !=null){
						state.close();
					}}
					catch(SQLException e){
					}
				try{
					if(cons !=null){
						cons.close();
					}
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
			return boo;
		}
		public static void main(String args []){
			
			
		}
	


}
