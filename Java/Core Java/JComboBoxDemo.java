//JComboBox Demo - only one selection

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JComboBoxDemo extends JFrame implements ItemListener
{
	//vars
	JComboBox box;
	JLabel lbl;
	
	JComboBoxDemo()
	{
		//Create content pane
		Container c = getContentPane();
		
		//do not set any layout
		c.setLayout(null);
		
		//create an empty combo box
		box = new JComboBox();
		
		//add items to it
		box.addItem("India");
		box.addItem("America");
		box.addItem("Germany");
		box.addItem("Japan");
		box.addItem("France");
		
		//set the location of combo box
		box.setBounds(100,50,100,40);
		
		//add combo box to the container
		c.add(box);
		
		//create an empty label
		lbl = new JLabel();
		
		//set the location of the label
		lbl.setBounds(100,200,200,40);
		
		//add the label to content pane
		c.add(lbl);
		
		//attach item listener to combo box
		box.addItemListener(this);
		
		//close the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		//know which item is selected
		String str = (String)box.getSelectedItem();
		
		//display the selected item in the label
		lbl.setText("You Selected: " + str);
	}
	
	public static void main(String args[])
	{
		JComboBoxDemo jcbd = new JComboBoxDemo();
		jcbd.setTitle("My JComboBoxDemo");
		jcbd.setSize(800,600);
		jcbd.setVisible(true);
	}
}