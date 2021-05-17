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
	
	private JTextField dob_textField;
	private JTextField gender_textField;
	private JTextField ph_no_textField;
	private JTextField height_textField;
	private JTextField email_textField;
	private JTextField blood_grp_textField;
	private JTextField weight_textField;
	private JTextField residing_area_textField;
	private JTextField work_place_textField;
	private JTextField profession_textField;

	private JLabel R_DateOfBirth_Label;
	private JLabel R_Gender_Label;
	private JLabel R_ph_no_Label;
	private JLabel R_email_Label;
	private JLabel R_blood_grp_Label;
	private JLabel R_height_Label;
	private JLabel R_weight_Label;
	private JLabel R_residingArea_Label;
	private JLabel R_workPace_Label;
	private JLabel R_Profession_Label;
	
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
		setBounds(100, 100, 451, 497);
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
		//R_enterName_textField.setColumns(10);
		
		R_DateOfBirth_Label = new JLabel("Date Of Birth");
		R_DateOfBirth_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_DateOfBirth_Label.setBounds(10, 160, 102, 21);
		
		dob_textField = new JTextField();
		dob_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dob_textField.setColumns(10);
		dob_textField.setBounds(134, 160, 219, 21);
				
		R_Gender_Label = new JLabel("Gender");
		R_Gender_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_Gender_Label.setBounds(10, 190, 102, 21);
				
		gender_textField = new JTextField();
		gender_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gender_textField.setColumns(10);
		gender_textField.setBounds(134, 190, 219, 21);
		
		R_ph_no_Label = new JLabel("Phone Number");
		R_ph_no_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_ph_no_Label.setBounds(10, 220, 102, 21);
				
		ph_no_textField = new JTextField();
		ph_no_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ph_no_textField.setColumns(10);
		ph_no_textField.setBounds(134, 220, 219, 21);
		
		R_email_Label = new JLabel("E-mail");
		R_email_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_email_Label.setBounds(10, 250, 102, 21);
				
		email_textField = new JTextField();
		email_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email_textField.setColumns(10);
		email_textField.setBounds(134, 250, 219, 21);
				
		R_blood_grp_Label = new JLabel("Blood Group");
		R_blood_grp_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_blood_grp_Label.setBounds(10, 280, 102, 21);
				
		blood_grp_textField = new JTextField();
		blood_grp_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		blood_grp_textField.setColumns(10);
		blood_grp_textField.setBounds(134, 280, 219, 21);
		
		R_height_Label = new JLabel("Height");
		R_height_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_height_Label.setBounds(10, 310, 102, 21);
				
		height_textField = new JTextField();
		height_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		height_textField.setColumns(10);
		height_textField.setBounds(134, 310, 219, 21);

		R_weight_Label = new JLabel("Weight");
		R_weight_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_weight_Label.setBounds(10, 340, 102, 21);
				
		weight_textField = new JTextField();
		weight_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		weight_textField.setColumns(10);
		weight_textField.setBounds(134, 340, 219, 21);
				
		R_residingArea_Label = new JLabel("Residence");
		R_residingArea_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_residingArea_Label.setBounds(10, 370, 102, 21);
				
		residing_area_textField = new JTextField();
		residing_area_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		residing_area_textField.setColumns(10);
		residing_area_textField.setBounds(134, 370, 219, 21);
				
		R_workPace_Label = new JLabel("Work Place");
		R_workPace_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_workPace_Label.setBounds(10, 400, 102, 21);
				
		work_place_textField = new JTextField();
		work_place_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		work_place_textField.setColumns(10);
		work_place_textField.setBounds(134, 400, 219, 21);
				
		R_Profession_Label = new JLabel("Profession");
		R_Profession_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_Profession_Label.setBounds(10, 430, 102, 21);
		
		profession_textField = new JTextField();
		profession_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		profession_textField.setColumns(10);
		profession_textField.setBounds(134, 430, 219, 21);

		contentPane.add(R_DateOfBirth_Label);
		contentPane.add(R_Gender_Label);
		contentPane.add(R_ph_no_Label);
		contentPane.add(R_email_Label);
		contentPane.add(R_blood_grp_Label);
		contentPane.add(R_height_Label);
		contentPane.add(R_weight_Label);
		contentPane.add(R_residingArea_Label);
		contentPane.add(R_workPace_Label);
		contentPane.add(R_Profession_Label);
		
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
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_information?characterEncoding=latin1","root","3249324932"); 
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
						dob_textField.setText(dob);
						
						String gender = rs.getString(4);
						System.out.println("Gender :" + gender);
						gender_textField.setText(gender);
						
						String ph_no = rs.getString(5);
						System.out.println("Phone Number :" + ph_no);
						ph_no_textField.setText(ph_no);
						
						String email = rs.getString(6);
						System.out.println("Email :" + email);
						email_textField.setText(email);
						
						String blood_grp = rs.getString(7);
						System.out.println("Blood Group :" + blood_grp);
						blood_grp_textField.setText(blood_grp);
						
						String height = rs.getString(8);
						System.out.println("Height :" + height);
						height_textField.setText(height);
						
						String weight = rs.getString(9);
						System.out.println("Weight :" + weight);
						weight_textField.setText(weight);
						
						String profession = rs.getString(10);
						System.out.println("Profession :" + profession);
						residing_area_textField.setText(profession);
						
						String residing_area = rs.getString(11);
						System.out.println("Residence :" + residing_area);
						work_place_textField.setText(residing_area);
						
						String work_place = rs.getString(12);
						System.out.println("Work Place:" + work_place);
						profession_textField.setText(work_place);
						
						
					}	
				}
				
				catch(Exception e1) 
				{ 
					System.out.println(e1); 
				} 
				
				contentPane.add(dob_textField);
				contentPane.add(gender_textField);
				contentPane.add(ph_no_textField);
				contentPane.add(email_textField);
				contentPane.add(blood_grp_textField);
				contentPane.add(height_textField);
				contentPane.add(weight_textField);
				contentPane.add(residing_area_textField);
				contentPane.add(work_place_textField);
				contentPane.add(profession_textField);
				
			
				
	
			}
		});
		
		
	}
}
	

