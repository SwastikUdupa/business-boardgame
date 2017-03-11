package com.it306.test;
import javax.swing.*;
import java.awt.*;
public class MonopolyBoard extends JFrame
{
	public static void main(String args[])
	{
		new MonopolyBoard();
	}
	public MonopolyBoard()
	{
		Toolkit tk=this.getToolkit();
		Dimension dm=tk.getScreenSize();
		JPanel thePanel=new JPanel();
		
		this.setSize(300,300);
		this.setLayout(new FlowLayout());
		JLabel label1=new JLabel("n");
		Dimension dim=new Dimension(20,150);
		label1.setMinimumSize(dim);
		thePanel.add(label1);
		
		JLabel label2=new JLabel("Random");
		thePanel.add(label2);
		
		this.add(thePanel);
		this.setVisible(true);
	}
}
