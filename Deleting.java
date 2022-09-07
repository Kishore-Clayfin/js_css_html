package jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleting
{
	private static final String DELETION ="delete from employee where id=104";
	public static void main(String[] args) 
	{
		try(Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger");
				Statement statement =connection.createStatement();)
		{
			int result=statement.executeUpdate(DELETION);
			System.out.println("Number Of Record Deleted"+result);
		}
		catch (BatchUpdateException e) {
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());

		} 
		catch (SQLException e) {
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());
		}
	}
}
