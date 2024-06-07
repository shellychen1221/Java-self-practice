import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class progGui7 {

	private JFrame frmSwapTwoNumbers;
	public static String a,b;
	public static int aa,bb;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui7 window = new progGui7();
					window.frmSwapTwoNumbers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSwapTwoNumbers = new JFrame();
		frmSwapTwoNumbers.setTitle("swap two numbers");
		frmSwapTwoNumbers.setBounds(100, 100, 450, 300);
		frmSwapTwoNumbers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSwapTwoNumbers.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("a:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(51, 52, 22, 25);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("b:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(220, 52, 22, 25);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("swap a:");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(28, 153, 85, 25);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(100, 155, 78, 23);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(68, 53, 102, 25);
		frmSwapTwoNumbers.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(237, 56, 104, 25);
		frmSwapTwoNumbers.getContentPane().add(textArea_1);
				
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(351, 55, 60, 23);
		frmSwapTwoNumbers.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("swap b:");
		lblNewLabel_4_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_1.setBounds(28, 197, 85, 25);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(100, 197, 78, 23);
		frmSwapTwoNumbers.getContentPane().add(lblNewLabel_1);
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=textArea.getText();
				b=textArea_1.getText();

				lblNewLabel.setText(b);
				lblNewLabel_1.setText(a);
			}
		});
		
	}

}

