import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class progGUI4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI4 window = new progGUI4();
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
	public progGUI4() {
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
		
		


        for(int i=1;i<=10;i++){
            for(int j=1;j<=4;j++){
                JLabel lblAnswer_2 = new JLabel("");
      		    lblAnswer_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
      		    lblAnswer_2.setBounds(30*i, 30*j, 169, 30);
      		    frame.getContentPane().add(lblAnswer_2);
      		    lblAnswer_2.setText("*");
                
            }

            
        }
		
	}

}