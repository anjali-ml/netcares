package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Login {

   JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 855, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(255, 250, 240));
		panel.setBounds(12, 13, 757, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUserName = new JLabel("USER NAME  :");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setBackground(new Color(240, 240, 240));
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserName.setBounds(230, 154, 143, 40);
		panel.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(385, 163, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD   :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(lblPassword.getFont().deriveFont(lblPassword.getFont().getStyle() | Font.BOLD, lblPassword.getFont().getSize() + 2f));
		lblPassword.setBounds(230, 207, 116, 18);
		panel.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(385, 205, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogin.setBounds(274, 268, 97, 25);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("   CANCEL");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCancel.setBounds(388, 268, 97, 25);
		panel.add(btnCancel);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 1, 777, 561);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("J:\\images\\login_background.jpg"));
	}
}
