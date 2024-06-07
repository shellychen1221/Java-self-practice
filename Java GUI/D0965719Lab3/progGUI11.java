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
public class progGUI11 {

	private JFrame frmPrime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI11 window = new progGUI11();
					window.frmPrime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrime = new JFrame();
		frmPrime.setTitle("Prime");
		frmPrime.setBounds(100, 100, 430, 326);
		frmPrime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrime.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(94, 33, 85, 30);
		frmPrime.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(195, 34, 118, 25);
		frmPrime.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmPrime.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmPrime.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				
		        int s = 0;
		        int f = 0;
		        for (int i = 1; i <= aa; i++) {
		            s = aa % i;
		            if (s == 0) {
		                f = f + 1;
		            }
		        }

		        if (f == 2) {
		            lblAnswer_1.setText(a + " is a prime");
		        }
		        else {
		        	lblAnswer_1.setText(a+ " is not a prime");
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmPrime.getContentPane().add(btnNewButton);
		
	}

}