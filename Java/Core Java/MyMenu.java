// Menu creation

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMenu extends JFrame implements ActionListener
{
	//vars
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op,sa,cl,cp,pt,f1,f2;
	JCheckBoxMenuItem pr;
	
	MyMenu()
	{
		//create container
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//create a menu bar
		mb = new JMenuBar();
		
		//add Menubar to container
		c.add("North", mb);
		
		//create the file edit menus and attach them to manu bar
		file = new JMenu("File");
		edit = new JMenu("Edit");
		mb.add(file);
		mb.add(edit);
		
		//create menu items
		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");
		
		//add Open, Save, Close to File Menu and copy, paste to Edit Menu
		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);
		
		//Make close disabled
		cl.setEnabled(false);
		
		//create Print checkbox and add it to file menu
		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);
		
		//add a separator (horizontal line) to File menu
		file.addSeparator();
		
		//Create a font sub menu and add it to File menu
		font = new JMenu("Font");
		file.add(font);
		
		//create menu items
		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");
		
		//add menu items to sub menu
		font.add(f1);
		font.add(f2);
		
		//attach action listeners to all menu items
		op.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
		
		//close frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//this method is executed when a menu item is clicked 
	public void actionPerformed(ActionEvent ae)
	{
		//know which menu item is clicked
		if(op.isArmed()) System.out.println("Open is selected");
		if(sa.isArmed()) System.out.println("Save is selected");
		if(cl.isArmed()) System.out.println("Close is selected");
		if(cp.isArmed()) System.out.println("Copy is selected");
		if(pt.isArmed()) System.out.println("Paste is selected");
		
		if(pr.getModel().isSelected()) System.out.println("Printing on...");
		else System.out.println("Printing off...");
		
		if(f1.isArmed()) System.out.println("Arial Font is selected");
		if(f2.isArmed()) System.out.println("Times New Roman is selected");
	}
	
	public static void main(String args[])
	{
		//create a frame
		MyMenu mm = new MyMenu();
		mm.setTitle("My Menu");
		mm.setSize(800,600);
		mm.setVisible(true);
	}
}
