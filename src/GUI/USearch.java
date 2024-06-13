package GUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class USearch extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField num;
	public JButton button;

	public USearch()
	{
		super("Update Menu");
		setSize(600, 600);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 600);
		getContentPane().add(panel);
		panel.setLayout(null);
		JLabel Title = new JLabel("Enter the StudentID to be Searched\n");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(104, 13, 400, 35);
		panel.add(Title);
		JLabel del = new JLabel("Student ID:  ");
		del.setFont(new Font("Tahoma", Font.PLAIN, 15));
		del.setBounds(122, 139, 122, 22);
		panel.add(del);
		num = new JTextField(10);
		num.setBounds(307, 140, 116, 22);
		panel.add(num);

		button = new JButton("UPDATE");
		button.setBounds(231, 249, 130, 48);
		
		panel.add(button);
		
		JLabel bg = new JLabel("New label");
		bg.setBounds(0, 0, 600, 600);
		
	}

	public void NotFound()
	{
		JOptionPane.showMessageDialog(this, "The Requested Entry Was Not Found");
	}
}