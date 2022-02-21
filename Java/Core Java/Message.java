// Frame with background color and message

import java.awt.*;
import java.awt.event.*;

class Message extends Frame
{
	Message()
	{
		//close the frame when close button clicked
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	} // end of constructor
	
	public void paint(Graphics g)
	{
		//set background color for frame
		this.setBackground(new Color(100,20,20));
		
		//set font for the text
		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		
		//set foreground color
		g.setColor(Color.green);
		
		//display the message
		g.drawString("Hello, How are you? ", 100,100);
	}
	
	public static void main(String args[])
	{
		Message m = new Message();
		m.setSize(400,300);
		m.setTitle("This is my text");
		m.setVisible(true);
	}
}