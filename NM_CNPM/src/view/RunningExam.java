package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
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

import model.*;

public class RunningExam extends JFrame implements Runnable {

	public JLabel lbmin;
	public JLabel lbsec;
	public static int min=10;
	public static int sec=0;
	public static boolean boo=true;
	
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
		
		JPanel panelparent = new JPanel();
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
		
		JCheckBox checkBoxA1 = new JCheckBox("A. Aswer A.");
		checkBoxA1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxA1);
		checkBoxA1.setBounds(117, 246, 365, 29);
		panel1.add(checkBoxA1);
		
		JCheckBox checkBoxB1 = new JCheckBox("B. Answer B.");
		checkBoxB1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxB1);
		checkBoxB1.setBounds(117, 313, 365, 29);
		panel1.add(checkBoxB1);
		
		JCheckBox checkBoxC1 = new JCheckBox("C. Answer C.");
		checkBoxC1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxC1);
		checkBoxC1.setBounds(118, 380, 368, 29);
		panel1.add(checkBoxC1);
		
		JCheckBox checkBoxD1 = new JCheckBox("D. Answer D.");
		checkBoxD1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxD1);
		checkBoxD1.setBounds(118, 447, 365, 29);
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
		
		JCheckBox checkBoxA2 = new JCheckBox("A. Aswer A.");
		buttonGroup2.add(checkBoxA2);
		checkBoxA2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA2.setBounds(118, 246, 365, 29);
		panel2.add(checkBoxA2);
		
		JCheckBox checkBoxB2 = new JCheckBox("B.Answer B.");
		buttonGroup2.add(checkBoxB2);
		checkBoxB2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB2.setBounds(118, 313, 365, 29);
		panel2.add(checkBoxB2);
		
		JCheckBox checkBoxC2 = new JCheckBox("C. Answer C.");
		buttonGroup2.add(checkBoxC2);
		checkBoxC2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC2.setBounds(118, 380, 365, 29);
		panel2.add(checkBoxC2);
		
		JCheckBox checkBoxD2 = new JCheckBox("D. Answer D.");
		buttonGroup2.add(checkBoxD2);
		checkBoxD2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD2.setBounds(118, 447, 365, 29);
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
		
		JCheckBox checkBoxA3 = new JCheckBox("A. Aswer A.");
		buttonGroup3.add(checkBoxA3);
		checkBoxA3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA3.setBounds(118, 239, 365, 29);
		panel3.add(checkBoxA3);
		
		JCheckBox checkBoxB3 = new JCheckBox("B. Aswer B.");
		buttonGroup3.add(checkBoxB3);
		checkBoxB3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB3.setBounds(118, 308, 365, 29);
		panel3.add(checkBoxB3);
		
		JCheckBox checkBoxC3 = new JCheckBox("C. Answer C.");
		buttonGroup3.add(checkBoxC3);
		checkBoxC3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC3.setBounds(118, 377, 365, 29);
		panel3.add(checkBoxC3);
		
		JCheckBox checkBoxD3 = new JCheckBox("D. Answer D.");
		buttonGroup3.add(checkBoxD3);
		checkBoxD3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD3.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA4 = new JCheckBox("A. Aswer A.");
		buttonGroup4.add(checkBoxA4);
		checkBoxA4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA4.setBounds(118, 239, 365, 29);
		panel4.add(checkBoxA4);
		
		JCheckBox checkBoxB4 = new JCheckBox("A. Aswer A.");
		buttonGroup4.add(checkBoxB4);
		checkBoxB4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB4.setBounds(118, 308, 365, 29);
		panel4.add(checkBoxB4);
		
		JCheckBox checkBoxC4 = new JCheckBox("A. Aswer A.");
		buttonGroup4.add(checkBoxC4);
		checkBoxC4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC4.setBounds(118, 377, 365, 29);
		panel4.add(checkBoxC4);
		
		JCheckBox checkBoxD4 = new JCheckBox("A. Aswer A.");
		buttonGroup4.add(checkBoxD4);
		checkBoxD4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD4.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA5 = new JCheckBox("A. Aswer A.");
		buttonGroup5.add(checkBoxA5);
		checkBoxA5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA5.setBounds(118, 239, 365, 29);
		panel5.add(checkBoxA5);
		
		JCheckBox checkBoxB5 = new JCheckBox("A. Aswer A.");
		buttonGroup5.add(checkBoxB5);
		checkBoxB5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB5.setBounds(118, 308, 365, 29);
		panel5.add(checkBoxB5);
		
		JCheckBox checkBoxC5 = new JCheckBox("A. Aswer A.");
		buttonGroup5.add(checkBoxC5);
		checkBoxC5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC5.setBounds(118, 377, 365, 29);
		panel5.add(checkBoxC5);
		
		JCheckBox checkBoxD5 = new JCheckBox("A. Aswer A.");
		buttonGroup5.add(checkBoxD5);
		checkBoxD5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD5.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA6 = new JCheckBox("A. Aswer A.");
		buttonGroup6.add(checkBoxA6);
		checkBoxA6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA6.setBounds(118, 239, 365, 29);
		panel6.add(checkBoxA6);
		
		JCheckBox checkBoxB6 = new JCheckBox("A. Aswer A.");
		buttonGroup6.add(checkBoxB6);
		checkBoxB6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB6.setBounds(118, 308, 365, 29);
		panel6.add(checkBoxB6);
		
		JCheckBox checkBoxC6 = new JCheckBox("A. Aswer A.");
		buttonGroup6.add(checkBoxC6);
		checkBoxC6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC6.setBounds(118, 377, 365, 29);
		panel6.add(checkBoxC6);
		
		JCheckBox checkBoxD6 = new JCheckBox("A. Aswer A.");
		buttonGroup6.add(checkBoxD6);
		checkBoxD6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD6.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA7 = new JCheckBox("A. Aswer A.");
		buttonGroup7.add(checkBoxA7);
		checkBoxA7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA7.setBounds(118, 239, 365, 29);
		panel7.add(checkBoxA7);
		
		JCheckBox checkBoxB7 = new JCheckBox("A. Aswer A.");
		buttonGroup7.add(checkBoxB7);
		checkBoxB7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB7.setBounds(118, 308, 365, 29);
		panel7.add(checkBoxB7);
		
		JCheckBox checkBoxC7 = new JCheckBox("A. Aswer A.");
		buttonGroup7.add(checkBoxC7);
		checkBoxC7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC7.setBounds(118, 377, 365, 29);
		panel7.add(checkBoxC7);
		
		JCheckBox checkBoxD7 = new JCheckBox("A. Aswer A.");
		buttonGroup7.add(checkBoxD7);
		checkBoxD7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD7.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA8 = new JCheckBox("A. Aswer A.");
		buttonGroup8.add(checkBoxA8);
		checkBoxA8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA8.setBounds(118, 239, 365, 29);
		panel8.add(checkBoxA8);
		
		JCheckBox checkBoxB8 = new JCheckBox("A. Aswer A.");
		buttonGroup8.add(checkBoxB8);
		checkBoxB8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB8.setBounds(118, 308, 365, 29);
		panel8.add(checkBoxB8);
		
		JCheckBox checkBoxC8 = new JCheckBox("A. Aswer A.");
		buttonGroup8.add(checkBoxC8);
		checkBoxC8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC8.setBounds(118, 377, 365, 29);
		panel8.add(checkBoxC8);
		
		JCheckBox checkBoxD8 = new JCheckBox("A. Aswer A.");
		buttonGroup8.add(checkBoxD8);
		checkBoxD8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD8.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA9 = new JCheckBox("A. Aswer A.");
		buttonGroup9.add(checkBoxA9);
		checkBoxA9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA9.setBounds(118, 239, 365, 29);
		panel9.add(checkBoxA9);
		
		JCheckBox checkBoxB9 = new JCheckBox("A. Aswer A.");
		buttonGroup9.add(checkBoxB9);
		checkBoxB9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB9.setBounds(118, 308, 365, 29);
		panel9.add(checkBoxB9);
		
		JCheckBox checkBoxC9 = new JCheckBox("A. Aswer A.");
		buttonGroup9.add(checkBoxC9);
		checkBoxC9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC9.setBounds(118, 377, 365, 29);
		panel9.add(checkBoxC9);
		
		JCheckBox checkBoxD9 = new JCheckBox("A. Aswer A.");
		buttonGroup9.add(checkBoxD9);
		checkBoxD9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD9.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA10 = new JCheckBox("A. Aswer A.");
		buttonGroup10.add(checkBoxA10);
		checkBoxA10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA10.setBounds(118, 239, 365, 29);
		panel10.add(checkBoxA10);
		
		JCheckBox checkBoxB10 = new JCheckBox("A. Aswer A.");
		buttonGroup10.add(checkBoxB10);
		checkBoxB10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB10.setBounds(118, 308, 365, 29);
		panel10.add(checkBoxB10);
		
		JCheckBox checkBoxC10 = new JCheckBox("A. Aswer A.");
		buttonGroup10.add(checkBoxC10);
		checkBoxC10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC10.setBounds(118, 377, 365, 29);
		panel10.add(checkBoxC10);
		
		JCheckBox checkBoxD10 = new JCheckBox("A. Aswer A.");
		buttonGroup10.add(checkBoxD10);
		checkBoxD10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD10.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA11 = new JCheckBox("A. Aswer A.");
		buttonGroup11.add(checkBoxA11);
		checkBoxA11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA11.setBounds(118, 239, 365, 29);
		panel11.add(checkBoxA11);
		
		JCheckBox checkBoxB11 = new JCheckBox("A. Aswer A.");
		buttonGroup11.add(checkBoxB11);
		checkBoxB11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB11.setBounds(118, 308, 365, 29);
		panel11.add(checkBoxB11);
		
		JCheckBox checkBoxC11 = new JCheckBox("A. Aswer A.");
		buttonGroup11.add(checkBoxC11);
		checkBoxC11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC11.setBounds(118, 377, 365, 29);
		panel11.add(checkBoxC11);
		
		JCheckBox checkBoxD11 = new JCheckBox("A. Aswer A.");
		buttonGroup11.add(checkBoxD11);
		checkBoxD11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD11.setBounds(118, 446, 365, 29);
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
		
		JCheckBox checkBoxA12 = new JCheckBox("A. Aswer A.");
		buttonGroup12.add(checkBoxA12);
		checkBoxA12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxA12.setBounds(118, 239, 365, 29);
		panel12.add(checkBoxA12);
		
		JCheckBox checkBoxB12 = new JCheckBox("A. Aswer A.");
		buttonGroup12.add(checkBoxB12);
		checkBoxB12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxB12.setBounds(118, 308, 365, 29);
		panel12.add(checkBoxB12);
		
		JCheckBox checkBoxC12 = new JCheckBox("A. Aswer A.");
		buttonGroup12.add(checkBoxC12);
		checkBoxC12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxC12.setBounds(118, 377, 365, 29);
		panel12.add(checkBoxC12);
		
		JCheckBox checkBoxD12 = new JCheckBox("A. Aswer A.");
		buttonGroup12.add(checkBoxD12);
		checkBoxD12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		checkBoxD12.setBounds(118, 446, 365, 29);
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
				if(buttonGroup1.getSelection().equals(checkBoxB1.getModel())) {
					JOptionPane.showMessageDialog(null,"");
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
		setVisible(true);
		//
//		Get_Question getquestion = new Get_Question();
//		Vector questionList =new Vector();
//		questionList = getquestion.Get_Data_Question();
	//	Question ch = (Question) questionList.get(0);
//		Vector lblListQuestion = new Vector<JLabel>();
//		lblListQuestion.addElement(lblQuestion1);
//		lblListQuestion.addElement(lblQuestion2);
//		lblListQuestion.addElement(lblQuestion3);
//		lblQuestion1.setText("Which can you keep after gi\r\nving it to your friend?");
//		for(int i= 0 ; i < 3 ; i++) {
//			Question ch =(Question) questionList.get(i);
//			JLabel lbl = (JLabel)lblListQuestion.get(i);
//    		lbl.setText(ch.concept);
////			System.out.println(ch.concept +"\n"+ch.Answer1 /*+" "+ ch.Answer2+" "+ch.Answer3+" "+ch.Answer4 */);
//		}
	}
	public void run() {
		while(boo==true) {
			lbmin.setText(String.valueOf(min));
			lbsec.setText(String.valueOf(sec));
			if(sec==0) {
				min--;
				sec=59;
			}else {
				sec--;
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
//	public void createVector() {
//	 	Vector lblListQuestion = new Vector<JLabel>();
//		Vector lblListAnswer = new Vector<JLabel>();
//		lblListQuestion.addElement(lblQuestion1);
//		lblListQuestion.addElement(lblQuestion2);
//		lblListQuestion.addElement(lblQuestion3);
//		lblListQuestion.addElement(lblQuestion4);
//		lblListQuestion.addElement(lblQuestion5);
//		lblListQuestion.addElement(lblQuestion6);
//		lblListQuestion.addElement(lblQuestion7);
//		lblListQuestion.addElement(lblQuestion8);
//		lblListQuestion.addElement(lblQuestion9);
//		lblListQuestion.addElement(lblQuestion10);
//		lblListQuestion.addElement(lblQuestion11);
//		lblListQuestion.addElement(lblQuestion12);
//		
//	}
	
//	public void displayQuestion() {
//		Get_Question getquestion = new Get_Question();
//		Vector questionList =new Vector();
//		questionList = getquestion.Get_Data_Question();
//		Question ch = (Question) questionList.get(1);
//		lblQuestion1.setText("adv");
//		for(int i=0 ; i < questionList.size() ; i++) {
//			Question ch =(Question) questionList.get(i);
//			JLabel lbl = (JLabel)lblListQuestion.get(i);
//			lbl.setText(ch.concept);
			//System.out.println(ch.concept +"\n"+ch.Answer1 /*+" "+ ch.Answer2+" "+ch.Answer3+" "+ch.Answer4 */);
//		}
//	}
	
	
}
