package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
//hi frm sanjana
public class FirstFrame extends JFrame {

	private JPanel contentPane;
	private JTextField namefeild;
	private JTextField dobfield;
	private JTextField genderfield;
	private JTextField phonefield;
	private JTextField emailfield;
	private JTextField bloodfield;
	private JTextField heightfield;
	private JTextField weightfield;
	private JTextField professionfield;
	private JTextField residencefield;
	private JTextField workfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFrame frame = new FirstFrame();
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
	public FirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Enter_label = new JLabel("Enter Details");
		Enter_label.setBounds(10, 11, 582, 20);
		Enter_label.setHorizontalAlignment(SwingConstants.CENTER);
		Enter_label.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(Enter_label);
		
		JLabel Name = new JLabel("Name");
		Name.setBounds(10, 39, 116, 38);
		Name.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(Name);
		
		JLabel dob = new JLabel("Date of birth");
		dob.setBounds(10, 71, 116, 38);
		dob.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(dob);
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(10, 105, 116, 38);
		gender.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(gender);
		
		JLabel phone = new JLabel("Phone Number");
		phone.setBounds(10, 136, 116, 38);
		phone.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(phone);
		
		JLabel email = new JLabel("E-mail");
		email.setBounds(10, 166, 116, 38);
		email.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(email);
		
		JLabel bloodgrp = new JLabel("Blood Group");
		bloodgrp.setBounds(10, 200, 116, 38);
		bloodgrp.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(bloodgrp);
		
		JLabel height = new JLabel("Height");
		height.setBounds(10, 239, 116, 38);
		height.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(height);
		
		JLabel weight = new JLabel("Weight");
		weight.setBounds(10, 278, 116, 38);
		weight.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(weight);
		
		JLabel profession = new JLabel("Profession");
		profession.setBounds(10, 311, 116, 38);
		profession.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(profession);
		
		JLabel residence = new JLabel("Residence");
		residence.setBounds(10, 345, 116, 38);
		residence.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(residence);
		
		JLabel workplace = new JLabel("Work place");
		workplace.setBounds(10, 381, 116, 38);
		workplace.setFont(new Font("Arial", Font.BOLD, 15));
		contentPane.add(workplace);
		
		namefeild = new JTextField();
		namefeild.setBounds(205, 50, 219, 19);
		namefeild.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		namefeild.setBackground(UIManager.getColor("CheckBox.background"));
		contentPane.add(namefeild);
		namefeild.setColumns(10);
		
		dobfield = new JTextField();
		dobfield.setBounds(205, 82, 219, 19);
		dobfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		dobfield.setColumns(10);
		dobfield.setBackground(SystemColor.menu);
		contentPane.add(dobfield);
		
		genderfield = new JTextField();
		genderfield.setBounds(205, 116, 219, 19);
		genderfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		genderfield.setColumns(10);
		genderfield.setBackground(SystemColor.menu);
		contentPane.add(genderfield);
		
		phonefield = new JTextField();
		phonefield.setBounds(205, 147, 219, 19);
		phonefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		phonefield.setColumns(10);
		phonefield.setBackground(SystemColor.menu);
		contentPane.add(phonefield);
		
		emailfield = new JTextField();
		emailfield.setBounds(205, 177, 219, 19);
		emailfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		emailfield.setColumns(10);
		emailfield.setBackground(SystemColor.menu);
		contentPane.add(emailfield);
		
		bloodfield = new JTextField();
		bloodfield.setBounds(205, 211, 219, 19);
		bloodfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		bloodfield.setColumns(10);
		bloodfield.setBackground(SystemColor.menu);
		contentPane.add(bloodfield);
		
		heightfield = new JTextField();
		heightfield.setBounds(205, 250, 219, 19);
		heightfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		heightfield.setColumns(10);
		heightfield.setBackground(SystemColor.menu);
		contentPane.add(heightfield);
		
		weightfield = new JTextField();
		weightfield.setBounds(205, 289, 219, 19);
		weightfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		weightfield.setColumns(10);
		weightfield.setBackground(SystemColor.menu);
		contentPane.add(weightfield);
		
		professionfield = new JTextField();
		professionfield.setBounds(205, 322, 219, 19);
		professionfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		professionfield.setColumns(10);
		professionfield.setBackground(SystemColor.menu);
		contentPane.add(professionfield);
		
		residencefield = new JTextField();
		residencefield.setBounds(205, 356, 219, 19);
		residencefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		residencefield.setColumns(10);
		residencefield.setBackground(SystemColor.menu);
		contentPane.add(residencefield);
		
		workfield = new JTextField();
		workfield.setBounds(205, 392, 219, 19);
		workfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		workfield.setColumns(10);
		workfield.setBackground(SystemColor.menu);
		contentPane.add(workfield);
		
		JButton ok1 = new JButton("OK");
		ok1.setBounds(495, 381, 85, 38);
		ok1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{ 
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_information?characterEncoding=latin1","root","Sharanya47*;"); 
					PreparedStatement ps = conn.prepareStatement("insert into Details(name, dob, gender, ph_no, email, blood_grp, height, weight, profession, residing_area, work_place) values(?,?,?,?,?,?,?,?,?,?,?);");
					ps.setString(1, namefeild.getText());
 					ps.setString(2, dobfield.getText());
					ps.setString(3, genderfield.getText());
 					ps.setString(4, phonefield.getText());
					ps.setString(5, emailfield.getText());
					ps.setString(6, bloodfield.getText());
					ps.setString(7, heightfield.getText());
					ps.setString(8, weightfield.getText());
					ps.setString(9, professionfield.getText());
					ps.setString(10, residencefield.getText());
					ps.setString(11, workfield.getText());


					int x = ps.executeUpdate(); 
					if(x>0) 
					{ 
						System.out.println("Registration Successful"); 
					}
					else 
					{ 
						System.out.println("Registration Failed"); 
					} 
				}
				
				catch(Exception e1) 
				{ 
					System.out.println(e1); 
				} 
				
				DisplayDatabase da = new DisplayDatabase();
				da.setVisible(true);

			}
		});
		ok1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		contentPane.add(ok1);
	}
}
