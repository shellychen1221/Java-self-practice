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
import java.awt.Color;

public class progGUI9 {

	private JFrame frmSetPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI9 window = new progGUI9();
					window.frmSetPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetPassword = new JFrame();
		frmSetPassword.setTitle("Set password");
		frmSetPassword.setBounds(100, 100, 430, 208);
		frmSetPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetPassword.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Set up password: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmSetPassword.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmSetPassword.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(100, 125, 219, 30);
		frmSetPassword.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				String s[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            s[i] = a.substring(i, (i+1));
			    }
			    boolean le=false,up=false,lo=false,di=false;
		        if(s.length>=8) {
		            le = true;
		        }
		        for(int i=0;i<a.length();i++){
		            if(Character.isUpperCase(a.charAt(i))){
		                up=true;
		            }
		            if(Character.isLowerCase(a.charAt(i))) {
		                lo=true;
		            }
		            if(Character.isDigit(a.charAt(i))) {
		                di=true;
		            }
		        }
		        if(le&&up&&lo&&di){
		        	lblNewLabel_1.setText("This is a valid password");
		        }
		        else{
		            lblNewLabel_1.setText("This is not a valid password");
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmSetPassword.getContentPane().add(btnNewButton);
		
		
		
		
		
	}
}
