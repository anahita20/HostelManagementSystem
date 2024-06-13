package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Main.*;

import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class Add extends JFrame{
	private static final long serialVersionUID = 1L;

	public JLabel StudentIdz,Namez,Addressz,Phonez,DateofBirthz,Collegez,YearOfStudyz,RoomNoz,DateofJoinz,GuardianNamez,GuardianPhonez;
	public JTextField StudentId,Name,Address,Phone,DateofBirth,Age,College,YearOfStudy,RoomNo,DateofJoin,GuardianName,GuardianPhone;
	public JButton button;
	private JPanel panel;
	public JLabel date,ten;
	public JComboBox jcombobox;
	
    public Add()
   {
	super("Add Entry");
	setSize(800,700);
	getContentPane().setLayout(null);
	
	panel = new JPanel();
	panel.setBounds(0, 0, 800, 700);
	getContentPane().add(panel);
	panel.setLayout(null);
	
	
	StudentIdz=new JLabel("Student ID:");
	StudentIdz.setFont(new Font("Tahoma", Font.BOLD, 16));
	StudentIdz.setForeground(Color.BLACK);
	StudentIdz.setBounds(55, 50, 136, 16);
	panel.add(StudentIdz);
	StudentId=new JTextField(30);
	StudentId.setBounds(250, 50, 336, 22);
	panel.add(StudentId);
	
	
	
	Namez=new JLabel("Student Name:");
	Namez.setFont(new Font("Tahoma", Font.BOLD, 16));
	Namez.setForeground(Color.BLACK);
	Namez.setBounds(55, 100, 140, 16);
	panel.add(Namez);
	Name=new JTextField(30);
	Name.setBounds(250, 100, 336, 22);
	panel.add(Name);
	
	
	
	Addressz=new JLabel("Address:");
	Addressz.setFont(new Font("Tahoma", Font.BOLD, 16));
	Addressz.setForeground(Color.BLACK);
	Addressz.setBounds(55, 150, 120, 16);
	panel.add(Addressz);
	Address=new JTextField(30);
	Address.setBounds(250, 150, 336, 22);
	panel.add(Address);
	
	
	Phonez=new JLabel("Phone No.:");
	Phonez.setFont(new Font("Tahoma", Font.BOLD, 16));
	Phonez.setForeground(Color.BLACK);
	Phonez.setBounds(55, 200, 106, 16);
	panel.add(Phonez);
	Phone=new JTextField(30);
	Phone.setBounds(250, 200, 336, 22);
	panel.add(Phone);
	ten=new JLabel("(10 digits)");
	ten.setFont(new Font("Tahoma", Font.BOLD, 16));
	ten.setForeground(Color.BLACK);
	ten.setBounds(55, 220, 106, 16);
	panel.add(ten);
	
	
	DateofBirthz=new JLabel("Date of Birth:");
	DateofBirthz.setFont(new Font("Tahoma", Font.BOLD, 16));
	DateofBirthz.setForeground(Color.BLACK);
	DateofBirthz.setBounds(55, 250, 120, 16);
	panel.add(DateofBirthz);
	DateofBirth=new JTextField(30);
	DateofBirth.setBounds(250, 250, 336, 22);
	panel.add(DateofBirth);
	date=new JLabel("(yyyy-mm-dd)");
	date.setFont(new Font("Tahoma", Font.BOLD, 16));
	date.setForeground(Color.BLACK);
	date.setBounds(55, 270, 136, 20);
	panel.add(date);
	
	
	Collegez=new JLabel("College:" );
	Collegez.setFont(new Font("Tahoma", Font.BOLD, 16));
	Collegez.setForeground(Color.BLACK);
	Collegez.setBounds(55, 300, 160, 16);
	panel.add(Collegez);
	College=new JTextField(30);
	College.setBounds(250, 300, 336, 22);
	panel.add(College);

	

	YearOfStudyz=new JLabel("Year of Study:");
	YearOfStudyz.setFont(new Font("Tahoma", Font.BOLD, 16));
	YearOfStudyz.setForeground(Color.BLACK);
	YearOfStudyz.setBounds(55, 350, 120, 16);
	panel.add(YearOfStudyz);
	YearOfStudy=new JTextField(30);
	YearOfStudy.setBounds(250, 350, 336, 22);
	panel.add(YearOfStudy);
	
	
	RoomNoz=new JLabel("Room No:");
	RoomNoz.setFont(new Font("Tahoma", Font.BOLD, 16));
	RoomNoz.setForeground(Color.BLACK);
	RoomNoz.setBounds(55, 400, 120, 16);
	panel.add(RoomNoz);
	RoomNo=new JTextField(30);
	RoomNo.setBounds(250, 400, 336, 22);
	panel.add(RoomNo);
	
	
	
	
	
	
	DateofJoinz=new JLabel("Date of Join:");
	DateofJoinz.setFont(new Font("Tahoma", Font.BOLD, 16));
	DateofJoinz.setForeground(Color.BLACK);
	DateofJoinz.setBounds(55, 450, 120, 16);
	panel.add(DateofJoinz);
	DateofJoin=new JTextField(30);
	DateofJoin.setBounds(250, 450, 336, 22);
	panel.add(DateofJoin);
	date=new JLabel("(yyyy-mm-dd)");
	date.setFont(new Font("Tahoma", Font.BOLD, 16));
	date.setForeground(Color.BLACK);
	date.setBounds(55, 470, 136, 20);
	panel.add(date);
	
	
	GuardianNamez=new JLabel("Guardian Name:");
	GuardianNamez.setFont(new Font("Tahoma", Font.BOLD, 16));
	GuardianNamez.setForeground(Color.BLACK);
	GuardianNamez.setBounds(55, 500, 140, 16);
	panel.add(GuardianNamez);
	GuardianName=new JTextField(30);
	GuardianName.setBounds(250, 500, 336, 22);
	panel.add(GuardianName);
	
	
	GuardianPhonez=new JLabel("Guardian Phone:");
	GuardianPhonez.setFont(new Font("Tahoma", Font.BOLD, 16));
	GuardianPhonez.setForeground(Color.BLACK);
	GuardianPhonez.setBounds(55, 550, 140, 16);
	panel.add(GuardianPhonez);
	GuardianPhone=new JTextField(30);
	GuardianPhone.setBounds(250, 550, 336, 22);
	panel.add(GuardianPhone);
	
	button = new JButton("Add Entry");
	button.setBounds(250, 580, 175, 44);
	button.setForeground(Color.WHITE);
	button.setBackground(Color.BLACK);
	panel.add(button);
	panel.setLayout(null);
	
}

private JComboBox addItem(String string) {
		// TODO Auto-generated method stub
		return null;
	}

public void Addmessage()
{
	JOptionPane.showMessageDialog(this, "Student entry added!");
}

public void CannotAdd()
{
	JOptionPane.showMessageDialog(this, "Student ID already exists!");
}

public void wrongRoomno()
{
	JOptionPane.showMessageDialog(this, "Room No doesn't exist in Hostel");
}

public void wrongphone()
{
	JOptionPane.showMessageDialog(this, "Enter valid phone number (10 digits)");
}

public boolean checkavailability(String sid)
{
	Connection con = DBConnection.Link();
	try {
		Statement stmt=con.createStatement();
		  String current = "SELECT CurrentCapacity FROM Rooms WHERE RoomNo='" + sid + "'"; 
		 ResultSet rs= stmt.executeQuery(current);
		  
		 if(rs.next())
		 {
		   int c=rs.getInt("CurrentCapacity");
		   if(c<2)
			 return true;
		 else
			 return false;
		 }
		 else
			  return false;
	}
	catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		return true;
	}
}

}
