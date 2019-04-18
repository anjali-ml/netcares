package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 157, 253);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		
		btnHome.setBounds(22, 82, 123, 25);
		panel.add(btnHome);
		
		JButton btnRegistration = new JButton("Registration");
		
	
		btnRegistration.setBounds(22, 120, 123, 25);
		panel.add(btnRegistration);
		
		JButton btnNotification = new JButton("Notification");
		btnNotification.setBounds(22, 158, 123, 25);
		panel.add(btnNotification);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(22, 196, 123, 25);
		panel.add(btnLogout);
		
		JLabel lblNetcares = new JLabel("NetCares");
		lblNetcares.setForeground(Color.RED);
		lblNetcares.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNetcares.setBounds(45, 13, 89, 40);
		panel.add(lblNetcares);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("J:\\images\\login_background.jpg"));
		lblNewLabel_2.setBounds(0, 0, 157, 253);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(156, 0, 276, 253);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUser = new JLabel("user");
		lblUser.setBounds(101, 59, 56, 16);
		panel_1.add(lblUser);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 157, 253);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\itsma\\Downloads\\New folder (2)\\WhatsApp Image 2019-03-20 at 3.37.46 PM.jpeg"));
		lblNewLabel.setBounds(0, 0, 276, 253);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 157, 253);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
	
	
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.removeAll();
				panel_1.add(panel_2);
				panel_1.repaint();
				panel_1.revalidate();			
				}
		});
		btnRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				panel_1.removeAll();
				panel_1.add(panel_3);
				panel_1.repaint();
				panel_1.revalidate();		
			}
		});
	
	
	}
}
