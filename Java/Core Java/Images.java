// displaying an image in the frame and also in the title bar

import java.awt.*;
import java.awt.event.*;

class Images extends Frame
{
	//take a static Image class object
	static Image img;
	
	Images()
	{
		//load an image into Image object
		img = Toolkit.getDefaultToolkit().getImage("diamonds.jpg");
		
		//wait till the image is loaded into img object, for this purpose, create MediaTracker
		MediaTracker track = new MediaTracker(this);
		
		//add image to MediaTracker
		track.addImage(img, 0);
		try
		{
			//let JVM wait till the image is loaded completely
			track.waitForID(0);
		}
		catch(InterruptedException ie){}
		
		//close the frame
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g)
	{
		// display the image in the frame at 50,50 pixels
		g.drawImage(img,50,50,null);
	}
	
	public static void main(String args[])
	{
		//create the frame
		Images i = new Images();
		
		//set size and title
		i.setTitle("My Images");
		i.setSize(500,400);
		
		//display the same image in the title bar of frame
		i.setIconImage(img);
		
		//display the frame
		i.setVisible(true);
	}
}