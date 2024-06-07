import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class progGUI10 {

	private JFrame frmPrint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI10 window = new progGUI10();
					window.frmPrint.setVisible(true);
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
		frmPrint = new JFrame();
		frmPrint.setTitle("Print ");
		frmPrint.setBounds(100, 100, 450, 186);
		frmPrint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrint.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] names = { "Ferrari", "BMW", "Ford", "Mazda", "FCU"};
				int i=1;
				for(String name : names) {	
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
					lblNewLabel.setBounds(10+60*i, 66, 416, 30);
					frmPrint.getContentPane().add(lblNewLabel);
					lblNewLabel.setText(name);
					i++;
				}
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(158, 10, 86, 23);
		frmPrint.getContentPane().add(btnNewButton);
	}

}
