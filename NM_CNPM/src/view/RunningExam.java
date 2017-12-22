package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xpath.internal.functions.Function;

import Data.*;
import DataAccess.*;

import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Checkbox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.SwingConstants;
import sun.tools.jar.resources.jar;
import java.lang.*;

public class RunningExam extends JFrame implements Runnable {

	public JLabel lbsec;
	public JLabel lbmin;
	public static int min=10;
	public static int sec=0;
	public static boolean checkclock=true;
	private JPanel contentPane;
	public JPanel panelparent;
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;
	public JPanel panel5;
	public JPanel panel6;
	public JPanel panel7;
	public JPanel panel8;
	public JPanel panel9;
	public JPanel panel10;
	public JPanel panel11;
	public JPanel panel12;
	
	public JLabel lblQuestion1;
	public JLabel lblQuestion2;
	public JLabel lblQuestion3;
	public JLabel lblQuestion4;
	public JLabel lblQuestion5;
	public JLabel lblQuestion6;
	public JLabel lblQuestion7;
	public JLabel lblQuestion8;
	public JLabel lblQuestion9;
	public JLabel lblQuestion10;
	public JLabel lblQuestion11;
	public JLabel lblQuestion12;
	
	public JLabel lblAnswerA1;
	public JLabel lblAnswerA2;
	public JLabel lblAnswerA3;
	public JLabel lblAnswerA4;
	public JLabel lblAnswerA5;
	public JLabel lblAnswerA6;
	public JLabel lblAnswerA7;
	public JLabel lblAnswerA8;
	public JLabel lblAnswerA9;
	public JLabel lblAnswerA10;
	public JLabel lblAnswerA11;
	public JLabel lblAnswerA12;
	
	public JLabel lblAnswerB1;
	public JLabel lblAnswerB2;
	public JLabel lblAnswerB3;
	public JLabel lblAnswerB4;
	public JLabel lblAnswerB5;
	public JLabel lblAnswerB6;
	public JLabel lblAnswerB7;
	public JLabel lblAnswerB8;
	public JLabel lblAnswerB9;
	public JLabel lblAnswerB10;
	public JLabel lblAnswerB11;
	public JLabel lblAnswerB12;
	
	public JLabel lblAnswerC1;
	public JLabel lblAnswerC2;
	public JLabel lblAnswerC3;
	public JLabel lblAnswerC4;
	public JLabel lblAnswerC5;
	public JLabel lblAnswerC6;
	public JLabel lblAnswerC7;
	public JLabel lblAnswerC8;
	public JLabel lblAnswerC9;
	public JLabel lblAnswerC10;
	public JLabel lblAnswerC11;
	public JLabel lblAnswerC12;
	
	public JLabel lblAnswerD1;
	public JLabel lblAnswerD2;
	public JLabel lblAnswerD3;
	public JLabel lblAnswerD4;
	public JLabel lblAnswerD5;
	public JLabel lblAnswerD6;
	public JLabel lblAnswerD7;
	public JLabel lblAnswerD8;
	public JLabel lblAnswerD9;
	public JLabel lblAnswerD10;
	public JLabel lblAnswerD11;
	public JLabel lblAnswerD12;
	
	
	
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup3 = new ButtonGroup();
	private final ButtonGroup buttonGroup4 = new ButtonGroup();
	private final ButtonGroup buttonGroup5 = new ButtonGroup();
	private final ButtonGroup buttonGroup6 = new ButtonGroup();
	private final ButtonGroup buttonGroup7 = new ButtonGroup();
	private final ButtonGroup buttonGroup8 = new ButtonGroup();
	private final ButtonGroup buttonGroup9 = new ButtonGroup();
	private final ButtonGroup buttonGroup10 = new ButtonGroup();
	private final ButtonGroup buttonGroup11 = new ButtonGroup();
	private final ButtonGroup buttonGroup12 = new ButtonGroup();
	
	public Checkbox checkBoxB1;
	public Checkbox checkBoxB2;
	public Checkbox checkBoxB3;
	public Checkbox checkBoxB4;
	public Checkbox checkBoxB5;
	public Checkbox checkBoxB6;
	public Checkbox checkBoxB7;
	public Checkbox checkBoxB8;
	public Checkbox checkBoxB9;
	public Checkbox checkBoxB10;
	public Checkbox checkBoxB11;
	public Checkbox checkBoxB12;
	
	
	public static int mark = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RunningExam exam = new RunningExam();
					exam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public RunningExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JPanel panelparent = new JPanel();
		panelparent.setBounds(348, 16, 565, 520);
		contentPane.add(panelparent);
		panelparent.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		
		JLabel lblPart1 = new JLabel("PART 1");
		lblPart1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart1.setBounds(118, 40, 87, 42);
		panel1.add(lblPart1);
		panelparent.add(panel1,"panel1");
		
		JLabel lblQuestion1 = new JLabel("What ???");
		lblQuestion1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion1.setBounds(25, 80, 500, 130);
		panel1.add(lblQuestion1);
		
