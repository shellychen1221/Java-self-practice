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

public class prog3 {
	private JFrame frmCountOfPositive;
	private static int cP = 0;
    private static int cN = 0;
    private static int Zero = 0;
    private static String cpp, cnn, z;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog3 window = new prog3();
					window.frmCountOfPositive.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCountOfPositive = new JFrame();
		frmCountOfPositive.setTitle("Count of positive, negative and zeros");
		frmCountOfPositive.setBounds(100, 100, 450, 327);
		frmCountOfPositive.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCountOfPositive.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 24, 85, 30);
		frmCountOfPositive.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(85, 24, 118, 25);
		frmCountOfPositive.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setBounds(130, 123, 283, 30);
		frmCountOfPositive.getContentPane().add(lblNewLabel_1);
		
		JLabel lblanswer = new JLabel("Answer:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(47, 123, 78, 30);
		frmCountOfPositive.getContentPane().add(lblanswer);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


		        String number=textArea.getText();
		        int n=Integer.parseInt(number);

		        if(n > 0) {
		            cP=cP+1;
		            cpp=String.valueOf(cP);
		        }
		        else if(n < 0){
		            cN=cN+1;
		            cnn=String.valueOf(cN);
		        }
		        else {
		            Zero=Zero+1;
		            z=String.valueOf(Zero);
		        }
		        textArea.setText("");
		       
		        }
		});
		
		btnNewButton.setBounds(233, 32, 85, 23);
		frmCountOfPositive.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(130, 163, 283, 30);
		frmCountOfPositive.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel();
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(130, 203, 283, 30);
		frmCountOfPositive.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.inactiveCaption);
		btnStop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop.setForeground(new Color(0, 0, 0));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblNewLabel_1.setText("Positive number:"+cpp);
				lblNewLabel_1_1.setText("Negative number:"+cnn);
		        lblNewLabel_1_2.setText("Zero:"+z);
			}
		});
		btnStop.setBounds(233, 65, 85, 23);
		frmCountOfPositive.getContentPane().add(btnStop);
		
		
	}
}
