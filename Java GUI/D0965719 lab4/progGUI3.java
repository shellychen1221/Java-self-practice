import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
public class progGUI3 {

	private JFrame frmCalculate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI3 window = new progGUI3();
					window.frmCalculate.setVisible(true);
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
		frmCalculate = new JFrame();
		frmCalculate.setTitle("Calculate");
		frmCalculate.setBounds(100, 100, 430, 326);
		frmCalculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculate.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("n: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(62, 33, 42, 30);
		frmCalculate.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(114, 34, 118, 25);
		frmCalculate.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmCalculate.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmCalculate.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				
				double b = 1;
		        double bb = 0;
		        double s;
		        double w;
		        for (int i = 1; i <= aa; i++) {
		            bb = bb + 1 / b;
		            s=Math.pow(-1, i);
		            w=Math.abs(b);
		            b = (w+1)*s;
		        }
		        String bbb = String.valueOf(bb);
		        lblAnswer_1.setText(bbb);

			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(242, 37, 85, 23);
		frmCalculate.getContentPane().add(btnNewButton);
		
		JLabel lblAnswer_2 = new JLabel("1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n");
		lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_2.setBounds(100, 110, 244, 30);
		frmCalculate.getContentPane().add(lblAnswer_2);
		
	}

}