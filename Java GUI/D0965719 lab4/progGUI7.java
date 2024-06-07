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

public class progGUI7 {

	private JFrame frmCosx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI7 window = new progGUI7();
					window.frmCosx.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCosx = new JFrame();
		frmCosx.setTitle("cosx");
		frmCosx.setBounds(100, 100, 430, 326);
		frmCosx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCosx.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("a: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(62, 33, 42, 30);
		frmCosx.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(114, 34, 118, 25);
		frmCosx.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmCosx.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmCosx.getContentPane().add(lblAnswer_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea_1.setBounds(114, 71, 118, 25);
		frmCosx.getContentPane().add(textArea_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				double aa=Double.parseDouble(a);
				String b=textArea_1.getText();
				double bb=Double.parseDouble(b);
		        int si = -1;
		        double sum = 1, pp;
		        for (int i = 2; i <= bb; i += 2) {
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
		frmCosx.getContentPane().add(btnNewButton);
		
		JLabel lblAnswer_2 = new JLabel("cos x = 1 - x2/2! + x4/4! - x6/6! ..... ");
		lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_2.setBounds(82, 133, 368, 30);
		frmCosx.getContentPane().add(lblAnswer_2);
		
		JLabel lblB = new JLabel("b: ");
		lblB.setHorizontalAlignment(SwingConstants.TRAILING);
		lblB.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblB.setBounds(62, 70, 42, 30);
		frmCosx.getContentPane().add(lblB);
		
	}
}