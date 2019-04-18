package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Device_reg {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-17,94
	 */
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Device_reg window = new Device_reg();
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
	public Device_reg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 906, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 888, 10);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(309, 58, 406, 54);
		frame.getContentPane().add(panel_2);
		
		JLabel lblDeviceRegistration = new JLabel("DEVICE REGISTRATION");
		lblDeviceRegistration.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDeviceRegistration.setForeground(new Color(147, 112, 219));
		lblDeviceRegistration.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		panel_2.add(lblDeviceRegistration);
	}

}
