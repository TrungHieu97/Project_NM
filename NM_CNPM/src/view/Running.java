package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Running extends JFrame implements ActionListener {

	private JPanel contentPane;
	public JPanel panel_1;
	public JPanel panel_2;
	public JPanel panel;
	
	public JLabel lblPart2;
	public JLabel  lblQuestion2;
	
	public Checkbox checkBox_A2;
	public Checkbox checkBox_B2;
	public Checkbox checkBox_C2;
	public Checkbox checkBox_D2;
	
	
	public Button btn_next;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private JPanel panel_3;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Running frame = new Running();
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
	public Running() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(15, 16, 314, 628);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(15, 28, 61, 58);
		panel_6.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_1);
				panel.repaint();
				panel.revalidate();
				
			}
		});
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				panel.add(panel_2);
				panel.repaint();
				panel.revalidate();
				
			}
		});
		button.setBounds(104, 31, 61, 58);
		panel_6.add(button);
		
		JButton btn_back = new JButton("BACK");
		btn_back.setBounds(15, 383, 89, 55);
		panel_6.add(btn_back);
		btn_back.setBackground(SystemColor.activeCaption);
		btn_back.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnNext = new JButton("NEXT");
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNext.setBackground(SystemColor.activeCaption);
		btnNext.setBounds(165, 385, 89, 55);
		panel_6.add(btnNext);
		
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) panel.getLayout();
				card.show(panel, "panel_2");
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(new CardLayout());
		panel.setBounds(344, 16, 735, 628);
		contentPane.add(panel);
		
		// Cau 1
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(344, 16, 700, 600);;
		
		JLabel lblPart1 = new JLabel("Part 1 :");
		lblPart1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart1.setBounds(74, 26, 102, 40);
		panel_1.add(lblPart1);
		
		JLabel lbl_question1 = new JLabel("What is the program language ?");
		lbl_question1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lbl_question1.setBounds(74, 92, 584, 126);
		panel_1.add(lbl_question1);
		
		JCheckBox chckbxAAnswerA1 = new JCheckBox("A. C ++");
		chckbxAAnswerA1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup.add(chckbxAAnswerA1);
		chckbxAAnswerA1.setBounds(74, 244, 399, 58);
		panel_1.add(chckbxAAnswerA1);
		
		JCheckBox chckbxBAnswerB1= new JCheckBox("B. C# ");
		chckbxBAnswerB1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup.add(chckbxBAnswerB1);
		chckbxBAnswerB1.setBounds(74, 328, 399, 58);
		panel_1.add(chckbxBAnswerB1);
		
		JCheckBox checkBox_C1 = new JCheckBox("C. Java ");
		checkBox_C1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup.add(checkBox_C1);
		checkBox_C1.setBounds(74, 412, 399, 58);
		panel_1.add(checkBox_C1);
		
		JCheckBox checkBox_D1 = new JCheckBox("D. Js");
		checkBox_D1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup.add(checkBox_D1);
		checkBox_D1.setBounds(74, 496, 399, 58);
		panel_1.add(checkBox_D1);
		setResizable(false);
		setLocation(300, 100);
		
		// Cau 2
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		
		JLabel lblPart2 = new JLabel("Part 2 :");
		lblPart2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart2.setBounds(74, 26, 102, 40);
		panel_2.add(lblPart2);
		
		JLabel lblQuestion2 = new JLabel("What is the name of computer ?");
		lblQuestion2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblQuestion2.setBounds(74, 92, 584, 126);
		panel_2.add(lblQuestion2);
		
		JCheckBox checkBox_A2 = new JCheckBox("A. Answer A");
		checkBox_A2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup2.add(checkBox_A2);
		checkBox_A2.setBounds(74, 244, 399, 58);
		panel_2.add(checkBox_A2);
		
		JCheckBox checkBox_B2 = new JCheckBox("B. Answer B");
		checkBox_B2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup2.add(checkBox_B2);
		checkBox_B2.setBounds(74, 328, 399, 58);
		panel_2.add(checkBox_B2);
		
		JCheckBox checkBox_C2 = new JCheckBox("C. Answer C");
		checkBox_C2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup2.add(checkBox_C2);
		checkBox_C2.setBounds(74, 412, 399, 58);
		panel_2.add(checkBox_C2);
		
		JCheckBox checkBox_D2 = new JCheckBox("D. Answer D");
		checkBox_D2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		buttonGroup2.add(checkBox_D2);
		checkBox_D2.setBounds(74, 496, 399, 58);
		panel_2.add(checkBox_D2);
		setResizable(false);
		setLocation(300, 100);
		panel.setLayout(new CardLayout(0, 0));
		
		//panel.add(panel_1, "panel_1");
		//panel.add(panel_2, "panel_2");
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, "panel_5");
		
		JButton btn_7 = new JButton("7");
		panel.add(btn_7, "name_1520817640366333");
		btn_7.setBackground(SystemColor.inactiveCaptionBorder);
		btn_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Button i = (Button) e.getSource();
//		if (i == btn_next) {
//			CardLayout cardLayout = (CardLayout) panel.getLayout();
//			cardLayout.show(panel, "panel_2");
//			
//		}
	}
}
