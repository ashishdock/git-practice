// Display fonts.
import java.awt.*;
import java.awt.event.*;

public class ShowFonts extends Frame
{
	String msg = "First five fonts: ";
	GraphicsEnvironment ge;
	
	public ShowFonts()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		// Get the graphics environment.
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		// Obtain a list of the fonts.
		String[] fontList = ge.getAvailableFontFamilyNames();
		
		// Create a string of the first 5 fonts.
		for(int i=0; (i<5) && i<(fontList.length); i++)
			msg += fontList[i] + " ";
		
	}
	
	// Display the fonts.
	public void paint(Graphics g)
	{
		g.drawString(msg, 10, 60);
	}
	
	public static void main(String args[])
	{
		ShowFonts appwin = new ShowFonts();
		
		appwin.setSize(500, 500);
		appwin.setTitle("Show Fonts");
		appwin.setVisible(true);
	}
}