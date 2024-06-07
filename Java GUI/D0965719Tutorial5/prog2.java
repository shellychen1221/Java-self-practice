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

	private JFrame frmArray;
	private static int length=10;
	private static String [] a = new String[length];
	private static int count=0,sum=0,product=1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog2 window = new prog2();
					window.frmArray.setVisible(true);
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
		frmArray = new JFrame();
		frmArray.setTitle("10 integers in array");
		frmArray.setBounds(100, 100, 412, 223);
		frmArray.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArray.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 24, 85, 30);
		frmArray.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(85, 24, 118, 25);
		frmArray.getContentPane().add(textArea);
		
		
		
		JLabel lblanswer = new JLabel("Product:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(47, 123, 78, 30);
		frmArray.getContentPane().add(lblanswer);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setBounds(130, 123, 85, 30);
	
		frmArray.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(130, 83, 85, 30);
		frmArray.getContentPane().add(lblNewLabel_1_1);
						
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number=textArea.getText();
		        int nn=Integer.parseInt(number);
		        a[count]=number;
		        count++;
		        sum=sum+nn;
		        product=product*nn;
		        textArea.setText("");

		        String sum2=String.valueOf(sum);
		       	lblNewLabel_1_1.setText(sum2);
		       	String product2=String.valueOf(product);
		       	lblNewLabel_1.setText(product2);
		        }
		        
		});
		
		btnNewButton.setBounds(233, 32, 85, 23);
		frmArray.getContentPane().add(btnNewButton);
		
		
		JLabel lblSum = new JLabel("Sum:");
		lblSum.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblSum.setBounds(47, 83, 78, 30);
		frmArray.getContentPane().add(lblSum);
		
		
	}
}
	