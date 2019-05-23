package guiBallz;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class guiStartMenu extends JPanel
{
	public void start()
	{
	//setLayout(new GridBagLayout());
	JPanel panel = new JPanel();
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.gridx = 0;
	gbc.gridy = 0;
	
	JLabel welcome = new JLabel("Welcome to Ballz");
	gbc.gridwidth = 2;
	add(welcome,gbc);
	
	JButton start = new JButton("Start");
	gbc.gridy = 1;
	add(start,gbc);
	
	JButton leaderboard = new JButton("leaderboard");
	gbc.gridy = 2;
	add(leaderboard,gbc);
	
	
	start.addActionListener(new ActionListener() 
	{

		public void actionPerformed(ActionEvent e) 
		{

		}
		
	});
	
	leaderboard.addActionListener(new ActionListener() 
	{

		public void actionPerformed(ActionEvent e) 
		{

		}
		
	});
	
	setVisible(true);
	}


}
