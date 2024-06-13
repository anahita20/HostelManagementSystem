package GUI;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FeeStatus extends JFrame{
	private static final long serialVersionUID = 1L;
	public JTextField SID;
	public JButton button;
	public FeeStatus()
	{
		super("Update Fee Status");
		getContentPane().setBackground(new Color(240, 240, 240));
		setSize(550, 384);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 550, 384);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		button = new JButton("Update Status");
		button.setBounds(190, 249, 150, 49);
		panel.add(button);
		JLabel Title = new JLabel("Enter the Student Id whose fee status is to be updated\n");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Title.setBounds(60, 13, 390, 60);
		panel.add(Title);
		JLabel del = new JLabel("Student ID:  ");
		del.setFont(new Font("Tahoma", Font.PLAIN, 15));
		del.setBounds(75, 114, 136, 31);
		panel.add(del);
		SID = new JTextField(10);
		SID.setBounds(272, 117, 182, 22);
		panel.add(SID);
	}
	
	public void message()
	{
		JOptionPane.showMessageDialog(this, "Fee Status updated!");
	}

}
