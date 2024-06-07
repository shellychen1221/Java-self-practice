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

public class progGUI6 {

	private JFrame frmInitials;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI6 window = new progGUI6();
					window.frmInitials.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInitials = new JFrame();
		frmInitials.setTitle(" initials");
		frmInitials.setBounds(100, 100, 430, 219);
		frmInitials.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInitials.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your name: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmInitials.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmInitials.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
				String ss[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			            
			        }
			    int rr=1;
		        ss[0]=s[0];
		        for(int i=0;i<a.length();i++){
		            if(a.charAt(i) == ' ') {
		                ss[rr]=s[i+1];
		                rr++;
		            }
		        }
		        for(int i=0;i<=a.length()-1;i++){
		            if(ss[i]==null){
		                break;
		            }
		            
		            JLabel lblAnswer = new JLabel("");
		            lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		            lblAnswer.setForeground(new Color(255, 99, 71));
		            lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		            lblAnswer.setBounds(23+20*i, 120, 393, 30);
		            frmInitials.getContentPane().add(lblAnswer);
		            lblAnswer.setText(ss[i]+". ");
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmInitials.getContentPane().add(btnNewButton);
		
		
		
	}
}
