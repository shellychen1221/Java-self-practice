import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;

public class progGUI6 {
	private JFrame frmSinx;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI6 window = new progGUI6();
					window.frmSinx.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public progGUI6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSinx = new JFrame();
		frmSinx.setTitle("sinx");
		frmSinx.setBounds(100, 100, 430, 326);
		frmSinx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSinx.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(62, 33, 42, 30);
		frmSinx.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(114, 34, 118, 25);
		frmSinx.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmSinx.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmSinx.getContentPane().add(lblAnswer_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea_1.setBounds(114, 71, 118, 25);
		frmSinx.getContentPane().add(textArea_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				double aa=Double.parseDouble(a);
				String b=textArea_1.getText();
				double bb=Double.parseDouble(b);
		        int si = 1;
		        double sum = 0, pp;
		        for (int i = 1; i <= bb; i += 2) {
		            double fa = 1;
		            for (int j = 1; j <= i; j++) {
		                fa = fa * j;
		            }
		            pp=Math.pow(aa,i);
		            sum = sum + si * pp / fa;
		            si*=(-1);
		        }
		        String summ = String.valueOf(sum);
		        lblAnswer_1.setText(summ);

			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(242, 54, 85, 23);
		frmSinx.getContentPane().add(btnNewButton);
		
		JLabel lblAnswer_2 = new JLabel("sin x = x - x3/3! + x5/5! - x7/7! + x9/9! ........ ");
		lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_2.setBounds(35, 131, 368, 30);
		frmSinx.getContentPane().add(lblAnswer_2);
		
		JLabel lblB = new JLabel("b: ");
		lblB.setHorizontalAlignment(SwingConstants.TRAILING);
		lblB.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblB.setBounds(62, 70, 42, 30);
		frmSinx.getContentPane().add(lblB);
		
	}
}