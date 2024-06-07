import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class progGui9 {

	private JFrame frmCalculateAreaCircumference;
	public static String l,w,a,c;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui9 window = new progGui9();
					window.frmCalculateAreaCircumference.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculateAreaCircumference = new JFrame();
		frmCalculateAreaCircumference.setTitle("Calculate Area, Circumference");
		frmCalculateAreaCircumference.setBounds(100, 100, 311, 300);
		frmCalculateAreaCircumference.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculateAreaCircumference.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("Area:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(46, 144, 102, 25);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Circumference:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(10, 172, 136, 25);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_4_1);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(122, 146, 113, 23);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(167, 23, 102, 25);
		frmCalculateAreaCircumference.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(151, 174, 136, 23);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_2.setBounds(127, 204, 113, 23);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea_1.setBounds(167, 52, 102, 25);
		frmCalculateAreaCircumference.getContentPane().add(textArea_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l=textArea.getText();
				w=textArea_1.getText();
				int ll=Integer.parseInt(l);
				int ww=Integer.parseInt(w);
				int aa=ll*ww;
				int cc=2*(ll+ww);
				a=String.valueOf(aa);
				c=String.valueOf(cc);
				lblNewLabel.setText(a);
				lblNewLabel_1.setText(c);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(130, 87, 78, 35);
		frmCalculateAreaCircumference.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4_3 = new JLabel("Enter the length: ");
		lblNewLabel_4_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(10, 23, 171, 25);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Enter the width: ");
		lblNewLabel_4_3_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_3_1.setBounds(10, 52, 171, 25);
		frmCalculateAreaCircumference.getContentPane().add(lblNewLabel_4_3_1);
		
		
		
		
	}
}
