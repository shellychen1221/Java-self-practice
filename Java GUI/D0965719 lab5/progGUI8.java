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

public class progGUI8 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI8 window = new progGUI8();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 263);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the string: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frame.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			        }
			    String ss=s[0];
		        if(a.length()==1){
		            s[0]=ss;
		        }
		        else{
		        	int y=1;
		            for(int ii=0;ii<a.length();ii++) {
		                for(int i=0;i<=a.length()-2;i++){
		                    s[i]=s[i+1];
		                }
		                s[a.length()-1]=ss;
		                ss=s[0];
		                for(int i=0;i<=a.length()-1;i++){
				            JLabel lblAnswer = new JLabel("");
				            lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
				            lblAnswer.setForeground(new Color(255, 99, 71));
				            lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
				            lblAnswer.setBounds(20*i, 85+15*y, 393, 30);
				            frame.getContentPane().add(lblAnswer);
				            lblAnswer.setText(s[i]);
				        }
		                y++;
		            }
		            
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
	}
}
