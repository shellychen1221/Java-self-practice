import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class progGUI7 {

	private JFrame frmPalindrome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI7 window = new progGUI7();
					window.frmPalindrome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPalindrome = new JFrame();
		frmPalindrome.setTitle("Palindrome");
		frmPalindrome.setBounds(100, 100, 430, 208);
		frmPalindrome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalindrome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the string: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmPalindrome.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmPalindrome.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(112, 125, 219, 30);
		frmPalindrome.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
				String ss[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			            ss[i] = a.substring(i,(i+1)); 
			    }
			    String sss=s[0];
		        if(a.length()==1){
		            s[0]=sss;
		        }
		        else{
		            for(int i=0;i<=a.length()-2;i++){
		                s[i]=ss[a.length()-1-i];
		            }
		            s[a.length()-1]=sss;
		        }
		        
		        if(Arrays.equals(s, ss)) {
		        	lblNewLabel_1.setText(a+" is a palindrome");
		        }
		        else {
		        	lblNewLabel_1.setText(a+" is not a palindrome");
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmPalindrome.getContentPane().add(btnNewButton);
		
	}
}
