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

public class progGUI3 {

	private JFrame frmReverse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI3 window = new progGUI3();
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
	public progGUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReverse = new JFrame();
		frmReverse.setTitle("Change first and last");
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
				String c[]=new String[a.length()];
			    for (int i = 0; i < a.length(); i ++){
			            c[i] = a.substring(i, (i+1));
			        }
			    String cc=c[0];
		        if(a.length()==1){
		            c[0]=cc;
		        }
		        else{
		            c[0]=c[a.length()-1];
		            c[a.length()-1]=cc;
		        }
		        for(int i=0;i<=a.length()-1;i++){
		            JLabel lblAnswer = new JLabel("");
		            lblAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		            lblAnswer.setForeground(new Color(255, 99, 71));
		            lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		            lblAnswer.setBounds(23+10*i, 120, 393, 30);
		            frmReverse.getContentPane().add(lblAnswer);
		            lblAnswer.setText(c[i]);
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmReverse.getContentPane().add(btnNewButton);
		
		
		
	}
}