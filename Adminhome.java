package netcaremain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import netcaremain.Emailvalidator;
import netcaremain.Mobvalidator;


import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JTextPane;


public class Adminhome {

	JFrame frame;
	private JTable table;
	private JTextField user_name;
	private JTextField user_email;
	private JTextField user_contact;
	private JTextField user_desig;
	private JTextField user_dept;
	private JPasswordField user_password;
	private JPasswordField user_repass;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_5;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table_6;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table_7;
	private JTable table_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminhome window = new Adminhome();
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
	public Adminhome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Adminhome.class.getResource("/netcaremain/NETCARElog copy.png")));
		
		frame.setBounds(100, 100, 854, 605);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 838, 52);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		
		JLabel lblAdminPanel = new JLabel("ADMIN PANEL");
		lblAdminPanel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAdminPanel.setForeground(Color.WHITE);
		lblAdminPanel.setBounds(37, 11, 136, 30);
		panel.add(lblAdminPanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 102, 0));
		panel_1.setBounds(0, 52, 227, 697);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton home = new JButton("Home");
		home.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		home.setBackground(new Color(255, 102, 0));
		home.setBounds(0, 89, 227, 45);
		panel_1.add(home);
		
		JButton notification = new JButton("Notification");
		
		
		notification.setFont(new Font("Tahoma", Font.BOLD, 12));
		notification.setBackground(new Color(255, 102, 0));
		notification.setBounds(0, 132, 227, 45);
		panel_1.add(notification);
		
		JButton userreg = new JButton("User Registration");
		
		userreg.setFont(new Font("Tahoma", Font.BOLD, 12));
		userreg.setBackground(new Color(255, 102, 0));
		userreg.setBounds(0, 174, 227, 45);
		panel_1.add(userreg);
		
		JButton userdet = new JButton("User Details");
		
		userdet.setFont(new Font("Tahoma", Font.BOLD, 12));
		userdet.setBackground(new Color(255, 102, 0));
		userdet.setBounds(0, 217, 227, 45);
		panel_1.add(userdet);
		
		JButton hostscan = new JButton("Host Scan");
		
		hostscan.setFont(new Font("Tahoma", Font.BOLD, 12));
		hostscan.setBackground(new Color(255, 102, 0));
		hostscan.setBounds(0, 260, 227, 45);
		panel_1.add(hostscan);
		
		JButton osdet = new JButton("Os Detection");
		
		osdet.setFont(new Font("Tahoma", Font.BOLD, 12));
		osdet.setBackground(new Color(255, 102, 0));
		osdet.setBounds(0, 302, 227, 45);
		panel_1.add(osdet);
		
		JButton portscan = new JButton("Port Scan");
		
		portscan.setFont(new Font("Tahoma", Font.BOLD, 12));
		portscan.setBackground(new Color(255, 102, 0));
		portscan.setBounds(0, 345, 227, 45);
		panel_1.add(portscan);
		
		JButton ids = new JButton("IDS");
		
		
		ids.setFont(new Font("Tahoma", Font.BOLD, 12));
		ids.setBackground(new Color(255, 102, 0));
		ids.setBounds(0, 388, 227, 45);
		panel_1.add(ids);
		
		JButton scanrep = new JButton("Scan Report");
		
		scanrep.setFont(new Font("Tahoma", Font.BOLD, 12));
		scanrep.setBackground(new Color(255, 102, 0));
		scanrep.setBounds(0, 432, 227, 45);
		panel_1.add(scanrep);
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				home logout=new home();
				logout.loginframe.setVisible(true);
				frame.dispose();
			}
		});
		logout.setFont(new Font("Tahoma", Font.BOLD, 12));
		logout.setBackground(new Color(255, 102, 0));
		logout.setBounds(0, 476, 227, 45);
		panel_1.add(logout);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Adminhome.class.getResource("/netcaremain/NETCARElog copy.png")));
		label.setBounds(18, 11, 199, 77);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(255, 69, 0));
		panel_2.setBounds(226, 52, 612, 514);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_home = new JPanel();
		panel_2.add(panel_home, "name_174882163799468");
		panel_home.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Adminhome.class.getResource("/netcaremain/networking.gif")));
		lblNewLabel_1.setBounds(-152, 0, 764, 514);
		panel_home.add(lblNewLabel_1);
		
		JPanel panel_not = new JPanel();
		panel_2.add(panel_not, "name_163028702192792");
		panel_not.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_not.add(scrollPane);
		
		
		
		table = new JTable();
		//table.setBounds(1134, 6, -1122, 680);
		//table.setBounds(575, 6, 0, 0);
		//panel_not.add(table);
		
		
		
		
		JPanel panel_userreg = new JPanel();
		panel_userreg.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_userreg, "name_163033227717003");
		panel_userreg.setLayout(null);
		
		JLabel lblUserRegistration = new JLabel("USER REGISTRATION");
		lblUserRegistration.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserRegistration.setBounds(218, 25, 227, 14);
		panel_userreg.add(lblUserRegistration);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(30, 95, 94, 14);
		panel_userreg.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(30, 129, 94, 14);
		panel_userreg.add(lblEmail);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContact.setBounds(30, 163, 94, 14);
		panel_userreg.add(lblContact);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(30, 198, 94, 14);
		panel_userreg.add(lblPassword);
		
		JLabel lblRepassword = new JLabel("Re-password");
		lblRepassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRepassword.setBounds(30, 235, 94, 14);
		panel_userreg.add(lblRepassword);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDesignation.setBounds(30, 265, 94, 14);
		panel_userreg.add(lblDesignation);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDepartment.setBounds(30, 299, 94, 14);
		panel_userreg.add(lblDepartment);
		
		user_name = new JTextField();
		user_name.setBounds(179, 92, 209, 20);
		panel_userreg.add(user_name);
		user_name.setColumns(10);
		
		user_email = new JTextField();
		user_email.setColumns(10);
		user_email.setBounds(179, 126, 209, 20);
		panel_userreg.add(user_email);
		
		user_contact = new JTextField();
		user_contact.setColumns(10);
		user_contact.setBounds(179, 160, 209, 20);
		panel_userreg.add(user_contact);
		
		user_desig = new JTextField();
		user_desig.setColumns(10);
		user_desig.setBounds(179, 262, 209, 20);
		panel_userreg.add(user_desig);
		
		user_dept = new JTextField();
		user_dept.setColumns(10);
		user_dept.setBounds(179, 296, 209, 20);
		panel_userreg.add(user_dept);
		
		JButton user_submit = new JButton("Submit");
		
		user_submit.setBounds(78, 352, 89, 23);
		panel_userreg.add(user_submit);
		
		JButton user_reset = new JButton("Reset");
		user_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				user_name.setText(null);
				user_email.setText(null);
				user_contact.setText(null);
				user_password.setText(null);
				user_repass.setText(null);
				user_desig.setText(null);
				user_dept.setText(null);
				
				
				
				
			}
		});
		user_reset.setBounds(229, 352, 89, 23);
		panel_userreg.add(user_reset);
		
		user_password = new JPasswordField();
		user_password.setBounds(179, 195, 209, 20);
		panel_userreg.add(user_password);
		
		user_repass = new JPasswordField();
		user_repass.setBounds(179, 232, 209, 20);
		panel_userreg.add(user_repass);
		
		JLabel emailerror = new JLabel("");
		emailerror.setForeground(Color.RED);
		emailerror.setBounds(413, 129, 163, 14);
		panel_userreg.add(emailerror);
		
		JLabel moberror = new JLabel("");
		moberror.setForeground(Color.RED);
		moberror.setBounds(413, 163, 163, 14);
		panel_userreg.add(moberror);
		
		JPanel panel_userdet = new JPanel();
		panel_2.add(panel_userdet, "name_163038533054703");
		panel_userdet.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_userdet.add(scrollPane_1, BorderLayout.NORTH);
		
		table_1 = new JTable();
		panel_userdet.add(table_1, BorderLayout.SOUTH);
		
		JPanel panel_host = new JPanel();
		panel_2.add(panel_host, "name_163118018738678");
		panel_host.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 1370, 52);
		panel_host.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField.getText();
				 if(value.length()==2){
					 textField_1.requestFocus();
				 }      
			}
		});
		textField.setBounds(114, 12, 42, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel(":");
		label_1.setBounds(169, 15, 10, 14);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setBounds(244, 15, 10, 14);
		panel_3.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_1.getText();
				 if(value.length()==2){
					 textField_2.requestFocus();
				 }      
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(189, 12, 42, 20);
		panel_3.add(textField_1);
		
		JLabel label_3 = new JLabel(":");
		label_3.setBounds(319, 15, 10, 14);
		panel_3.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_2.getText();
				 if(value.length()==2){
					 textField_3.requestFocus();
				 }      
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(264, 12, 42, 20);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_3.getText();
				 if(value.length()==2){
					 textField.requestFocus();
				 }      
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(339, 12, 42, 20);
		panel_3.add(textField_3);
		
		
		
		
		
		JButton hostscanbtn = new JButton("Host Scan");
		
		
		hostscanbtn.setBounds(429, 11, 129, 23);
		panel_3.add(hostscanbtn);
		
		JLabel lblIpAddress = new JLabel("Ip Address");
		lblIpAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIpAddress.setBounds(35, 15, 69, 14);
		panel_3.add(lblIpAddress);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 51, 612, 463);
		panel_host.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_4.add(scrollPane_2);
		
