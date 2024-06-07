import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class progGUI402 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI402 window = new progGUI402();
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
	public progGUI402() {
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
		
		int x=1,y=1;
        for(int i = 1; i<=5; i++){
        	x=1;
            for(int j=1;j<=i;j++){
                JLabel lblAnswer_2 = new JLabel("");
                lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                lblAnswer_2.setBounds(30*x, 30*y, 169, 30);
                frame.getContentPane().add(lblAnswer_2);
                lblAnswer_2.setText("*");
                x++;
              }
            y++;
           }
        }

		
	}
