// A program to create a menu and handle the file open event for the user

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class MyMenu1 extends JFrame implements ActionListener
{
	//vars
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, cp, pt, f1, f2;
	JCheckBoxMenuItem pr;
	
	MyMenu1()
	{
		//create container
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//create a menubar
		mb = new JMenuBar();
		
		//add menubar to conainer
		c.add("North", mb);
		
		////create the file, edit menus
		file = new JMenu("File");
		edit = new JMenu("Edit");
		
		//attach them to menu bar
		mb.add(file);
		mb.add(edit);
		
		//create menu items
		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");
		
		//add open, save, close to File menu and copy paste to Edit menu
		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);
		
		//make close disabled
		cl.setEnabled(false);
		
		//create Print checkbox and add it to File menu
		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);
		
		//add a separator(horizontal line) to File menu
		file.addSeparator();
		
		//Create a Font submenu and add it to File menu
		font = new JMenu("Font");
		file.add(font);
		
		//create menu items for Font
		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");
		
		//add menu items to Font
		font.add(f1);
		font.add(f2);
		
		//attach action listeners
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
	
	public void actionPerformed(ActionEvent ae)
	{
		//know which menu item is selected
		if(op.isArmed()) this.openFile();
		if(sa.isArmed()) //this.saveFile();
		if(cl.isArmed()) System.out.println("Close is selected");
		if(cp.isArmed()) System.out.println("Copy is selected");
		if(pt.isArmed()) System.out.println("Paste is selected");
		
		if(pr.getModel().isSelected()) System.out.println("Printing on...");
		else System.out.println("Printing off...");
		
		if(f1.isArmed()) System.out.println("Arial Font is selected");
		if(f2.isArmed()) System.out.println("Times New Roman is selected");
	}
	
	//this method is called when file->open is selected
	void openFile()
	{
		//create an object to JFileChooser class
		JFileChooser fc = new JFileChooser();
		
		//display file open dialog box
		int i = fc.showOpenDialog(this);
		
		//if the user selected a file name then
		if(i==JFileChooser.APPROVE_OPTION)
		{
			//get the selected file into file object
			File f = fc.getSelectedFile();
			
			//The file name is given by f.getName()
			//File name with path is given by f.getPath();
			String fname = f.getPath();
			
			//open another frame and pass the fname to it
			OpenFrame of = new OpenFrame(fname);
			
			of.setSize(500,400);
			of.setVisible(true);
		}
	}
	
	public static void main (String args[])
	{
		//create the frame
		MyMenu1 mm = new MyMenu1();
		mm.setTitle("JMenu demo");
		mm.setSize(800,600);
		mm.setVisible(true);
	}
	
	//this is another class which creates another frame to display file contents
	
	class OpenFrame extends JFrame
	{
		//catch the file name
		OpenFrame(String fname)
		{
			//create content pane
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			//create a text area and add to content pane
			TextArea ta = new TextArea(22,60);
			c.add(ta);
			
			//vars
			String str = "";
			String str1 = "";
			
			try
			{
				//create reader to read from file
				BufferedReader br = new BufferedReader(new FileReader(fname));
				
				//read string by string and add to str1
				while((str = br.readLine()) != null)
					str1 += str + "\n";
				
				//display the file content in the text area
				ta.setText(str1);
				
				//close the file
				br.close();
			}
			catch(Exception e){}
		}
	}
}