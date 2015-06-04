//STEP 1. Import required packages
import java.sql.*;

public class dbtest 
{
	public static void main(String[] args)
	{
		Connection c = null;
		try
		{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db");
		} catch(Exception e)
		{
			System.err.println(e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);	
		}
		
		System.out.println("Succesfully opened database");
		
	}
 
}
    