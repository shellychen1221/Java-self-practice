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

public class prog3 {

	private JFrame frmBmi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog3 window = new prog3();
					window.frmBmi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBmi = new JFrame();
		frmBmi.setBounds(100, 100, 453, 215);
		frmBmi.setTitle("BMI");
		frmBmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBmi.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("Enter the weight:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 32, 200, 25);
		frmBmi.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Enter the height:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(10, 67, 147, 25);
		frmBmi.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("BMI= ");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(79, 129, 51, 25);
		frmBmi.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(132, 131, 78, 23);
		frmBmi.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(156, 32, 102, 25);
		frmBmi.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(154, 67, 104, 25);
		frmBmi.getContentPane().add(textArea_1);
				

		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(349, 55, 60, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frmBmi.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("m");
		lblNewLabel_4_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_1.setBounds(263, 67, 51, 25);
		frmBmi.getContentPane().add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("kg");
		lblNewLabel_4_2_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_2.setBounds(263, 32, 51, 25);
		frmBmi.getContentPane().add(lblNewLabel_4_2_2);
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h,w;
				h=textArea.getText();
				w=textArea_1.getText();
				float hh=Float.parseFloat(w);
				float ww=Float.parseFloat(h);
				String bmi=String.valueOf(ww/(hh*hh));
				lblNewLabel.setText(bmi);
			}
		});
		
	}
}
