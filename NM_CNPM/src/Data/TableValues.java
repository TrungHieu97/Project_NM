package Data;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import DataAccess.FunctionAccess;

public class TableValues extends DefaultTableModel{
	Vector<Student> StudentList = new Vector<>();
	Vector<Question> QuestionList = new Vector<>();
	FunctionAccess f = new FunctionAccess();
	

	
	public Object[][] valuesStudent ;
	public Object[][] valuesQuestion;
	
	public void getStudent() {
		StudentList = f.getInformationOfUser();
		int n = StudentList.size();
		valuesStudent = new Object[n][2];
		for(int i = 0 ; i < n; i++) {
			valuesStudent[i][0] =(String) StudentList.get(i).name;
			valuesStudent[i][1] =(Float) StudentList.get(i).mark;
		}
	}
	
	public void getQuesstion() {
		QuestionList = f.getQuestion();
		int m = QuestionList.size();
		valuesQuestion = new Object[m][5];
		for(int i = 0 ; i < m ; i ++) {
			valuesQuestion[i][0] = (String) QuestionList.get(i).ques;
			valuesQuestion[i][1] = (String) QuestionList.get(i).ans1;
			valuesQuestion[i][2] = (String) QuestionList.get(i).ans2;
			valuesQuestion[i][3] = (String) QuestionList.get(i).ans3;
			valuesQuestion[i][4] = (String) QuestionList.get(i).ans4;
			
		}
	}

public static void main(String[] args) {
		TableValues tb = new TableValues();
		tb.getQuesstion();
		
	}

}
