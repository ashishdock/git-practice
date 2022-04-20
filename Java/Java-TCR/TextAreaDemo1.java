// Demonstrate TextArea.
import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo1 extends Frame implements ActionListener
{
	public TextAreaDemo1()
	{
		// Use a flow layout
		setLayout(new FlowLayout());
		
		String val = "Java 9 is the latest version of the most \n" + "widely-used computer language for Internet programming.\n" + "Building on a rich heritage, Java has advanced both\n" + "the art and science of computer language design.\n\n" + "One of the reasons for Java's ongoing success is its\n" + "constant, steady rate of evolution. Javas has never stood\n" + "still. Instead, Java has consistently adapted to the\n" + "rapidly changing landscape of the networked world.\n" + "Moreover, Java has often led the way, charting the\n" + "course for others to follow.\n";
		
		TestArea text = new TextArea(val, 10, 30);
		add(text);
		
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
		TextAreaDemo1 appwin = new TextAreaDemo1();
		
		appwin.setSize(new Dimension(500, 500));
		appwin.setTitle("Text Area Demo");
		appwin.setVisible(true);
	}
}