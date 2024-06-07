import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class progGUI3 {

	private JFrame frmMultiplicationTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI3 window = new progGUI3();
					window.frmMultiplicationTable.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMultiplicationTable = new JFrame();
		frmMultiplicationTable.setTitle("Multiplication table");
		frmMultiplicationTable.setBounds(100, 100, 415, 290);
		frmMultiplicationTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMultiplicationTable.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 33, 78, 30);
		frmMultiplicationTable.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(83, 34, 118, 25);
		frmMultiplicationTable.getContentPane().add(textArea);
		

		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				for(int i=1;i<=9;i++) {
					loop(i, aa, frmMultiplicationTable);
				}
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(42, 128, 85, 23);
		frmMultiplicationTable.getContentPane().add(btnNewButton);
	}
	static void loop(int i ,int aa,JFrame frame) {
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(250, 20*i, 196, 43);
		lblNewLabel.setForeground(Color.red);
		frame.getContentPane().add(lblNewLabel);
		String num=String.valueOf(aa*i);
		lblNewLabel.setText(aa+"*"+i+"="+num);
		
	}

}
