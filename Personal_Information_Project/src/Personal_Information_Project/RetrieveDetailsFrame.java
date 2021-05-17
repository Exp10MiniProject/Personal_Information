package Personal_Information_Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.ResultSet;
import javax.swing.JRadioButton;

public class RetrieveDetailsFrame extends JFrame 
{
	private JPanel contentPane;
	private JTextField SpecificstextField;
	private JTextField id_textField;
	private JTextField name_textField;
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
	
	private JLabel R_id_Label;
	private JLabel R_name_Label;
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
	private JTable table_details;
	
	public static void main(String[] args) {
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

	public RetrieveDetailsFrame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Retrieve_Label = new JLabel("Retrieve Details");
		Retrieve_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Retrieve_Label.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 17));
		Retrieve_Label.setBounds(10, 0, 461, 30);
		contentPane.add(Retrieve_Label);
		
		JLabel Retrieve_Label_1 = new JLabel("Retrieve Details Based On :   ");
		Retrieve_Label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Retrieve_Label_1.setFont(new Font("Lucida Sans", Font.ITALIC, 14));
		Retrieve_Label_1.setBounds(0, 36, 224, 21);
		contentPane.add(Retrieve_Label_1);
		
		JLabel R_enterSpecifics_Label = new JLabel("Enter Specifics :");
		R_enterSpecifics_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_enterSpecifics_Label.setBounds(22, 176, 102, 21);
		contentPane.add(R_enterSpecifics_Label);
		
		SpecificstextField = new JTextField();
		SpecificstextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		SpecificstextField.setBounds(134, 176, 219, 21);
		contentPane.add(SpecificstextField);
				
		JLabel R_ID_Label = new JLabel("ID");
		R_ID_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_ID_Label.setBounds(10, 200, 102, 21);
		contentPane.add(R_ID_Label);
		
		JLabel R_Name_Label = new JLabel("Name");
		R_Name_Label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_Name_Label.setBounds(10, 220, 102, 21);
		contentPane.add(R_Name_Label);
		
		JLabel R_DateOfBirth_Label_1 = new JLabel("Date Of Birth");
		R_DateOfBirth_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_DateOfBirth_Label_1.setBounds(10, 240, 102, 21);
		contentPane.add(R_DateOfBirth_Label_1);
		
		JLabel R_Gender_Label_1 = new JLabel("Gender");
		R_Gender_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_Gender_Label_1.setBounds(10, 260, 102, 21);
		contentPane.add(R_Gender_Label_1);
		
		JLabel R_ph_no_Label_1 = new JLabel("Phone Number");
		R_ph_no_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_ph_no_Label_1.setBounds(10, 280, 102, 21);
		contentPane.add(R_ph_no_Label_1);
		
		JLabel R_email_Label_1 = new JLabel("E-mail");
		R_email_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_email_Label_1.setBounds(10, 300, 102, 21);
		contentPane.add(R_email_Label_1);
		
		JLabel R_blood_grp_Label_1 = new JLabel("Blood Group");
		R_blood_grp_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_blood_grp_Label_1.setBounds(10, 320, 102, 21);
		contentPane.add(R_blood_grp_Label_1);
		
		JLabel R_height_Label_1 = new JLabel("Height");
		R_height_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_height_Label_1.setBounds(10, 340, 102, 21);
		contentPane.add(R_height_Label_1);
		
		JLabel R_weight_Label_1 = new JLabel("Weight");
		R_weight_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_weight_Label_1.setBounds(10, 360, 102, 21);
		contentPane.add(R_weight_Label_1);
		
		JLabel R_residingArea_Label_1 = new JLabel("Residence");
		R_residingArea_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_residingArea_Label_1.setBounds(10, 380, 102, 21);
		contentPane.add(R_residingArea_Label_1);
		
		JLabel R_workPace_Label_1 = new JLabel("Work Place");
		R_workPace_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_workPace_Label_1.setBounds(10, 400, 102, 21);
		contentPane.add(R_workPace_Label_1);
		
		JLabel R_Profession_Label_1 = new JLabel("Profession");
		R_Profession_Label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		R_Profession_Label_1.setBounds(10, 420, 102, 21);
		contentPane.add(R_Profession_Label_1);
		
		id_textField = new JTextField();
		id_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		id_textField.setColumns(10);
		id_textField.setBounds(134, 200, 219, 21);
		
		name_textField = new JTextField();
		name_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name_textField.setColumns(10);
		name_textField.setBounds(134, 220, 219, 21);
		
		dob_textField = new JTextField();
		dob_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dob_textField.setColumns(10);
		dob_textField.setBounds(134, 240, 219, 21);
				
		gender_textField = new JTextField();
		gender_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gender_textField.setColumns(10);
		gender_textField.setBounds(134, 260, 219, 21);
					
		ph_no_textField = new JTextField();
		ph_no_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ph_no_textField.setColumns(10);
		ph_no_textField.setBounds(134, 280, 219, 21);
			
		email_textField = new JTextField();
		email_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email_textField.setColumns(10);
		email_textField.setBounds(134, 300, 219, 21);
			
		blood_grp_textField = new JTextField();
		blood_grp_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		blood_grp_textField.setColumns(10);
		blood_grp_textField.setBounds(134, 320, 219, 21);
			
		height_textField = new JTextField();
		height_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		height_textField.setColumns(10);
		height_textField.setBounds(134, 340, 219, 21);
	
		weight_textField = new JTextField();
		weight_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		weight_textField.setColumns(10);
		weight_textField.setBounds(134, 360, 219, 21);
				
		residing_area_textField = new JTextField();
		residing_area_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		residing_area_textField.setColumns(10);
		residing_area_textField.setBounds(134, 380, 219, 21);
				
		work_place_textField = new JTextField();
		work_place_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		work_place_textField.setColumns(10);
		work_place_textField.setBounds(134, 400, 219, 21);
				
		profession_textField = new JTextField();
		profession_textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		profession_textField.setColumns(10);
		profession_textField.setBounds(134, 420, 219, 21);
		
		JButton r_ok = new JButton("OK");
		r_ok.setFont(new Font("Tahoma", Font.BOLD, 14));
		r_ok.setBounds(385, 176, 65, 21);
		contentPane.add(r_ok);
				
		r_ok.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String value= Handler.value();				
				try 
				{ 
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_information?characterEncoding=latin1","root","your password"); 
					String sql="SELECT * FROM Details WHERE " + value+" =?";
					PreparedStatement s= conn.prepareStatement(sql);
					s.setString(1, SpecificstextField.getText());
					ResultSet rs = (ResultSet) s.executeQuery();
					
					while(rs.next())
					{
						String id = rs.getString(1);
						System.out.println("ID :" + id);
						id_textField.setText(id);
						
						String name = rs.getString(2);
						System.out.println("Name :" + name);
						name_textField.setText(name);
						
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
				contentPane.add(id_textField);
				contentPane.add(name_textField);
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
	
		Handler h= new Handler();
		JRadioButton rdbtnID = new JRadioButton("id");
		rdbtnID.setBounds(203, 36, 109, 23);
		contentPane.add(rdbtnID);
		
		JRadioButton rdbtnDateOfBirth = new JRadioButton("dob");
		rdbtnDateOfBirth.setBounds(203, 76, 109, 23);
		rdbtnDateOfBirth.addActionListener(h);
		contentPane.add(rdbtnDateOfBirth);
		
		JRadioButton rdbtnName = new JRadioButton("name");
		rdbtnName.setBounds(203, 56, 109, 23);
		rdbtnName.addActionListener(h);
		contentPane.add(rdbtnName);
		
		JRadioButton rdbtnGender = new JRadioButton("gender");
		rdbtnGender.setBounds(203, 96, 109, 23);
		rdbtnGender.addActionListener(h);
		contentPane.add(rdbtnGender);
		
		JRadioButton rdbtnPhoneNumber = new JRadioButton("ph_no");
		rdbtnPhoneNumber.setBounds(203, 116, 109, 23);
		rdbtnPhoneNumber.addActionListener(h);
		contentPane.add(rdbtnPhoneNumber);
		
		JRadioButton rdbtnEmail = new JRadioButton("email");
		rdbtnEmail.setBounds(314, 36, 109, 23);
		rdbtnEmail.addActionListener(h);
		contentPane.add(rdbtnEmail);
		
		JRadioButton rdbtnBloodGroup = new JRadioButton("blood_grp");
		rdbtnBloodGroup.setBounds(314, 56, 109, 23);
		rdbtnBloodGroup.addActionListener(h);
		contentPane.add(rdbtnBloodGroup);
		
		JRadioButton rdbtnHeight = new JRadioButton("height");
		rdbtnHeight.setBounds(314, 76, 109, 23);
		rdbtnHeight.addActionListener(h);
		contentPane.add(rdbtnHeight);
		
		JRadioButton rdbtnWeight = new JRadioButton("weight");
		rdbtnWeight.setBounds(314, 96, 109, 23);
		rdbtnWeight.addActionListener(h);
		contentPane.add(rdbtnWeight);
		
		JRadioButton rdbtnResidence = new JRadioButton("residing_area");
		rdbtnResidence.setBounds(314, 116, 109, 23);
		rdbtnResidence.addActionListener(h);
		contentPane.add(rdbtnResidence);
		
		JRadioButton rdbtnWorkPlace = new JRadioButton("work_place");
		rdbtnWorkPlace.setBounds(203, 136, 109, 23);
		rdbtnWorkPlace.addActionListener(h);
		contentPane.add(rdbtnWorkPlace);
		
		JRadioButton rdbtnProfession = new JRadioButton("profession");
		rdbtnProfession.setBounds(314, 136, 109, 23);
		rdbtnProfession.addActionListener(h);
		rdbtnProfession.addActionListener(null);
		contentPane.add(rdbtnProfession);
	}
}
class Handler implements ActionListener
{
	static String s;
	public void actionPerformed(ActionEvent e) 
	{
		s= e.getActionCommand();
	}
	public static String value()
	{
		return s;	
	}
}
