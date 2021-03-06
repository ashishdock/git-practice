// Catching which key is pressed

import java.awt.*;
import java.awt.event.*;

class Keys extends Frame implements KeyListener
{
	//vars
	TextArea ta;
	String msg = "";
	
	Keys()
	{
		//set Flow Layout
		setLayout(new FlowLayout());
		
		//create a textarea to display the key code
		ta = new TextArea(5,25);
		
		//set some font and foreground color to text area
		Font f = new Font("SansSerif", Font.BOLD, 25);
		ta.setFont(f);
		ta.setForeground(Color.red);
		
		//add text area to frame
		add(ta);
		
		//add key listener to text area
		ta.addKeyListener(this);
		
		//close the frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void keyPressed(KeyEvent ke)
	{
		//get the code of the key pressed
		int keycode = ke.getKeyCode();
		msg += "\nKey Code: " + keycode;
		//get the name of the key from code
		String keyname = ke.getKeyText(keycode);
		msg += "\nKey Pressed: " + keyname;
		
		//display the key code and key name in text area
		ta.setText(msg);
		msg = "";
	}
	
	public void keyTyped(KeyEvent ke)
	{}
	
	public void keyReleased(KeyEvent ke)
	{
		//get the keycode released
		int keycode = ke.getKeyCode();
		msg += "\nKey code: " + keycode;
		
		//get the key name from the code
		String keyname = ke.getKeyText(keycode);
		msg += "\nKey name: " + keyname;
		
		//display key code and key name in text area
		ta.setText(msg);
		msg = "";
	}
	
	public static void main(String args[])
	{
		Keys ks = new Keys();
		ks.setTitle("Key Code and Key Name");
		ks.setSize(800,600);
		ks.setVisible(true);
	}
}