package model;

public class Account {
	private String name;
	private String password;
	private int mark;
	
	public Account(){
		name = "";
		password = "";
		mark = 0;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setMark(int mark){
		this.mark = mark;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public int getMark(){
		return mark;
	}
	
	public boolean checkLogin(String name , String password){
		return (this.name == name) && (this.password == password);
	}
	

}
