// Button which displays image when clicked

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class ButtonDemo1 extends JFrame implements ActionListener
{
	JButton b;
	JLabel lbl;
	
	ButtonDemo1()
	{
		//create container
		Container c = getContentPane();
		
		//set a layout for container
		c.setLayout(new FlowLayout());
		
		//store the image into ImageIcon object
		ImageIcon ii = new ImageIcon("car2.gif");
		
		//create the button with the image
		b = new JButton("Click me", ii);
		
		//set background and foreground colors for button
		b.setBackground(Color.yellow);
		b.setForeground(Color.red);
		
		//set font for the label of button
		b.setFont(new Font("Arial", Font.BOLD, 30));
		
		//set bevel border for button
		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);
		
		//set ToolTip text for button
		b.setToolTipText("This is a button");
		
		//set a shortcut key for button. Alt + C will invoke the button
		b.setMnemonic('C');
		
		//add the button to the container
		c.add(b);
		
		//add action listener to the button
		b.addActionListener(this);
		
		//create an empty label and add to the content pane
		lbl = new JLabel();
		c.add(lbl);
		
		//close the frame upon clicking
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//set some image to the label. This image is displayed when the button is clicked
		ImageIcon ii = new ImageIcon("car.jpg");
		lbl.setIcon(ii);
	}
	
	public static void main(String args[])
	{
		//create a frame
		ButtonDemo1 obj = new ButtonDemo1();
		
		obj.setTitle("My Button with Image - Swing");
		obj.setSize(800,600);
		obj.setVisible(true);
	}
}