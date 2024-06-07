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

public class progGUI2 {

	private JFrame frmSum;
	private static int sum=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI2 window = new progGUI2();
					window.frmSum.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSum = new JFrame();
		frmSum.setTitle("Sum");
		frmSum.setBounds(100, 100, 450, 300);
		frmSum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSum.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(55, 58, 78, 30);
		frmSum.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(143, 64, 118, 25);
		frmSum.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(141, 118, 78, 30);
		frmSum.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSum = new JLabel("Sum:");
		lblSum.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblSum.setBounds(71, 118, 78, 30);
		frmSum.getContentPane().add(lblSum);
		
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String num=textArea.getText();
			int num1=Integer.parseInt(num);
			for(int i=1;i<=num1;i++) {
				sum=sum+i;
			}
			String sum1=String.valueOf(sum);
			lblNewLabel_1.setText(sum1);
		}
		});
		btnNewButton.setBounds(299, 88, 85, 23);
		frmSum.getContentPane().add(btnNewButton);
				
	}
	

}
