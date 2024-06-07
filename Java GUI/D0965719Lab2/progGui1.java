import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JTextField;
import javax.swing.JButton;

public class progGui1 {

	private JFrame frame;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui1 window = new progGui1();
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
	public progGui1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Hello, Name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your name:");
		lblNewLabel.setBounds(38, 37, 150, 58);
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(201, 61, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(307, 60, 85, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a= textField.getText();
				String aa="Hello, "+a;
				JLabel lblNewLabel_1=new JLabel("");
				lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 18));
				lblNewLabel_1.setBounds(125, 127, 150, 58);
				frame.getContentPane().add(lblNewLabel_1);
				lblNewLabel_1.setText(aa);
			}
		});
		
	}
}
