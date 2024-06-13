package Main;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

import GUI.*;
public class HMS implements ActionListener{

	
	
	StartScreen welcome= new StartScreen();
	MainMenu menu=new MainMenu();
	Add add=new Add();
	Operation obj=new Operation();
	Delete delete=new Delete();
	Search search=new Search();
	FeeStatus fee=new FeeStatus();
	Update update=new Update();
	USearch us=new USearch();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HMS mainobj=new HMS();
		mainobj.welcome.btnNewButton.addActionListener(mainobj);
		mainobj.menu.menu_add.addActionListener(mainobj);
		mainobj.menu.menu_display.addActionListener(mainobj);
		mainobj.menu.menu_delete.addActionListener(mainobj);
		mainobj.menu.menu_search.addActionListener(mainobj);
		mainobj.menu.menu_fees.addActionListener(mainobj);
		mainobj.menu.menu_dispfee.addActionListener(mainobj);
		mainobj.menu.menu_disproom.addActionListener(mainobj);
		mainobj.menu.menu_update.addActionListener(mainobj);
		
		mainobj.add.button.addActionListener(mainobj);
		mainobj.delete.button.addActionListener(mainobj);
		mainobj.search.button.addActionListener(mainobj);
		mainobj.fee.button.addActionListener(mainobj);
		mainobj.update.button.addActionListener(mainobj);
		mainobj.us.button.addActionListener(mainobj);
		
	}
	
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==welcome.btnNewButton)
		{
			welcome.setVisible(false);
			menu.setVisible(true);
		}
		else if(event.getSource()==menu.menu_dispfee)
		{
			menu.setVisible(false);
			obj.DisplayFee();
			menu.setVisible(true);
		}
		else if(event.getSource()==menu.menu_disproom)
		{
			menu.setVisible(false);
			obj.DisplayRoom();
			menu.setVisible(true);
		}
		else if(event.getSource()== menu.menu_add)
		{
			
			menu.setVisible(false);
			add.setVisible(true);
		}
		else if(event.getSource()==menu.menu_update)
		{
			menu.setVisible(false);
			us.setVisible(true);
		}
		else if (event.getSource() == us.button)
		{
			us.setVisible(false);
			if(obj.Search(us.num.getText()))
			{
				update.equalise(us.num.getText());
				update.setVisible(true);
			}
			else
			{
				us.NotFound();
				menu.setVisible(true);
			}
		}
		else if(event.getSource()==update.button)
		{
			update.setVisible(false);
			obj.Update(update.SID, update.Name.getText(), update.Address.getText(), update.Phone.getText(), update.DateofBirth.getText(), update.College.getText(), update.YearOfStudy.getText(),update.GuardianName.getText(),update.GuardianPhone.getText());
			menu.setVisible(true);
		}
		else if(event.getSource()==menu.menu_fees)
				{
			menu.setVisible(false);
			fee.setVisible(true);
				}
		
		else if(event.getSource()==fee.button)
		{
			obj.updatefeestatus(fee.SID.getText());
			
			fee.setVisible(false);
			menu.setVisible(true);
			
		}
		else if(event.getSource() == add.button)
		{
			int flag=1;
			if(add.StudentId.getText().length()==0 || add.Phone.getText().length()==0 || add.GuardianPhone.getText().length()==0 || add.RoomNo.getText().length()==0 || add.DateofBirth.getText().length()==0 || add.GuardianName.getText().length()==0  || add.DateofJoin.getText().length()==0 || add.Name.getText().length()==0 || add.College.getText().length()==0 || add.Address.getText().length()==0 || add.YearOfStudy.getText().length()==0 )
			{
				JOptionPane.showMessageDialog(null, "Please fill in details!", "Error", JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			Integer x=Integer.parseInt(add.RoomNo.getText());
			if(x<=100 ||x>=111){
				flag=0;
				JOptionPane.showMessageDialog(null, "RoomNo doesn't exist in Hostel", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			else
			if((add.checkavailability(add.RoomNo.getText())))
			{
				
			
			 if(obj.isStudentIdRegistered(add.StudentId.getText()))
			{
				JOptionPane.showMessageDialog(null, "Student Id already exists!", "Error", JOptionPane.ERROR_MESSAGE);
				flag=0;
			}
			
			else if(add.StudentId.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Student Id cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.Name.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Name must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.DateofJoin.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Date of Join must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.GuardianName.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Guardian Name must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.DateofBirth.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Date of birth must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.RoomNo.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "RoomNo must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.GuardianPhone.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Guardian Phone must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			else if(add.Phone.getText().length()==0)
			{
				flag=0;
				JOptionPane.showMessageDialog(null, "Phone must not be empty", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else if(add.Phone.getText().length()!=10)
			{
				flag=0;
				add.wrongphone();
			}
			
			else
			{
				if(flag==1){
				obj.addEntry(add.StudentId.getText(), add.Name.getText(), add.Address.getText(), add.Phone.getText(), add.DateofBirth.getText(), add.College.getText(), add.YearOfStudy.getText(),add.RoomNo.getText(),add.DateofJoin.getText(),add.GuardianName.getText(),add.GuardianPhone.getText());
				add.Addmessage();
				add.setVisible(false);
				add.StudentId.setText(null);
				add.Name.setText(null);
				add.Address.setText(null);
				add.Phone.setText(null);
				add.DateofBirth.setText(null);
				add.College.setText(null);
				add.YearOfStudy.setText(null);
				add.RoomNo.setText(null);
				add.DateofJoin.setText(null);
				add.GuardianName.setText(null);
				add.GuardianPhone.setText(null);
				menu.setVisible(true);
			}
			}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Room is full", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			
		}
		else if(event.getSource()==menu.menu_display)
		{
			menu.setVisible(false);
			obj.Display();
			menu.setVisible(true);
		}
		else if(event.getSource()==menu.menu_delete)
		{
			menu.setVisible(false);
			delete.setVisible(true);
		}
		else if(event.getSource()==delete.button)
		{
			
			delete.setVisible(false);
			if(obj.Search(delete.num.getText()))
			{
				obj.Delete(delete.num.getText());
				delete.Deleted();
			}
			else
			{
				delete.NotFound();
			}
			
			menu.setVisible(true);
		}
		else if(event.getSource()==menu.menu_search)
		{
			menu.setVisible(false);
			search.setVisible(true);
		}
		else if(event.getSource()==search.button)
		{
			search.setVisible(false);
			if(!obj.Search(search.num.getText()))
				search.NotFound();
			menu.setVisible(true);
		}







	}
}

