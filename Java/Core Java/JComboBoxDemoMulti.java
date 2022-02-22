//JCombo Box Demo - Multiple Selection

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class JComboBoxDemoMulti extends JFrame implements ListSelectionListener
{
	//vars
	JList lst;
	JLabel lbl;
	Object arr[];
	String msg = "";
	
	JComboBoxDemoMulti()
	{
		//create content pane
		Container c = getContentPane();
		
		//do not set any layout to c
		c.setLayout(null);
		
		//create an array with items list
		String items[] = {"India", "America", "Germany", "Japan", "France"};
		
		//create a list box with the items
		lst = new JList(items);
		
		//set the location of the list box
		lst.setBounds(100,50,100,100);
		
		//add list to the container
		c.add(lst);
		
		//create an empty label
		lbl = new JLabel();
		
		//set the location of label
		lbl.setBounds(50,200,400,40);
		
		//add the label to content pane
		c.add(lbl);
		
		//attach item listener to list box
		lst.addListSelectionListener(this);
		
		//close the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void valueChanged(ListSelectionEvent lse)
	{
		//know which items are selected
		arr = lst.getSelectedValues();
		
		//retreive selected items and add to string msg
		for(int i=0; i<arr.length; i++)
			msg += "\n" + (String)arr[i] + " \n" ;
		
		//display the selected items in the label
		lbl.setText("selected: " + msg);
		
		//reset the string
		msg = "";
	}
	
	public static void main(String args[])
	{
		//create the frame
		JComboBoxDemoMulti jcbdm = new JComboBoxDemoMulti();
		jcbdm.setTitle("My JComboBoxDemoMulti");
		jcbdm.setSize(800,600);
		jcbdm.setVisible(true);
	}
}
