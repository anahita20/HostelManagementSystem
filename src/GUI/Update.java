package GUI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import java.io.File;
import java.io.IOException;


import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Update extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel StudentIdz,Namez,Addressz,Phonez,DateofBirthz,Collegez,YearOfStudyz,RoomNoz,DateofJoinz,GuardianNamez,GuardianPhonez;
	public JTextField StudentId,Name,Address,Phone,DateofBirth,Age,College,YearOfStudy,RoomNo,DateofJoin,GuardianName,GuardianPhone;
	public JLabel ten,date;
	public JButton button;
	public String SID;
	private JPanel panel;
	private JLabel tit;
	public  Update()
	{
		super("Update Entry");
		setSize(800,600);
		getContentPane().setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		button = new JButton("Update Entry");
		button.setBounds(250, 500, 175, 44);
		panel.add(button);
		
		
	}
	
	public void equalise(String TEMP)
	{
		SID=TEMP;
		tit = new JLabel("Updating Entry For : " + SID);
		tit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setBounds(150, 13, 387, 32);
		panel.add(tit);
		
		
		Namez=new JLabel("Name:  ");
		Namez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Namez.setForeground(Color.BLACK);
		Namez.setBounds(55, 100, 120, 16);
		panel.add(Namez);
		Name=new JTextField(30);
		Name.setBounds(250, 100, 336, 22);
		panel.add(Name);
		
		Addressz=new JLabel("Address:");
		Addressz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Addressz.setForeground(Color.BLACK);
		Addressz.setBounds(55, 150, 120, 16);
		panel.add(Addressz);
		Address=new JTextField(30);
		Address.setBounds(250, 150, 336, 22);
		panel.add(Address);
		
		
		Phonez=new JLabel("Phone No.:");
		Phonez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Phonez.setForeground(Color.BLACK);
		Phonez.setBounds(55, 200, 106, 16);
		panel.add(Phonez);
		Phone=new JTextField(30);
		Phone.setBounds(250, 200, 336, 22);
		panel.add(Phone);
		ten=new JLabel("(10 digits)");
		ten.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ten.setForeground(Color.BLACK);
		ten.setBounds(55, 220, 106, 16);
		panel.add(ten);
		
		
		DateofBirthz=new JLabel("Date of Birth:");
		DateofBirthz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DateofBirthz.setForeground(Color.BLACK);
		DateofBirthz.setBounds(55, 250, 106, 16);
		panel.add(DateofBirthz);
		DateofBirth=new JTextField(30);
		DateofBirth.setBounds(250, 250, 336, 22);
		panel.add(DateofBirth);
		date=new JLabel("(yyyy-mm-dd)");
		date.setFont(new Font("Tahoma", Font.PLAIN, 16));
		date.setForeground(Color.BLACK);
		date.setBounds(55, 270, 136, 20);
		panel.add(date);
		
		
		Collegez=new JLabel("College:" );
		Collegez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Collegez.setForeground(Color.BLACK);
		Collegez.setBounds(55, 300, 160, 16);
		panel.add(Collegez);
		College=new JTextField(30);
		College.setBounds(250, 300, 336, 22);
		panel.add(College);

		

		YearOfStudyz=new JLabel("Year of Study:");
		YearOfStudyz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		YearOfStudyz.setForeground(Color.BLACK);
		YearOfStudyz.setBounds(55, 350, 120, 16);
		panel.add(YearOfStudyz);
		YearOfStudy=new JTextField(30);
		YearOfStudy.setBounds(250, 350, 336, 22);
		panel.add(YearOfStudy);
		
		
	
		
		/*
		DateofJoinz=new JLabel("Date of Join:");
		DateofJoinz.setFont(new Font("Tahoma", Font.PLAIN, 16));
		DateofJoinz.setForeground(Color.BLACK);
		DateofJoinz.setBounds(55, 450, 120, 16);
		panel.add(DateofJoinz);
		DateofJoin=new JTextField(30);
		DateofJoin.setBounds(250, 450, 336, 22);
		panel.add(DateofJoin);
		date=new JLabel("(yyyy-mm-dd)");
		date.setFont(new Font("Tahoma", Font.PLAIN, 16));
		date.setForeground(Color.BLACK);
		date.setBounds(55, 470, 136, 20);
		panel.add(date);
		*/
		
		GuardianNamez=new JLabel("Guardian Name:");
		GuardianNamez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GuardianNamez.setForeground(Color.BLACK);
		GuardianNamez.setBounds(55, 400, 120, 16);
		panel.add(GuardianNamez);
		GuardianName=new JTextField(30);
		GuardianName.setBounds(250, 400, 336, 22);
		panel.add(GuardianName);
		
		
		GuardianPhonez=new JLabel("Guardian Phone:");
		GuardianPhonez.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GuardianPhonez.setForeground(Color.BLACK);
		GuardianPhonez.setBounds(55, 450, 120, 16);
		panel.add(GuardianPhonez);
		GuardianPhone=new JTextField(30);
		GuardianPhone.setBounds(250, 450, 336, 22);
		panel.add(GuardianPhone);
		
	/*	button = new JButton("Update Entry");
		button.setBounds(250, 580, 175, 44);
		panel.add(button);
		panel.setLayout(null);
		*/
		
	
	}

}