//		table_3 = new JTable();
//		panel_4.add(table_3);
		
		table_2 = new JTable();
		//panel_4.add(table_2);
		
		JPanel panel_os = new JPanel();
		panel_2.add(panel_os, "name_163122498875648");
		panel_os.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 612, 68);
		panel_os.add(panel_5);
		panel_5.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_4.getText();
				 if(value.length()==2){
					 textField_5.requestFocus();
				 }      
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(110, 23, 42, 20);
		panel_5.add(textField_4);
		
		JLabel label_4 = new JLabel(":");
		label_4.setBounds(165, 26, 10, 14);
		panel_5.add(label_4);
		
		JLabel label_5 = new JLabel(":");
		label_5.setBounds(240, 26, 10, 14);
		panel_5.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_5.getText();
				 if(value.length()==2){
					 textField_6.requestFocus();
				 }      
			}
		});
		textField_5.setColumns(10);
		textField_5.setBounds(185, 23, 42, 20);
		panel_5.add(textField_5);
		
		JLabel label_6 = new JLabel(":");
		label_6.setBounds(315, 26, 10, 14);
		panel_5.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_6.getText();
				 if(value.length()==2){
					 textField_4.requestFocus();
				 }      
			}
		});
		textField_6.setColumns(10);
		textField_6.setBounds(260, 23, 42, 20);
		panel_5.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(335, 23, 42, 20);
		panel_5.add(textField_7);
		
		JButton btnOsDetection = new JButton("Os Detection");
		btnOsDetection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOsDetection.setBounds(425, 22, 129, 23);
		panel_5.add(btnOsDetection);
		
		JLabel label_7 = new JLabel("Ip Address");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(31, 26, 69, 14);
		panel_5.add(label_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 68, 612, 446);
		panel_os.add(panel_6);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panel_6.add(scrollPane_3);
		
		table_5 = new JTable();
		panel_6.add(table_5);
		
		JPanel panel_port = new JPanel();
		panel_2.add(panel_port, "name_163128100292044");
		panel_port.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 0, 612, 70);
		panel_port.add(panel_7);
		panel_7.setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_8.getText();
				 if(value.length()==2){
					 textField_9.requestFocus();
				 }      
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(114, 23, 42, 20);
		panel_7.add(textField_8);
		
		JLabel label_8 = new JLabel(":");
		label_8.setBounds(169, 26, 10, 14);
		panel_7.add(label_8);
		
		JLabel label_9 = new JLabel(":");
		label_9.setBounds(244, 26, 10, 14);
		panel_7.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_9.getText();
				 if(value.length()==2){
					 textField_10.requestFocus();
				 }      
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(189, 23, 42, 20);
		panel_7.add(textField_9);
		
		JLabel label_10 = new JLabel(":");
		label_10.setBounds(319, 26, 10, 14);
		panel_7.add(label_10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
							
				String value=textField_10.getText();
				 if(value.length()==2){
					 textField_11.requestFocus();
				 }      
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(264, 23, 42, 20);
		panel_7.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(339, 23, 42, 20);
		panel_7.add(textField_11);
		
		JButton btnPortScanning = new JButton("Port Scanning");
		btnPortScanning.setBounds(429, 22, 129, 23);
		panel_7.add(btnPortScanning);
		
		JLabel label_11 = new JLabel("Ip Address");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_11.setBounds(35, 26, 69, 14);
		panel_7.add(label_11);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 70, 612, 444);
		panel_port.add(panel_8);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		panel_8.add(scrollPane_4);
		
		table_6 = new JTable();
		panel_8.add(table_6);
		
		JPanel panel_ids = new JPanel();
		panel_2.add(panel_ids, "name_263248886611909");
		panel_ids.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 0, 612, 84);
		panel_ids.add(panel_9);
		panel_9.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(119, 27, 42, 20);
		panel_9.add(textField_12);
		
		JLabel label_12 = new JLabel(":");
		label_12.setBounds(174, 30, 10, 14);
		panel_9.add(label_12);
		
		JLabel label_13 = new JLabel(":");
		label_13.setBounds(249, 30, 10, 14);
		panel_9.add(label_13);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(194, 27, 42, 20);
		panel_9.add(textField_13);
		
		JLabel label_14 = new JLabel(":");
		label_14.setBounds(324, 30, 10, 14);
		panel_9.add(label_14);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(269, 27, 42, 20);
		panel_9.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(344, 27, 42, 20);
		panel_9.add(textField_15);
		
		JButton btnIdsScanning = new JButton("IDS Scanning");
		
		btnIdsScanning.setBounds(434, 26, 129, 23);
		panel_9.add(btnIdsScanning);
		
		JLabel label_15 = new JLabel("Ip Address");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_15.setBounds(40, 30, 69, 14);
		panel_9.add(label_15);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 86, 612, 428);
		panel_ids.add(panel_10);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		panel_10.add(scrollPane_5);
		
		table_7 = new JTable();
		panel_10.add(table_7);
		
		
		JPanel panel_scanrep = new JPanel();
		panel_2.add(panel_scanrep, "name_163137003369470");
		panel_scanrep.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_6 = new JScrollPane();
		panel_scanrep.add(scrollPane_6, BorderLayout.NORTH);
		
		table_8 = new JTable();
		panel_scanrep.add(table_8, BorderLayout.SOUTH);
		
		
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.removeAll();
				panel_2.add(panel_home);
				panel_2.repaint();
				panel_2.revalidate();
				
			}
		});
		
		notification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.repaint();
				panel_2.revalidate();
				panel_2.add(panel_not);
				panel_2.repaint();
				panel_2.revalidate();
				

				
				
				DefaultTableModel tbl = new DefaultTableModel(0,0);
				
				tbl.addColumn("Sl No.");
				tbl.addColumn("id");
				tbl.addColumn("Name");
				tbl.addColumn("Email");
				tbl.addColumn("Device Name");
				tbl.addColumn("Device Type");
				tbl.addColumn("Ip Address");
				tbl.addColumn("Mac Address");
				tbl.addColumn("Accept");
				tbl.addColumn("Reject");
				
				
				Object rowtbl[] = new Object[10];
				
				
				
				table.setRowSelectionAllowed(true);
				table.setModel(tbl);
				table.getColumn("Accept").setCellRenderer(new ButtonRenderer());
			    table.getColumn("Accept").setCellEditor(
			        new ButtonEditor(new JCheckBox()));
			    table.getColumn("Reject").setCellRenderer(new ButtonRendererrej());
			    table.getColumn("Reject").setCellEditor(
			        new ButtonEditorrej(new JCheckBox()));
				
				scrollPane.setViewportView(table);
				
				
				
				tbl.getDataVector().removeAllElements();
				tbl.fireTableDataChanged();
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from devreg WHERE status=0";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int i =0;
				int slno=0;
				while(rs.next())
				{
					i=i+1;
				slno = slno+1;
				String id=rs.getString("id");
				String nme = rs.getString("name");
				String emailid = rs.getString("email");
				@SuppressWarnings("unused")
				String mob = rs.getString("contact");
				@SuppressWarnings("unused")
				String uname = rs.getString("username");
				@SuppressWarnings("unused")
				String dept = rs.getString("department");
				@SuppressWarnings("unused")
				String desig = rs.getString("designation");
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				
				rowtbl[0]=slno;
				rowtbl[1]=id;
				rowtbl[2]=nme;
				rowtbl[3]=emailid;
				rowtbl[4]=devnme;
				rowtbl[5]=devtyp;
				rowtbl[6]=ipad;
				rowtbl[7]=macad;
				rowtbl[8]="accept";
				rowtbl[9]="reject";
				
				
			
				
				tbl.addRow(rowtbl);
				
		        scrollPane.setViewportView(table);
				
				
				
				}
				
				
				
				
				
				
				
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		
		userreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_userreg);
				panel_2.repaint();
				panel_2.revalidate();
			}
		});
		
		userdet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_userdet);
				panel_2.repaint();
				panel_2.revalidate();
				

				DefaultTableModel tblusr = new DefaultTableModel(0,0);
				
				tblusr.addColumn("Sl No.");
				tblusr.addColumn("id");
				tblusr.addColumn("Name");
				tblusr.addColumn("Email");
				tblusr.addColumn("Contact");
				tblusr.addColumn("Username");
				tblusr.addColumn("Department");
				tblusr.addColumn("Designation");
				tblusr.addColumn("Delete");
				
				
				
				Object rowtblusr[] = new Object[9];
				
				
				
				table_1.setRowSelectionAllowed(true);
				table_1.setModel(tblusr);
				table_1.getColumn("Delete").setCellRenderer(new ButtonRendererusr());
				table_1.getColumn("Delete").setCellEditor(
			        new ButtonEditorusr(new JCheckBox()));
				
				
				scrollPane_1.setViewportView(table_1);
				
				
				
				tblusr.getDataVector().removeAllElements();
				tblusr.fireTableDataChanged();
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from signin WHERE acctype='user' and status=0";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				int i =0;
				int slno=0;
				while(rs.next())
				{
					i=i+1;
				slno = slno+1;
				String id=rs.getString("id");
				String nme = rs.getString("name");
				String emailid = rs.getString("email");
				String mob = rs.getString("contact");
				String uname = rs.getString("username");
				String dept = rs.getString("department");
				String desig = rs.getString("designation");
				
				
				rowtblusr[0]=slno;
				rowtblusr[1]=id;
				rowtblusr[2]=nme;
				rowtblusr[3]=emailid;
				rowtblusr[4]=mob;
				rowtblusr[5]=uname;
				rowtblusr[6]=dept;
				rowtblusr[7]=desig;
				rowtblusr[8]="Delete";
				
				
			
				
				tblusr.addRow(rowtblusr);
				
		        scrollPane_1.setViewportView(table_1);
				
				
				
				}
				
				
				
				
				
				
				
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		hostscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_host);
				panel_2.repaint();
				panel_2.revalidate();
				
				
				DefaultTableModel tbl5 = new DefaultTableModel(0,0);
				
				tbl5.addColumn("Sl No.");
				tbl5.addColumn("Host IP");
				tbl5.addColumn("Status");
				
				
				
				Object rowtbl1[] = new Object[3];
				
				
				
				table_2.setRowSelectionAllowed(true);
				table_2.setModel(tbl5);
				
				
				scrollPane_2.setViewportView(table_2);
				
				
				
				tbl5.getDataVector().removeAllElements();
				tbl5.fireTableDataChanged();
				
				hostscanbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
				
				String ip1= textField.getText();
				String ip2= textField_1.getText();
				String ip3= textField_2.getText();
				String ip4= textField_3.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate localDate = LocalDate.now();
				String date = dtf.format(localDate);
				System.out.println(date);
				
		
				
					
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connhost = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
					Statement smthost=null;
					
					String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','Host Scaning')";
					smthost=connhost.createStatement();
			                      @SuppressWarnings("unused")
								int j=smthost.executeUpdate(sql);
			                      
			                      
			                      
			                      int slno=1;
			  					
			  					
			  					
			  					
			  					for ( ;i < 4; i++)
			  			        {
			  					
			  			            String host = subnet + "." + i;
			  			            String command = "ping " + host;
			  			            
			  			            try{
			  			    			Process sysProcess = Runtime.getRuntime().exec(command);
			  			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			  			    			
			  			    			int pings = 0;
			  			    			@SuppressWarnings("unused")
			  							int timeouts = 0;
			  			    			@SuppressWarnings("unused")
			  							int other = 0;
			  			    			
			  			    			
			  			    			String line;
			  			    			while((line = streamReader.readLine()) != null){
			  			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
			  			    				
			  			    					timeouts++;
			  			    					
			  			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
			  			    					
			  			    					
			  			    					pings++;
			  			    				}else if(line.contains("Request timed out") & line.contains(" TTL=")) {
			  			    					
			  			    					pings++;
			  			    				}
			  			    			}
			  			    			if (pings > 0){
			  			    				
			  			    				rowtbl1[0] = slno;
			  			    				rowtbl1[1] = host;
			  			    				rowtbl1[2] = "Host Found";
			  			    		        
			  			    				tbl5.addRow(rowtbl1);
			  			    		        scrollPane_2.setViewportView(table_2);
			  			    		        
			  			    		        slno++;
			  			    		        		    							
			  			    				 
			  			    		        try
			  			    				{ 
			  			    				Class.forName("com.mysql.jdbc.Driver"); 
			  			    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
			  			    				String sql1 = "select MAX(id) FROM scaninfo";
			  			    				PreparedStatement ps = con1.prepareStatement(sql1);
			  			    				ResultSet rs = ps.executeQuery();
			  			    				if(rs.next()){
			  			    				String id= rs.getString(1);
			  			    				System.out.println(id);
			  			    				
			  			    				
			  			    				
			  			    				try
			  			    				{
			  			    								  			    				
			  			    			String sql3="INSERT INTO hostscan(scanid,ipaddress,result) VALUES ('"+id+"','"+host+"','success')";
			  			    			Statement smt=con1.createStatement();
			  			    	                      @SuppressWarnings("unused")
			  										int k=smt.executeUpdate(sql3);
			  			    	                     
			  			    				}
			  			    	                    catch(Exception ex)
			  			    				{
			  			    					System.out.println(ex);
			  			    				}
			  			    				
			  			    				
			  			    				}
			  			    				}catch(Exception ex)
			  			    				{
			  			    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			  			    				JOptionPane.ERROR_MESSAGE);
			  			    				}
			  			    		        
			  			    				System.out.println("ping successful in " + host );
			  			    			}else {
			  			    				
			  			    				
			  			    				System.out.println("ping failed in " + host);
			  			    			}
			  			    			
			  			    			
			  			    		}catch (IOException ex){
			  			    			System.err.println(ex.getMessage());
			  			    		}
			  			            
			  			        }
					
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
				
					}
				});
				
				
