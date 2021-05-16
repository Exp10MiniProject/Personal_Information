package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
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
		Enter_label.setHorizontalAlignment(SwingConstants.CENTER);
		Enter_label.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 17));
		Enter_label.setBounds(10, 11, 582, 20);
		contentPane.add(Enter_label);
		
		JLabel Name = new JLabel("Name");
		Name.setFont(new Font("Arial", Font.BOLD, 15));
		Name.setBounds(10, 39, 116, 38);
		contentPane.add(Name);
		
		JLabel dob = new JLabel("Date of birth");
		dob.setFont(new Font("Arial", Font.BOLD, 15));
		dob.setBounds(10, 71, 116, 38);
		contentPane.add(dob);
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.BOLD, 15));
		gender.setBounds(10, 105, 116, 38);
		contentPane.add(gender);
		
		JLabel phone = new JLabel("Phone no.");
		phone.setFont(new Font("Arial", Font.BOLD, 15));
		phone.setBounds(10, 136, 116, 38);
		contentPane.add(phone);
		
		JLabel email = new JLabel("E-mail");
		email.setFont(new Font("Arial", Font.BOLD, 15));
		email.setBounds(10, 166, 116, 38);
		contentPane.add(email);
		
		JLabel bloodgrp = new JLabel("Blood Group");
		bloodgrp.setFont(new Font("Arial", Font.BOLD, 15));
		bloodgrp.setBounds(10, 200, 116, 38);
		contentPane.add(bloodgrp);
		
		JLabel height = new JLabel("Height");
		height.setFont(new Font("Arial", Font.BOLD, 15));
		height.setBounds(10, 239, 116, 38);
		contentPane.add(height);
		
		JLabel weight = new JLabel("Weight");
		weight.setFont(new Font("Arial", Font.BOLD, 15));
		weight.setBounds(10, 278, 116, 38);
		contentPane.add(weight);
		
		JLabel profession = new JLabel("Profession");
		profession.setFont(new Font("Arial", Font.BOLD, 15));
		profession.setBounds(10, 311, 116, 38);
		contentPane.add(profession);
		
		JLabel residence = new JLabel("Residence");
		residence.setFont(new Font("Arial", Font.BOLD, 15));
		residence.setBounds(10, 345, 116, 38);
		contentPane.add(residence);
		
		JLabel workplace = new JLabel("Work place");
		workplace.setFont(new Font("Arial", Font.BOLD, 15));
		workplace.setBounds(10, 381, 116, 38);
		contentPane.add(workplace);
		
		namefeild = new JTextField();
		namefeild.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		namefeild.setBackground(UIManager.getColor("CheckBox.background"));
		namefeild.setBounds(205, 50, 219, 19);
		contentPane.add(namefeild);
		namefeild.setColumns(10);
		
		dobfield = new JTextField();
		dobfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		dobfield.setColumns(10);
		dobfield.setBackground(SystemColor.menu);
		dobfield.setBounds(205, 82, 219, 19);
		contentPane.add(dobfield);
		
		genderfield = new JTextField();
		genderfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		genderfield.setColumns(10);
		genderfield.setBackground(SystemColor.menu);
		genderfield.setBounds(205, 116, 219, 19);
		contentPane.add(genderfield);
		
		phonefield = new JTextField();
		phonefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		phonefield.setColumns(10);
		phonefield.setBackground(SystemColor.menu);
		phonefield.setBounds(205, 147, 219, 19);
		contentPane.add(phonefield);
		
		emailfield = new JTextField();
		emailfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		emailfield.setColumns(10);
		emailfield.setBackground(SystemColor.menu);
		emailfield.setBounds(205, 177, 219, 19);
		contentPane.add(emailfield);
		
		bloodfield = new JTextField();
		bloodfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		bloodfield.setColumns(10);
		bloodfield.setBackground(SystemColor.menu);
		bloodfield.setBounds(205, 211, 219, 19);
		contentPane.add(bloodfield);
		
		heightfield = new JTextField();
		heightfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		heightfield.setColumns(10);
		heightfield.setBackground(SystemColor.menu);
		heightfield.setBounds(205, 250, 219, 19);
		contentPane.add(heightfield);
		
		weightfield = new JTextField();
		weightfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		weightfield.setColumns(10);
		weightfield.setBackground(SystemColor.menu);
		weightfield.setBounds(205, 289, 219, 19);
		contentPane.add(weightfield);
		
		professionfield = new JTextField();
		professionfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		professionfield.setColumns(10);
		professionfield.setBackground(SystemColor.menu);
		professionfield.setBounds(205, 322, 219, 19);
		contentPane.add(professionfield);
		
		residencefield = new JTextField();
		residencefield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		residencefield.setColumns(10);
		residencefield.setBackground(SystemColor.menu);
		residencefield.setBounds(205, 356, 219, 19);
		contentPane.add(residencefield);
		
		workfield = new JTextField();
		workfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 13));
		workfield.setColumns(10);
		workfield.setBackground(SystemColor.menu);
		workfield.setBounds(205, 392, 219, 19);
		contentPane.add(workfield);
		
		JButton ok1 = new JButton("OK");
		ok1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ok1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ok1.setBounds(495, 381, 85, 38);
		contentPane.add(ok1);
	}
}
