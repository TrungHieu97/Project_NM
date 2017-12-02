package model;
import java.sql.*;
import java.util.Vector;

public class Get_Question {

	public Vector Get_Data_Question(){
			Question ch;
			Vector<Question> questionList = new Vector();
			Connection cons=null;
			Statement state=null;
			ResultSet rs=null;
			String str1="select * from Question ";
			String concept;
			String Answer1;
			String Answer2;
			String Answer3;
			String Answer4;
			final String url = "jdbc:mysql://localhost:3306/login?useSSL=false";
			final String user = "root";
			final String pass = "mysql";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cons = DriverManager.getConnection(url,user,pass);
				state=(Statement) cons.createStatement();
				rs=state.executeQuery(str1);
				while(rs.next()){
					concept=rs.getString("ques");
					Answer1=rs.getString("ans1");
					Answer2=rs.getString("ans2");
					Answer3=rs.getString("ans3");
					Answer4=rs.getString("ans4");
					ch=new Question(concept,Answer1,Answer2,Answer3,Answer4);
					questionList.add(ch);
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
			return new Vector(questionList);
		}
		public static void main(String args []) {
//			Get_Question getQuestion =new Get_Question();
//			Vector questionList =new Vector();
//			questionList = getQuestion.Get_Data_Question();
//			for(int i=0 ; i < questionList.size() ; i++) {
//				Question ch =(Question) questionList.get(i);
//				System.out.println(ch.concept +"\n"+ch.Answer1 /*+" "+ ch.Answer2+" "+ch.Answer3+" "+ch.Answer4 */);
//			}
			
		}
	


}
