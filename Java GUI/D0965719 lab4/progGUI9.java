import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class progGUI9 {

	private JFrame frmEvenNumberOdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					progGUI9 window = new progGUI9();
					window.frmEvenNumberOdd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public progGUI9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEvenNumberOdd = new JFrame();
		frmEvenNumberOdd.setTitle("even number, odd number using for loop or while loop");
		frmEvenNumberOdd.setBounds(100, 100, 1176, 219);
		frmEvenNumberOdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEvenNumberOdd.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("even number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 66, 118, 30);
		frmEvenNumberOdd.getContentPane().add(lblNewLabel);
		
		JLabel lblOddNumber = new JLabel("odd number:");
		lblOddNumber.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblOddNumber.setBounds(10, 118, 118, 30);
		frmEvenNumberOdd.getContentPane().add(lblOddNumber);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                for (int i = 2; i <= 1000; i += 2) {
                	JLabel lblNewLabel_2 = new JLabel("");
                	lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                	lblNewLabel_2.setBounds(125+15*i, 66, 118, 30);
                	frmEvenNumberOdd.getContentPane().add(lblNewLabel_2);
                	String ii= String.valueOf(i);
                    lblNewLabel_2.setText(ii+" ");
                    
                }

                for (int i = 1; i <= 1000; i += 2) {
                    JLabel lblNewLabel_3 = new JLabel("");
                    lblNewLabel_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                    lblNewLabel_3.setBounds(125+15*i, 118, 118, 30);
                    frmEvenNumberOdd.getContentPane().add(lblNewLabel_3);
                    String ii= String.valueOf(i);
                    lblNewLabel_3.setText(ii+" ");
                }
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnNewButton.setBounds(240, 10, 86, 23);
		frmEvenNumberOdd.getContentPane().add(btnNewButton);
		
		JButton btnTry = new JButton("2");
		btnTry.setBackground(SystemColor.inactiveCaption);
		btnTry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iii=2;
                while(iii<1000) {
                	JLabel lblNewLabel_2 = new JLabel("");
                	lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                	lblNewLabel_2.setBounds(125+15*iii, 66, 118, 30);
                	frmEvenNumberOdd.getContentPane().add(lblNewLabel_2);
                	String ii= String.valueOf(iii);
                    lblNewLabel_2.setText(ii+" ");
                    iii=iii+2;
                }
                
                int jjj=1;
                while(jjj<1000){
                	JLabel lblNewLabel_2 = new JLabel("");
                	lblNewLabel_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
                	lblNewLabel_2.setBounds(125+15*jjj, 118, 118, 30);
                	frmEvenNumberOdd.getContentPane().add(lblNewLabel_2);
                	String ii= String.valueOf(jjj);
                    lblNewLabel_2.setText(ii+" ");
                    jjj=jjj+2;
                }
			}
		});
		btnTry.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		btnTry.setBounds(536, 10, 86, 23);
		frmEvenNumberOdd.getContentPane().add(btnTry);
		

		JLabel lblforLoop = new JLabel("(for loop)");
		lblforLoop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblforLoop.setBounds(336, 10, 118, 30);
		frmEvenNumberOdd.getContentPane().add(lblforLoop);
		
		JLabel lblwhileLoop = new JLabel("(while loop)");
		lblwhileLoop.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		lblwhileLoop.setBounds(632, 6, 118, 30);
		frmEvenNumberOdd.getContentPane().add(lblwhileLoop);
		
	}
}