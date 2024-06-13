package GUI;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Delete extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField num;
	public JButton button;

	public Delete()
	{
		super("Delete Menu");
		getContentPane().setBackground(new Color(240, 240, 240));
		setSize(550, 384);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 550, 384);
		getContentPane().add(panel);
		panel.setLayout(null);

		button = new JButton("Delete Student");
		button.setBounds(190, 249, 150, 49);
		panel.add(button);
		JLabel Title = new JLabel("Enter the Student Id to be Deleted\n");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setBounds(65, 13, 374, 35);
		panel.add(Title);
		JLabel del = new JLabel("Student ID:  ");
		del.setFont(new Font("Tahoma", Font.PLAIN, 15));
		del.setBounds(75, 114, 136, 31);
		panel.add(del);
		num = new JTextField(10);
		num.setBounds(272, 117, 182, 22);
		panel.add(num);
		

	}
	
	
	public void NotFound()
	{
		JOptionPane.showMessageDialog(this, "The Requested Entry Was Not Found");
	}
	
	public void Deleted()
	{
		JOptionPane.showMessageDialog(this, "The Requested Entry Was Deleted");
	}
}
