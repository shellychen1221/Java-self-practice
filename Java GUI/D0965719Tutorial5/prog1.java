import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class prog1 {

	private JFrame frmArray;
	private static int length=10;
	private static String [] a = new String[length];
	private static int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog1 window = new prog1();
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
	public prog1() {
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
		
		
		
		JLabel lblanswer = new JLabel("Answer:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(47, 123, 78, 30);
		frmArray.getContentPane().add(lblanswer);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number=textArea.getText();
		        a[count]=number;
		        count++;
		        textArea.setText("");
		        if(count==9) {
		        	btnNewButton.setVisible(false);
		        	textArea.setVisible(false);
		        	lblNewLabel.setVisible(false);
		        	for(int i=0;i<10;i++) {
		        		JLabel lblNewLabel_1 = new JLabel();
		        		lblNewLabel_1.setForeground(Color.RED);
						lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
						lblNewLabel_1.setBounds(130+20*i, 123, 30, 30);
						frmArray.getContentPane().add(lblNewLabel_1);
						lblNewLabel_1.setText(a[i]);
		        	}
		        }
		        }
		});
		
		btnNewButton.setBounds(233, 32, 85, 23);
		frmArray.getContentPane().add(btnNewButton);
		
		
	}
}
	