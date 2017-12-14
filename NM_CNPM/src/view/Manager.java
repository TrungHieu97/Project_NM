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

public class Manager extends JFrame {

	private JPanel contentPane;
	
	public JPanel panelparent;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel_3;
	
	private JTable tableQuestion;
	private JTable tableStudent;
	
	private JTextField tfName;
	private JTextField tfPass;
	
	public TableValues tb;
	

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
		
		String[] columnname = {"NAME" , "MARK"};
		
		
		tb = new TableValues();
		tb.getStudent();
		
		JButton btnAddStudent = new JButton("ADD");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((tfName != null) && (tfPass != null)) {
					FunctionAccess f = new FunctionAccess();
					f.insertUser(tfName.getText(), tfPass.getText());
					DefaultTableModel df = (DefaultTableModel) tableStudent.getModel();
					df.addRow(new Object[]{tfName.getText(), "0"});
					
				}
				else {JOptionPane.showMessageDialog(null, "Name or Password is blank");}
			}
		});
		btnAddStudent.setBackground(SystemColor.inactiveCaption);
		btnAddStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddStudent.setBounds(628, 30, 128, 43);
		panel1.add(btnAddStudent);
		
		JButton btnDeleteStudent = new JButton("DELETE");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDeleteStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteStudent.setBackground(SystemColor.inactiveCaption);
		btnDeleteStudent.setBounds(628, 110, 128, 43);
		panel1.add(btnDeleteStudent);
		
		JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(15, 163, 575, 326);
		panel1.add(scrollPane1);
		
		tableStudent = new JTable(new DefaultTableModel(tb.values,columnname));
		tableStudent.setFillsViewportHeight(true);
		tableStudent.setRowSelectionAllowed(false);
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
		
		
		tableQuestion = new JTable();
		tableQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tableQuestion.setBounds(15, 16, 605, 487);
		panel2.add(tableQuestion);
		
		JButton btnAddQues = new JButton("ADD");
		btnAddQues.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddQues.setBackground(SystemColor.inactiveCaption);
		btnAddQues.setBounds(635, 28, 128, 43);
		panel2.add(btnAddQues);
		
		JButton btnDeleteQues = new JButton("DELETE");
		btnDeleteQues.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteQues.setBackground(SystemColor.inactiveCaption);
		btnDeleteQues.setBounds(635, 103, 128, 43);
		panel2.add(btnDeleteQues);
		setVisible(true);
	}
	
	private Object[] loadColumnname() {
		return new Object[] {};
	}
	
	private Object[][] loadData() {
		return new Object[][] {};
	}
}
