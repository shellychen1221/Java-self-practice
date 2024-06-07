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
import javax.swing.SwingConstants;

public class progGUI2 {

	private JFrame frmString;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI2 window = new progGUI2();
					window.frmString.setVisible(true);
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
		frmString = new JFrame();
		frmString.setTitle("String");
		frmString.setBounds(100, 100, 430, 375);
		frmString.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmString.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the string: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmString.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmString.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(255, 99, 71));
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(23, 120, 393, 30);
		frmString.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_1.setForeground(new Color(255, 99, 71));
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(23, 173, 393, 30);
		frmString.getContentPane().add(lblAnswer_1);
		
		JLabel lblAnswer_2 = new JLabel("");
		lblAnswer_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_2.setForeground(new Color(255, 99, 71));
		lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_2.setBounds(23, 226, 393, 30);
		frmString.getContentPane().add(lblAnswer_2);
		
		JLabel lblAnswer_3 = new JLabel("");
		lblAnswer_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer_3.setForeground(new Color(255, 99, 71));
		lblAnswer_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_3.setBounds(23, 278, 393, 30);
		frmString.getContentPane().add(lblAnswer_3);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			        }
			    int upp=0,low=0,digit=0,white=0;
		        for (int i = 0; i < a.length(); i++) {
		            if (Character.isUpperCase(a.charAt(i))) {
		                upp++;
		            }
		            if (Character.isLowerCase(a.charAt(i))){
		                low++;
		            }
		            if(a.charAt(i) != ' '){
		                digit++;
		            }
		        }
		        for (char c : a.toCharArray()) {
		            if (c == ' ') {
		                white++;
		            }
		        }
		        String upp2=String.valueOf(upp);
		        String low2=String.valueOf(low);
		        String digit2=String.valueOf(digit);
		        String white2=String.valueOf(white);
		        lblAnswer.setText("The number of uppercase letters: "+upp2);
		        lblAnswer_1.setText("The number of lowercase letters: "+low2);
		        lblAnswer_2.setText("The number of digits letter: "+digit2);
		        lblAnswer_3.setText("The number of whitespace: "+white2);
			    }
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmString.getContentPane().add(btnNewButton);
		
	}
}