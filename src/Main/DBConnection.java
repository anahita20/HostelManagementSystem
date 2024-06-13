package Main;



import java.sql.Connection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnection
{

static Connection con;

public static Connection Link()
{
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HMS","root","tiger");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return con;
}

public static void unLink()
{
	try
	{
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}

	


