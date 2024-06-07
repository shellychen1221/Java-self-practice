import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class progGui5 {

	private JFrame frmHoursMinutesSeconds;
	public static String s,hh,mm,sss;
	public static int h,m,ss;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGui5 window = new progGui5();
					window.frmHoursMinutesSeconds.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGui5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHoursMinutesSeconds = new JFrame();
		frmHoursMinutesSeconds.setTitle("hours, minutes, seconds");
		frmHoursMinutesSeconds.setBounds(100, 100, 331, 300);
		frmHoursMinutesSeconds.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHoursMinutesSeconds.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("Hours:");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(46, 144, 102, 25);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Minutes:");
		lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(46, 172, 87, 25);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_4_1);
		
		
		JLabel lblNewLabel_4_2 = new JLabel("Seconds:");
		lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(46, 194, 148, 25);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_4_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(122, 146, 113, 23);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textArea.setBounds(171, 52, 102, 25);
		frmHoursMinutesSeconds.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_1.setBounds(122, 174, 136, 23);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel_2.setBounds(127, 204, 113, 23);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s=textArea.getText();
				int s2=Integer.parseInt(s);
				h=s2/3600;
				m=(s2%3600)/60;
				ss=s2-h*3600-m*60;
				hh=String.valueOf(h);
				mm=String.valueOf(m);
				sss=String.valueOf(ss);
				lblNewLabel.setText(hh);
				lblNewLabel_1.setText(mm);
				lblNewLabel_2.setText(sss);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(130, 87, 78, 35);
		frmHoursMinutesSeconds.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4_3 = new JLabel("Enter the seconds: ");
		lblNewLabel_4_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4_3.setBounds(10, 52, 171, 25);
		frmHoursMinutesSeconds.getContentPane().add(lblNewLabel_4_3);
		
		
	}
}
