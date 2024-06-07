import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class progGUI14 {

	private JFrame frmLargestAndSmallest;
	private static int max=Integer.MIN_VALUE;
	private static int min=Integer.MAX_VALUE;
    private static String maxx,minn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI14 window = new progGUI14();
					window.frmLargestAndSmallest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public progGUI14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLargestAndSmallest = new JFrame();
		frmLargestAndSmallest.setTitle("largest and smallest numbers");
		frmLargestAndSmallest.setBounds(100, 100, 447, 266);
		frmLargestAndSmallest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLargestAndSmallest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 24, 85, 30);
		frmLargestAndSmallest.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(105, 24, 118, 25);
		frmLargestAndSmallest.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setBounds(130, 123, 283, 30);
		frmLargestAndSmallest.getContentPane().add(lblNewLabel_1);
		
		JLabel lblanswer = new JLabel("Answer:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(47, 123, 78, 30);
		frmLargestAndSmallest.getContentPane().add(lblanswer);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        String number=textArea.getText();
		        int n=Integer.parseInt(number);
		        if(max<n) {
	                max = n;
	                maxx=String.valueOf(max);
	            }
		        if(min>n) {
	            	min = n;
	            	minn=String.valueOf(min);
	            }
		        textArea.setText("");
		        }
		});
		btnNewButton.setBounds(233, 32, 85, 23);
		frmLargestAndSmallest.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(130, 163, 283, 30);
		frmLargestAndSmallest.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Largest number:"+maxx);
				lblNewLabel_1_1.setText("Smallest number:"+minn);
			}
		});
		btnStop.setBounds(233, 65, 85, 23);
		frmLargestAndSmallest.getContentPane().add(btnStop);
		
		
	}
}