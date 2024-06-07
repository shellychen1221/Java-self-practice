import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class progGUI8 {

	private JFrame frmGuessNumber;
	private static int randnumber,count=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI8 window = new progGUI8();
					window.frmGuessNumber.setVisible(true);
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
		frmGuessNumber = new JFrame();
		frmGuessNumber.setTitle("Guess number");
		frmGuessNumber.setBounds(100, 100, 430, 219);
		frmGuessNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuessNumber.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess the number: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(37, 66, 166, 30);
		frmGuessNumber.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(213, 67, 118, 25);
		frmGuessNumber.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("");
		lblAnswer.setForeground(new Color(255, 99, 71));
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 118, 393, 30);
		frmGuessNumber.getContentPane().add(lblAnswer);
			
		JButton btnNewButton = new JButton("Generate the random number");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand=new Random();
				randnumber = rand.nextInt(100);
				count=0;
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(68, 10, 304, 23);
		frmGuessNumber.getContentPane().add(btnNewButton);
		
		JButton btnTry = new JButton("Try");
		btnTry.setBackground(SystemColor.inactiveCaption);
		btnTry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textArea.getText();
				int numm=Integer.parseInt(num);
				count++;
				if(numm<randnumber) {
					lblAnswer.setText("You have to guess larger");
				}
				else if(numm>randnumber) {
					lblAnswer.setText("You have to guess smaller");
				}
				else {
					lblAnswer.setText("Congratulation,You got it right! You try "+count+" times");
				}
			}
		});
		btnTry.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnTry.setBounds(341, 70, 65, 23);
		frmGuessNumber.getContentPane().add(btnTry);
		
	}
}