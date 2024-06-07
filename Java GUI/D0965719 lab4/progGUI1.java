import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class progGUI1 {

	private JFrame frmFibonacciSequence;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI1 window = new progGUI1();
					window.frmFibonacciSequence.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFibonacciSequence = new JFrame();
		frmFibonacciSequence.setTitle("Fibonacci sequence");
		frmFibonacciSequence.setBounds(100, 100, 1395, 218);
		frmFibonacciSequence.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFibonacciSequence.getContentPane().setLayout(null);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(-77, 50, 154, 30);
		frmFibonacciSequence.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(0, 112, 40, 30);
		frmFibonacciSequence.getContentPane().add(lblAnswer_1);
		
		
		 int num1 = 0;
		 int num2 = 1;
		 int num3 ;
		 lblAnswer_1.setText(num1 + " " + num2 + " ");
		 for (int i = 1; i <= 25; i++) {
		      num3 = num1 + num2;
		      JLabel lblAnswer_2 = new JLabel("");
		      lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		      lblAnswer_2.setBounds(50*i, 110, 169, 30);
		      frmFibonacciSequence.getContentPane().add(lblAnswer_2);
		      String num33=String.valueOf(num3);
		      lblAnswer_2.setText(num33);
		      num1 = num2;
		      num2 = num3;
		   }
		
	}

}