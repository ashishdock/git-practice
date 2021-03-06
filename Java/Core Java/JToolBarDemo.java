// JToolBar

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JToolBarDemo extends JFrame implements ActionListener
{
	//vars
	String str;
	Container c;
	JToolBar tb;
	JButton b1, b2, b3;
	JLabel lbl;
	
	JToolBarDemo()
	{
		//create content pane
		c = getContentPane();
		//set border layout to c
		c.setLayout(new BorderLayout());
		
		//create Toolbar
		tb = new JToolBar();
		
		//add the toolbar in c at the top
		c.add("North", tb);
		
		//set etched border around the tool bar
		tb.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.black));
		
		//load images into ImageIcon objects
		ImageIcon img1 = new ImageIcon("New.jpg");
		ImageIcon img2 = new ImageIcon("Open.jpg");
		ImageIcon img3 = new ImageIcon("Print.jpg");
		
		//create 3 push buttons with images
		b1 = new JButton("New", img1);
		b2 = new JButton("Open", img2);
		b3 = new JButton("Print", img3);
		
		//add the push buttons to the tool bar
		tb.add(b1);
		tb.add(b2);
		tb.add(b3);
		
		//create a label and add to the center of c
		lbl = new JLabel();
		lbl.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.add("Center", lbl);
		
		//add action listener to buttons in tool bar
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//know which button is clicked
		if(ae.getSource() == b1) str = "New Clicked";
		if(ae.getSource() == b2) str = "Open Clicked";
		if(ae.getSource() == b3) str = "Print Clicked";
		
		//display the string in the label
		lbl.setText(str);
	}
	
	public static void main(String args[])
	{
		JToolBarDemo tbd = new JToolBarDemo();
		tbd.setSize(800,600);
		tbd.setTitle("My JToolBarDemo");
		tbd.setVisible(true);
		tbd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}