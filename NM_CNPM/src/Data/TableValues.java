package Data;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import DataAccess.FunctionAccess;

public class TableValues extends DefaultTableModel{
	Vector StudentList = new Vector();
	FunctionAccess f = new FunctionAccess();
	

	
	public Object[][] values ;
	
	public void getStudent() {
		StudentList = f.getInformationOfUser();
		int n = StudentList.size();
		values = new Object[n][2];
		for(int i = 0 ; i < n; i++) {
			Student s=(Student) StudentList.get(i);
			values[i][0] =(String) s.name;
			values[i][1] =new Float(s.mark);
		}
	}

public static void main(String[] args) {
		TableValues tb = new TableValues();
		tb.getStudent();
		
	}

}
