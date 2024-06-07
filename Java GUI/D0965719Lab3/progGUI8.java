import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
public class progGUI8 {

	private JFrame frmPalindrome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI8 window = new progGUI8();
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
	public progGUI8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPalindrome = new JFrame();
		frmPalindrome.setTitle("Palindrome");
		frmPalindrome.setBounds(100, 100, 450, 326);
		frmPalindrome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalindrome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 33, 78, 30);
		frmPalindrome.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(83, 34, 118, 25);
		frmPalindrome.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 98, 30);
		frmPalindrome.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(118, 185, 285, 30);
		frmPalindrome.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int rr=0;
				int aa=Integer.parseInt(a);
				int a1=aa;
				String aaa=String.valueOf(aa);
				lblAnswer.setText(aaa);
				while (aa != 0) {
					rr = rr * 10;
					rr = rr + aa % 10;
		            aa = aa / 10;
		        }
				
				if(a1==rr) {
					lblAnswer_1.setText("is a Palindrome");
				}
				else {
					lblAnswer_1.setText("is Not a Palindrome");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmPalindrome.getContentPane().add(btnNewButton);
		
	}

}