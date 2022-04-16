// Inner Class demo.
import java.awt.*;
import java.awt.event.*;

public class InnerClassDemo3 extends Frame
{
	String msg = "";
	
	public InnerClassDemo3()
	{
		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
	}
	
	// Inner class to handle mouse pressed events.
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent me)
		{
			msg = "Mouse Pressed";
			repaint();
		}
	}
	
	// Inner class to handle window close events.
	class MyWindowAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	}
	
	public void paintGraphics(Graphics g)
	{
		g.drawString(msg, 20, 80);
	}
	
	public static void main(String args[])
	{
		InnerClassDemo3 appwin = new InnerClassDemo3();
		
		appwin.setSize(new Dimension(500, 400));
		appwin.setTitle("Inner Class Demo");
		appwin.setVisible(true);
	}
}