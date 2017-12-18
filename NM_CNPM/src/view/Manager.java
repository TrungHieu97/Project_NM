package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelListener;
import javax.smartcardio.Card;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sun.corba.se.spi.oa.OADefault;

import Data.TableValues;
import DataAccess.FunctionAccess;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Manager extends JFrame {

	private JPanel contentPane;
	
	public JPanel panelparent;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel_3;
	private JTable tableStudent;
	private JTable tableQuestion;
	
	private JTextField tfName;
	private JTextField tfPass;
	
	public TableValues tb;
	private JTextField tfAnsA;
	private JTextField tfQues;
	private JTextField tfAnsB;
	private JTextField tfAnsC;
	private JTextField tfAnsD;
	
	public String[] columnnameStudent = {"NAME" , "MARK"};
	public String[] columnnameQuestion = {"QUESION", "ANSWER A", "ANSWER B", "ANSWER C", "ANSWER D"};
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 786, 64);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton btnStudent = new JButton("STUDENT");
		btnStudent.setBounds(15, 5, 144, 35);
		panel_3.add(btnStudent);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelparent.removeAll();
				panelparent.add(panel1);
				panelparent.repaint();
				panelparent.revalidate();
				
			}
		});
		btnStudent.setBackground(SystemColor.inactiveCaption);
		btnStudent.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
		JButton btnQuestion = new JButton("QUESTION");
		btnQuestion.setBounds(174, 5, 164, 35);
		panel_3.add(btnQuestion);
		btnQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelparent.removeAll();
				panelparent.add(panel2);
				panelparent.repaint();
				panelparent.revalidate();
			}
		});
		btnQuestion.setBackground(SystemColor.inactiveCaption);
		btnQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		
	    panelparent = new JPanel();
		panelparent.setBounds(15, 82, 771, 519);
		contentPane.add(panelparent);
		panelparent.setLayout(new CardLayout(0, 0));
		
	     panel1 = new JPanel();
		panelparent.add(panel1, "panel1");
		panel1.setLayout(null);
		
		
		
		
		tb = new TableValues();
		tb.getStudent();
		tb.getQuesstion();
		
		// Add account student
		JButton btnAddStudent = new JButton("ADD");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = tfName.getText();
				String p = tfPass.getText();
				if(!(n.trim().equals("")) && !(p.trim().equals(""))) {
					FunctionAccess f = new FunctionAccess();
					f.insertUser(n,p);
					DefaultTableModel df = (DefaultTableModel) tableStudent.getModel();
					df.addRow(new Object[]{n, "0"});
					
				}
				else {JOptionPane.showMessageDialog(null, "Name or Password is blank");}
			}
		});
		btnAddStudent.setBackground(SystemColor.inactiveCaption);
		btnAddStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddStudent.setBounds(628, 30, 128, 43);
		panel1.add(btnAddStudent);
		
		// Delete account student
		JButton btnDeleteStudent = new JButton("DELETE");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel df = (DefaultTableModel) tableStudent.getModel();
				if(tableStudent.getSelectedRow() == -1) {
					if(tableStudent.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Table is empty");
					}
					else { JOptionPane.showMessageDialog(null, "You must select a account");}
				}
				else {
					String n = (String) df.getValueAt(tableStudent.getSelectedRow(),0);
					Float p = (Float) df.getValueAt(tableStudent.getSelectedRow(), 1);
					df.removeRow(tableStudent.getSelectedRow());
					FunctionAccess f = new FunctionAccess();
					f.deleteUser(n);
				}
			}
		});
		btnDeleteStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteStudent.setBackground(SystemColor.inactiveCaption);
		btnDeleteStudent.setBounds(628, 110, 128, 43);
		panel1.add(btnDeleteStudent);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(15, 163, 575, 326);
		panel1.add(scrollPane1);
		
		tableStudent = new JTable(new DefaultTableModel(tb.valuesStudent,columnnameStudent));
		tableStudent.setFillsViewportHeight(true);
		tableStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane1.setViewportView(tableStudent);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(15, 16, 90, 43);
		panel1.add(lblName);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfName.setBounds(123, 16, 227, 43);
		panel1.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(15, 75, 90, 43);
		panel1.add(lblPassword);
		
		tfPass = new JTextField();
		tfPass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfPass.setColumns(10);
		tfPass.setBounds(123, 75, 227, 43);
		panel1.add(tfPass);
		
	    panel2 = new JPanel();
		panelparent.add(panel2, "panel2");
		panel2.setLayout(null);
		
		JButton btnAddQues = new JButton("ADD");
		btnAddQues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String q = tfQues.getText();
				String a = tfAnsA.getText();
				String b = tfAnsB.getText();
				String c = tfAnsC.getText();
				String d = tfAnsD.getText();
				boolean check = q.trim().equals("")||a.trim().equals("")
						||b.trim().equals("")||c.trim().equals("")||d.trim().equals("");
				int count = tableQuestion.getRowCount();
				if(!check) {
					FunctionAccess f = new FunctionAccess();
					f.insertQuestion(count + 1, q, a, b, c, d);
					DefaultTableModel df = (DefaultTableModel) tableQuestion.getModel();
					df.addRow(new Object[] {q,a,b,c,d});
				}
				else { JOptionPane.showMessageDialog(null, "There is no field is blank");}
			}
		});
		btnAddQues.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddQues.setBackground(SystemColor.inactiveCaption);
		btnAddQues.setBounds(635, 28, 128, 43);
		panel2.add(btnAddQues);
		
		JButton btnDeleteQues = new JButton("DELETE");
		btnDeleteQues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel df = (DefaultTableModel) tableQuestion.getModel();
				if(tableQuestion.getSelectedRow() == -1) {
					if(tableQuestion.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Table is empty");
					}
					else { JOptionPane.showMessageDialog(null, "You must select a question");}
				}
				else {
					String q = (String) df.getValueAt(tableQuestion.getSelectedRow(), 0);
					String a = (String) df.getValueAt(tableQuestion.getSelectedRow(), 1);
					String b = (String) df.getValueAt(tableQuestion.getSelectedRow(), 2);
					String c = (String) df.getValueAt(tableQuestion.getSelectedRow(), 3);
					String d = (String) df.getValueAt(tableQuestion.getSelectedRow(), 4);
					
					df.removeRow(tableQuestion.getSelectedRow());
					FunctionAccess f = new FunctionAccess();
					f.deleteQuestion(q);
				}
				
			}
		});
		btnDeleteQues.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteQues.setBackground(SystemColor.inactiveCaption);
		btnDeleteQues.setBounds(635, 103, 128, 43);
		panel2.add(btnDeleteQues);
		
		JLabel lblQuestion = new JLabel("Question");
		lblQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblQuestion.setBounds(41, 16, 90, 43);
		panel2.add(lblQuestion);
		
		JLabel lblAnswerA = new JLabel("Answer A");
		lblAnswerA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA.setBounds(41, 75, 90, 43);
		panel2.add(lblAnswerA);
		
		JLabel lblAnswerb = new JLabel("Answer B");
		lblAnswerb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerb.setBounds(41, 134, 90, 43);
		panel2.add(lblAnswerb);
		
		JLabel lblAnswerc = new JLabel("Answer C");
		lblAnswerc.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerc.setBounds(41, 193, 90, 43);
		panel2.add(lblAnswerc);
		
		JLabel lblAnswerD = new JLabel("Answer D");
		lblAnswerD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD.setBounds(41, 244, 90, 43);
		panel2.add(lblAnswerD);
		
		tfAnsA = new JTextField();
		tfAnsA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfAnsA.setBounds(146, 79, 458, 34);
		panel2.add(tfAnsA);
		tfAnsA.setColumns(10);
		
		tfQues = new JTextField();
		tfQues.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfQues.setColumns(10);
		tfQues.setBounds(144, 20, 460, 34);
		panel2.add(tfQues);
		
		tfAnsB = new JTextField();
		tfAnsB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfAnsB.setColumns(10);
		tfAnsB.setBounds(146, 138, 458, 34);
		panel2.add(tfAnsB);
		
		tfAnsC = new JTextField();
		tfAnsC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfAnsC.setColumns(10);
		tfAnsC.setBounds(146, 197, 458, 34);
		panel2.add(tfAnsC);
		
		tfAnsD = new JTextField();
		tfAnsD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tfAnsD.setColumns(10);
		tfAnsD.setBounds(146, 248, 458, 34);
		panel2.add(tfAnsD);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 303, 748, 198);
		panel2.add(scrollPane);
		
		tableQuestion = new JTable(new DefaultTableModel(tb.valuesQuestion,columnnameQuestion));
		tableQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel df = (DefaultTableModel) tableQuestion.getModel();
				tfQues.setText((String) df.getValueAt(tableQuestion.getSelectedRow(), 0));
				tfAnsA.setText((String) df.getValueAt(tableQuestion.getSelectedRow(), 1));
				tfAnsB.setText((String) df.getValueAt(tableQuestion.getSelectedRow(), 2));
				tfAnsC.setText((String) df.getValueAt(tableQuestion.getSelectedRow(), 3));
				tfAnsD.setText((String) df.getValueAt(tableQuestion.getSelectedRow(), 4));
			}
		});
		tableQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		scrollPane.setViewportView(tableQuestion);
		setVisible(true);
		

	}
	

}
