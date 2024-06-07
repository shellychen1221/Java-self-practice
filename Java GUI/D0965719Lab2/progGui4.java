import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class progGui4 {

	private JFrame frmCalculateTheSimple;
	public static String p,r,t;
	public static int pp,rr,tt;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui4 window = new progGui4();
					window.frmCalculateTheSimple.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculateTheSimple = new JFrame();
		frmCalculateTheSimple.setTitle("Calculate the simple interest");
		frmCalculateTheSimple.setBounds(100, 100, 450, 300);
		frmCalculateTheSimple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculateTheSimple.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("principle:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 52, 102, 25);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("rate:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(10, 87, 87, 25);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel_4_1);
		
		
		JLabel lblNewLabel_4_2 = new JLabel("simple interest:");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(46, 194, 148, 25);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(179, 196, 192, 23);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(92, 52, 102, 25);
		frmCalculateTheSimple.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(92, 89, 104, 25);
		frmCalculateTheSimple.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 124, 78, 23);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1_1.setBounds(90, 122, 104, 25);
		frmCalculateTheSimple.getContentPane().add(textArea_1_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=textArea.getText();
				r=textArea_1.getText();
				t=textArea_1_1.getText();
				pp=Integer.parseInt(p);
				rr=Integer.parseInt(r);
				tt=Integer.parseInt(t);
				String ii=String.valueOf(pp*rr*tt);
				lblNewLabel.setText(ii);
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(266, 77, 78, 35);
		frmCalculateTheSimple.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("time:");
		lblNewLabel_4_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1_1.setBounds(10, 122, 87, 25);
		frmCalculateTheSimple.getContentPane().add(lblNewLabel_4_1_1);
		

		
		
	}
}
