package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class RetrieveDetailsFrame extends JFrame 
{

	private JPanel contentPane;
	private JTextField R_enterName_textField;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetrieveDetailsFrame frame = new RetrieveDetailsFrame();
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
	public RetrieveDetailsFrame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Retrieve_Label = new JLabel("Retrieve Details");
		Retrieve_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Retrieve_Label.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 17));
		Retrieve_Label.setBounds(10, 11, 414, 21);
		contentPane.add(Retrieve_Label);
		
		JLabel R_enterName_Label = new JLabel("Enter Name");
		R_enterName_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_enterName_Label.setBounds(10, 72, 102, 21);
		contentPane.add(R_enterName_Label);
		
		R_enterName_textField = new JTextField();
		R_enterName_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_enterName_textField.setBounds(134, 72, 219, 21);
		contentPane.add(R_enterName_textField);
		R_enterName_textField.setColumns(10);
		
		JButton r_ok = new JButton("OK");
		r_ok.setFont(new Font("Tahoma", Font.BOLD, 14));
		r_ok.setBounds(359, 111, 65, 32);
		contentPane.add(r_ok);
		
		r_ok.addActionListener(new ActionListener() 
		{

			//String EnteredName= R_enterName_textField.getText();
			
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{ 
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_information?characterEncoding=latin1","root","your password"); 
					String sql="SELECT * FROM Details WHERE name=?";
					PreparedStatement s= conn.prepareStatement(sql);
					s.setString(1, R_enterName_textField.getText());
					ResultSet rs = (ResultSet) s.executeQuery();
					
					while(rs.next())
					{
						String id = rs.getString(1);
						System.out.println("ID :" + id);
						
						String name = rs.getString(2);
						System.out.println("Name :" + name);
						
						String dob = rs.getString(3);
						System.out.println("Date of birth :" + dob);
						
						String gender = rs.getString(4);
						System.out.println("Gender :" + gender);
						
						String ph_no = rs.getString(5);
						System.out.println("Phone Number :" + ph_no);
						
						String email = rs.getString(6);
						System.out.println("Email :" + email);
						
						String blood_grp = rs.getString(7);
						System.out.println("Blood Group :" + blood_grp);
						
						String height = rs.getString(8);
						System.out.println("Height :" + height);
						
						String weight = rs.getString(9);
						System.out.println("Weight :" + weight);
						
						String profession = rs.getString(10);
						System.out.println("Profession :" + profession);
						
						String residing_area = rs.getString(11);
						System.out.println("Residence :" + residing_area);
						
						String work_place = rs.getString(12);
						System.out.println("Work Place:" + work_place);
					}	
				}
				
				catch(Exception e1) 
				{ 
					System.out.println(e1); 
				} 
			}
		});
		
		
	}
}
	

