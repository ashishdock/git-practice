//Program to create a tabbed pane with two tab sheets. In the first tab sheet, we display some push buttons with names of capital cities. In the second tab sheet, we display some checkboxes with names of countries

//Tabbed Pane

import java.awt.*;
import javax.swing.*;

class JTabbedPaneDemo extends JFrame
{
	JTabbedPaneDemo()
	{
		//create content pane
		Container c = getContentPane();
		
		//create tabbed pane
		JTabbedPane jtp = new JTabbedPane();
		
		//add two sheets, CapitalsPanel and CountriesPanel are classes which extend JPanel and contain a group of componnets
		jtp.addTab("Capitals", new CapitalsPanel());
		jtp.addTab("Countries", new CountriesPanel());
		
		//add the tabbed pane to content pane
		c.add(jtp);
	}
	
	public static void main(String args[])
	{
		//create the frame
		JTabbedPaneDemo jtpd = new JTabbedPaneDemo();
		
		jtpd.setSize(800,600);
		jtpd.setTitle("My JTabbed Panes");
		jtpd.setVisible(true);
		
		jtpd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//the components of this class go into Capitals tab sheet
	class CapitalsPanel extends JPanel
	{
		CapitalsPanel()
		{
			//create 3 push buttons and add to panel
			JButton b1 = new JButton("Washington");
			JButton b2 = new JButton("London");
			JButton b3 = new JButton("Tokyo");
			
			add(b1);
			add(b2);
			add(b3);
		}
	}
	
	class CountriesPanel extends JPanel
	{
		CountriesPanel()	
		{
			//create 3 check boxes and add to panel
			JCheckBox c1 = new JCheckBox("United States");
			JCheckBox c2 = new JCheckBox("Britain");
			JCheckBox c3 = new JCheckBox("Japan");
			
			add(c1);
			add(c2);
			add(c3);
		}
	}
}