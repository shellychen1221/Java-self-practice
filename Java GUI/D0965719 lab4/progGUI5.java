

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class progGUI5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI5 window = new progGUI5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int p=0,x=1,y=1;
		for(int i = 1; i<=5; i++){
            y++;
            x=1;
            for(int j=1;j<=i;j++){
            	p++;
            	JLabel lblAnswer_2 = new JLabel("");
                lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                lblAnswer_2.setBounds(30*x, 30*y, 20, 30);
                frame.getContentPane().add(lblAnswer_2);
                String pp =String.valueOf(p);
                lblAnswer_2.setText(pp);
                x++;
            }
       }
	}

}
