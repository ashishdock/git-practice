// To retrieve data from MSAccess database

import java.sql.*;

class AccessData
{
	public static void main(String args[])
	{
		//Register the driver
		DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
		
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:odbc:accdsn", "", "");
		
		//Create a SQL statement
		Statement stmt = con.createStatement();
		
		//Execute the stmt
		ResultSet rs = stmt.executeQuery("select * from emptab");
		
		//retrieve from ResultSet and display column data
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
			System.out.println("==============================");
		}
	}
}