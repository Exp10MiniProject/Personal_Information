package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
//import net.proteanit.sql.Dbutils;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DisplayDatabase extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayDatabase frame = new DisplayDatabase ();
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
	public DisplayDatabase () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel db1 = new JLabel("Databases");
		db1.setHorizontalAlignment(SwingConstants.CENTER);
		db1.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 17));
		db1.setBounds(71, 10, 414, 21);
		contentPane.add(db1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 49, 556, 350);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Arial", Font.BOLD, 13));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Date of Birth", "Gender", "Phone Number", "E-Mail", "Blood Group", "Height", "Weight", "Profession", "Residence", "Work Place"
			}
		));
		
		JButton fetch = new JButton("Fetch data");
		fetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fetch.setBounds(269, 411, 102, 32);
		contentPane.add(fetch);
	}
}