//				try
//				{ 
//				Class.forName("com.mysql.jdbc.Driver"); 
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
//				String sql = "select * from devreg WHERE status=0";
//				PreparedStatement ps = con.prepareStatement(sql);
//				ResultSet rs = ps.executeQuery();
//				int i =0;
//				int slno=0;
//				while(rs.next())
//				{
//					i=i+1;
//				slno = slno+1;
//				String id=rs.getString("id");
//				String nme = rs.getString("name");
//				String emailid = rs.getString("email");
//				@SuppressWarnings("unused")
//				String mob = rs.getString("contact");
//				@SuppressWarnings("unused")
//				String uname = rs.getString("username");
//				@SuppressWarnings("unused")
//				String dept = rs.getString("department");
//				@SuppressWarnings("unused")
//				String desig = rs.getString("designation");
//				String devnme = rs.getString("devname");
//				String devtyp = rs.getString("devtype");
//				String ipad = rs.getString("ipadd");
//				String macad = rs.getString("macadd");
//				
//				rowtbl[0]=slno;
//				rowtbl[1]=id;
//				rowtbl[2]=nme;
//				rowtbl[3]=emailid;
//				rowtbl[4]=devnme;
//				rowtbl[5]=devtyp;
//				rowtbl[6]=ipad;
//				rowtbl[7]=macad;
//				rowtbl[8]="accept";
//				rowtbl[9]="reject";
//				
//				
//			
//				
//				tbl.addRow(rowtbl);
//				
//		        scrollPane.setViewportView(table);
//				
//				
//				
//				}
//				
//				
//				
//				
//				
//				
//				
//				}catch(Exception ex)
//				{
//				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
//				JOptionPane.ERROR_MESSAGE);
//				}
				
				
				
				
				
			}
		});
		
		osdet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_os);
				panel_2.repaint();
				panel_2.revalidate();
				
				
				
									
				
				DefaultTableModel tbl6 = new DefaultTableModel(0,0);
				
				tbl6.addColumn("Sl No.");
				tbl6.addColumn("Host IP");
				tbl6.addColumn("Os detected");
				
				
				
				Object rowtbl2[] = new Object[3];
				
				
				
				table_5.setRowSelectionAllowed(true);
				table_5.setModel(tbl6);
				
				
				scrollPane_3.setViewportView(table_5);
				
				
				
				tbl6.getDataVector().removeAllElements();
				tbl6.fireTableDataChanged();
				
				btnOsDetection.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
				String ip1= textField_4.getText();
				String ip2= textField_5.getText();
				String ip3= textField_6.getText();
				String ip4= textField_7.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate localDate = LocalDate.now();
				String date = dtf.format(localDate);
				System.out.println(date);
				
				try
			         				{
			                    	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
			      					Statement smt=null;
			         				
			         			String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','Os detection')";
			         			smt=con.createStatement();
			         	                      @SuppressWarnings("unused")
											int k=smt.executeUpdate(sql);
			         	                      
			         				}
			         	                    catch(Exception ex)
			         				{
			         					System.out.println(ex);
			         				}
			     					
			     					int slno=1;
			     					
			     					for ( ;i < 4; i++)
			     			        {
			     					
			     			            String host = subnet + "." + i;
			     			            String command = "ping " + host;
			     			            try{
			     			    			Process sysProcess = Runtime.getRuntime().exec(command);
			     			    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
			     			    			
			     			    			int pings = 0;
			     			    			@SuppressWarnings("unused")
											int timeouts = 0;
			     			    			@SuppressWarnings("unused")
											int other = 0;
			     			    			
			     			    			
			     			    			String line;
			     			    			String OsType="";
			     			    			while((line = streamReader.readLine()) != null){
			     			    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
			     			    				
			     			    					timeouts++;
			     			    					
			     			    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
			     			    					
			     			    					
			     			    					pings++;
			     			    				}
			     			    				
			     			    				if(line.contains(" TTL=128")){
			     			    					
			     			    					OsType="Windows";
			     			    				}else if(line.contains(" TTL=64")){
			     			    					
			     			    					OsType="Linux kernel os";
			     			    				}else if(line.contains(" TTL=225")){
			     			    					
			     			    					OsType="Linux kernel 2.2.14 or 2.4 os";
			     			    				}else if(line.contains(" TTL=60")){
			     			    					
			     			    					OsType="Mac";
			     			    				}
			     			    			}
			     			    			if (pings > 0){
			     			    				
			     			   				try
			    			    				{ 
			    			    				Class.forName("com.mysql.jdbc.Driver"); 
			    			    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
			    			    				String sql1 = "select MAX(id) FROM scaninfo";
			    			    				PreparedStatement ps = con1.prepareStatement(sql1);
			    			    				ResultSet rs = ps.executeQuery();
			    			    				if(rs.next()){
			    			    				String id= rs.getString(1);
			    			    				System.out.println(id);
			    			    				
			    			    				
			    			    				
			    			    				try
			    			    				{
			    			    					Connection connhost1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
			    			    					Statement smthost1=null;
			    			    			String sql3="INSERT INTO osscan(scanid,ipaddress,result) VALUES ('"+id+"','"+host+"','"+OsType+"')";
			    			    			smthost1=connhost1.createStatement();
			    			    	                      @SuppressWarnings("unused")
														int l=smthost1.executeUpdate(sql3);
			    			    	                              
			    			    				}
			    			    	                    catch(Exception ex)
			    			    				{
			    			    					System.out.println(ex);
			    			    				}
			    			    				
			    			    				
			    			    				}
			    			    				}catch(Exception ex)
			    			    				{
			    			    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
			    			    				JOptionPane.ERROR_MESSAGE);
			    			    				}
			     			    				
			     			    				
			     			    				System.out.println(OsType);     			    				
			     			    				System.out.println("ping successful in " + host );
			     			    		       
			     			    				rowtbl2[0] = slno;
			     			    				rowtbl2[1] = host;
			     			    				rowtbl2[2]=OsType;
							    		        
			     			    				tbl6.addRow(rowtbl2);
			     			    				scrollPane_3.setViewportView(table_5);
			     					    		           
							    		        slno++;      			    		        
			     			    		        
			     			    				
			     			    			}else {
			     			    				
			     			    				
			     			    			}
			     			    			
			     			    			
			     			    		}catch (IOException ex){
			     			    			System.err.println(ex.getMessage());
			     			    		}
			     			            
			     			        }
			     				
					
					}
				});
					
				
				
				
			}
		});
		
		portscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_port);
				panel_2.repaint();
				panel_2.revalidate();
				
				
