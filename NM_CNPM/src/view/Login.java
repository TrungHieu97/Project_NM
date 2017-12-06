package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.image.Image;
import model.Check_Login;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import sun.security.util.Password;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField nameField;
	private JPasswordField passwordField;
	
	private JButton btnLogin;
	private JLabel LbLogin;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 420);
		setLocation(550, 200);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
	    LbLogin = new JLabel("LOGIN");
		LbLogin.setHorizontalAlignment(SwingConstants.CENTER);
		LbLogin.setBounds(181, 14, 293, 90);
		LbLogin.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(LbLogin);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		nameField.setBounds(234, 120, 220, 42);
		panel.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setIcon(new ImageIcon("user1.png"));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblName.setBounds(45, 122, 174, 42);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setIcon(new ImageIcon("pass.png"));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblPassword.setBounds(45, 208, 161, 31);
		panel.add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnLogin.setBounds(245, 281, 115, 29);
		panel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(234, 203, 220, 42);
		panel.add(passwordField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton item = (JButton) e.getSource();
		if(item == btnLogin){
			String n = nameField.getText();
			String p = String.valueOf(passwordField.getPassword());
			Check_Login ck = new Check_Login();
			boolean check = ck.check(n, p);
			if (check) {
	             int i =JOptionPane.showConfirmDialog(null, "Are you ready", "Bat dau",JOptionPane.YES_NO_OPTION );
	             if ( i == JOptionPane.YES_OPTION ) {
	        	 RunningExam running = new RunningExam();
	        	 running.setVisible(false);
	        	// running.displayQuestion();
			     this.setVisible(false);
			     Thread t =new Thread(new RunningExam());
			     t.start();
		         }
		    }
			else {JOptionPane.showMessageDialog(null, "User name or password not true");}
		}
		
	}
}
