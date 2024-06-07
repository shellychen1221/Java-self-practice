import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class trafficlight {
	private JFrame frame;
	public static boolean stop=false;
	public static String a="green";
	public Timer timer;
	public static int qq=0;
	public static int aa=0;

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 63, 162);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel light_red = new JPanel();
		light_red.setBorder(new EmptyBorder(0, 0, 0, 0));
		light_red.setToolTipText("");
		light_red.setBounds(10, 5, 42, 42);
		panel.add(light_red);
		light_red.setBackground(Color.red);
		light_red.setLayout(null);
		
		JLabel Labelred = new JLabel("");
		Labelred.setBounds(0, 0, 42, 42);
		light_red.add(Labelred);
		Labelred.setIcon(new ImageIcon("C:\\Users\\shell\\Desktop\\cover.png"));

		JPanel light_yellow = new JPanel();
		light_yellow.setBorder(new EmptyBorder(0, 0, 0, 0));
		light_yellow.setBackground(Color.yellow);
		light_yellow.setBounds(10, 57, 42, 42);
		panel.add(light_yellow);
		light_yellow.setLayout(null);
		
		JLabel Labelyellow = new JLabel("");
		Labelyellow.setBounds(0, -12, 42, 54);
		light_yellow.add(Labelyellow);
		Labelyellow.setIcon(new ImageIcon("C:\\Users\\shell\\Desktop\\cover.png"));
		
		JPanel light_green = new JPanel();
		light_green.setBorder(new EmptyBorder(0, 0, 0, 0));
		light_green.setBackground(Color.green);
		light_green.setBounds(10, 109, 42, 42);
		panel.add(light_green);
		light_green.setLayout(null);
		
		JLabel Labelgreen = new JLabel("");
		Labelgreen.setBounds(0, 0, 42, 42);
		light_green.add(Labelgreen);
		Labelgreen.setIcon(new ImageIcon("C:\\Users\\shell\\Desktop\\cover.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(21, 154, 19, 109);
		frame.getContentPane().add(panel_3);
		
		JLabel pedestrian = new JLabel("");
		pedestrian.setIcon(new ImageIcon("C:\\Users\\shell\\Desktop\\pedestrian.png"));
		pedestrian.setBounds(134, 58, 176, 162);
		frame.getContentPane().add(pedestrian);		
	
		Timer O=new Timer(10,new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				aa++;
				pedestrian.setLocation(aa,100);
				if(aa==355) {
					aa=0;
				}
			}
		});
		Timer T=new Timer(1000,new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				qq++;
				switch (qq) {
				case 1: {
					Labelred.setVisible(true);
					Labelyellow.setVisible(true);
					Labelgreen.setVisible(false);
					O.start();
					break;
				}
				case 2:{
					Labelred.setVisible(true);
					Labelyellow.setVisible(false);
					Labelgreen.setVisible(true);
					break;
				}
				case 3:{
					Labelred.setVisible(false);
					Labelyellow.setVisible(true);
					Labelgreen.setVisible(true);
					qq=0;
					O.stop();
					break;
				}
				default:{
					break;
				}
				}
			}
			
		});
		T.start();
	}
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trafficlight window = new trafficlight();
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
	public trafficlight() {
		initialize();
	}
}
