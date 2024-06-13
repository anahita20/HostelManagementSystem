package GUI;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
public class MainMenu extends JFrame {
	private static final long serialVersionUID = 1L;
	public JButton menu_add, menu_delete, menu_update, menu_display, menu_search,menu_fees,menu_dispfee,menu_disproom;
    public JLabel menu_label;
    private JPanel panel;
    public MainMenu()
{
	
  
	super("Hostel Management System");
	
	//panel.setVisible(true);               
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setSize(800, 600);
	panel = new JPanel();
	panel.setBounds(0, 0, 800, 600);

	getContentPane().add(panel);
	panel.setLayout(null);
	
	
	menu_label = new JLabel("Select the Operation");
	menu_label.setBounds(27, 38, 484, 33);
	panel.add(menu_label);
	menu_label.setFont(new Font("Dialog", Font.BOLD, 25));
	menu_label.setVerticalAlignment(SwingConstants.BOTTOM);
	
	menu_dispfee = new JButton("DisplayFeeTable");
	menu_dispfee.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_dispfee.setHorizontalAlignment(SwingConstants.LEFT);
	menu_dispfee.setBounds(310, 185, 190, 50);
	panel.add(menu_dispfee);
	menu_dispfee.setToolTipText("View Fee table details");
	
	menu_disproom = new JButton("DisplayRoomTable");
	menu_disproom.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_disproom.setHorizontalAlignment(SwingConstants.LEFT);
	menu_disproom.setBounds(310, 325, 200, 50);
	panel.add(menu_disproom);
	menu_disproom.setToolTipText("View Room table details");
	
	menu_add = new JButton("Add");
	menu_add.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_add.setHorizontalAlignment(SwingConstants.LEFT);
	menu_add.setBounds(117, 115, 170, 50);
	panel.add(menu_add);
	menu_add.setToolTipText("This Option Allows you to add a new Entry");
	
	
	menu_delete = new JButton("Delete");
	menu_delete.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_delete.setHorizontalAlignment(SwingConstants.LEFT);
	menu_delete.setBounds(527, 115, 170, 50);
	panel.add(menu_delete);
	menu_delete.setToolTipText("This Option Allows you to delete an Entry");
	
	
	menu_update = new JButton("Update");
	menu_update.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_update.setHorizontalAlignment(SwingConstants.LEFT);

	menu_update.setBounds(117, 254, 170, 50);
	panel.add(menu_update);
	menu_update.setToolTipText("This Option Allows you to update an Entry");
	
	
	menu_display = new JButton("Display All");
	menu_display.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_display.setHorizontalAlignment(SwingConstants.LEFT);
	menu_display.setBounds(527, 255, 170, 50);
	panel.add(menu_display);
	menu_display.setToolTipText("This Option Allows you to display Entry");
	
	
	menu_search = new JButton("Search");
	menu_search.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_search.setHorizontalAlignment(SwingConstants.LEFT);
	menu_search.setBounds(117, 400, 170, 50);
	panel.add(menu_search);
	menu_search.setToolTipText("This Option Allows you to search an Entry");
	
	
	menu_fees = new JButton("Fee Status");
	menu_fees.setFont(new Font("Tahoma", Font.PLAIN, 20));
	menu_fees.setHorizontalAlignment(SwingConstants.LEFT);
	menu_fees.setBounds(527, 400, 170, 50);
	panel.add(menu_fees);
	menu_search.setToolTipText("This Option allows you to update fee status of student");
	
	BufferedImage img = null;
	try {
		img = ImageIO.read(new File("/Users/HP-PC/Downloads/Hostel1.jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	JLabel bg = new JLabel("New label");
	bg.setBounds(0, 0, 800, 600);
	Image dimg = img.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
	panel.setLayout(null);
	bg.setIcon(new ImageIcon(dimg));
	panel.add(bg);

}
}
