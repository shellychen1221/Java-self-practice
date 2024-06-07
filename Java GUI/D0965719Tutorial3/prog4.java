import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class prog4 {

	private JFrame frmMode;
	private JTextField textField_1;

	ArrayList<Integer> myList = new ArrayList<Integer>();
	int[] ret = new int[myList.size()];

	int[] count = new int[101];
	int index = count.length - 1;
	Integer[] array;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog4 window = new prog4();
					window.frmMode.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prog4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMode = new JFrame();
		frmMode.setTitle("Mode");
		frmMode.setBounds(100, 100, 506, 237);
		frmMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMode.getContentPane().setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
		textArea.setBounds(139, 23, 212, 34);
		frmMode.getContentPane().add(textArea);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textArea.getText();
				int op = Integer.parseInt(number);

				textArea.setText("");

				myList.add(op);
				System.out.println(Arrays.deepToString(myList.toArray()));
				array = myList.toArray(new Integer[0]);
				System.out.println(Arrays.toString(array));
			}

		});

		btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton.setBounds(381, 26, 106, 31);
		frmMode.getContentPane().add(btnNewButton);
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		textField_1.setBounds(120, 131, 264, 34);
		frmMode.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		JButton btnNewButton_1 = new JButton("Stop");
		// count the occurrences

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < array.length; i++) {
					count[array[i]]++;
				}
				for (int i = count.length - 2; i >= 0; i--) {
					if (count[i] >= count[index])
						index = i;
				}
				String aaa = Float.toString(index);
				textField_1.setText(aaa);
			}

		});

		btnNewButton_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		btnNewButton_1.setBounds(381, 77, 106, 34);
		frmMode.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblNewLabel.setBounds(25, 26, 90, 23);
		frmMode.getContentPane().add(lblNewLabel);
		
		JLabel lblMode = new JLabel("Mode");
		lblMode.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		lblMode.setBounds(25, 131, 90, 23);
		frmMode.getContentPane().add(lblMode);

	}
}