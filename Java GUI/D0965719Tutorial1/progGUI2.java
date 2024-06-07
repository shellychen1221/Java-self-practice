import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class progGUI2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI2 window = new progGUI2();
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
	public progGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 246);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(150, 5, 74, 30);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(" /�¡¡¡¡¡�\\ ");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(150, 15, 74, 30);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setText("/              \\");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(150, 25, 74, 30);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setText("\\              /");
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(150, 35, 74, 30);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setText(" \\______/");
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(150, 45, 74, 30);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setText("\\              /");
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(150, 55, 74, 30);
		frame.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setText(" \\______/");
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(150, 70, 74, 30);
		frame.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setText("+--------+");

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(150, 80, 74, 30);
		frame.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setText(" /�¡¡¡¡¡�\\ ");
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(150, 90, 74, 30);
		frame.getContentPane().add(lblNewLabel_8);
		lblNewLabel_8.setText("/              \\");
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(150, 100, 74, 30);
		frame.getContentPane().add(lblNewLabel_9);
		lblNewLabel_9.setText("|  STOP  |");
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(150, 110, 74, 30);
		frame.getContentPane().add(lblNewLabel_10);
		lblNewLabel_10.setText("\\              /");
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(150, 110, 74, 30);
		frame.getContentPane().add(lblNewLabel_11);
		lblNewLabel_11.setText(" \\______/");

		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(150, 125, 74, 30);
		frame.getContentPane().add(lblNewLabel_12);
		lblNewLabel_12.setText(" /�¡¡¡¡¡�\\ ");
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(150, 135, 74, 30);
		frame.getContentPane().add(lblNewLabel_13);
		lblNewLabel_13.setText("/              \\");
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(150, 145, 74, 30);
		frame.getContentPane().add(lblNewLabel_14);
		lblNewLabel_14.setText("+--------+");
	}

}
