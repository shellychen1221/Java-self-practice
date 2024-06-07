import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class prog4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog4 window = new prog4();
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
	public prog4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 282, 297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" -5 + 8 * 6=43");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel.setBounds(44, 55, 198, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(55+9) % 9=1");
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel_1.setBounds(44, 100, 198, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("20 + -3*5 / 8=19");
		lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel_2.setBounds(44, 147, 198, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("5 + 15 / 3 * 2 - 8 % 3=13");
		lblNewLabel_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		lblNewLabel_3.setBounds(44, 194, 198, 25);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
