import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class progGUI404 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI404 window = new progGUI404();
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
	public progGUI404() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("*");
		frame.setBounds(100, 100, 366, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int x,y=1;
		for(int i=1;i<=5;i++){
			x=i;
            for(int o=1;o<=2*i-1;o++) {
                JLabel lblAnswer_2 = new JLabel("");
                lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                lblAnswer_2.setBounds(100+20*x, 30*y, 169, 30);
                frame.getContentPane().add(lblAnswer_2);
                lblAnswer_2.setText("*");
                x--;
            }
            
            y++;
        }
	}
}