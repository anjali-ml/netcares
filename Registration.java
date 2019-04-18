package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;

public class Registration {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 917, 764);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 13, 823, 655);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name           :");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblName.setBounds(270, 140, 123, 16);
		panel.add(lblName);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(241, 27, 392, 51);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUserRegistration = new JLabel("USER REGISTRATION");
		lblUserRegistration.setBackground(new Color(255, 0, 0));
		lblUserRegistration.setForeground(new Color(0, 0, 205));
		lblUserRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblUserRegistration.setBounds(91, 13, 227, 29);
		panel_1.add(lblUserRegistration);
		
		textField = new JTextField();
		textField.setBounds(421, 138, 182, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-Mail          :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(270, 193, 113, 16);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(421, 191, 182, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(421, 240, 182, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDesignation = new JLabel("Designation   :");
		lblDesignation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDesignation.setBounds(270, 285, 113, 36);
		panel.add(lblDesignation);
		
		textField_3 = new JTextField();
		textField_3.setBounds(421, 293, 182, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department   :");
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDepartment.setBounds(270, 344, 113, 19);
		panel.add(lblDepartment);
		
		textField_4 = new JTextField();
		textField_4.setBounds(421, 341, 182, 22);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSubmit.setBounds(296, 432, 97, 41);
		panel.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(461, 432, 97, 41);
		panel.add(btnCancel);
		
		JLabel lblContact = new JLabel("Contact         :");
		lblContact.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblContact.setBounds(269, 246, 124, 16);
		panel.add(lblContact);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("J:\\images\\login-page-.jpg"));
		lblNewLabel_1.setBounds(0, -45, 834, 663);
		panel.add(lblNewLabel_1);
	}
}
