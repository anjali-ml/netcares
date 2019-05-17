package netcaremain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class user {

	JFrame frame;
	private static String username;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user window = new user(username);
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
//	public user() {
//		
//	}

	public user(String username) {
		// TODO Auto-generated constructor stub
		initialize();
		this.username=username;
		System.out.println(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 787, 423);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 787, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUserPanel = new JLabel("USER PANEL");
		lblUserPanel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUserPanel.setForeground(Color.WHITE);
		lblUserPanel.setBounds(37, 11, 201, 28);
		panel_1.add(lblUserPanel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 0));
		panel_2.setBounds(0, 51, 193, 372);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBackground(new Color(255, 102, 0));
		
		btnNewButton.setBounds(0, 0, 193, 40);
		panel_2.add(btnNewButton);
		
		JButton btnDeviceRegistration = new JButton("Device Registration");
		btnDeviceRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeviceRegistration.setBackground(new Color(255, 102, 0));
		btnDeviceRegistration.setBounds(0, 40, 193, 40);
		panel_2.add(btnDeviceRegistration);
		
		JButton btnStatus = new JButton("Status");
		
		btnStatus.setBackground(new Color(255, 102, 0));
		btnStatus.setBounds(0, 80, 193, 40);
		panel_2.add(btnStatus);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				home logout=new home();
				logout.loginframe.setVisible(true);
				frame.dispose();
			}
		});
		btnLogout.setBackground(new Color(255, 102, 0));
		btnLogout.setBounds(0, 121, 193, 40);
		panel_2.add(btnLogout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(197, 51, 590, 372);
		panel.add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_4, "name_280540826500007");
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("USER DETAILS");
		label.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		label.setBounds(141, 26, 157, 33);
		panel_4.add(label);
		
		JLabel label_1 = new JLabel("Name :");
		label_1.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_1.setBounds(45, 114, 63, 23);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("Email :");
		label_2.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_2.setBounds(45, 158, 63, 23);
		panel_4.add(label_2);
		
		JLabel label_3 = new JLabel("Username :");
		label_3.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_3.setBounds(45, 200, 86, 23);
		panel_4.add(label_3);
		
		JLabel label_4 = new JLabel("Designation :");
		label_4.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_4.setBounds(45, 248, 86, 23);
		panel_4.add(label_4);
		
		JLabel label_5 = new JLabel("Department :");
		label_5.setFont(new Font("Bell MT", Font.BOLD, 12));
		label_5.setBounds(45, 294, 86, 23);
		panel_4.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(226, 114, 211, 14);
		panel_4.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(226, 162, 211, 14);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(226, 204, 211, 14);
		panel_4.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(226, 252, 211, 14);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(226, 298, 211, 14);
		panel_4.add(label_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_5, "name_280545567068450");
		panel_5.setLayout(null);
		
		JLabel label_11 = new JLabel("DEVICE REGISTRATION");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("BLACK CAPS", Font.BOLD, 14));
		label_11.setBounds(81, 34, 258, 34);
		panel_5.add(label_11);
		
		JLabel label_12 = new JLabel("DEVICE NAME");
		label_12.setBounds(59, 95, 96, 14);
		panel_5.add(label_12);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(185, 89, 179, 20);
		panel_5.add(textField);
		
		JLabel label_13 = new JLabel("DEVICE TYPE");
		label_13.setBounds(59, 133, 96, 14);
		panel_5.add(label_13);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(185, 127, 179, 20);
		panel_5.add(textField_1);
		
		JLabel label_14 = new JLabel("IP ADDRESS");
		label_14.setBounds(59, 173, 96, 14);
		panel_5.add(label_14);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(185, 167, 179, 20);
		panel_5.add(textField_2);
		
		JLabel label_15 = new JLabel("MAC ADDRESS");
		label_15.setBounds(59, 215, 116, 14);
		panel_5.add(label_15);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(185, 209, 179, 20);
		panel_5.add(textField_3);
		
		JButton button = new JButton("SUBMIT");
		
		button.setBounds(132, 265, 89, 23);
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_6, "name_280551405560527");
		
		JScrollPane scrollPane = new JScrollPane();
		panel_6.add(scrollPane);
		
		table = new JTable();
		DefaultTableModel tbl = new DefaultTableModel(0,0);
		table.setModel(tbl);
		
		tbl.addColumn("Sl No.");
		tbl.addColumn("Device Name");
		tbl.addColumn("Device Type");
		tbl.addColumn("Ip Address");
		tbl.addColumn("Mac Address");
		tbl.addColumn("Status");
		Object rowtbl[] = new Object[12];
		scrollPane.setViewportView(table);
		//panel_6.add(table);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.removeAll();
				panel_3.add(panel_4);
				panel_3.repaint();
				panel_3.revalidate();
				

				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from signin where username='"+username+"' ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				@SuppressWarnings("unused")
				int slno=0;
				while(rs.next())
				{
				//slno = slno+1;
				/*
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				String stat = rs.getString("status");
				*/
				
					label_6.setText(rs.getString("name"));
					label_7.setText(rs.getString("email"));
					label_8.setText(rs.getString("username"));
					label_9.setText(rs.getString("department"));
					label_10.setText(rs.getString("designation"));
						
				
				}
				}catch(Exception ex)
				{
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
				JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnDeviceRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3.removeAll();
				panel_3.add(panel_5);
				panel_3.repaint();
				panel_3.revalidate();
				
			}
		});
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MysqlCon db=new MysqlCon();
				Connection con=null;
				Statement smt=null;
				
				String devicename=textField.getText();
				String devicetype=textField_1.getText();
				String deviceip=textField_2.getText();
				String devicemac=textField_3.getText();
				
				try
				{
					con=db.conneCtion();
				
			String sql="INSERT INTO devreg(name,email,contact,username,designation,department)SELECT name,email,contact,username,designation,department FROM signin WHERE username='"+username+"'";
			String sql1="UPDATE devreg SET devname='"+devicename+"',devtype='"+devicetype+"',ipadd='"+deviceip+"',macadd='"+devicemac+"', status='0' WHERE username='"+username+"' ";              
			smt=con.createStatement();
	                      @SuppressWarnings("unused")
						int i=smt.executeUpdate(sql);
	                      @SuppressWarnings("unused")
						int i1=smt.executeUpdate(sql1);
	                      
	                      textField.setText(null);
	                      textField_1.setText(null);
	                      textField_2.setText(null);
	                      textField_3.setText(null);
	      				
	                        
	                        }
	                    catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});
		
		
		
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3.removeAll();
				panel_3.add(panel_6);
				panel_3.repaint();
				panel_3.revalidate();
				
				tbl.getDataVector().removeAllElements();
				tbl.fireTableDataChanged();
				
				
				try
				{ 
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netcare","root","");
				String sql = "select * from devreg where username='"+username+"'  ";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				@SuppressWarnings("unused")
				int i =0;
				int slno=0;
				while(rs.next())
				{
				slno = slno+1;
				String devnme = rs.getString("devname");
				String devtyp = rs.getString("devtype");
				String ipad = rs.getString("ipadd");
				String macad = rs.getString("macadd");
				String stat = rs.getString("status");
				
				
				if(stat.equals("0")){
					
				rowtbl[0]=slno;
				rowtbl[1]=devnme;
				rowtbl[2]=devtyp;
				rowtbl[3]=ipad;
				rowtbl[4]=macad;
				rowtbl[5]="Pending";
				}
				if(stat.equals("1")){
					
					rowtbl[0]=slno;
					rowtbl[1]=devnme;
					rowtbl[2]=devtyp;
					rowtbl[3]=ipad;
					rowtbl[4]=macad;
					rowtbl[5]="Accepted";
					}
				if(stat.equals("2")){
					
					rowtbl[0]=slno;
					rowtbl[1]=devnme;
					rowtbl[2]=devtyp;
					rowtbl[3]=ipad;
					rowtbl[4]=macad;
					rowtbl[5]="Rejected";
					}
				
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
		
		
	}
}
