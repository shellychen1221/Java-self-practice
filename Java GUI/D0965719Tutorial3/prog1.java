import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class prog1 {

	private JFrame frmCompareTwoIntegers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog1 window = new prog1();
					window.frmCompareTwoIntegers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCompareTwoIntegers = new JFrame();
		frmCompareTwoIntegers.setBounds(100, 100, 451, 176);
		frmCompareTwoIntegers.setTitle("Compare two integers");
		frmCompareTwoIntegers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCompareTwoIntegers.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("a:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(48, 31, 22, 25);
		frmCompareTwoIntegers.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("b:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(217, 31, 22, 25);
		frmCompareTwoIntegers.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Comparison: ");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(61, 87, 115, 25);
		frmCompareTwoIntegers.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(167, 89, 131, 23);
		frmCompareTwoIntegers.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(65, 32, 102, 25);
		frmCompareTwoIntegers.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(234, 35, 104, 25);
		frmCompareTwoIntegers.getContentPane().add(textArea_1);
				
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(348, 34, 60, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frmCompareTwoIntegers.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String b=textArea_1.getText();
				int aa =Integer.parseInt(a);
				int bb =Integer.parseInt(b);
				if(aa>bb) {
					lblNewLabel.setText(a+">"+b);
				}
				else if(aa<bb) {
					lblNewLabel.setText(a+"<"+b);
				}
				else {
					lblNewLabel.setText(a+"="+b);
				}
				
			}
		});
		
	}

}
