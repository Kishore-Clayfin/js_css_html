package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update 
{
	private static final String UPDATION ="update employee set name='AAA' where id=102";

	public static void main(String[] args)
	{
		try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				Statement statement =connection.createStatement();)
		{
			int result=statement.executeUpdate(UPDATION);
			System.out.println("Number Of Record Updated"+result);
		}
		
		catch (SQLException e) {
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());
		}
		
	}
}
