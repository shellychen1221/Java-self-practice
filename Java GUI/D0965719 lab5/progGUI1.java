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

public class progGUI1 {

	private JFrame frmNumberOfVowels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI1 window = new progGUI1();
					window.frmNumberOfVowels.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumberOfVowels = new JFrame();
		frmNumberOfVowels.setTitle("Number of vowels");
		frmNumberOfVowels.setBounds(100, 100, 430, 219);
		frmNumberOfVowels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumberOfVowels.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the string: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmNumberOfVowels.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmNumberOfVowels.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("");
		lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnswer.setForeground(new Color(255, 99, 71));
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(23, 120, 393, 30);
		frmNumberOfVowels.getContentPane().add(lblAnswer);
			
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
				String ss[]=new String[a.length()];
				a=a.toLowerCase();
				int vowels=0;
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			            ss[i] = a.substring(i, (i+1));
			        }
			        int tt=0;
			        for(int i = 0;i<a.length();i++) {
			            if (s[i].equals("a")|| s[i].equals("e") || s[i].equals("i") || s[i].equals("o") || s[i].equals("u")) {
			                vowels++;
			                ss[tt]=s[i];
			                tt++;
			            }
			        }
			        
			        lblAnswer.setText("the number of vowels: "+vowels);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmNumberOfVowels.getContentPane().add(btnNewButton);
		
		
		
	}
}