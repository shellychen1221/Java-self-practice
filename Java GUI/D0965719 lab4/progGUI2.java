import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import java.awt.Color;
public class progGUI2 {

	private JFrame frmCalculate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI2 window = new progGUI2();
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
	public progGUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculate = new JFrame();
		frmCalculate.setTitle("Calculate");
		frmCalculate.setBounds(100, 100, 341, 218);
		frmCalculate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculate.getContentPane().setLayout(null);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(-77, 50, 154, 30);
		frmCalculate.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(0, 112, 266, 30);
		frmCalculate.getContentPane().add(lblAnswer_1);
		
		JLabel lblsevenTerms = new JLabel("1/1!+2/2!+3/3!+...(seven terms)");
		lblsevenTerms.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblsevenTerms.setBounds(10, 10, 307, 30);
		frmCalculate.getContentPane().add(lblsevenTerms);
		
		
		double factorial = 1;
        double answer;
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }
            answer = i / factorial;
            lblAnswer_1.setText(answer + " ");
            factorial = 1;
        }
        
		
	}

}