package DataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckLogin {
	public boolean check(int x,String str1,String str2){
		System.out.println(str2+str1+x);
		boolean boo=false;
		Connection cons=null;
		Statement state=null;
		ResultSet rs=null;
		cons=new ConnectDB().connect();
		String str3="";
		String str4="";
		if(x==2) {
			str3="select password from user where name =\""+str1+"\";";
		}
		else {
			str3="select password from manager where username =\""+str1+"\";";
		}
		try {
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
		}
		catch (SQLException e) {
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
}
