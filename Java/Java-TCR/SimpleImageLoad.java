// Load and display an image
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class SimpleImageLoad extends Frame
{
	Image img;
	
	public SimpleImageLoad()
	{
		try
		{
			File imageFile = new File("Lilies.jpg");
			
			// Load the image.
			img = ImageIO.read(imageFile);
		}
		catch(IOException exc)
		{
			System.out.println("Cannot load image file.");
			System.exit(0);
		}
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[])
	{
		SimpleImageLoad appwin = new SimpleImageLoad();
		
		appwin.setSize(new Dimension(1000, 800));
		appwin.setTitle("Simple Image Load");
		appwin.setVisible(true);
	}
}