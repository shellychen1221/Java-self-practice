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

public class progGUI4 {

	private JFrame frmReverse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI4 window = new progGUI4();
					window.frmReverse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReverse = new JFrame();
		frmReverse.setTitle("Reverse");
		frmReverse.setBounds(100, 100, 430, 219);
		frmReverse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReverse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the string: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmReverse.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmReverse.getContentPane().add(textArea);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
				String ss[]=new String[a.length()];
				a=a.toLowerCase();
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			            ss[i] = a.substring(i, (i+1));
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
		        for(int i=0;i<=a.length()-1;i++){
		            JLabel lblAnswer = new JLabel("");
		            lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		            lblAnswer.setForeground(new Color(255, 99, 71));
		            lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		            lblAnswer.setBounds(23+10*i, 120, 393, 30);
		            frmReverse.getContentPane().add(lblAnswer);
		            lblAnswer.setText(s[i]);
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmReverse.getContentPane().add(btnNewButton);
		
		
		
	}
}
