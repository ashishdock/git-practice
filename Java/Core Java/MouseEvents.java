//Mouse Events

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseEvents extends JFrame implements MouseListener, MouseMotionListener
{
	//vars
	String str = "";
	JTextArea ta;
	Container c;
	int x, y;
	
	MouseEvents()
	{
		//create content pane
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//create a text area and set some font to it
		ta = new JTextArea();
		ta.setFont(new Font("Arial", Font.BOLD, 30));
		
		//add text area to content pane
		c.add(ta);
		
		//add mouse listener, mouse motion listener to text area
		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		//know which button of mouse if clicked
		int i = me.getButton();
		if(i == 1)
			str += "Clicked Button: Left";
		if(i == 2)
			str += "Clicked Button: Middle";
		if(i == 3)
			str += "Clicked Button: Right";
		
		this.display();
	}
	
	public void mouseEntered(MouseEvent me)
	{
		str += "Mouse Entered";
		this.display();
	}
	
	public void mouseExited(MouseEvent me)
	{
		str += "Mouse Exited";
		this.display();
	}
	
	public void mousePressed(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Pressed at: " + x + "\t" + y;
		this.display();
	}
	
	public void mouseReleased(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Released at: " + x + "\t" + y;
		this.display();
	}
	
	public void mouseDragged(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Dragged at " + x + "\t" + y;
		this.display();
	}
	
	public void mouseMoved(MouseEvent me)
	{
		x = me.getX();
		y = me.getY();
		str += "Mouse Moved at: " + x + "\t" + y;
		this.display();
	}
	
	public void display()
	{
		ta.setText(str);
		str = "";
	}
	
	public static void main(String args[])
	{
		//create the frame
		MouseEvents mes = new MouseEvents();
		mes.setSize(800,600);
		mes.setTitle("My Mouse Events");
		mes.setVisible(true);
		mes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}