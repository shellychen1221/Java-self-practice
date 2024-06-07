import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class progGUI6 {

	private JFrame frmReverse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI6 window = new progGUI6();
					window.frmReverse.setVisible(true);
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
		frmReverse = new JFrame();
		frmReverse.setTitle("Reverse");
		frmReverse.setBounds(100, 100, 450, 326);
		frmReverse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReverse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number: ");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 33, 78, 30);
		frmReverse.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(83, 34, 118, 25);
		frmReverse.getContentPane().add(textArea);

		JLabel lblReverse = new JLabel("Reverse: ");
		lblReverse.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblReverse.setBounds(10, 185, 78, 30);
		frmReverse.getContentPane().add(lblReverse);
		
		JLabel lblReverse_1 = new JLabel("");
		lblReverse_1.setForeground(Color.RED);
		lblReverse_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblReverse_1.setBounds(83, 185, 118, 30);
		frmReverse.getContentPane().add(lblReverse_1);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textArea.getText();
				int rr=0;
				int aa=Integer.parseInt(a);
				while (aa != 0) {
		            rr = rr * 10;
		            rr = rr + aa % 10;
		            aa = aa / 10;
		        }
				String aaa=String.valueOf(rr);
				lblReverse_1.setText(aaa);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(41, 112, 85, 23);
		frmReverse.getContentPane().add(btnNewButton);
		
	}

}