package GUI;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class StartScreen extends JFrame{
	
	public JButton btnNewButton;
public JLabel label;
	public StartScreen()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 600);
		JLabel menu_label = new JLabel("Welcome to HOSTEL!");
		menu_label.setFont(new Font("Dialog", Font.BOLD, 25));
		menu_label.setVerticalAlignment(SwingConstants.BOTTOM);
		menu_label.setBounds(27, 38, 484, 33);
		panel.add(menu_label);
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("/Users/HP-PC/Downloads/Hostel2.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		getContentPane().setLayout(null);
		btnNewButton = new JButton("START");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 32));
		//btnNewButton.setForeground(Color.BLACK);
		//btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(293, 25, 140, 60);
	//  btnNewButton.setBorder(new RoundedBorder(10));
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		panel.add(btnNewButton);
		
		getContentPane().add(panel);
		JLabel bg = new JLabel("New label");
		bg.setBounds(0, 0, 800, 600);
		Image dimg = img.getScaledInstance(bg.getWidth(), bg.getHeight(),Image.SCALE_SMOOTH);
		panel.setLayout(null);
		bg.setIcon(new ImageIcon(dimg));
		panel.add(bg);
		setVisible(true);
		

	}
}
