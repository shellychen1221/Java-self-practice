import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PhoneBook {

    private JFrame frame;
    LinkedList<String> name = new LinkedList<>();//create the LinkedList
    LinkedList<String> phonenumber = new LinkedList<>();
    StringBuffer sb = new StringBuffer();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PhoneBook window = new PhoneBook();
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
    public PhoneBook() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Enter the name:");
        lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        lblNewLabel.setBounds(21, 66, 212, 30);
        frame.getContentPane().add(lblNewLabel);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        textArea.setBounds(257, 71, 118, 25);
        frame.getContentPane().add(textArea);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        textArea_1.setBounds(257, 106, 118, 25);
        frame.getContentPane().add(textArea_1);

        JLabel lblEnterPhone = new JLabel("Enter the phone number:");
        lblEnterPhone.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        lblEnterPhone.setBounds(6, 106, 227, 30);
        frame.getContentPane().add(lblEnterPhone);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        lblNewLabel_1.setBounds(21, 159, 354, 30);
        frame.getContentPane().add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Insert");
        btnNewButton.setBackground(SystemColor.inactiveCaption);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = textArea.getText();
                String pn = textArea_1.getText();
                name.add(n);
                phonenumber.add(pn);
                lblNewLabel_1.setText("Entry added.");
                textArea.setText("");
                textArea_1.setText("");
            }
        });
        btnNewButton.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        btnNewButton.setBounds(10, 10, 89, 23);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("LookUp");
        btnNewButton_1.setBackground(SystemColor.inactiveCaption);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fn = textArea.getText();
                if (name.contains(fn)) {
                    int index = name.indexOf(fn);
                    lblNewLabel_1.setText("Phone number: " + phonenumber.get(index));
                } else {
                    lblNewLabel_1.setText("Not present in the list");
                }
            }
        });
        btnNewButton_1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        btnNewButton_1.setBounds(108, 10, 97, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Repeat LookUp");
        btnNewButton_2.setBackground(SystemColor.inactiveCaption);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblNewLabel.setText("Enter the name you want to find:");
            }
        });
        btnNewButton_2.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        btnNewButton_2.setBounds(215, 10, 151, 23);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Delete");
        btnNewButton_3.setBackground(SystemColor.inactiveCaption);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dn = textArea.getText();
                if (name.contains(dn)) {
                    int index = name.indexOf(dn);
                    name.remove(index);
                    phonenumber.remove(index);
                    lblNewLabel_1.setText("Successfully deleted");
                } else {
                    lblNewLabel_1.setText("Not present in the list");
                }
            }
        });
        btnNewButton_3.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 17));
        btnNewButton_3.setBounds(374, 10, 89, 23);
        frame.getContentPane().add(btnNewButton_3);
    }
}
