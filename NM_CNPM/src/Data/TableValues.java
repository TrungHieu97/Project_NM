package Data;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import DataAccess.FunctionAccess;

public class TableValues extends DefaultTableModel{
<<<<<<< HEAD
	Vector StudentList = new Vector();
=======
	Vector<Student> StudentList = new Vector<>();
	Vector<Question> QuestionList = new Vector<>();
>>>>>>> e00fdf6cb81f8e7b9eb6bdf24d7ac077161bd15b
	FunctionAccess f = new FunctionAccess();
	

	
	public Object[][] valuesStudent ;
	public Object[][] valuesQuestion;
	
	public void getStudent() {
		StudentList = f.getInformationOfUser();
		int n = StudentList.size();
		valuesStudent = new Object[n][2];
		for(int i = 0 ; i < n; i++) {
<<<<<<< HEAD
			Student s=(Student) StudentList.get(i);
			values[i][0] =(String) s.name;
			values[i][1] =new Float(s.mark);
=======
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
			
>>>>>>> e00fdf6cb81f8e7b9eb6bdf24d7ac077161bd15b
		}
	}

public static void main(String[] args) {
		TableValues tb = new TableValues();
		tb.getQuesstion();
		
	}

}
