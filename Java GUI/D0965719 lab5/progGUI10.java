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
import javax.swing.SwingConstants;

public class progGUI10 {

	private JFrame frmConvertDollar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI10 window = new progGUI10();
					window.frmConvertDollar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConvertDollar = new JFrame();
		frmConvertDollar.setTitle("Convert dollar");
		frmConvertDollar.setBounds(100, 100, 568, 324);
		frmConvertDollar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertDollar.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the exchange rate from dollars to NTD: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(21, 66, 354, 30);
		frmConvertDollar.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(374, 67, 118, 25);
		frmConvertDollar.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(156, 204, 219, 30);
		frmConvertDollar.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea_1.setBounds(432, 106, 60, 25);
		frmConvertDollar.getContentPane().add(textArea_1);
		
		JLabel lblEnterTo = new JLabel("Enter 0 to convert USD to NTD and 1 for vice versa:");
		lblEnterTo.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblEnterTo.setBounds(21, 105, 416, 30);
		frmConvertDollar.getContentPane().add(lblEnterTo);
		
		JLabel lblEnterTheDollar = new JLabel("Enter the dollar amount:");
		lblEnterTheDollar.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblEnterTheDollar.setBounds(21, 150, 208, 30);
		frmConvertDollar.getContentPane().add(lblEnterTheDollar);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea_1_1.setBounds(226, 151, 266, 25);
		frmConvertDollar.getContentPane().add(textArea_1_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				float ex=Float.parseFloat(a);
				String aa=textArea_1.getText();
				int con=Integer.parseInt(aa);
				String aaa=textArea_1_1.getText();
				int money=Integer.parseInt(aaa);
				float res;
				if(con==0){
		            res=money*ex;
		            lblNewLabel_1.setText("USD $"+money+" is "+res+" NTD");
		        }
		        else if(con==1){
		            res=money/ex;
		            lblNewLabel_1.setText("NTD"+money+" is "+res+" USD $");
		        }
		        else {
		            lblNewLabel_1.setText("Invalid");
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(111, 10, 304, 23);
		frmConvertDollar.getContentPane().add(btnNewButton);
		

		
	}
}
