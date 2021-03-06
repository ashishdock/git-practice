// a movinf banner using a thread
import java.awt.*; //for GUI

class MovingBanner extends Frame implements Runnable
{
	//this is the banner string
	String str = " ASHISH IS THE BEST ";
	
	MovingBanner()
	{
		setLayout(null); //don't set Layout manager
		setBackground(Color.cyan);
		setForeground(Color.red);
	} //end of constructor
	
	public void paint(Graphics g)
	{
		//set a font and display the banner string
		Font f = new Font("Courier", Font.BOLD, 40);
		g.setFont(f);
		g.drawString(str, 10, 100);
	}
	
	public void run()
	{
		for(;;) //move banner continuously
		{
			repaint(); //refresh the frame contents
			try
			{
				Thread.sleep(400); //give a gap of 400 milliseconds between each movement
			}catch(InterruptedException ie){}
			
			char ch = str.charAt(0); //extract first char from string
			str = str.substring(1, str.length()); //add to str from second char till end
			str = str + ch; // attach first char at the end of str
		}
	}
	
	public static void main(String args[])
	{
		MovingBanner b = new MovingBanner(); //b represents the frame
		b.setSize(400, 400);
		b.setTitle("MyBanner");
		b.setVisible(true);
		// create a thread and run it
		Thread t = new Thread(b);
		t.start();
	}
}