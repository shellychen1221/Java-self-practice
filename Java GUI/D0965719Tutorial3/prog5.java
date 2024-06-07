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

public class prog5 {

	private JFrame frmMenu;
	private static float sum=0;
	private static String ss;
	private static int m=0,count=0;
	private static int length=1;
	private static int [] a = new int[length];

	ArrayList<Integer> myList = new ArrayList<Integer>();
	ArrayList<Integer> myList11 = new ArrayList<Integer>();
	int[] ret = new int[myList.size()];
	Integer[] array;
	int[] count11 = new int[101];
	int index = count11.length - 1;
	Integer[] array11;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog5 window = new prog5();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 379, 298);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 67, 85, 30);
		frmMenu.getContentPane().add(lblNewLabel);
		lblNewLabel.setVisible(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(85, 72, 118, 25);
		frmMenu.getContentPane().add(textArea);
		textArea.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setBounds(98, 157, 267, 30);
		frmMenu.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JLabel lblanswer = new JLabel();
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(10, 157, 251, 30);
		frmMenu.getContentPane().add(lblanswer);
		lblanswer.setVisible(false);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number=textArea.getText();
		        float n=Float.parseFloat(number);
		        a[length-1]=Integer.parseInt(number);
		        sum=sum+n;
		        count++;
		        
		        int op = Integer.parseInt(number);
				myList.add(op);
				array = myList.toArray(new Integer[0]);
				
				
				String number1 = textArea.getText();
				int op1 = Integer.parseInt(number1);

				myList11.add(op1);
				array11 = myList11.toArray(new Integer[0]);
				textArea.setText("");
		        }
		});
		
		btnNewButton.setBounds(233, 71, 85, 23);
		frmMenu.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.inactiveCaption);
		btnStop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop.setForeground(new Color(0, 0, 0));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblanswer.setVisible(true);
				lblNewLabel_1.setVisible(true);
				switch(m) {
				case 1:{
					ss=String.valueOf(sum/count);
					lblNewLabel_1.setText(ss);
					lblanswer.setText("Mean:");
					textArea.setVisible(false);
					count=0;
					break;
				}
				case 2:{
					Arrays.sort(array);
		        	String median;
		        	if (array.length% 2 == 0) {
	                    median=String.valueOf((array[array.length/2-1] +array[array.length/2])/2);
	                 } 
	                 else {
	                    median=String.valueOf(array[array.length/2]);
	                 }
		        	lblanswer.setText("Median: ");
		        	lblNewLabel_1.setText(median);
		        	Arrays.fill(array, null);
			        count=0;
			        break;
				}
				case 3:{
					for (int i = 0; i < array11.length; i++) {
						count11[array[i]]++;
					}
					for (int i = count11.length - 2; i >= 0; i--) {
						if (count11[i] >= count11[index])
							index = i;
					}
					String aaa = Float.toString(index);
					lblanswer.setText("Mode:");
					Arrays.fill(array11, null);
					
			        lblNewLabel_1.setText(aaa);
			        count=0;
			        break;
				}
				default:{
					break;
				}
				} 
				count=0;
			}
		});
		btnStop.setBounds(233, 101, 85, 23);
		frmMenu.getContentPane().add(btnStop);
		
		JButton btnMean = new JButton("Mean");
		btnMean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m=1;
				lblNewLabel.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel_1.setVisible(false);
				lblanswer.setVisible(false);
			}
		});
		btnMean.setForeground(Color.BLACK);
		btnMean.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnMean.setBackground(SystemColor.inactiveCaption);
		btnMean.setBounds(10, 32, 85, 23);
		frmMenu.getContentPane().add(btnMean);
		
		JButton btnStop_1_1 = new JButton("Median");
		btnStop_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m=2;
				lblNewLabel.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel_1.setVisible(false);
				lblanswer.setVisible(false);
			
			}
		});
		btnStop_1_1.setForeground(Color.BLACK);
		btnStop_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop_1_1.setBackground(SystemColor.inactiveCaption);
		btnStop_1_1.setBounds(117, 32, 102, 23);
		frmMenu.getContentPane().add(btnStop_1_1);
		
		JButton btnStop_1_2 = new JButton("Mode");
		btnStop_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m=3;
				lblNewLabel.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel_1.setVisible(false);
				lblanswer.setVisible(false);
			}
		});
		btnStop_1_2.setForeground(Color.BLACK);
		btnStop_1_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop_1_2.setBackground(SystemColor.inactiveCaption);
		btnStop_1_2.setBounds(233, 32, 85, 23);
		frmMenu.getContentPane().add(btnStop_1_2);


	}
}
