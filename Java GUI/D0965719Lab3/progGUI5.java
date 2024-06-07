import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class progGUI5 {

	private JFrame frmPower;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI5 window = new progGUI5();
					window.frmPower.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPower = new JFrame();
		frmPower.setTitle("Power");
		frmPower.setBounds(100, 100, 450, 300);
		frmPower.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPower.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(55, 58, 19, 30);
		frmPower.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(74, 63, 118, 25);
		frmPower.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(143, 196, 142, 30);
		frmPower.getContentPane().add(lblNewLabel_1);
		
		JLabel lblanswer = new JLabel("Answer:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(55, 196, 78, 30);
		frmPower.getContentPane().add(lblanswer);
		
		JLabel lblB = new JLabel("b: ");
		lblB.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblB.setBounds(55, 101, 19, 30);
		frmPower.getContentPane().add(lblB);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea_1.setBounds(74, 106, 118, 25);
		
		frmPower.getContentPane().add(textArea_1);
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				double aa=Double.parseDouble(a);
				String b=textArea_1.getText();
				double bb=Double.parseDouble(b);
				double res=Math.pow(aa, bb);
				String result=String.valueOf(res);
				lblNewLabel_1.setText(result);
		}
		});
		btnNewButton.setBounds(259, 87, 85, 23);
		frmPower.getContentPane().add(btnNewButton);
		
		
				
	}
	

}