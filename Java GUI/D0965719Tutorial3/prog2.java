import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class prog2 {

	private JFrame frmMean;
	private static float sum=0,count=0;
	private static String ss;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog2 window = new prog2();
					window.frmMean.setVisible(true);
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
		frmMean = new JFrame();
		frmMean.setTitle("Mean");
		frmMean.setBounds(100, 100, 417, 211);
		frmMean.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMean.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 24, 85, 30);
		frmMean.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		textArea.setBounds(85, 24, 118, 25);
		frmMean.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setBounds(130, 123, 283, 30);
		frmMean.getContentPane().add(lblNewLabel_1);
		
		JLabel lblanswer = new JLabel("Mean:");
		lblanswer.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblanswer.setBounds(47, 123, 78, 30);
		frmMean.getContentPane().add(lblanswer);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String number=textArea.getText();
		        float n=Float.parseFloat(number);
		        sum=sum+n;
		        count++;
		        textArea.setText("");
		        }
		});
		
		btnNewButton.setBounds(233, 32, 85, 23);
		frmMean.getContentPane().add(btnNewButton);
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBackground(SystemColor.inactiveCaption);
		btnStop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnStop.setForeground(new Color(0, 0, 0));
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ss=String.valueOf(sum/count);
				lblNewLabel_1.setText(ss);
			}
		});
		btnStop.setBounds(233, 65, 85, 23);
		frmMean.getContentPane().add(btnStop);

	}
}
