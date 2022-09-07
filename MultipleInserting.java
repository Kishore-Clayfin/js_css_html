package jdbc;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class MultipleInserting {
	public static void main(String[] args) 
	{
		try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
				"tiger"); 
				Statement statement = connection.createStatement())
		{
			connection.setAutoCommit(false);
			statement.addBatch("INSERT INTO employee VALUES(102,'abc',10000) ");
			statement.addBatch("INSERT INTO employee VALUES(103,'xyz',15000) ");
			statement.addBatch("INSERT INTO employee VALUES(104,'wxy',25000) ");
			int[] updateCounts = statement.executeBatch();
			System.out.println(Arrays.toString(updateCounts));
			connection.commit();
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
