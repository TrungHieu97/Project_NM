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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.sun.corba.se.spi.oa.OADefault;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager extends JFrame {

	private JPanel contentPane;
	private JTable tableStudent;
	
	public JPanel panelparent;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel_3;
	private JTable tableQuestion;

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
		
		String[] columnname = {"Name" , "Mark"};
		String[][] data = {};
		
		tableStudent = new JTable();
		tableStudent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tableStudent.setBounds(15, 16, 565, 464);
		panel1.add(tableStudent);
		
	    panel2 = new JPanel();
		panelparent.add(panel2, "panel2");
		panel2.setLayout(null);
		
		
		tableQuestion = new JTable();
		tableQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		tableQuestion.setBounds(15, 16, 668, 487);
		panel2.add(tableQuestion);
	}
	
	private Object[] loadColumnname() {
		return new Object[] {};
	}
	
	private Object[][] loadData() {
		return new Object[][] {};
	}
}