DefaultTableModel tbl7 = new DefaultTableModel(0,0);
				
				tbl7.addColumn("Sl No.");
				tbl7.addColumn("Host IP");
				tbl7.addColumn("Port");
				tbl7.addColumn("Status");
				
				
				
				Object rowtbl3[] = new Object[4];
				
				
				
				table_6.setRowSelectionAllowed(true);
				table_6.setModel(tbl7);
				
				
				scrollPane_4.setViewportView(table_6);
				
				
				
				tbl7.getDataVector().removeAllElements();
				tbl7.fireTableDataChanged();
				
				btnPortScanning.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
				String ip1= textField_8.getText();
				String ip2= textField_9.getText();
				String ip3= textField_10.getText();
				String ip4= textField_11.getText();
				
				int i =Integer.parseInt(ip4);
				
				String subnet = ip1 + "." + ip2 + "." + ip3;
				System.out.println(subnet);
				
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
				LocalDate localDate = LocalDate.now();
				String date = dtf.format(localDate);
				System.out.println(date);
				
				 try
  				{
  					
					 Class.forName("com.mysql.jdbc.Driver"); 
	    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
	    				
  			String sql="INSERT INTO scaninfo(date,scantype) VALUES ('"+date+"','Port Scaning')";
  			Statement smt=con1.createStatement();
  	                      @SuppressWarnings("unused")
							int j=smt.executeUpdate(sql);
  	                      
  				}
  	                    catch(Exception ex)
  				{
  					System.out.println(ex);
  				}
				
				int slno=1;
				
				for ( ;i < 4; i++)
		        {
				
		            String host = subnet + "." + i;
		            String command = "ping " + host;
		           
		            try{
		    			Process sysProcess = Runtime.getRuntime().exec(command);
		    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
		    			
		    			int pings = 0;
		    			@SuppressWarnings("unused")
						int timeouts = 0;
		    			@SuppressWarnings("unused")
						int other = 0;
		    			
		    			
		    			String line;
		    			while((line = streamReader.readLine()) != null){
		    				if(line.contains("Destination host unreachable") || line.contains("Request timed out")){
		    				
		    					timeouts++;
		    					
		    				}else if(line.contains(" time=") || line.contains(" TTL=")) {
		    					
		    					
		    					pings++;
		    				}else if(line.contains("Request timed out") & line.contains(" TTL=")) {
		    					
		    					pings++;
		    				}
		    			}
		    			if (pings > 0){
		 			
		    				System.out.println("ping successful in " + host );
		    		        for (int port = 1; port <= 3000; port++) {
		    		        	
		    			         try {
		    			            Socket socket = new Socket();
		    			            socket.connect(new InetSocketAddress(host, port), 1);
		    			            socket.close();
		    			            
		    			          String msg="";  
		    			         if(port == 21)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 22)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 23)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 25)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 53)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 443)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 110)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 135)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 137)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 138)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 139)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 1433)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else if(port == 1434)   {
		    			        	 msg="Vulnerable";
		    			         
		    			            rowtbl3[0] = slno;
		    			            rowtbl3[1] = host;
		    			            rowtbl3[2]=port;
		    			            rowtbl3[3] = msg;
				    		       
				    		      
		    			            tbl7.addRow(rowtbl3);
		    			            scrollPane_4.setViewportView(table_6);
				    		        
				    		        slno++;
				    		        
				    		        
				    		        try
				    				{ 
				    				Class.forName("com.mysql.jdbc.Driver"); 
				    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    				String sql = "select MAX(id) FROM scaninfo";
				    				PreparedStatement ps = con1.prepareStatement(sql);
				    				ResultSet rs = ps.executeQuery();
				    				if(rs.next()){
				    				String id= rs.getString(1);
				    				System.out.println(id);
				    				
				    				
				    				
				    				try
				    				{
				    					Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
				    			Statement smt1=con2.createStatement();
				    	                      @SuppressWarnings("unused")
											int j=smt1.executeUpdate(sql3);
				    	                      //int i1=smt.executeUpdate(sql1);
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    		        
		    			         }else {
		    			        	 
		    			        	 
		    			        	 msg="";
			    			         
			    			            rowtbl3[0] = slno;
			    			            rowtbl3[1] = host;
			    			            rowtbl3[2]=port;
			    			            rowtbl3[3] = msg;
					    		       
					    		      
			    			            tbl7.addRow(rowtbl3);
			    			            scrollPane_4.setViewportView(table_6);
					    		        
					    		        slno++;
					    		        
					    		        
					    		        try
					    				{ 
					    				Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
					    				String sql = "select MAX(id) FROM scaninfo";
					    				PreparedStatement ps = con1.prepareStatement(sql);
					    				ResultSet rs = ps.executeQuery();
					    				if(rs.next()){
					    				String id= rs.getString(1);
					    				//System.out.println(id);
					    				
					    				
					    				
					    				try
					    				{
					    					Class.forName("com.mysql.jdbc.Driver"); 
						    				Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
					    			String sql3="INSERT INTO portscan(scanid,ipaddress,port,result,status) VALUES ('"+id+"','"+host+"','"+port+"','success','"+msg+"')";
					    			Statement smt1=con2.createStatement();
					    	                      @SuppressWarnings("unused")
												int j=smt1.executeUpdate(sql3);
					    	                      //int i1=smt.executeUpdate(sql1);
					    	                     
					    				}
					    	                    catch(Exception ex)
					    				{
					    					System.out.println(ex);
					    				}
					    				
					    				
					    				}
					    				}catch(Exception ex)
					    				{
					    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
					    				JOptionPane.ERROR_MESSAGE);
					    				}
		    			        	 
		    			        	 
		    			         }
		    			         
		    			            
		    			            System.out.println("Port " + port + " is open on " + host);
		    			            
		    			        } catch (Exception ex) {
		    			        }
		    			      }	
		    		        
		    		        
		    				
		    			}else {
		    				
		    				
		    			}
		    			
		    			
		    		}catch (IOException ex){
		    			System.err.println(ex.getMessage());
		    		}
		            
		        }
			     				
					
					}
				});
				
				
				
				
			}
		});
		
		ids.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_2.removeAll();
				panel_2.add(panel_ids);
				panel_2.repaint();
				panel_2.revalidate();
				
