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
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Panel;

public class RunningExam extends JFrame {

	private JPanel contentPane;
	public JPanel panelparent;
	public JPanel panel_2;
	public JPanel panel_3;
	private final ButtonGroup buttonGroup1 = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	private final ButtonGroup buttonGroup3 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RunningExam frame = new RunningExam();
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
		lblPart1.setBounds(118, 38, 87, 42);
		panel1.add(lblPart1);
		panelparent.add(panel1);
		
		JLabel lblQuestion1 = new JLabel("What ???");
		lblQuestion1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion1.setBounds(118, 118, 364, 90);
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
		checkBoxC1.setBounds(118, 379, 368, 29);
		panel1.add(checkBoxC1);
		
		JCheckBox checkBoxD1 = new JCheckBox("D. Answer D.");
		checkBoxD1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		buttonGroup1.add(checkBoxD1);
		checkBoxD1.setBounds(118, 447, 365, 29);
		panel1.add(checkBoxD1);
		
		JPanel panel2 = new JPanel();
		panelparent.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblPart2 = new JLabel("PART 2");
		lblPart2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPart2.setBounds(118, 38, 87, 42);
		panel2.add(lblPart2);
		
		JLabel lblQuestion2 = new JLabel("What ???");
		lblQuestion2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion2.setBounds(118, 118, 364, 90);
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
		panelparent.add(panel3, "name_1559935389624011");
		panel3.setLayout(null);
		
		JLabel lblPart3 = new JLabel("PART 3");
		lblPart3.setBounds(118, 40, 87, 29);
		lblPart3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel3.add(lblPart3);
		
		JLabel lblQuestion3 = new JLabel("What ???");
		lblQuestion3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblQuestion3.setBounds(118, 109, 364, 90);
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
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(15, 16, 318, 531);
		contentPane.add(panel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(SystemColor.info);
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnBack.setBounds(49, 348, 95, 49);
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
		btnNext.setBounds(169, 348, 95, 49);
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
				getPanel(panelparent,panel1);
			}
		});
		btn1.setBounds(15, 16, 53, 56);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanel(panelparent,panel2);
			}
		});
		btn2.setBackground(SystemColor.activeCaption);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn2.setBounds(91, 16, 53, 56);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getPanel(panelparent,panel3);
			}
		});
		btn3.setBackground(SystemColor.activeCaption);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn3.setBounds(169, 16, 53, 56);
		panel.add(btn3);
		
		JButton bnt4 = new JButton("4");
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
					JOptionPane.showMessageDialog(null, "RIGHT");
				}
			}
		});
		btnSubmit.setBounds(91, 438, 131, 55);
		panel.add(btnSubmit);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(SystemColor.activeCaption);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn5.setBounds(15, 104, 53, 56);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(SystemColor.activeCaption);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn6.setBounds(91, 104, 53, 56);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(SystemColor.activeCaption);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn7.setBounds(169, 104, 53, 56);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(SystemColor.activeCaption);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn8.setBounds(250, 104, 53, 56);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(SystemColor.activeCaption);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn9.setBounds(15, 192, 53, 56);
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBackground(SystemColor.activeCaption);
		btn10.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn10.setBounds(91, 192, 53, 56);
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBackground(SystemColor.activeCaption);
		btn11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn11.setBounds(169, 192, 53, 56);
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBackground(SystemColor.activeCaption);
		btn12.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn12.setBounds(250, 192, 53, 56);
		panel.add(btn12);
	}
	
	public void getPanel(JPanel panelparent,JPanel p) {
		panelparent.removeAll();
		panelparent.add(p);
		panelparent.repaint();
		panelparent.revalidate();
	}
}
