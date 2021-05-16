package Personal_Information_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel frame2_lable = new JLabel("Enter details");
		frame2_lable.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame2_lable.setBounds(22, 11, 130, 28);
		contentPane.add(frame2_lable);
	}

	public void NewScreen() 
	{

		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run() 
			{
				try
				{
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		});
	}

}
