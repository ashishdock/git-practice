// A Simple Applet

import java.awt.*;
import java.applet.*;

public class MyApp extends Applet
{
	//set a background color for the frame
	public void init()
	{
		setBackground(Color.yellow);
	}
	
	//display message in applet window
	public void paint(Graphics g)
	{
		g.drawString("Hello Applets! ",50,100);
	}
}