import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;

public class progGui3 {

	private JFrame frmCelsiusToFahrenheit;
	public static String c;
	public static int cc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui3 window = new progGui3();
					window.frmCelsiusToFahrenheit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCelsiusToFahrenheit = new JFrame();
		frmCelsiusToFahrenheit.setTitle("Celsius to Fahrenheit");
		frmCelsiusToFahrenheit.setBounds(100, 100, 329, 168);
		frmCelsiusToFahrenheit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCelsiusToFahrenheit.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("C:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(52, 30, 22, 25);
		frmCelsiusToFahrenheit.getContentPane().add(lblNewLabel_4);
		
		
		
		JLabel lblNewLabel_4_2 = new JLabel("F=");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(62, 65, 51, 25);
		frmCelsiusToFahrenheit.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(97, 67, 78, 23);
		frmCelsiusToFahrenheit.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(73, 30, 102, 25);
		frmCelsiusToFahrenheit.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(222, 51, 60, 23);
		frmCelsiusToFahrenheit.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int f;
				String ff;
				c=textArea.getText();
				cc=Integer.parseInt(c);
				f=(cc*9/5)+32;
				ff=String.valueOf(f);
				lblNewLabel.setText(ff);
			}
		});
		
	}

}

