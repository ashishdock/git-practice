// Demonstrate check boxes
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener
{
	String msg = "";
	Checkbox windows, android, solaris, mac, linux;
	
	public CheckboxDemo()
	{
		// Use a flow layout.
		setLayout(new FlowLayout());
		
		// Create check boxes.
		windows = new Checkbox("Windows", true);
		android = new Checkbox("Android");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac");
		linux = new Checkbox("Linux");
		
		// Add the checkboxes to the frame
		add(windows);
		add(android);
		add(solaris);
		add(mac);
		add(linux);
		
		// Add item listeners.
		windows.addItemListener(this);
		android.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
		linux.addItemListener(this);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	// Display current state of the checkboxes.
	public void paint(Graphics g)
	{
		msg = "Current state: ";
		g.drawString(msg, 20, 120);
		msg = "	Windows: " + windows.getState();
		g.drawString(msg, 20, 140);
		msg = "	Android: " + android.getState();
		g.drawString(msg, 20, 160);
		msg = "	Solaris: " + solaris.getState();
		g.drawString(msg, 20, 180);
		msg = "	Mac OS: " + mac.getState();
		g.drawString(msg, 20, 200);
		msg = "	Linux: " + linux.getState();
		g.drawString(msg, 20, 220);
	}
	
	public static void main(String args[])
	{
		CheckboxDemo appwin = new CheckboxDemo();
		appwin.setSize(500, 500);
		appwin.setTitle("Checkbox Demo");
		appwin.setVisible(true);
	}
}