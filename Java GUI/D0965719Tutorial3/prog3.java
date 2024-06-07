import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class prog3 {

	private JFrame frame;
	
	ArrayList<Integer> myList = new ArrayList<Integer>();
	int[] ret = new int[myList.size()];
	Integer[] array;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog3 window = new prog3();
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
	public prog3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Median");
		frame.setBounds(100, 100, 425, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 44, 85, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(85, 44, 118, 25);
		frame.getContentPane().add(textArea);
		
		JLabel lblanswer = new JLabel();
		lblanswer.setForeground(Color.RED);
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(81, 124, 271, 30);
		frame.getContentPane().add(lblanswer);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textArea.getText();
				int op = Integer.parseInt(number);
				textArea.setText("");
				myList.add(op);
				array = myList.toArray(new Integer[0]);
		        }
		        }
		);
		btnNewButton.setBounds(233, 52, 85, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.inactiveCaption);
		btnStop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop.setForeground(new Color(0, 0, 0));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(array);
	        	String median;
	        	if (array.length% 2 == 0) {
                    median=String.valueOf((array[array.length/2-1] +array[array.length/2])/2);
                 } 
                 else {
                    median=String.valueOf(array[array.length/2]);
                 }
	        	lblanswer.setText("The median value is: "+median);
			}
		});
		btnStop.setBounds(328, 51, 85, 23);
		frame.getContentPane().add(btnStop);
		
		
	}
}
