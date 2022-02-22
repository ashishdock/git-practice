//List box demo
import java.awt.*;
import java.awt.event.*;

class Mylist extends Frame implements ItemListener
{
	//vars
	int [] msg;
	List lst;
	
	Mylist()
	{
		//set flow layout manager
		setLayout(new FlowLayout());
		
		//create an empty list box that displays 4 items initially and multiple selection is also enabled
		lst = new List(4,true);
		
		//add items to the list box
		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");
		
		//add the list box to frame
		add(lst);
		
		//add item listener to the list box
		lst.addItemListener(this);
		
		//frame closing
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	} // end of constructor
	
	public void itemStateChanged(ItemEvent ie)
	{
		//call the paint() method
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Selected Languages: " , 100,200);
		
		//get the selected items position numbers into msg[]
		msg = lst.getSelectedIndexes();
		
		//know each selected item's name and display
		for(int i=0; i<msg.length; i++)
		{
			String item = lst.getItem(msg[i]);
			g.drawString(item, 100,220+i*20);
		}
	}
	
	public static void main(String args[])
	{
		//create a frame
		Mylist ml = new Mylist();
		ml.setTitle("My List");
		ml.setSize(800,600);
		ml.setVisible(true);
	}
}