DefaultTableModel tbl8 = new DefaultTableModel(0,0);
				
				tbl8.addColumn("Sl No.");
				tbl8.addColumn("IP Address");
				tbl8.addColumn("MAC Address");
				tbl8.addColumn("Status");
				
				
				
				Object rowtbl4[] = new Object[4];
				
				
				
				table_7.setRowSelectionAllowed(true);
				table_7.setModel(tbl8);
				
				
				scrollPane_5.setViewportView(table_7);
				
				
				
				tbl8.getDataVector().removeAllElements();
				tbl8.fireTableDataChanged();
				
				btnIdsScanning.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String ip1= textField_12.getText();
						String ip2= textField_13.getText();
						String ip3= textField_14.getText();
						String ip4= textField_15.getText();
						
						int i =Integer.parseInt(ip4);
						
						String subnet = ip1 + "." + ip2 + "." + ip3;
						System.out.println(subnet);
						
						
						int slno=1;
						
						
						
						
						for ( ;i < 5; i++)
				        {
						
				            String host = subnet + "." + i;
				            String command = "ping " + host;
				            
				            try{
				    			Process sysProcess = Runtime.getRuntime().exec(command);
				    			BufferedReader streamReader = new BufferedReader(new InputStreamReader(sysProcess.getInputStream()));
				    			
				    			int pings = 0;
				    			@SuppressWarnings("unused")
								int timeouts = 0;
				    			@SuppressWarnings("unused")
								int other = 0;
				    			
				    			
				    			String line1;
				    			while((line1 = streamReader.readLine()) != null){
				    				if(line1.contains("Destination host unreachable") || line1.contains("Request timed out")){
				    				
				    					timeouts++;
				    					
				    				}else if(line1.contains(" time=") || line1.contains(" TTL=")) {
				    					
				    					
				    					pings++;
				    				}else if(line1.contains("Request timed out") & line1.contains(" TTL=")) {
				    					
				    					pings++;
				    				}
				    			}
				    			if (pings > 0){
				    				
				    				
				    				Runtime rt = Runtime.getRuntime();
				    			       Process pr = rt.exec("arp -a " + host );

				    			        BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				    			        @SuppressWarnings({ "resource", "unused" })
										FileOutputStream fout=new FileOutputStream("F:\\output1.txt");
				    			     
				    			        String line=null;
				    			        while((line=input.readLine()) != null) {
				    			        	
				    			        	StringTokenizer defaultTokenizer = new StringTokenizer(line);
				    			            String test; 
				    			            while (defaultTokenizer.hasMoreTokens())
				    			            {
				    			    test=defaultTokenizer.nextToken();
				    			             
				    			    Pattern p = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
				    		        Matcher m = p.matcher(test);
				    		     
				    			   if(m.find()==true)
				    			   {
				    				  		
				    				   Class.forName("com.mysql.jdbc.Driver"); 
					    				Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				    					java.sql.Statement smt=null;
				    					java.sql.ResultSet rs=null;
				    					try{
				    						
				    						String sql="select * from devreg where macadd='"+test+"' and status='1'";
				    						
				    						smt=con3.createStatement();
				    						rs=smt.executeQuery(sql);
				    						
				    						//System.out.println(test);
				    						
				    			int flag=0;
				    						if(rs.next() )
				    						{
				    							
				    							
				    							flag=1;
				    							@SuppressWarnings("unused")
												String Address=rs.getString("macadd");
				    					
				    						}
				    						if(flag==0)
				    						{
				    							
				    							
				    						
						    					java.sql.Statement smt1=null;
						    					try{
				    							
				    							
				    							String st="Indtruder Detected";
				    							
				    			    			String sql3="INSERT INTO ids(ipadd,macadd,result) VALUES ('"+host+"','"+test+"','"+st+"')";
				    			    			smt1=con3.createStatement();
				    			    	        @SuppressWarnings("unused")
												int j=smt1.executeUpdate(sql3);
				    							
						    					}catch (Exception id){
						    						
						    						System.out.println(id);
						    						
						    					}
				    							
				    							rowtbl4[0]=slno; 
				    							rowtbl4[1]=host;
				    							rowtbl4[2]=test;
				    							rowtbl4[3]="Indtruder Detected";
				    							tbl8.addRow(rowtbl4);
						    					scrollPane_5.setViewportView(table_7);
				    							
				    							
				    							
				    							System.out.println("Intruder Detected "+test);
				    							
				    							 slno++;
				    							
				    						}
				    				}
				    					catch(Exception exx)
				    			{
				    						System.out.println(exx);
				    						}
				    			   }
				    			            }
				    			        
				    			        	
				    			        }
				    			        @SuppressWarnings("unused")
										int exitVal = pr.waitFor();
				    				
				    				
				    				
				    		        
				    		       
				    		        		    							
				    				 
				    		         				
				    				try
				    				{
				    					
				    				    	                      
				    	                     
				    				}
				    	                    catch(Exception ex)
				    				{
				    					System.out.println(ex);
				    				}
				    				
				    				
				    				}
				    				}catch(Exception ex)
				    				{
				    				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				    				JOptionPane.ERROR_MESSAGE);
				    				}
				    		        
				    				System.out.println("ping successful in " + host );
				    			}
					}
				});
				
				
				
			}
		});
		
		
		scanrep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.removeAll();
				panel_2.add(panel_scanrep);
				panel_2.repaint();
				panel_2.revalidate();
				
