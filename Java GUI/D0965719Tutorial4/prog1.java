import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class prog1 {
	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog1 window = new prog1();
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
	public prog1() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Add");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Ascending");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(10, 10, 115, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Decending");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 136, 204, 23);
		frame.getContentPane().add(lblNewLabel);
				
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(351, 55, 60, 23);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a[] = {"2","3","1","4","8","9","0","5"};
		        String[] text =new String[] {("Candy"), ("Mango"), ("Gum"), ("Apple"),("Avi")} ;
		        Arrays.sort(a);
		        Arrays.sort(text);
		        int iii=0;
		        for(int i=0;i<a.length;i++){
		            JLabel lblNewLabel_4_1 = new JLabel("");
		            lblNewLabel_4_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		            frame.getContentPane().add(lblNewLabel_4_1);
		            lblNewLabel_4_1.setText(a[i]);
		            lblNewLabel_4_1.setBounds(10+i*10, 52, 22, 25);
		        }
		        for(int i = a.length-1; i>=0; i--){
		        	JLabel lblNewLabel_4_2_1 = new JLabel("");
		        	lblNewLabel_4_2_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		        	frame.getContentPane().add(lblNewLabel_4_2_1);
		        	lblNewLabel_4_2_1.setText(a[iii]);
		        	iii++;
		            lblNewLabel_4_2_1.setBounds(10+i*10, 170, 22, 25);
		        }
		        for(int i=0;i< text.length;i++){
		        	JLabel lblNewLabel_4_2 = new JLabel("");
		        	lblNewLabel_4_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		        	frame.getContentPane().add(lblNewLabel_4_2);
		        	lblNewLabel_4_2.setText(text[i]);
		            lblNewLabel_4_2.setBounds(10+i*50,86 , 60, 25);
		            lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		        }
		        iii=0;
		        for(int i = text.length-1; i>=0; i--){
		        	JLabel lblNewLabel_4_2_2 = new JLabel("");
		        	lblNewLabel_4_2_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 18));
		        	frame.getContentPane().add(lblNewLabel_4_2_2);
		        	lblNewLabel_4_2_2.setText(text[iii]);
		        	iii++;
		            lblNewLabel_4_2_2.setBounds(i*55, 210, 60, 25);
		            lblNewLabel_4_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		        }
			}
		});	
	}
}
