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
public class progGUI15 {

	private JFrame frmArmstrongNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI15 window = new progGUI15();
					window.frmArmstrongNumber.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArmstrongNumber = new JFrame();
		frmArmstrongNumber.setTitle("Armstrong number");
		frmArmstrongNumber.setBounds(100, 100, 430, 326);
		frmArmstrongNumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArmstrongNumber.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(106, 33, 79, 30);
		frmArmstrongNumber.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(195, 34, 118, 25);
		frmArmstrongNumber.getContentPane().add(textArea);

		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAnswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer.setBounds(10, 185, 154, 30);
		frmArmstrongNumber.getContentPane().add(lblAnswer);
		
		JLabel lblAnswer_1 = new JLabel("");
		lblAnswer_1.setForeground(Color.RED);
		lblAnswer_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblAnswer_1.setBounds(174, 185, 229, 30);
		frmArmstrongNumber.getContentPane().add(lblAnswer_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int aa=Integer.parseInt(a);
				
		        int ccc=0,aaa,ttt;
		        ttt=aa;
		        while(aa>0) {
		            aaa=aa%10;
		            aa=aa/10;
		            ccc=ccc+(aaa*aaa*aaa);
		        }
		        
		        if (ttt == ccc) {
		            lblAnswer_1.setText(a + " is a armstrong number");
		        }
		        else {
		        	lblAnswer_1.setText(a+ " is not a armstrong number");
		        }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmArmstrongNumber.getContentPane().add(btnNewButton);
		
	}

}