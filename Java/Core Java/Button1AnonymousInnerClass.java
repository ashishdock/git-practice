//creating a push button and providing action to it

import java.awt.*; //for button
import java.awt.event.*;	//for ActionListener
class Button1AnonymousInnerClass extends Frame
{
	Button1AnonymousInnerClass()
	{
		//create a push button b
		Button b = new Button("OK");
		//add push button to frame
		add(b);
		//add action listener to button
		//MyClass is implementation class of ActionListener interface
		b.addActionListener(new ActionListener()
							{			
								//this method is executed when button is clicked
								public void actionPerformed(ActionEvent ae)
								{
									//exit the application
									System.exit(0);
								}
							});
	}
	
	public static void main(String args[])
	{
		//create a frame by creating Button1 class object
		Button1 obj = new Button1();
		obj.setSize(400, 300);
		//display the frame
		obj.setVisible(true);
	}
}

//MyClass should implement the methods of ActionListener
class MyClass implements ActionListener
{
	//this method is executed when button is clicked
	public void actionPerformed(ActionEvent ae)
	{
		//exit the application
		System.exit(0);
	}
}
