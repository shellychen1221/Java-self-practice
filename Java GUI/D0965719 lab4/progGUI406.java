import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class progGUI406 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI406 window = new progGUI406();
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
	public progGUI406() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 31, 263);
		frame.getContentPane().add(lblNewLabel);
		
		int x,y=1;
		for(int i=1;i<=5;i++){
			x=i;
            for(int o=1;o<=i;o++) {
                JLabel lblAnswer_2 = new JLabel("");
                lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                lblAnswer_2.setBounds(180+20*x, 30*y, 169, 30);
                frame.getContentPane().add(lblAnswer_2);
                String oo =String.valueOf(o);
                lblAnswer_2.setText(oo);
                x--;
            }
            x=i;
            for(int o=1;o<=i;o++) {
                JLabel lblAnswer_2 = new JLabel("");
                lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                lblAnswer_2.setBounds(220-20*x, 30*y, 169, 30);
                frame.getContentPane().add(lblAnswer_2);
                String oo =String.valueOf(o);
                lblAnswer_2.setText(oo);
                x--;
            }
            y++;
        }
	}
}