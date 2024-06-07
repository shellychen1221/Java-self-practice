import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class progGUI7 {

	private JFrame frmSumOfDigits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI7 window = new progGUI7();
					window.frmSumOfDigits.setVisible(true);
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
		frmSumOfDigits = new JFrame();
		frmSumOfDigits.setTitle("Sum of Digits");
		frmSumOfDigits.setBounds(100, 100, 450, 326);
		frmSumOfDigits.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSumOfDigits.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 33, 78, 30);
		frmSumOfDigits.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(83, 34, 118, 25);
		frmSumOfDigits.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer: ");
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 78, 30);
		frmSumOfDigits.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(83, 185, 118, 30);
		frmSumOfDigits.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int rr=0;
				int aa=Integer.parseInt(a);
				while (aa != 0) {
		            rr = rr + aa % 10;
		            aa = aa / 10;
		        }
				String aaa=String.valueOf(rr);
				lblAnswer_1.setText(aaa);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmSumOfDigits.getContentPane().add(btnNewButton);
		
	}

}