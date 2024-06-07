import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
public class progGUI10 {

	private JFrame frmBinaryToDecimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI10 window = new progGUI10();
					window.frmBinaryToDecimal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBinaryToDecimal = new JFrame();
		frmBinaryToDecimal.setTitle("Binary to Decimal");
		frmBinaryToDecimal.setBounds(100, 100, 450, 326);
		frmBinaryToDecimal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBinaryToDecimal.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Binary number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 33, 169, 30);
		frmBinaryToDecimal.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(195, 34, 118, 25);
		frmBinaryToDecimal.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Decimal number is:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmBinaryToDecimal.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmBinaryToDecimal.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				
		        int dcn = 0;
		        int kk;
		        int jj = 1;
		        while (aa > 0) {
		            kk = aa % 10;
		            dcn = dcn + kk * jj;
		            jj = jj * 2;
		            aa = aa / 10;
		        }
				String answer= String.valueOf(dcn);
				lblAnswer_1.setText(answer);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmBinaryToDecimal.getContentPane().add(btnNewButton);
		
	}

}