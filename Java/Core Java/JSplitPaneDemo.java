//Program to create a split pane
//Split pane with textarea and button

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JSplitPaneDemo extends JFrame implements ActionListener
{
	//vars
	String str = "This is my text being displayed in the text area" + " and this text will be wrapped accordingly";
	JButton b;
	JTextArea ta;
	JSplitPane sp;
	
	JSplitPaneDemo()
	{
		//create content pane
		Container c = getContentPane();
		
		//set border layout to content pane
		c.setLayout(new BorderLayout());
		
		//create a push button and text area
		b = new JButton("MyButton");
		ta = new JTextArea();
		
		//set wrapping of the line for the text area
		ta.setLineWrap(true);
		
		//create horizontal split pane that contains b. ta
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, b,ta);
		
		//set the divider location at 300 pixels in split pane
		sp.setDividerLocation(300);
		
		//add split pane in the center of container
		c.add("Center",sp);
		
		//add action listener
		b.addActionListener(this);
		
		//close frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//when button is clicked, set the string to the text area
		ta.setText(str);
	}
	
	public static void main(String args[])
	{
		JSplitPaneDemo jspd = new JSplitPaneDemo();
		jspd.setTitle("My JSplitPaneDemo");
		jspd.setSize(400,400);
		jspd.setVisible(true);
	}
}