DefaultTableModel tbl9 = new DefaultTableModel(0,0);
				
				tbl9.addColumn("Sl No.");
				tbl9.addColumn("Id");
				tbl9.addColumn("Date");
				tbl9.addColumn("Scan Type");
				tbl9.addColumn("Action");
				
				
				
				Object rowtbl5[] = new Object[5];
				
				
				table_8.setRowSelectionAllowed(true);
				table_8.setModel(tbl9);

				table_8.getColumn("Action").setCellRenderer(new ButtonRendererv());
				table_8.getColumn("Action").setCellEditor(
			        new ButtonEditorv(new JCheckBox()));
				
				
				scrollPane_6.setViewportView(table_8);
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from scaninfo ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String id=rs.getString("id");
				String dat = rs.getString("date");
				String stype = rs.getString("scantype");
				
				
				rowtbl5[0]=slno;
				rowtbl5[1]=id;				
				rowtbl5[2]=dat;
				rowtbl5[3]=stype;
				rowtbl5[4]="View Report";
				
				tbl9.addRow(rowtbl5);
		        scrollPane_6.setViewportView(table_8);
				
				
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		
		
		
		user_submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String u_name=user_name.getText();
				String u_email=user_email.getText();
				String u_contact=user_contact.getText();
				char[] u_pas=user_password.getPassword();
				String u_pass=String.copyValueOf(u_pas);
				char[] u_repas=user_repass.getPassword();
				String u_repass=String.copyValueOf(u_repas);
				String u_desig=user_desig.getText();
				String u_dept=user_dept.getText();
				
				
				
				Emailvalidator emailValidator = new Emailvalidator();
				Pattern pattern = Pattern.compile("\\d{10}");
			      Matcher matcher = pattern.matcher(u_contact);
			      
			      if(!emailValidator.validate(user_email.getText().trim())) {
				        System.out.print("Invalid Email ID");
				        
				        emailerror.setText(" * Invalid Email ID");
				       
				   }
			      Mobvalidator mobValidator = new Mobvalidator();
			      if(!mobValidator.validate(user_contact.getText().trim())) {
				        System.out.print("Invalid number");
				        
				        moberror.setText("* invalid number");
				       
				   }else {
			      
					 
			      
			     
				   
				if(u_pass.equals(u_repass)){
                    
                    try
			{
                     Class.forName("com.mysql.jdbc.Driver");
               		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
			
		String sql="INSERT INTO signin(name,email,contact,username,password,designation,department,acctype)VALUES('"+u_name+"','"+u_email+"','"+u_contact+"','"+u_email+"','"+u_pass+"','"+u_desig+"','"+u_dept+"','user');";
                      Statement smt=con.createStatement();
                      @SuppressWarnings("unused")
					int i=smt.executeUpdate(sql);
                      
                    user_name.setText(null);
      				user_email.setText(null);
      				user_contact.setText(null);
      				user_password.setText(null);
      				user_repass.setText(null);
      				user_desig.setText(null);
      				user_dept.setText(null);
      				emailerror.setText(null);
      				moberror.setText(null);
      				
                        
                        }
                    catch(Exception ex)
			{
				System.out.println(ex);
			}
				 }     
                    				
				   }  
				
				
				
				
			}
		});
		
		
		
		
		
		
	}
}











