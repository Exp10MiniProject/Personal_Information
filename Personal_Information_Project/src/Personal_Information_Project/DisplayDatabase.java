package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
//for rozz
import net.proteanit.sql.DbUtils;
import net.proteanit.sql.Dbutils;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		setBounds(100, 100, 1006, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel db1 = new JLabel("Databases");
		db1.setHorizontalAlignment(SwingConstants.CENTER);
		db1.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 19));
		db1.setBounds(10, 10, 953, 21);
		contentPane.add(db1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 49, 918, 599);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Date of Birth", "Gender", "Phone Number", "E-Mail", "Blood Group", "Height", "Weight", "Profession", "Residence", "Work Place"
			}
		));
		
		JButton fetch = new JButton("Fetch data");
		fetch.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		fetch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{ 
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_information?characterEncoding=latin1","root","Sharanya47*;"); 
					
					String sql = "Select * from Details";
					PreparedStatement s= conn.prepareStatement(sql);
					ResultSet rs = (ResultSet) s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				
				
				
				}catch(Exception e2) 
				{ 
					System.out.println(e2); 
				} 
				
				
				
				
				
			}
		});
		fetch.setBounds(450, 658, 148, 49);
		contentPane.add(fetch);
	}
}

