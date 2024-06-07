import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class progGUI4 {

	private JFrame frmFactorial;
	private static int factorial=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI4 window = new progGUI4();
					window.frmFactorial.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFactorial = new JFrame();
		frmFactorial.setTitle("Factorial");
		frmFactorial.setBounds(100, 100, 450, 300);
		frmFactorial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFactorial.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(55, 58, 78, 30);
		frmFactorial.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(143, 64, 118, 25);
		frmFactorial.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(151, 118, 142, 30);
		frmFactorial.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSum = new JLabel("Factorial:");
		lblSum.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblSum.setBounds(71, 118, 78, 30);
		frmFactorial.getContentPane().add(lblSum);
		
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(SystemColor.activeCaptionText);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num=textArea.getText();
			int num1=Integer.parseInt(num);
			for(int i=1;i<=num1;i++) {
				factorial=factorial*i;
			}
			String factorial1=String.valueOf(factorial);
			lblNewLabel_1.setText(factorial1);
		}
		});
		btnNewButton.setBounds(299, 88, 85, 23);
		frmFactorial.getContentPane().add(btnNewButton);
				
	}
	

}
