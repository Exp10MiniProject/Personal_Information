package Personal_Information_Project;
//hi
import java.awt.BorderLayout;
import java.awt.EventQueue;
//hi
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
//hi hi 
//hi from SHaranya 
public class FormFrame extends JFrame {
// hi rose
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFrame frame = new FormFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Information Management System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 17));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 0, 431, 52);
		contentPane.add(lblNewLabel);
		
		JButton entry_button = new JButton("Enter Details");
		entry_button.setFont(new Font("Tahoma", Font.BOLD, 11));
		entry_button.setBounds(140, 91, 154, 23);
		contentPane.add(entry_button);
		entry_button.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						FirstFrame f2= new FirstFrame();
						f2.setVisible(true);
					}
				});
		
		JButton group_button = new JButton("Retrieve Details");
		group_button.setFont(new Font("Tahoma", Font.BOLD, 11));
		group_button.setBounds(140, 146, 154, 23);
		contentPane.add(group_button);
	}
}
