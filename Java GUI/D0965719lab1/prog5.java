import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class prog5 {

	private JFrame frame;
	public static String a,b;
	public static int aa,bb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog5 window = new prog5();
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
	public prog5() {
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
		
		
		JLabel lblNewLabel_4 = new JLabel("a:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(51, 52, 22, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("b:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(220, 52, 22, 25);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("a+b=");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(92, 89, 51, 25);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("a-b=");
		lblNewLabel_4_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_1.setBounds(92, 124, 51, 25);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("a*b=");
		lblNewLabel_4_2_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_2.setBounds(92, 159, 51, 25);
		frame.getContentPane().add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("a%b=");
		lblNewLabel_4_2_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_3.setBounds(92, 228, 51, 25);
		frame.getContentPane().add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_4_2_4 = new JLabel("a/b=");
		lblNewLabel_4_2_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2_4.setBounds(92, 193, 51, 25);
		frame.getContentPane().add(lblNewLabel_4_2_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(150, 91, 78, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(68, 53, 102, 25);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(237, 56, 104, 25);
		frame.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 124, 78, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_2.setBounds(150, 159, 78, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_3.setBounds(150, 195, 78, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_5.setBounds(150, 230, 78, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		
		JButton btnNewButton = new JButton("OK");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plus,minus,product,over,mod;
				a=textArea.getText();
				b=textArea_1.getText();
				aa=Integer.parseInt(a);
				bb=Integer.parseInt(b);
				plus=String.valueOf(aa+bb);
				minus=String.valueOf(aa-bb);
				product=String.valueOf(aa*bb);
				over=String.valueOf(aa/bb);
				mod=String.valueOf(aa%bb);
				lblNewLabel.setText(plus);
				lblNewLabel_1.setText(minus);
				lblNewLabel_2.setText(product);
				lblNewLabel_3.setText(over);
				lblNewLabel_5.setText(mod);
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(351, 55, 60, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
