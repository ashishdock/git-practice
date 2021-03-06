//a program that creates a table with rows and columns

//JTable Demo

import java.awt.*; //container
import javax.swing.*; //JTable
import javax.swing.table.*; //JTableHeader
import javax.swing.border.*; //Border
import java.util.*; //Vector

class JTableDemo extends JFrame
{
	JTableDemo()
	{
		//take Vector object to represent data of table
		Vector<Vector> data = new Vector<Vector>();
		
		//take another Vector object to represent a row
		Vector<String> row = new Vector<String>();
		
		//add the row to data of the table
		data.add(row);
		
		//create another row
		row = new Vector<String>();
		row.add("Srinivas Kumar");
		row.add("Programmer");
		row.add("18,000.50");
		
		//add the second row also to data
		data.add(row);
		
		//create third row
		row = new Vector<String>();
		row.add("Vinaya Devi");
		row.add("Programmer");
		row.add("16,000.75");
		
		//add the second row also to data
		data.add(row);
		
		//Create another vector object for column names
		Vector<String> cols = new Vector<String>();
		cols.add("Employee Name");
		cols.add("Designation");
		cols.add("Salary");
		
		//do not add column names  to data of table
		
		//create the table
		JTable tab = new JTable(data,cols);
		
		//set green line border to the table
		tab.setBorder(BorderFactory.createLineBorder(Color.green, 2));
		
		//set some font to the table
		tab.setFont(new Font("Arial", Font.BOLD, 20));
		
		//set row height to 30 px
		tab.setRowHeight(30);
		
		//set grid color to red
		tab.setGridColor(Color.red);
		
		//get the table header into head
		JTableHeader head = tab.getTableHeader();
		
		//create content pane
		Container c = getContentPane();
		
		//set border layout to content pane
		c.setLayout(new BorderLayout());
		
		//add head of the table at top and remaining table below the top
		c.add("North", head);
		c.add("Center", tab);
	}
	
	public static void main(String args[])
	{
		//create the frame
		JTableDemo demo = new JTableDemo();
		demo.setSize(800,600);
		demo.setTitle("JTable Demo");
		demo.setVisible(true);
		
		//close the frame
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
