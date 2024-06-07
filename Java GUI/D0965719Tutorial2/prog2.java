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

public class prog2 {

	private JFrame frmAddAndSub;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog2 window = new prog2();
					window.frmAddAndSub.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddAndSub = new JFrame();
		frmAddAndSub.setBounds(100, 100, 450, 300);
		frmAddAndSub.setTitle("Add and Sub");
		frmAddAndSub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddAndSub.getContentPane().setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("a:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(51, 52, 22, 25);
		frmAddAndSub.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("b:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(220, 52, 22, 25);
		frmAddAndSub.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Answer: ");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(66, 109, 74, 25);
		frmAddAndSub.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(150, 111, 78, 23);
		frmAddAndSub.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(68, 53, 102, 25);
		frmAddAndSub.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(237, 56, 104, 25);
		frmAddAndSub.getContentPane().add(textArea_1);
				
		
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(351, 35, 75, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frmAddAndSub.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sum;
				String a =textArea.getText();
				String b=textArea_1.getText();
				int aa=Integer.parseInt(a);
				int bb=Integer.parseInt(b);
				sum=String.valueOf(aa+bb);
				lblNewLabel.setText(sum);
			}
		});
		
		JButton btnSub = new JButton("Sub");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				String a =textArea.getText();
				String b=textArea_1.getText();
				int aa=Integer.parseInt(a);
				int bb=Integer.parseInt(b);
				answer=String.valueOf(aa-bb);
				lblNewLabel.setText(answer);
			}
		});
		btnSub.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnSub.setBackground(SystemColor.inactiveCaption);
		btnSub.setBounds(351, 77, 75, 23);
		frmAddAndSub.getContentPane().add(btnSub);
		
		
		
		
	}
}