		JCheckBox checkBoxA1 = new JCheckBox("");
		checkBoxA1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxA1);
		checkBoxA1.setBounds(117, 246, 34, 29);
		panel1.add(checkBoxA1);
		
		final JCheckBox checkBoxB1 = new JCheckBox("");
		checkBoxB1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxB1);
		checkBoxB1.setBounds(117, 313, 34, 29);
		panel1.add(checkBoxB1);
		
		final JCheckBox checkBoxC1 = new JCheckBox("");
		checkBoxC1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxC1);
		checkBoxC1.setBounds(118, 380, 33, 29);
		panel1.add(checkBoxC1);
		
		final JCheckBox checkBoxD1 = new JCheckBox("");
		checkBoxD1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxD1);
		checkBoxD1.setBounds(118, 447, 34, 29);
		panel1.add(checkBoxD1);
		
		JPanel panel2 = new JPanel();
		panelparent.add(panel2,"panel2");
		panel2.setLayout(null);
		
		JLabel lblPart2 = new JLabel("PART 2");
		lblPart2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart2.setBounds(118, 40, 87, 42);
		panel2.add(lblPart2);
		
		JLabel lblQuestion2 = new JLabel("What ???");
		lblQuestion2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion2.setBounds(25, 80, 500, 130);
		panel2.add(lblQuestion2);
		
		final JCheckBox checkBoxA2 = new JCheckBox("");
		buttonGroup2.add(checkBoxA2);
		checkBoxA2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA2.setBounds(118, 246, 29, 29);
		panel2.add(checkBoxA2);
		
		final JCheckBox checkBoxB2 = new JCheckBox("");
		buttonGroup2.add(checkBoxB2);
		checkBoxB2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB2.setBounds(118, 313, 29, 29);
		panel2.add(checkBoxB2);
		
		final JCheckBox checkBoxC2 = new JCheckBox("");
		buttonGroup2.add(checkBoxC2);
		checkBoxC2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC2.setBounds(118, 380, 29, 29);
		panel2.add(checkBoxC2);
		
		final JCheckBox checkBoxD2 = new JCheckBox("");
		buttonGroup2.add(checkBoxD2);
		checkBoxD2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD2.setBounds(118, 447, 29, 29);
		panel2.add(checkBoxD2);
		
		JPanel panel3 = new JPanel();
		panelparent.add(panel3, "panel3");
		panel3.setLayout(null);
		
		JLabel lblPart3 = new JLabel("PART 3");
		lblPart3.setBounds(118, 40, 87, 29);
		lblPart3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel3.add(lblPart3);
		
		JLabel lblQuestion3 = new JLabel("What ???");
		lblQuestion3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion3.setBounds(25, 80, 500, 130);
		panel3.add(lblQuestion3);
		
		final JCheckBox checkBoxA3 = new JCheckBox("");
		buttonGroup3.add(checkBoxA3);
		checkBoxA3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA3.setBounds(118, 239, 29, 29);
		panel3.add(checkBoxA3);
		
		final JCheckBox checkBoxB3 = new JCheckBox("");
		buttonGroup3.add(checkBoxB3);
		checkBoxB3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB3.setBounds(118, 308, 29, 29);
		panel3.add(checkBoxB3);
		
		final JCheckBox checkBoxC3 = new JCheckBox("");
		buttonGroup3.add(checkBoxC3);
		checkBoxC3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC3.setBounds(118, 377, 29, 29);
		panel3.add(checkBoxC3);
		
		final JCheckBox checkBoxD3 = new JCheckBox("");
		buttonGroup3.add(checkBoxD3);
		checkBoxD3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD3.setBounds(118, 446, 29, 29);
		panel3.add(checkBoxD3);
		
		JPanel panel4 = new JPanel();
		panelparent.add(panel4, "panel4");
		panel4.setLayout(null);
		
		JLabel lblPart4 = new JLabel("PART 4");
		lblPart4.setBounds(118, 40, 87, 29);
		lblPart4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel4.add(lblPart4);
		
		JLabel lblQuestion4 = new JLabel("What ???");
		lblQuestion4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion4.setBounds(25, 80, 500, 130);
		panel4.add(lblQuestion4);
		
		final JCheckBox checkBoxA4 = new JCheckBox("");
		buttonGroup4.add(checkBoxA4);
		checkBoxA4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA4.setBounds(118, 239, 29, 29);
		panel4.add(checkBoxA4);
		
		final JCheckBox checkBoxB4 = new JCheckBox("");
		buttonGroup4.add(checkBoxB4);
		checkBoxB4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB4.setBounds(118, 308, 29, 29);
		panel4.add(checkBoxB4);
		
		final JCheckBox checkBoxC4 = new JCheckBox("");
		buttonGroup4.add(checkBoxC4);
		checkBoxC4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC4.setBounds(118, 377, 29, 29);
		panel4.add(checkBoxC4);
		
		final JCheckBox checkBoxD4 = new JCheckBox("");
		buttonGroup4.add(checkBoxD4);
		checkBoxD4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD4.setBounds(118, 446, 29, 29);
		panel4.add(checkBoxD4);
		
		JPanel panel5 = new JPanel();
		panelparent.add(panel5, "panel5");
		panel5.setLayout(null);
		
		JLabel lblPart5 = new JLabel("PART 5");
		lblPart5.setBounds(118, 40, 87, 29);
		lblPart5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel5.add(lblPart5);
		
		JLabel lblQuestion5 = new JLabel("What ???");
		lblQuestion5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion5.setBounds(25, 80, 500, 130);
		panel5.add(lblQuestion5);
		
		final JCheckBox checkBoxA5 = new JCheckBox("");
		buttonGroup5.add(checkBoxA5);
		checkBoxA5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA5.setBounds(118, 239, 29, 29);
		panel5.add(checkBoxA5);
		
		final JCheckBox checkBoxB5 = new JCheckBox("");
		buttonGroup5.add(checkBoxB5);
		checkBoxB5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB5.setBounds(118, 308, 29, 29);
		panel5.add(checkBoxB5);
		
		final JCheckBox checkBoxC5 = new JCheckBox("");
		buttonGroup5.add(checkBoxC5);
		checkBoxC5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC5.setBounds(118, 377, 29, 29);
		panel5.add(checkBoxC5);
		
		final JCheckBox checkBoxD5 = new JCheckBox("");
		buttonGroup5.add(checkBoxD5);
		checkBoxD5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD5.setBounds(118, 446, 29, 29);
		panel5.add(checkBoxD5);
		
		JPanel panel6 = new JPanel();
		panelparent.add(panel6, "panel6");
		panel6.setLayout(null);
		
		JLabel lblPart6 = new JLabel("PART 6");
		lblPart6.setBounds(118, 40, 87, 29);
		lblPart6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel6.add(lblPart6);
		
		JLabel lblQuestion6 = new JLabel("What ???");
		lblQuestion6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion6.setBounds(25, 80, 500, 130);
		panel6.add(lblQuestion6);
		
		final JCheckBox checkBoxA6 = new JCheckBox("");
		buttonGroup6.add(checkBoxA6);
		checkBoxA6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA6.setBounds(118, 239, 29, 29);
		panel6.add(checkBoxA6);
		
		final JCheckBox checkBoxB6 = new JCheckBox("");
		buttonGroup6.add(checkBoxB6);
		checkBoxB6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB6.setBounds(118, 308, 29, 29);
		panel6.add(checkBoxB6);
		
		final JCheckBox checkBoxC6 = new JCheckBox("");
		buttonGroup6.add(checkBoxC6);
		checkBoxC6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC6.setBounds(118, 377, 29, 29);
		panel6.add(checkBoxC6);
		
		final JCheckBox checkBoxD6 = new JCheckBox("");
		buttonGroup6.add(checkBoxD6);
		checkBoxD6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD6.setBounds(118, 446, 29, 29);
		panel6.add(checkBoxD6);
		
		JPanel panel7 = new JPanel();
		panelparent.add(panel7, "panel7");
		panel7.setLayout(null);
		
		JLabel lblPart7 = new JLabel("PART 7");
		lblPart7.setBounds(118, 40, 87, 29);
		lblPart7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel7.add(lblPart7);
		
		JLabel lblQuestion7 = new JLabel("What ???");
		lblQuestion7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion7.setBounds(25, 80, 500, 130);
		panel7.add(lblQuestion7);
		
		final JCheckBox checkBoxA7 = new JCheckBox("");
		buttonGroup7.add(checkBoxA7);
		checkBoxA7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA7.setBounds(118, 239, 29, 29);
		panel7.add(checkBoxA7);
		
		final JCheckBox checkBoxB7 = new JCheckBox("");
		buttonGroup7.add(checkBoxB7);
		checkBoxB7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB7.setBounds(118, 308, 29, 29);
		panel7.add(checkBoxB7);
		
		final JCheckBox checkBoxC7 = new JCheckBox("");
		buttonGroup7.add(checkBoxC7);
		checkBoxC7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC7.setBounds(118, 377, 29, 29);
		panel7.add(checkBoxC7);
		
		final JCheckBox checkBoxD7 = new JCheckBox("");
		buttonGroup7.add(checkBoxD7);
		checkBoxD7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD7.setBounds(118, 446, 29, 29);
		panel7.add(checkBoxD7);
		
		JPanel panel8 = new JPanel();
		panelparent.add(panel8, "panel8");
		panel8.setLayout(null);
		
		JLabel lblPart8 = new JLabel("PART 8");
		lblPart8.setBounds(118, 40, 87, 29);
		lblPart8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel8.add(lblPart8);
		
		JLabel lblQuestion8 = new JLabel("What ???");
		lblQuestion8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion8.setBounds(25, 80, 500, 130);
		panel8.add(lblQuestion8);
		
		final JCheckBox checkBoxA8 = new JCheckBox("");
		buttonGroup8.add(checkBoxA8);
		checkBoxA8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA8.setBounds(118, 239, 29, 29);
		panel8.add(checkBoxA8);
		
		final JCheckBox checkBoxB8 = new JCheckBox("");
		buttonGroup8.add(checkBoxB8);
		checkBoxB8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB8.setBounds(118, 308, 29, 29);
		panel8.add(checkBoxB8);
		
		final JCheckBox checkBoxC8 = new JCheckBox("");
		buttonGroup8.add(checkBoxC8);
		checkBoxC8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC8.setBounds(118, 377, 29, 29);
		panel8.add(checkBoxC8);
		
		final JCheckBox checkBoxD8 = new JCheckBox("");
		buttonGroup8.add(checkBoxD8);
		checkBoxD8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD8.setBounds(118, 446, 29, 29);
		panel8.add(checkBoxD8);
		
		JPanel panel9 = new JPanel();
		panelparent.add(panel9, "panel9");
		panel9.setLayout(null);
		
		JLabel lblPart9 = new JLabel("PART 9");
		lblPart9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart9.setBounds(118, 40, 87, 29);
		panel9.add(lblPart9);
		
		JLabel lblQuestion9 = new JLabel("What ???");
		lblQuestion9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion9.setBounds(25, 80, 500, 130);
		panel9.add(lblQuestion9);
		
		final JCheckBox checkBoxA9 = new JCheckBox("");
		buttonGroup9.add(checkBoxA9);
		checkBoxA9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA9.setBounds(118, 239, 29, 29);
		panel9.add(checkBoxA9);
		
		final JCheckBox checkBoxB9 = new JCheckBox("");
		buttonGroup9.add(checkBoxB9);
		checkBoxB9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB9.setBounds(118, 308, 29, 29);
		panel9.add(checkBoxB9);
		
		final JCheckBox checkBoxC9 = new JCheckBox("");
		buttonGroup9.add(checkBoxC9);
		checkBoxC9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC9.setBounds(118, 377, 29, 29);
		panel9.add(checkBoxC9);
		
		final JCheckBox checkBoxD9 = new JCheckBox("");
		buttonGroup9.add(checkBoxD9);
		checkBoxD9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD9.setBounds(118, 446, 29, 29);
		panel9.add(checkBoxD9);
		
		JPanel panel10 = new JPanel();
		panelparent.add(panel10, "panel10");
		panel10.setLayout(null);
		
		JLabel lblPart10 = new JLabel("PART 10");
		lblPart10.setBounds(118, 40, 100, 29);
		lblPart10.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel10.add(lblPart10);
		
		JLabel lblQuestion10 = new JLabel("What ???");
		lblQuestion10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion10.setBounds(25, 80, 500, 130);
		panel10.add(lblQuestion10);
		
		final JCheckBox checkBoxA10 = new JCheckBox("");
		buttonGroup10.add(checkBoxA10);
		checkBoxA10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA10.setBounds(118, 239, 29, 29);
		panel10.add(checkBoxA10);
		
		final JCheckBox checkBoxB10 = new JCheckBox("");
		buttonGroup10.add(checkBoxB10);
		checkBoxB10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB10.setBounds(118, 308, 29, 29);
		panel10.add(checkBoxB10);
		
		final JCheckBox checkBoxC10 = new JCheckBox("");
		buttonGroup10.add(checkBoxC10);
		checkBoxC10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC10.setBounds(118, 377, 29, 29);
		panel10.add(checkBoxC10);
		
		final JCheckBox checkBoxD10 = new JCheckBox("");
		buttonGroup10.add(checkBoxD10);
		checkBoxD10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD10.setBounds(118, 446, 29, 29);
		panel10.add(checkBoxD10);
		
		JPanel panel11 = new JPanel();
		panelparent.add(panel11, "panel11");
		panel11.setLayout(null);
		
		JLabel lblPart11 = new JLabel("PART 11");
		lblPart11.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart11.setBounds(118, 40, 100, 29);
		panel11.add(lblPart11);
		
		JLabel lblQuestion11 = new JLabel("What ???");
		lblQuestion11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion11.setBounds(25, 80, 500, 130);
		panel11.add(lblQuestion11);
		
		final JCheckBox checkBoxA11 = new JCheckBox("");
		buttonGroup11.add(checkBoxA11);
		checkBoxA11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA11.setBounds(118, 239, 29, 29);
		panel11.add(checkBoxA11);
		
		final JCheckBox checkBoxB11 = new JCheckBox("");
		buttonGroup11.add(checkBoxB11);
		checkBoxB11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB11.setBounds(118, 308, 29, 29);
		panel11.add(checkBoxB11);
		
		final JCheckBox checkBoxC11 = new JCheckBox("");
		buttonGroup11.add(checkBoxC11);
		checkBoxC11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC11.setBounds(118, 377, 29, 29);
		panel11.add(checkBoxC11);
		
		final JCheckBox checkBoxD11 = new JCheckBox("");
		buttonGroup11.add(checkBoxD11);
		checkBoxD11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD11.setBounds(118, 446, 29, 29);
		panel11.add(checkBoxD11);
		
		JPanel panel12 = new JPanel();
		panelparent.add(panel12, "panel12");
		panel12.setLayout(null);
		
		JLabel lblPart12 = new JLabel("PART 12");
		lblPart12.setBounds(118, 40, 100, 29);
		lblPart12.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel12.add(lblPart12);
		
		JLabel lblQuestion12 = new JLabel("What ???");
		lblQuestion12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion12.setBounds(25, 80, 500, 130);
		panel12.add(lblQuestion12);
		
		final JCheckBox checkBoxA12 = new JCheckBox("");
		buttonGroup12.add(checkBoxA12);
		checkBoxA12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA12.setBounds(118, 239, 29, 29);
		panel12.add(checkBoxA12);
		
		final JCheckBox checkBoxB12 = new JCheckBox("");
		buttonGroup12.add(checkBoxB12);
		checkBoxB12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB12.setBounds(118, 308, 29, 29);
		panel12.add(checkBoxB12);
		
		final JCheckBox checkBoxC12 = new JCheckBox("");
		buttonGroup12.add(checkBoxC12);
		checkBoxC12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC12.setBounds(118, 377, 29, 29);
		panel12.add(checkBoxC12);
		
		final JCheckBox checkBoxD12 = new JCheckBox("");
		buttonGroup12.add(checkBoxD12);
		checkBoxD12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD12.setBounds(118, 446, 29, 29);
		panel12.add(checkBoxD12);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(15, 16, 318, 531);
		contentPane.add(panel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(SystemColor.info);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(48, 395, 95, 49);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.previous(panelparent);
			}
		});
		panel.setLayout(null);
		panel.add(btnBack);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setBackground(SystemColor.info);
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNext.setBounds(170, 395, 95, 49);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.next(panelparent);
			}
		});
		panel.add(btnNext);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(SystemColor.activeCaption);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel1");
				//getPanel(panelparent,panel1);
			}
		});
		btn1.setBounds(15, 16, 53, 56);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel2");
				//getPanel(panelparent,panel2);
			}
		});
		btn2.setBackground(SystemColor.activeCaption);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(91, 16, 53, 56);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel3");
				//getPanel(panelparent,panel3);
			}
		});
		btn3.setBackground(SystemColor.activeCaption);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(169, 16, 53, 56);
		panel.add(btn3);
		
		JButton bnt4 = new JButton("4");
		bnt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel4");
			}
		});
		bnt4.setBackground(SystemColor.activeCaption);
		bnt4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		bnt4.setBounds(250, 16, 53, 56);
		panel.add(bnt4);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBackground(SystemColor.info);
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(buttonGroup1.getSelection().equals(checkBoxB1.getModel())) {mark++;}
					if(buttonGroup2.getSelection().equals(checkBoxB2.getModel())) {mark++;}
					if(buttonGroup3.getSelection().equals(checkBoxB3.getModel())) {mark++;}
					if(buttonGroup4.getSelection().equals(checkBoxB4.getModel())) {mark++;}
					if(buttonGroup5.getSelection().equals(checkBoxB5.getModel())) {mark++;}
					if(buttonGroup6.getSelection().equals(checkBoxB6.getModel())) {mark++;}
					if(buttonGroup7.getSelection().equals(checkBoxB7.getModel())) {mark++;}
					if(buttonGroup8.getSelection().equals(checkBoxB8.getModel())) {mark++;}
					if(buttonGroup9.getSelection().equals(checkBoxB9.getModel())) {mark++;}
					if(buttonGroup10.getSelection().equals(checkBoxB10.getModel())) {mark++;}
					if(buttonGroup11.getSelection().equals(checkBoxB11.getModel())) {mark++;}
					if(buttonGroup12.getSelection().equals(checkBoxB12.getModel())) {mark++;}
					
					int f = JOptionPane.showConfirmDialog(null, "Really ???","Notification", JOptionPane.YES_NO_OPTION);
					if(f == JOptionPane.YES_OPTION) {
						JOptionPane.showMessageDialog(null, "Your score is :" +mark);
						setVisible(false);
					}
				}
					catch(Exception ex) {
						int d = JOptionPane.showConfirmDialog(null, "You haven't done the exam yet","Error", JOptionPane.YES_NO_OPTION);
						if(d == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(null, "Your score is :" +mark);
							setVisible(false);
						
							
						}
						else { mark = 0;}
					}
				
			}
		});
		btnSubmit.setBounds(91, 460, 131, 55);
		panel.add(btnSubmit);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel5");
			}
		});
		btn5.setBackground(SystemColor.activeCaption);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(15, 104, 53, 56);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel6");
			}
		});
		btn6.setBackground(SystemColor.activeCaption);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(91, 104, 53, 56);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel7");
			}
		});
		btn7.setBackground(SystemColor.activeCaption);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(169, 104, 53, 56);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel8");
			}
		});
		btn8.setBackground(SystemColor.activeCaption);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(250, 104, 53, 56);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel9");
			}
		});
		btn9.setBackground(SystemColor.activeCaption);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(15, 192, 53, 56);
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel10");
			}
		});
		btn10.setBackground(SystemColor.activeCaption);
		btn10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn10.setBounds(91, 192, 53, 56);
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel11");
			}
		});
		btn11.setBackground(SystemColor.activeCaption);
		btn11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn11.setBounds(169, 192, 53, 56);
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panelparent.getLayout();
				card.show(panelparent, "panel12");
			}
		});
		btn12.setBackground(SystemColor.activeCaption);
		btn12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn12.setBounds(250, 192, 53, 56);
		panel.add(btn12);
		
		JLabel lblTime = new JLabel("TIME :");
		lblTime.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTime.setBounds(35, 309, 95, 29);
		panel.add(lblTime);
		
		lbmin = new JLabel("00");
		lbmin.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lbmin.setBounds(145, 309, 29, 29);
		panel.add(lbmin);
		
		lbsec = new JLabel("00");
		lbsec.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lbsec.setBounds(216, 309, 29, 29);
		panel.add(lbsec);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(182, 309, 29, 29);
		panel.add(label_2);
		

	
		
		JLabel lblAnswerA1 = new JLabel("New label");
		lblAnswerA1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA1.setBounds(155, 246, 283, 29);
		panel1.add(lblAnswerA1);
		
		JLabel lblAnswerB1 = new JLabel("New label");
		lblAnswerB1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB1.setBounds(155, 313, 283, 29);
		panel1.add(lblAnswerB1);
		
		JLabel lblAnswerC1 = new JLabel("New label");
		lblAnswerC1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC1.setBounds(155, 380, 283, 29);
		panel1.add(lblAnswerC1);
		
		JLabel lblAnswerD1 = new JLabel("New label");
		lblAnswerD1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD1.setBounds(155, 447, 283, 29);
		panel1.add(lblAnswerD1);
		
		JLabel lblAnswerA2 = new JLabel("New label");
		lblAnswerA2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA2.setBounds(158, 246, 283, 29);
		panel2.add(lblAnswerA2);
		
		JLabel lblAnswerB2 = new JLabel("New label");
		lblAnswerB2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB2.setBounds(158, 313, 283, 29);
		panel2.add(lblAnswerB2);
		
		JLabel lblAnswerC2 = new JLabel("New label");
		lblAnswerC2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC2.setBounds(158, 380, 283, 29);
		panel2.add(lblAnswerC2);
		
		JLabel lblAnswerD2 = new JLabel("New label");
		lblAnswerD2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD2.setBounds(158, 447, 283, 29);
		panel2.add(lblAnswerD2);
		
		JLabel lblAnswerA3 = new JLabel("New label");
		lblAnswerA3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA3.setBounds(158, 239, 283, 29);
		panel3.add(lblAnswerA3);
		
		JLabel lblAnswerB3 = new JLabel("New label");
		lblAnswerB3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB3.setBounds(158, 308, 283, 29);
		panel3.add(lblAnswerB3);
		
		JLabel lblAnswerC3 = new JLabel("New label");
		lblAnswerC3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC3.setBounds(158, 377, 283, 29);
		panel3.add(lblAnswerC3);
		
		JLabel lblAnswerD3 = new JLabel("New label");
		lblAnswerD3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD3.setBounds(158, 446, 283, 29);
		panel3.add(lblAnswerD3);
		
		JLabel lblAnswerA4 = new JLabel("New label");
		lblAnswerA4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA4.setBounds(158, 239, 283, 29);
		panel4.add(lblAnswerA4);
		
		JLabel lblAnswerB4 = new JLabel("New label");
		lblAnswerB4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB4.setBounds(158, 308, 283, 29);
		panel4.add(lblAnswerB4);
		
		JLabel lblAnswerC4 = new JLabel("New label");
		lblAnswerC4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC4.setBounds(158, 377, 283, 29);
		panel4.add(lblAnswerC4);
		
		JLabel lblAnswerD4 = new JLabel("New label");
		lblAnswerD4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD4.setBounds(158, 446, 283, 29);
		panel4.add(lblAnswerD4);
		
		JLabel lblAnswerA5 = new JLabel("New label");
		lblAnswerA5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA5.setBounds(158, 239, 283, 29);
		panel5.add(lblAnswerA5);
		
		JLabel lblAnswerB5 = new JLabel("New label");
		lblAnswerB5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB5.setBounds(158, 308, 283, 29);
		panel5.add(lblAnswerB5);
		
		JLabel lblAnswerC5 = new JLabel("New label");
		lblAnswerC5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC5.setBounds(158, 377, 283, 29);
		panel5.add(lblAnswerC5);
		
		JLabel lblAnswerD5 = new JLabel("New label");
		lblAnswerD5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD5.setBounds(158, 446, 283, 29);
		panel5.add(lblAnswerD5);
		
		JLabel lblAnswerA6 = new JLabel("New label");
		lblAnswerA6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA6.setBounds(158, 239, 283, 29);
		panel6.add(lblAnswerA6);
		
		JLabel lblAnswerB6 = new JLabel("New label");
		lblAnswerB6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB6.setBounds(158, 308, 283, 29);
		panel6.add(lblAnswerB6);
		
		JLabel lblAnswerC6 = new JLabel("New label");
		lblAnswerC6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC6.setBounds(158, 377, 283, 29);
		panel6.add(lblAnswerC6);
		
		JLabel lblAnswerD6 = new JLabel("New label");
		lblAnswerD6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD6.setBounds(158, 446, 283, 29);
		panel6.add(lblAnswerD6);
		
		JLabel lblAnswerA7 = new JLabel("New label");
		lblAnswerA7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA7.setBounds(158, 239, 283, 29);
		panel7.add(lblAnswerA7);
		
		JLabel lblAnswerB7 = new JLabel("New label");
		lblAnswerB7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB7.setBounds(158, 308, 283, 29);
		panel7.add(lblAnswerB7);
		
		JLabel lblAnswerC7 = new JLabel("New label");
		lblAnswerC7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC7.setBounds(158, 377, 283, 29);
		panel7.add(lblAnswerC7);
		
		JLabel lblAnswerD7 = new JLabel("New label");
		lblAnswerD7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD7.setBounds(158, 446, 283, 29);
		panel7.add(lblAnswerD7);
		
		JLabel lblAnswerA8 = new JLabel("New label");
		lblAnswerA8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA8.setBounds(158, 239, 283, 29);
		panel8.add(lblAnswerA8);
		
		JLabel lblAnswerB8 = new JLabel("New label");
		lblAnswerB8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB8.setBounds(158, 308, 283, 29);
		panel8.add(lblAnswerB8);
		
		JLabel lblAnswerC8 = new JLabel("New label");
		lblAnswerC8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC8.setBounds(158, 377, 283, 29);
		panel8.add(lblAnswerC8);
		
		JLabel lblAnswerD8 = new JLabel("New label");
		lblAnswerD8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD8.setBounds(158, 446, 283, 29);
		panel8.add(lblAnswerD8);
		
		JLabel lblAnswerA9 = new JLabel("New label");
		lblAnswerA9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA9.setBounds(158, 239, 283, 29);
		panel9.add(lblAnswerA9);
		
		JLabel lblAnswerB9 = new JLabel("New label");
		lblAnswerB9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB9.setBounds(158, 308, 283, 29);
		panel9.add(lblAnswerB9);
		
		JLabel lblAnswerC9 = new JLabel("New label");
		lblAnswerC9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC9.setBounds(158, 377, 283, 29);
		panel9.add(lblAnswerC9);
		
		JLabel lblAnswerD9 = new JLabel("New label");
		lblAnswerD9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD9.setBounds(158, 446, 283, 29);
		panel9.add(lblAnswerD9);
		
		JLabel lblAnswerA10 = new JLabel("New label");
		lblAnswerA10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA10.setBounds(158, 239, 283, 29);
		panel10.add(lblAnswerA10);
		
		JLabel lblAnswerB10 = new JLabel("New label");
		lblAnswerB10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB10.setBounds(158, 308, 283, 29);
		panel10.add(lblAnswerB10);
		
		JLabel lblAnswerC10 = new JLabel("New label");
		lblAnswerC10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC10.setBounds(158, 377, 283, 29);
		panel10.add(lblAnswerC10);
		
		JLabel lblAnswerD10 = new JLabel("New label");
		lblAnswerD10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD10.setBounds(158, 446, 283, 29);
		panel10.add(lblAnswerD10);
		
		
		JLabel lblAnswerA11 = new JLabel("New label");
		lblAnswerA11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA11.setBounds(158, 239, 283, 29);
		panel11.add(lblAnswerA11);
		
		JLabel lblAnswerB11 = new JLabel("New label");
		lblAnswerB11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB11.setBounds(158, 308, 283, 29);
		panel11.add(lblAnswerB11);
		
		JLabel lblAnswerC11 = new JLabel("New label");
		lblAnswerC11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC11.setBounds(158, 377, 283, 29);
		panel11.add(lblAnswerC11);
		
		JLabel lblAnswerD11 = new JLabel("New label");
		lblAnswerD11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD11.setBounds(158, 446, 283, 29);
		panel11.add(lblAnswerD11);
		
		JLabel lblAnswerA12 = new JLabel("New label");
		lblAnswerA12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerA12.setBounds(158, 239, 283, 29);
		panel12.add(lblAnswerA12);
		
		JLabel lblAnswerB12 = new JLabel("New label");
		lblAnswerB12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerB12.setBounds(158, 308, 283, 29);
		panel12.add(lblAnswerB12);
		
		JLabel lblAnswerC12 = new JLabel("New label");
		lblAnswerC12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerC12.setBounds(158, 377, 283, 29);
		panel12.add(lblAnswerC12);
		
		JLabel lblAnswerD12 = new JLabel("New label");
		lblAnswerD12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblAnswerD12.setBounds(158, 446, 283, 29);
		panel12.add(lblAnswerD12);
		
		
		// Vector of answer, vector of question
		Vector questionList =new Vector();
		Vector answerAList = new Vector();
		Vector answerBList = new Vector();
		Vector answerCList = new Vector();
		Vector answerDList = new Vector();

		Vector lblListQuestion = new Vector();
		lblListQuestion.addElement(lblQuestion1);
		lblListQuestion.addElement(lblQuestion2);
		lblListQuestion.addElement(lblQuestion3);
		lblListQuestion.addElement(lblQuestion4);
		lblListQuestion.addElement(lblQuestion5);
		lblListQuestion.addElement(lblQuestion6);
		lblListQuestion.addElement(lblQuestion7);
		lblListQuestion.addElement(lblQuestion8);
		lblListQuestion.addElement(lblQuestion9);
		lblListQuestion.addElement(lblQuestion10);
		lblListQuestion.addElement(lblQuestion11);
		lblListQuestion.addElement(lblQuestion12);
		
		answerAList.addElement(lblAnswerA1);
		answerAList.addElement(lblAnswerA2);
		answerAList.addElement(lblAnswerA3);
		answerAList.addElement(lblAnswerA4);
		answerAList.addElement(lblAnswerA5);
		answerAList.addElement(lblAnswerA6);
		answerAList.addElement(lblAnswerA7);
		answerAList.addElement(lblAnswerA8);
		answerAList.addElement(lblAnswerA9);
		answerAList.addElement(lblAnswerA10);
		answerAList.addElement(lblAnswerA11);
		answerAList.addElement(lblAnswerA12);
		
		
		answerBList.addElement(lblAnswerB1);
		answerBList.addElement(lblAnswerB2);
		answerBList.addElement(lblAnswerB3);
		answerBList.addElement(lblAnswerB4);
		answerBList.addElement(lblAnswerB5);
		answerBList.addElement(lblAnswerB6);
		answerBList.addElement(lblAnswerB7);
		answerBList.addElement(lblAnswerB8);
		answerBList.addElement(lblAnswerB9);
		answerBList.addElement(lblAnswerB10);
		answerBList.addElement(lblAnswerB11);
		answerBList.addElement(lblAnswerB12);
		
		
		answerCList.addElement(lblAnswerC1);
		answerCList.addElement(lblAnswerC2);
		answerCList.addElement(lblAnswerC3);
		answerCList.addElement(lblAnswerC4);
		answerCList.addElement(lblAnswerC5);
		answerCList.addElement(lblAnswerC6);
		answerCList.addElement(lblAnswerC7);
		answerCList.addElement(lblAnswerC8);
		answerCList.addElement(lblAnswerC9);
		answerCList.addElement(lblAnswerC10);
		answerCList.addElement(lblAnswerC11);
		answerCList.addElement(lblAnswerC12);
		
		
		answerDList.addElement(lblAnswerD1);
		answerDList.addElement(lblAnswerD2);
		answerDList.addElement(lblAnswerD3);
		answerDList.addElement(lblAnswerD4);
		answerDList.addElement(lblAnswerD5);
		answerDList.addElement(lblAnswerD6);
		answerDList.addElement(lblAnswerD7);
		answerDList.addElement(lblAnswerD8);
		answerDList.addElement(lblAnswerD9);
		answerDList.addElement(lblAnswerD10);
		answerDList.addElement(lblAnswerD11);
		answerDList.addElement(lblAnswerD12);
		
		FunctionAccess functionaccess = new FunctionAccess();
		questionList = functionaccess.getQuestion();
		
		for(int i= 0 ; i < 12 ; i++) {
			Question ch =(Question) questionList.get(i);
			JLabel lblQ = new JLabel();
			JLabel lblAA = new JLabel();
			JLabel lblAB = new JLabel();
			JLabel lblAC = new JLabel();
			JLabel lblAD = new JLabel();
			
			lblQ = (JLabel) lblListQuestion.get(i);
			lblQ.setText(ch.ques);
			
			lblAA =(JLabel) answerAList.get(i);
			lblAA.setText(ch.ans1);
			
			lblAB =(JLabel) answerBList.get(i);
			lblAB.setText(ch.ans2);
			
			lblAC =(JLabel) answerCList.get(i);
			lblAC.setText(ch.ans3);
			
			lblAD =(JLabel) answerDList.get(i);
			lblAD.setText(ch.ans4);
			
		}
		setVisible(true);
	}
	public void run() {
		lbmin.setText(String.valueOf(min));
		lbsec.setText(String.valueOf(sec));
		while(checkclock==true) {
			if(sec==0) {
				min--;
				sec=59;
			}
			else {
				sec--;
			}
			if(sec==0&&min==0) {
				checkclock=false;
				JOptionPane.showMessageDialog(null, "Time out, press Submit");

			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lbmin.setText(String.valueOf(min));
			lbsec.setText(String.valueOf(sec));
		}
	}
	
	public float getMark() {
		return mark;
	}
	
}
