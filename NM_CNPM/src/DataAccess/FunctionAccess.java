package DataAccess;
import java.sql.*;
import java.util.*;

import Data.*;
public class FunctionAccess {
	public Vector getQuestion(){
		Question ch;
		Vector v=new Vector();
		Connection cons=null;
		Statement state=null;
		ResultSet rs=null;
		String str1="select * from question ";
		String ques;
		String ans1;
		String ans2;
		String ans3;
		String ans4;
		int id;
		cons=new ConnectDB().connect();
		try {
			state=(Statement) cons.createStatement();
			rs=state.executeQuery(str1);
			while(rs.next()){
				id=rs.getInt("id");
				ques=rs.getString("ques");
				ans1=rs.getString("ans1");
				ans2=rs.getString("ans2");
				ans3=rs.getString("ans3");
				ans4=rs.getString("ans4");
				ch=new Question (id,ques,ans1,ans2,ans3,ans4);
				v.add(ch);
			}
			rs.close();
			state.close();
			cons.close();
		} catch (Exception e) {
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
		return new Vector(v);
	}
	public Vector getInformationOfUser() {
		Vector v=new Vector();
		Connection cons=null;
		Statement state=null;
		ResultSet rs=null;
		cons=new ConnectDB().connect();
		String str1="select * from User;";
		String name;
		String password;
		float mark;
		try {
			state=(Statement) cons.createStatement();
			rs=state.executeQuery(str1);
			while(rs.next()) {
				name=rs.getString("name");
				password=rs.getString("password");
				mark = rs.getFloat("mark");
				v.add(new Student(name,password, mark));
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
		return new Vector(v);
	}
	public void insertQuestion(int id,String ques,String ans1,String ans2,String ans3,String ans4) {
		Connection cons=null;
		ResultSet rs=null;
		Statement state =null;
		cons=new ConnectDB().connect();
		String str1="insert into question (id,ques,ans1,ans2,ans3,ans4) values (";
		str1=str1+1+",\""+ques+"\""+",\""+ans1+"\""+",\""+ans2+"\""+",\""+ans3+"\""+",\""+ans4+"\");";
		try {
			state=(Statement) cons.createStatement();
			rs=state.executeQuery("select * from question;");
			while(rs.next()) {
				if(ques.equals(rs.getString("ques"))) {
					System.out.println("cau hoi da ton tai");
					return;
				}
			}
			state.executeUpdate(str1);
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
	}
	public void insertUser(String name,String password) {
		Connection cons=null;
		ResultSet rs=null;
		Statement state =null;
		cons=new ConnectDB().connect();
		String str1="insert into user (name,password) values (\"";
		str1=str1+name+"\",\""+password+"\");";
		try {
			state=(Statement) cons.createStatement();
			rs=state.executeQuery("select * from user;");
			while(rs.next()) {
				if(name.equals(rs.getString("name"))) {
					System.out.println("tai khoan da ton tai");
					return;
				}
			}
			state.executeUpdate(str1);
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
	}
	public void deleteQuestion(String question) {
		Connection cons=null;
		Statement state=null;
		cons=new ConnectDB().connect();
		String str1="delete from question where ques =\""+question+"\";";
		try {
			state=(Statement) cons.createStatement();
			state.executeUpdate(str1);
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
	}
	public void deleteUser(String username) {
		Connection cons=null;
		Statement state=null;
		cons=new ConnectDB().connect();
		String str1="delete from user where name=\""+username+"\";";
		try {
			state=(Statement) cons.createStatement();
			state.executeUpdate(str1);
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
	}
	public void print(int x) {
		if(x==1) {
			Vector v=new Vector();
			v=new FunctionAccess().getQuestion();
			Question ch=null;
			for(int i=0;i<v.size();i++) {
				ch=(Question)v.get(i);
				System.out.println(ch.id+","+ch.ques+","+ch.ans1+","+ch.ans2+","+ch.ans3+","+ch.ans4);
			}
		}
		else {
			Vector v=new Vector();
			v=new FunctionAccess().getInformationOfUser();
			Student u=null;
			for(int i=0;i<v.size();i++) {
				u=(Student)v.get(i);
				System.out.println(u.name+","+u.password);
			}
		}
	}
	public void updateUser(String name,float mark) {
		Connection cons=null;
		Statement state=null;
		cons=new ConnectDB().connect();
		String str1="update user set mark="+mark+"where name=\""+name+"\";";
		//System.out.println(str1);
		try {
			state=(Statement) cons.createStatement();
			state.executeUpdate(str1);
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
	}
	public float seenMark(String name) {
		float mark=0f;
		Connection cons=null;
		Statement state=null;
		ResultSet rs=null;
		cons=new ConnectDB().connect();
		String str1="select * from user where name=\""+name+"\";";
		System.out.println(str1);
		try {
			state=(Statement) cons.createStatement();
			rs=state.executeQuery(str1);
			while(rs.next()) {
				mark=rs.getFloat("mark");
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
		return mark;
	}
}