@SuppressWarnings("serial")
class ButtonRenderer extends JButton implements TableCellRenderer {

	  public ButtonRenderer() {
	    setOpaque(true);
	  }

	  public Component getTableCellRendererComponent(JTable table_4, Object value,
	      boolean isSelected, boolean hasFocus, int row, int column) {
	    if (isSelected) {
	      setForeground(table_4.getSelectionForeground());
	      setBackground(table_4.getSelectionBackground());
	    } else {
	      setForeground(table_4.getForeground());
	      setBackground(UIManager.getColor("Button.background"));
	    }
	    setText((value == null) ? "" : value.toString());
	    return this;
	  }
	}



	@SuppressWarnings("serial")
	class ButtonEditor extends DefaultCellEditor {
	  protected JButton button;

	  private String label;

	  private boolean isPushed;

	  public ButtonEditor(JCheckBox checkBox) {
	    super(checkBox);
	    button = new JButton();
	    button.setOpaque(true);
	    button.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	    	  //table update code should be write here
	        fireEditingStopped();
	      }
	    });
	  }

	  public Component getTableCellEditorComponent(JTable table_4, Object value,
	      boolean isSelected, int row, int column) {
	    if (isSelected) {
	      button.setForeground(table_4.getSelectionForeground());
	      button.setBackground(table_4.getSelectionBackground());
	    } else {
	      button.setForeground(table_4.getForeground());
	      button.setBackground(table_4.getBackground());
	    }
	    @SuppressWarnings("unused")
		Object label1 = (value == null) ? "" : value.toString();
	  //  label=Integer.toString(table_4.getSelectedRow());
	    
	    int selctrow = table_4.getSelectedRow();
	    label = (String) table_4.getValueAt(selctrow, 1);
	    
	   // label= data.toString();
	    button.setText("Accepted");
	    isPushed = true;
	    return button;
	  }

	  public Object getCellEditorValue() {
	    if (isPushed) {
	      
	    	    	
	    	System.out.println(label);
	    	
	      JOptionPane.showMessageDialog(button, label);
	     
	        
			String st="1";
			try
			{
				
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				Statement smt=null;
		String sql="UPDATE devreg SET status='"+st+"' WHERE id='"+label+"' ";              
		smt=con.createStatement();
                      @SuppressWarnings("unused")
					int i=smt.executeUpdate(sql);
                      
                                          
                        }
                    catch(Exception ex)
			{
				System.out.println(ex);
			}
	      
	      
	      
	    }
	    isPushed = false;
	    return new String("Accepted");
	  }

	  public boolean stopCellEditing() {
	    isPushed = false;
	    return super.stopCellEditing();
	  }

	  protected void fireEditingStopped() {
	    super.fireEditingStopped();
	  }
	}

	@SuppressWarnings("serial")
	class ButtonRendererrej extends JButton implements TableCellRenderer {

		  public ButtonRendererrej() {
		    setOpaque(true);
		  }

		  public Component getTableCellRendererComponent(JTable table_4, Object value,
		      boolean isSelected, boolean hasFocus, int row, int column) {
		    if (isSelected) {
		      setForeground(table_4.getSelectionForeground());
		      setBackground(table_4.getSelectionBackground());
		    } else {
		      setForeground(table_4.getForeground());
		      setBackground(UIManager.getColor("Button.background"));
		    }
		    setText((value == null) ? "" : value.toString());
		    return this;
		  }
		}



		@SuppressWarnings("serial")
		class ButtonEditorrej extends DefaultCellEditor {
		  protected JButton button;

		  private String label;

		  private boolean isPushed;

		  public ButtonEditorrej(JCheckBox checkBox) {
		    super(checkBox);
		    button = new JButton();
		    button.setOpaque(true);
		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		    	  //table update code should be write here
		    	 
		        fireEditingStopped();
		      }
		    });
		  }

		  public Component getTableCellEditorComponent(JTable table_4, Object value,
		      boolean isSelected, int row, int column) {
		    if (isSelected) {
		      button.setForeground(table_4.getSelectionForeground());
		      button.setBackground(table_4.getSelectionBackground());
		    } else {
		      button.setForeground(table_4.getForeground());
		      button.setBackground(table_4.getBackground());
		    }
		    @SuppressWarnings("unused")
			Object label1 = (value == null) ? "" : value.toString();
		  //  label=Integer.toString(table_4.getSelectedRow());
		    
		    
		    int selctrow = table_4.getSelectedRow();
		    label = (String) table_4.getValueAt(selctrow, 1);
		    
		   // label= data.toString();
		    button.setText("Rejected");
		    isPushed = true;
		    return button;
		  }

		  public Object getCellEditorValue() {
		    if (isPushed) {
		      
		    	    	
		    	System.out.println( "reject " +label);
		    	
		      JOptionPane.showMessageDialog(null, label + " reject");
		      
		    
				String st="2";
				try
				{

					Class.forName("com.mysql.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
					Statement smt=null;
				
			String sql="UPDATE devreg SET status='"+st+"' WHERE id='"+label+"' ";              
			smt=con.createStatement();
	                      @SuppressWarnings("unused")
						int i=smt.executeUpdate(sql);
	                      
	                                          
	                        }
	                    catch(Exception ex)
				{
					System.out.println(ex);
				}
		      
		      
		      
		    }
		    isPushed = false;
		    return new String("Rejected");
		    
		  }

		  public boolean stopCellEditing() {
		    isPushed = false;
		    return super.stopCellEditing();
		  }

		  protected void fireEditingStopped() {
		    super.fireEditingStopped();
		  }
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@SuppressWarnings("serial")
		class ButtonRendererusr extends JButton implements TableCellRenderer {

			  public ButtonRendererusr() {
			    setOpaque(true);
			  }

			  public Component getTableCellRendererComponent(JTable table_1, Object value,
			      boolean isSelected, boolean hasFocus, int row, int column) {
			    if (isSelected) {
			      setForeground(table_1.getSelectionForeground());
			      setBackground(table_1.getSelectionBackground());
			    } else {
			      setForeground(table_1.getForeground());
			      setBackground(UIManager.getColor("Button.background"));
			    }
			    setText((value == null) ? "" : value.toString());
			    return this;
			  }
			}


			@SuppressWarnings("serial")
			class ButtonEditorusr extends DefaultCellEditor {
			  protected JButton button;

			  private String label;

			  private boolean isPushed;

			  public ButtonEditorusr(JCheckBox checkBox) {
			    super(checkBox);
			    button = new JButton();
			    button.setOpaque(true);
			    button.addActionListener(new ActionListener() {
			      public void actionPerformed(ActionEvent e) {
			    	  //table update code should be write here
			        fireEditingStopped();
			      }
			    });
			  }

			  public Component getTableCellEditorComponent(JTable table_1, Object value,
			      boolean isSelected, int row, int column) {
			    if (isSelected) {
			      button.setForeground(table_1.getSelectionForeground());
			      button.setBackground(table_1.getSelectionBackground());
			    } else {
			      button.setForeground(table_1.getForeground());
			      button.setBackground(table_1.getBackground());
			    }
			    @SuppressWarnings("unused")
				Object label1 = (value == null) ? "" : value.toString();
			  //  label=Integer.toString(table_4.getSelectedRow());
			    
			    int selctrow = table_1.getSelectedRow();
			    label = (String) table_1.getValueAt(selctrow, 1);
			    
			   // label= data.toString();
			    button.setText("Deleted");
			    isPushed = true;
			    return button;
			  }

			  public Object getCellEditorValue() {
			    if (isPushed) {
			      
			    	    	
			    	System.out.println(label);
			    	
			      JOptionPane.showMessageDialog(button, label);
			     
			        
					String st="1";
					try
					{
						
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
						Statement smt=null;
				String sql="UPDATE signin SET status='"+st+"' WHERE id='"+label+"' ";              
				smt=con.createStatement();
		                      @SuppressWarnings("unused")
							int i=smt.executeUpdate(sql);
		                      
		                                          
		                        }
		                    catch(Exception ex)
					{
						System.out.println(ex);
					}
			      
			      
			      
			    }
			    isPushed = false;
			    return new String("Deleted");
			  }

			  public boolean stopCellEditing() {
			    isPushed = false;
			    return super.stopCellEditing();
			  }

			  protected void fireEditingStopped() {
			    super.fireEditingStopped();
			  }
			}
			
			
			
			
			
			@SuppressWarnings("serial")
			class ButtonRendererv extends JButton implements TableCellRenderer {

				  public ButtonRendererv() {
				    setOpaque(true);
				  }

				  public Component getTableCellRendererComponent(JTable table_1, Object value,
				      boolean isSelected, boolean hasFocus, int row, int column) {
				    if (isSelected) {
				      setForeground(table_1.getSelectionForeground());
				      setBackground(table_1.getSelectionBackground());
				    } else {
				      setForeground(table_1.getForeground());
				      setBackground(UIManager.getColor("Button.background"));
				    }
				    setText((value == null) ? "" : value.toString());
				    return this;
				  }
				}



				@SuppressWarnings("serial")
				class ButtonEditorv extends DefaultCellEditor {
				  protected JButton button;
				  static String idsc;
				  static String type;
				  private String label;

				  private boolean isPushed;
				@SuppressWarnings("unused")
				private Object frame;

				  public ButtonEditorv(JCheckBox checkBox) {
				    super(checkBox);
				    button = new JButton();
				    button.setOpaque(true);
				    button.addActionListener(new ActionListener() {
				      public void actionPerformed(ActionEvent e) {
				    	  //table update code should be write here
				        fireEditingStopped();
				      }
				    });
				  }

				  public Component getTableCellEditorComponent(JTable table_1, Object value,
				      boolean isSelected, int row, int column) {
				    if (isSelected) {
				      button.setForeground(table_1.getSelectionForeground());
				      button.setBackground(table_1.getSelectionBackground());
				    } else {
				      button.setForeground(table_1.getForeground());
				      button.setBackground(table_1.getBackground());
				    }
				    @SuppressWarnings("unused")
					Object label1 = (value == null) ? "" : value.toString();
				  //  label=Integer.toString(table_4.getSelectedRow());
				    
				    int selctrow = table_1.getSelectedRow();
				    label = (String) table_1.getValueAt(selctrow, 1);
				    
				   // label= data.toString();
				    button.setText(label);
				    isPushed = true;
				    return button;
				  }

				  public Object getCellEditorValue() {
				    if (isPushed) {
				      
				    	    	
				    	System.out.println( "reject " +label);
				    	
				    //  JOptionPane.showMessageDialog(button, label + " reject");
				     
				     	
				      try
						{ 
						Class.forName("com.mysql.jdbc.Driver"); 
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
						String sql = "select * from scaninfo where id='"+label+"' ";
						PreparedStatement ps = con.prepareStatement(sql);
						ResultSet rs = ps.executeQuery();
						@SuppressWarnings("unused")
						int i =0;
						@SuppressWarnings("unused")
						int slno=0;
						if(rs.next())
						{
							String type=rs.getString("scantype");
							String idsc=rs.getString("id");
							
							if(type.equals("Host Scaning")){
							Showresulthost window = new Showresulthost(idsc);
	                    	window.setVisible(true);
	                    	//adminhome.frame.dispose();
							}
							
							
							if(type.equals("Port Scaning")){
								Showresultport window = new Showresultport(idsc);
		                    	window.setVisible(true);
		                    	//adminhome.frame.dispose();
								}
							if(type.equals("Os detection")){
								Showresultos window = new Showresultos(idsc);
		                    	window.setVisible(true);
		                    	//adminhome.frame.dispose();
								}
							
						}
						}catch(Exception ex)
						{
						JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
						JOptionPane.ERROR_MESSAGE);
						}
				      
				     // System.out.println(type);
				    }
				    isPushed = false;
				    return new String(label);
				  }

				  public boolean stopCellEditing() {
				    isPushed = false;
				    return super.stopCellEditing();
				  }

				  protected void fireEditingStopped() {
				    super.fireEditingStopped();
				  }
				}



