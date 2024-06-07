import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;

public class prog2 {

	private JFrame frmGame;
	private static boolean t=false;
	private static int q=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog2 window = new prog2();
					window.frmGame.setVisible(true);
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
		frmGame = new JFrame();
		frmGame.setTitle("Game");
		frmGame.setBounds(100, 100, 526, 301);
		frmGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 77, 392, 30);
		frmGame.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		textArea.setBounds(81, 134, 272, 25);
		frmGame.getContentPane().add(textArea);
		textArea.setVisible(false);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setText("Answer:");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 129, 108, 30);
		frmGame.getContentPane().add(lblNewLabel_1);
		

		JButton btnNewButton_8_1 = new JButton("OK");
	
		btnNewButton_8_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_8_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_8_1.setBounds(388, 117, 63, 46);
		frmGame.getContentPane().add(btnNewButton_8_1);
		btnNewButton_8_1.setVisible(false);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("48+90-5=?");
				q=1;
			}
		});
		
		btnNewButton.setBounds(10, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("7946+8215+52=?");
				q=2;
			}
		});
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1.setBounds(59, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.setBounds(109, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many colors are there in a rainbow?");
				q=3;
			}
		});
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_3.setBackground(SystemColor.inactiveCaption);
		btnNewButton_3.setBounds(158, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many days are there in a year?");
				q=4;
			}
		});
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_4.setBackground(SystemColor.inactiveCaption);
		btnNewButton_4.setBounds(207, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many letters are there in the English alphabet?");
				q=5;
			}
		});
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_5.setBackground(SystemColor.inactiveCaption);
		btnNewButton_5.setBounds(256, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many days do we have in a week?");
				q=6;
			}
		});
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_6.setBackground(SystemColor.inactiveCaption);
		btnNewButton_6.setBounds(308, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many sides are there in a triangle?");
				q=7;
			}
		});
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_7.setBackground(SystemColor.inactiveCaption);
		btnNewButton_7.setBounds(357, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many months of the year have 31 days?");
				q=8;
			}
		});
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_8.setBackground(SystemColor.inactiveCaption);
		btnNewButton_8.setBounds(406, 10, 45, 46);
		frmGame.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("How many millimeters are there in 1cm?");
				q=9;
			}
		});
		
		JButton btnNewButton_9 = new JButton("10");
		btnNewButton_9.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 15));
		btnNewButton_9.setBackground(SystemColor.inactiveCaption);
		btnNewButton_9.setBounds(455, 10, 54, 46);
		frmGame.getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8_1.setVisible(true);
				textArea.setVisible(true);
				lblNewLabel.setText("What is the sum of the first four odd natural numbers?");
				q=10;
			}
		});
		
		JLabel lblNewLabel_1_1 = new JLabel();
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(60, 192, 340, 30);
		frmGame.getContentPane().add(lblNewLabel_1_1);
		
		
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				switch (q) {
					case 1: {
						if(aa==133) {
							t=true;
						}	
						else {
							t=false;
						}
						break;
					}
					case 2:{
						if(aa==12613) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 3:{
						if(aa==7) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 4:{
						if(aa==365) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 5:{
						if(aa==21) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 6:{
						if(aa==7) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 7:{
						if(aa==3) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 8:{
						if(aa==7) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 9:{
						if(aa==10) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					case 10:{
						if(aa==10) {
							t=true;
						}
						else {
							t=false;
						}
						break;
					}
					default:{
					}
				}
				if(t) {
					lblNewLabel_1_1.setText("You are right~!");
				}
				else if(!t) {
					lblNewLabel_1_1.setText("You are wrong...");
				}
			}
		});
	}
}
