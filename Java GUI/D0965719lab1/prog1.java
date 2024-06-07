import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class prog1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog1 window = new prog1();
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
	public prog1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   J    a   v     v  a        ");
		lblNewLabel.setFont(new Font("微軟正黑體 Light", Font.BOLD, 15));
		lblNewLabel.setBounds(154, 41, 201, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblJAA = new JLabel("   J   a a   v    v  a a                                                 \r\n");
		lblJAA.setFont(new Font("微軟正黑體 Light", Font.BOLD, 15));
		lblJAA.setBounds(154, 81, 201, 30);
		frame.getContentPane().add(lblJAA);
		
		JLabel lblJJAaaaa = new JLabel("J  J  aaaaa   V V  aaaaa   ");
		lblJJAaaaa.setFont(new Font("微軟正黑體 Light", Font.BOLD, 15));
		lblJJAaaaa.setBounds(141, 121, 201, 30);
		frame.getContentPane().add(lblJJAaaaa);
		
		JLabel lblJjAA = new JLabel(" JJ  a     a   V  a     a");
		lblJjAA.setFont(new Font("微軟正黑體 Light", Font.BOLD, 15));
		lblJjAA.setBounds(154, 161, 201, 30);
		frame.getContentPane().add(lblJjAA);
	}
}
