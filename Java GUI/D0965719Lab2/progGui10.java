import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class progGui10 {

	private JFrame frmArea;
	public static String a,b,c;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui10 window = new progGui10();
					window.frmArea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArea = new JFrame();
		frmArea.setTitle("Area");
		frmArea.setBounds(100, 100, 450, 300);
		frmArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArea.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("a:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(50, 52, 62, 25);
		frmArea.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("b:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(50, 87, 47, 25);
		frmArea.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("c:");
		lblNewLabel_4_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1_1.setBounds(50, 122, 47, 25);
		frmArea.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Area:");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(92, 194, 102, 25);
		frmArea.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(179, 196, 192, 23);
		frmArea.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(92, 52, 102, 25);
		frmArea.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(92, 89, 104, 25);
		frmArea.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 124, 78, 23);
		frmArea.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1_1.setBounds(90, 122, 104, 25);
		frmArea.getContentPane().add(textArea_1_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=textArea.getText();
				b=textArea_1.getText();
				c=textArea_1_1.getText();
				int aa=Integer.parseInt(a);
				int bb=Integer.parseInt(b);
				int cc=Integer.parseInt(c);
				double s=(aa+bb+cc)/2;
				double area=Math.sqrt(s*(s-aa)*(s-bb)*(s-cc));
				String area2=String.valueOf(area);
				lblNewLabel.setText(area2);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(266, 77, 78, 35);
		frmArea.getContentPane().add(btnNewButton);

		
	}
}

