package com.it306.test;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FirstBoard extends JFrame
{
	JButton buttonRules,buttonNewgame,buttonAbout;
	JLabel player1,player2;	
	JTextField txtPlayer,txtPlayer2;
	public static void main(String args[])
	{
		new FirstBoard();
	}
	public FirstBoard()
	{
	 try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException | 
	        InstantiationException | 
	        IllegalAccessException | 
	        UnsupportedLookAndFeelException e) {
	        e.printStackTrace();
	    }
		 
		Toolkit tk=this.getToolkit();
		Dimension dm=tk.getScreenSize();
		this.setSize(425,425);
		this.setTitle("Business Game");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		JPanel thePanel=new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonClickListener btnClickListener=new buttonClickListener();

		
		thePanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc	=new GridBagConstraints();
		
		
		gbc.gridy=2500;
		gbc.weighty=0;
		gbc.ipadx=50;
		gbc.ipady=15;
		gbc.anchor=GridBagConstraints.PAGE_END;
		gbc.anchor=GridBagConstraints.EAST;
		gbc.insets=new Insets(0,0,0,70);
		gbc.gridx=1;
		gbc.gridheight=20;
		JButton buttonStart=new JButton("Start");
		thePanel.add(buttonStart, gbc);
		
		
		gbc.insets=new Insets(0,0,0,0);
		gbc.weightx=0.2;
		gbc.gridx=0;
		gbc.gridy=dm.height/2;
		gbc.gridheight=2;
		gbc.ipadx=49;
		gbc.anchor = GridBagConstraints.WEST;
		buttonNewgame=new JButton("New Game");
		thePanel.add(buttonNewgame,gbc);
		
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridy=dm.height/2+2;
		gbc.ipadx=73;
		buttonRules=new JButton("Rules");
		thePanel.add(buttonRules,gbc);
		
		gbc.weightx=0;
		gbc.gridy=dm.height/2+4;
		gbc.ipadx=55;
		buttonAbout=new JButton("About Us");
		thePanel.add(buttonAbout,gbc);
		
		JPanel flowPanel=new JPanel();
		flowPanel.setLayout(new FlowLayout());
		
		gbc.gridx=1;
		gbc.gridy=0;
		thePanel.add(flowPanel,gbc);
		player1=new JLabel("Player 1");
		flowPanel.add(player1);	
		
		txtPlayer=new JTextField();
		txtPlayer.setColumns(20);
		flowPanel.add(txtPlayer);

		JPanel flowPanel2=new JPanel();
		flowPanel2.setLayout(new FlowLayout());
		
		gbc.gridx=1;
		gbc.gridy=100;
		player2=new JLabel("Player 2");
		flowPanel2.add(player2);
		
		txtPlayer2=new JTextField();
		txtPlayer2.setColumns(20);
		flowPanel2.add(txtPlayer2);
		thePanel.add(flowPanel2,gbc);
		

		this.add(thePanel);
		this.setVisible(true);
	}
	private class buttonClickListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==buttonAbout)
			{
				
				new About();
			}
		}
		
	}
}
