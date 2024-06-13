package GUI;

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
import javax.swing.SwingConstants;


public class Search extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField num;
	public JButton button;

	public Search()
	{
		super("Search Menu");
		setSize(600, 400);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 5, 582, 348);
		getContentPane().add(panel);
		panel.setLayout(null);
		JLabel Title = new JLabel("Enter the Student ID to be Searched\n");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(104, 13, 370, 35);
		panel.add(Title);
		JLabel del = new JLabel("Student ID:  ");
		del.setFont(new Font("Tahoma", Font.PLAIN, 15));
		del.setBounds(122, 139, 122, 22);
		panel.add(del);
		num = new JTextField(10);
		num.setBounds(307, 140, 116, 22);
		panel.add(num);

		button = new JButton("Search");
		button.setBounds(231, 249, 130, 48);
		/*
		ImageIcon icon = new ImageIcon("/home/chinmay/workspace/RTORegistrationSystem/images/Search.png");
		Image img1 = icon.getImage();
		Image newimg1 = img1.getScaledInstance(50, 40, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg1);
		button.setIcon(icon);*/
		panel.add(button);
		/*
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("/home/chinmay/workspace/RTORegistrationSystem/images/MainMenu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		JLabel bg = new JLabel("New label");
		bg.setBounds(0, 0, 582, 348);
		Image dimg = img.getScaledInstance(bg.getWidth(), bg.getHeight(), Image.SCALE_SMOOTH);
		panel.setLayout(null);
		bg.setIcon(new ImageIcon(dimg));
		panel.add(bg);*/
	}
	
	
	public void NotFound()
	{
		JOptionPane.showMessageDialog(this, "The Requested Entry Was Not Found");
	}
	
}
