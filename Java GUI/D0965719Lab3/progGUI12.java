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

public class progGUI12 {

	private JFrame frmHighCommonFactor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI12 window = new progGUI12();
					window.frmHighCommonFactor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public progGUI12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHighCommonFactor = new JFrame();
		frmHighCommonFactor.setTitle("High Common Factor");
		frmHighCommonFactor.setBounds(100, 100, 450, 300);
		frmHighCommonFactor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHighCommonFactor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(55, 58, 19, 30);
		frmHighCommonFactor.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(74, 63, 118, 25);
		frmHighCommonFactor.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 12));
		lblNewLabel_1.setBounds(143, 196, 283, 30);
		frmHighCommonFactor.getContentPane().add(lblNewLabel_1);
		
		JLabel lblanswer = new JLabel("Answer:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(55, 196, 78, 30);
		frmHighCommonFactor.getContentPane().add(lblanswer);
		
		JLabel lblB = new JLabel("b: ");
		lblB.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblB.setBounds(55, 101, 19, 30);
		frmHighCommonFactor.getContentPane().add(lblB);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea_1.setBounds(74, 106, 118, 25);
		
		frmHighCommonFactor.getContentPane().add(textArea_1);
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				double aa=Double.parseDouble(a);
				String b=textArea_1.getText();
				double bb=Double.parseDouble(b);
				int hcf = 0;
		        for(int i = 1; i <= aa && i <= bb; i++)
		        {
		            if(aa%i==0 && bb%i==0)
		                hcf = i;
		        }	
				String result=String.valueOf(hcf);
				lblNewLabel_1.setText("The Highest Common Factor of two numbers is "+result);
		}
		});
		btnNewButton.setBounds(259, 87, 85, 23);
		frmHighCommonFactor.getContentPane().add(btnNewButton);
	}
		
				
}
	